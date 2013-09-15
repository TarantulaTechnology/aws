/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.demo.personalfilestore.s3;


import java.util.List;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

import com.amazonaws.demo.personalfilestore.CustomListActivity;
import com.amazonaws.demo.personalfilestore.s3.S3AddObjectView;

public class S3BucketView extends CustomListActivity {

    protected List<String> objectNameList;
    protected String bucketName;
    protected String prefix;

    private static final String SUCCESS = "Object List";
    private static final int NUM_OBJECTS = 6;

    private final Runnable postResults = new Runnable() {
        @Override
        public void run(){
            updateUi(objectNameList, SUCCESS);
        }
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = this.getIntent().getExtras();
        bucketName = extras.getString(S3.BUCKET_NAME);
        prefix = extras.getString(S3.PREFIX);
        startPopulateList();
    }

    @Override
    public void onResume() {
        super.onResume();
        startPopulateList();
    }

    protected void obtainListItems(){
        objectNameList = S3.getObjectNamesForBucket(bucketName, prefix, NUM_OBJECTS);
        getHandler().post(postResults);
    }

    protected void wireOnListClick(){
        getItemList().setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> list, View view, int position, long id) {
                final String objectName = ((TextView)view).getText().toString();
                Intent objectViewIntent = new Intent(S3BucketView.this, S3ObjectView.class);
                objectViewIntent.putExtra( S3.BUCKET_NAME, bucketName);
                objectViewIntent.putExtra( S3.OBJECT_NAME, S3BucketView.this.prefix + "/" + objectName );
                startActivity(objectViewIntent);
            }
        });
    }

    protected void wireOnClick(){
        this.add.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addObjectViewIntent = new Intent( S3BucketView.this, S3AddObjectView.class);
                addObjectViewIntent.putExtra( S3.BUCKET_NAME, bucketName);
                addObjectViewIntent.putExtra( S3.PREFIX, S3BucketView.this.prefix);
                startActivity(addObjectViewIntent);
            }
        });
    }
}
