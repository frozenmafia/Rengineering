package com.facebook.imagepipeline.transcoder;

import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.core.NativeCodeSetup;
import com.facebook.imagepipeline.nativecode.NativeImageTranscoderFactory;
/* loaded from: classes4.dex */
public class MultiImageTranscoderFactory implements ImageTranscoderFactory {
    private final boolean mEnsureTranscoderLibraryLoaded;
    private final Integer mImageTranscoderType;
    private final int mMaxBitmapSize;
    private final ImageTranscoderFactory mPrimaryImageTranscoderFactory;
    private final boolean mUseDownSamplingRatio;

    public MultiImageTranscoderFactory(int i, boolean z, ImageTranscoderFactory imageTranscoderFactory, Integer num, boolean z2) {
        this.mMaxBitmapSize = i;
        this.mUseDownSamplingRatio = z;
        this.mPrimaryImageTranscoderFactory = imageTranscoderFactory;
        this.mImageTranscoderType = num;
        this.mEnsureTranscoderLibraryLoaded = z2;
    }

    @Override // com.facebook.imagepipeline.transcoder.ImageTranscoderFactory
    public ImageTranscoder createImageTranscoder(ImageFormat imageFormat, boolean z) {
        ImageTranscoder customImageTranscoder = getCustomImageTranscoder(imageFormat, z);
        if (customImageTranscoder == null) {
            customImageTranscoder = getImageTranscoderWithType(imageFormat, z);
        }
        if (customImageTranscoder == null && NativeCodeSetup.getUseNativeCode()) {
            customImageTranscoder = getNativeImageTranscoder(imageFormat, z);
        }
        return customImageTranscoder == null ? getSimpleImageTranscoder(imageFormat, z) : customImageTranscoder;
    }

    private ImageTranscoder getCustomImageTranscoder(ImageFormat imageFormat, boolean z) {
        ImageTranscoderFactory imageTranscoderFactory = this.mPrimaryImageTranscoderFactory;
        if (imageTranscoderFactory == null) {
            return null;
        }
        return imageTranscoderFactory.createImageTranscoder(imageFormat, z);
    }

    private ImageTranscoder getNativeImageTranscoder(ImageFormat imageFormat, boolean z) {
        return NativeImageTranscoderFactory.getNativeImageTranscoderFactory(this.mMaxBitmapSize, this.mUseDownSamplingRatio, this.mEnsureTranscoderLibraryLoaded).createImageTranscoder(imageFormat, z);
    }

    private ImageTranscoder getSimpleImageTranscoder(ImageFormat imageFormat, boolean z) {
        return new SimpleImageTranscoderFactory(this.mMaxBitmapSize).createImageTranscoder(imageFormat, z);
    }

    private ImageTranscoder getImageTranscoderWithType(ImageFormat imageFormat, boolean z) {
        Integer num = this.mImageTranscoderType;
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                return getSimpleImageTranscoder(imageFormat, z);
            }
            throw new IllegalArgumentException("Invalid ImageTranscoderType");
        }
        return getNativeImageTranscoder(imageFormat, z);
    }
}
