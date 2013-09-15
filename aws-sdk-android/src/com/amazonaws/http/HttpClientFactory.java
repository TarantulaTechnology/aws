/*
 * Copyright 2011-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.http;

import java.security.NoSuchAlgorithmException;

import javax.net.ssl.SSLContext;

import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.NTCredentials;
import org.apache.http.client.HttpClient;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.params.ConnRoutePNames;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

import com.amazonaws.AmazonClientException;
import com.amazonaws.ClientConfiguration;

/** Responsible for creating and configuring instances of Apache HttpClient4. */
class HttpClientFactory {

    /**
     * Creates a new HttpClient object using the specified AWS
     * ClientConfiguration to configure the client.
     *
     * @param config
     *            Client configuration options (ex: proxy settings, connection
     *            limits, etc).
     *
     * @return The new, configured HttpClient.
     */
    public HttpClient createHttpClient(ClientConfiguration config) {
        /* Set HTTP client parameters */
        HttpParams httpClientParams = new BasicHttpParams();
        HttpClientParams.setRedirecting(httpClientParams, false);
        HttpConnectionParams.setConnectionTimeout(httpClientParams, config.getConnectionTimeout());
        HttpConnectionParams.setSoTimeout(httpClientParams, config.getSocketTimeout());
        HttpConnectionParams.setStaleCheckingEnabled(httpClientParams, true);
        HttpConnectionParams.setTcpNoDelay(httpClientParams, true);

        int socketSendBufferSizeHint = config.getSocketBufferSizeHints()[0];
        int socketReceiveBufferSizeHint = config.getSocketBufferSizeHints()[1];
        if (socketSendBufferSizeHint > 0 || socketReceiveBufferSizeHint > 0) {
            HttpConnectionParams.setSocketBufferSize(httpClientParams,
                    Math.max(socketSendBufferSizeHint, socketReceiveBufferSizeHint));
        }

        /* Set connection manager */
        PoolingClientConnectionManager connectionManager = ConnectionManagerFactory.createPoolingClientConnManager(config, httpClientParams);
        DefaultHttpClient httpClient = new DefaultHttpClient(connectionManager, httpClientParams);

        try {
            Scheme http = new Scheme("http", 80, PlainSocketFactory.getSocketFactory());

            SSLSocketFactory sf = new SSLSocketFactory(
                    SSLContext.getDefault(),
                    SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
            Scheme https = new Scheme("https", 443, sf);

            SchemeRegistry sr = connectionManager.getSchemeRegistry();
            sr.register(http);
            sr.register(https);
        } catch (NoSuchAlgorithmException e) {
            throw new AmazonClientException("Unable to access default SSL context", e);
        }

        /* Set proxy if configured */
        String proxyHost = config.getProxyHost();
        int proxyPort = config.getProxyPort();
        if (proxyHost != null && proxyPort > 0) {
            AmazonHttpClient.log.info("Configuring Proxy. Proxy Host: " + proxyHost + " " + "Proxy Port: " + proxyPort);
            HttpHost proxyHttpHost = new HttpHost(proxyHost, proxyPort);
            httpClient.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, proxyHttpHost);

            String proxyUsername    = config.getProxyUsername();
            String proxyPassword    = config.getProxyPassword();
            String proxyDomain      = config.getProxyDomain();
            String proxyWorkstation = config.getProxyWorkstation();

            if (proxyUsername != null && proxyPassword != null) {
                httpClient.getCredentialsProvider().setCredentials(
                        new AuthScope(proxyHost, proxyPort),
                        new NTCredentials(proxyUsername, proxyPassword, proxyWorkstation, proxyDomain));
            }
        }

        return httpClient;
    }

}
