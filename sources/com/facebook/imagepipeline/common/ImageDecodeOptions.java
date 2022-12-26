package com.facebook.imagepipeline.common;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.transformation.BitmapTransformation;
import o.Fragment;
/* loaded from: classes4.dex */
public class ImageDecodeOptions {
    private static final ImageDecodeOptions DEFAULTS = newBuilder().build();
    public final Bitmap.Config animatedBitmapConfig;
    public final Bitmap.Config bitmapConfig;
    public final BitmapTransformation bitmapTransformation;
    public final ColorSpace colorSpace;
    public final ImageDecoder customImageDecoder;
    public final boolean decodeAllFrames;
    public final boolean decodePreviewFrame;
    private final boolean excludeBitmapConfigFromComparison;
    public final boolean forceStaticImage;
    public final int maxDimensionPx;
    public final int minDecodeIntervalMs;
    public final boolean useLastFrameForPreview;

    public ImageDecodeOptions(ImageDecodeOptionsBuilder imageDecodeOptionsBuilder) {
        this.minDecodeIntervalMs = imageDecodeOptionsBuilder.getMinDecodeIntervalMs();
        this.maxDimensionPx = imageDecodeOptionsBuilder.getMaxDimensionPx();
        this.decodePreviewFrame = imageDecodeOptionsBuilder.getDecodePreviewFrame();
        this.useLastFrameForPreview = imageDecodeOptionsBuilder.getUseLastFrameForPreview();
        this.decodeAllFrames = imageDecodeOptionsBuilder.getDecodeAllFrames();
        this.forceStaticImage = imageDecodeOptionsBuilder.getForceStaticImage();
        this.bitmapConfig = imageDecodeOptionsBuilder.getBitmapConfig();
        this.animatedBitmapConfig = imageDecodeOptionsBuilder.getAnimatedBitmapConfig();
        this.customImageDecoder = imageDecodeOptionsBuilder.getCustomImageDecoder();
        this.bitmapTransformation = imageDecodeOptionsBuilder.getBitmapTransformation();
        this.colorSpace = imageDecodeOptionsBuilder.getColorSpace();
        this.excludeBitmapConfigFromComparison = imageDecodeOptionsBuilder.getExcludeBitmapConfigFromComparison();
    }

    public static ImageDecodeOptions defaults() {
        return DEFAULTS;
    }

    public static ImageDecodeOptionsBuilder newBuilder() {
        return new ImageDecodeOptionsBuilder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageDecodeOptions imageDecodeOptions = (ImageDecodeOptions) obj;
        if (this.minDecodeIntervalMs == imageDecodeOptions.minDecodeIntervalMs && this.maxDimensionPx == imageDecodeOptions.maxDimensionPx && this.decodePreviewFrame == imageDecodeOptions.decodePreviewFrame && this.useLastFrameForPreview == imageDecodeOptions.useLastFrameForPreview && this.decodeAllFrames == imageDecodeOptions.decodeAllFrames && this.forceStaticImage == imageDecodeOptions.forceStaticImage) {
            boolean z = this.excludeBitmapConfigFromComparison;
            if (z || this.bitmapConfig == imageDecodeOptions.bitmapConfig) {
                return (z || this.animatedBitmapConfig == imageDecodeOptions.animatedBitmapConfig) && this.customImageDecoder == imageDecodeOptions.customImageDecoder && this.bitmapTransformation == imageDecodeOptions.bitmapTransformation && this.colorSpace == imageDecodeOptions.colorSpace;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i = (((((((((this.minDecodeIntervalMs * 31) + this.maxDimensionPx) * 31) + (this.decodePreviewFrame ? 1 : 0)) * 31) + (this.useLastFrameForPreview ? 1 : 0)) * 31) + (this.decodeAllFrames ? 1 : 0)) * 31) + (this.forceStaticImage ? 1 : 0);
        if (!this.excludeBitmapConfigFromComparison) {
            i = (i * 31) + this.bitmapConfig.ordinal();
        }
        if (!this.excludeBitmapConfigFromComparison) {
            Bitmap.Config config = this.animatedBitmapConfig;
            i = (i * 31) + (config != null ? config.ordinal() : 0);
        }
        ImageDecoder imageDecoder = this.customImageDecoder;
        int hashCode = imageDecoder != null ? imageDecoder.hashCode() : 0;
        BitmapTransformation bitmapTransformation = this.bitmapTransformation;
        int hashCode2 = bitmapTransformation != null ? bitmapTransformation.hashCode() : 0;
        ColorSpace colorSpace = this.colorSpace;
        return (((((i * 31) + hashCode) * 31) + hashCode2) * 31) + (colorSpace != null ? colorSpace.hashCode() : 0);
    }

    public String toString() {
        return "ImageDecodeOptions{" + toStringHelper().toString() + "}";
    }

    protected Fragment.AnonymousClass7.values toStringHelper() {
        return Fragment.AnonymousClass7.valueOf(this).toString("minDecodeIntervalMs", this.minDecodeIntervalMs).toString("maxDimensionPx", this.maxDimensionPx).toString("decodePreviewFrame", this.decodePreviewFrame).toString("useLastFrameForPreview", this.useLastFrameForPreview).toString("decodeAllFrames", this.decodeAllFrames).toString("forceStaticImage", this.forceStaticImage).ah$a("bitmapConfigName", this.bitmapConfig.name()).ah$a("animatedBitmapConfigName", this.animatedBitmapConfig.name()).ah$a("customImageDecoder", this.customImageDecoder).ah$a("bitmapTransformation", this.bitmapTransformation).ah$a("colorSpace", this.colorSpace);
    }
}
