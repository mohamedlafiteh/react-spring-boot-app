package com.mocode.awsuploadimage.bucket;

public enum BucketName {

    PROFILE_IMAGE("mocode-image-upload-123\n");

    private  final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
