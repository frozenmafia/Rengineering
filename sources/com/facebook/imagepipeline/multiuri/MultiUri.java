package com.facebook.imagepipeline.multiuri;

import com.facebook.imagepipeline.request.ImageRequest;
/* loaded from: classes6.dex */
public class MultiUri {
    private ImageRequest mHighResImageRequest;
    private ImageRequest mLowResImageRequest;
    private ImageRequest[] mMultiImageRequests;

    private MultiUri(Builder builder) {
        this.mLowResImageRequest = builder.mLowResImageRequest;
        this.mHighResImageRequest = builder.mHighResImageRequest;
        this.mMultiImageRequests = builder.mMultiImageRequests;
    }

    public ImageRequest getLowResImageRequest() {
        return this.mLowResImageRequest;
    }

    public ImageRequest getHighResImageRequest() {
        return this.mHighResImageRequest;
    }

    public ImageRequest[] getMultiImageRequests() {
        return this.mMultiImageRequests;
    }

    public static Builder create() {
        return new Builder();
    }

    /* loaded from: classes6.dex */
    public static class Builder {
        private ImageRequest mHighResImageRequest;
        private ImageRequest mLowResImageRequest;
        private ImageRequest[] mMultiImageRequests;

        private Builder() {
        }

        public MultiUri build() {
            return new MultiUri(this);
        }

        public Builder setLowResImageRequest(ImageRequest imageRequest) {
            this.mLowResImageRequest = imageRequest;
            return this;
        }

        public Builder setHighResImageRequest(ImageRequest imageRequest) {
            this.mHighResImageRequest = imageRequest;
            return this;
        }

        public Builder setImageRequests(ImageRequest... imageRequestArr) {
            this.mMultiImageRequests = imageRequestArr;
            return this;
        }
    }
}
