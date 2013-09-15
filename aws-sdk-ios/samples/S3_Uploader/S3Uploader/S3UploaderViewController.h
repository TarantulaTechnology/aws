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

#import <UIKit/UIKit.h>
#import <AWSS3/AWSS3.h>

typedef enum {
    GrandCentralDispatch,
    Delegate,
    BackgroundThread
} UploadType;

@interface S3UploaderViewController:UIViewController<UINavigationControllerDelegate, UIImagePickerControllerDelegate, AmazonServiceRequestDelegate> {
    UploadType _uploadType;
}

@property (nonatomic, retain) AmazonS3Client *s3;

-(IBAction)uploadPhotoWithGrandCentralDispatch:(id)sender;
-(IBAction)uploadPhotoWithDelegate:(id)sender;
-(IBAction)uploadPhotoWithBackgroundThread:(id)sender;

-(IBAction)showInBrowser:(id)sender;

@end
