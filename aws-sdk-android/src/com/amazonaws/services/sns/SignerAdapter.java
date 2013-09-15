package com.amazonaws.services.sns;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.auth.AWS4Signer;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSSessionCredentials;
import com.amazonaws.auth.AbstractAWSSigner;
import com.amazonaws.auth.QueryStringSigner;
import com.amazonaws.auth.Signer;

public class SignerAdapter extends AbstractAWSSigner implements Signer
{
    
    private final QueryStringSigner queryStringSigner;
    private final AWS4Signer aws4Signer;
    private boolean useSigV4;
    
    public SignerAdapter() {
        useSigV4 = true;
        queryStringSigner = new QueryStringSigner();
        aws4Signer = new AWS4Signer();
    }
    
    public void useSigV4(){
        useSigV4 = true;
    }
    
    public void useSigV2(){
        useSigV4 = false;
    }

    public void setServiceName(String serviceName) {
        aws4Signer.setServiceName(serviceName);
    }
    
    public void setRegionName(String serviceName) {
        aws4Signer.setRegionName(serviceName);
    }
    
    @Override
    public void sign(Request<?> arg0, AWSCredentials arg1) throws AmazonClientException
    {
        //pick one...
        if (useSigV4)
            aws4Signer.sign(arg0, arg1);
        else
            queryStringSigner.sign(arg0, arg1);
    }

    @Override
    protected void addSessionCredentials(Request<?> arg0, AWSSessionCredentials arg1)
    {

    }

    /*
     * need to have: 
     * 
     * public class com.amazonaws.auth.QueryStringSigner extends com.amazonaws.auth.AbstractAWSSigner implements com.amazonaws.auth.Signer {
     * 
     * public class com.amazonaws.auth.AWS4Signer extends com.amazonaws.auth.AbstractAWSSigner {
     * 
     * where: 
     * public abstract class com.amazonaws.auth.AbstractAWSSigner implements com.amazonaws.auth.Signer
     */
    

}
