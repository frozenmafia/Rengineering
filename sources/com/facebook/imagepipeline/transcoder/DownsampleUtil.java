package com.facebook.imagepipeline.transcoder;

import com.facebook.imageformat.DefaultImageFormats;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.image.EncodedImage;
import o.Fragment;
import o.FragmentActivity;
/* loaded from: classes4.dex */
public class DownsampleUtil {
    public static final int DEFAULT_SAMPLE_SIZE = 1;
    private static final float INTERVAL_ROUNDING = 0.33333334f;

    public static int ratioToSampleSizeJPEG(float f) {
        if (f > 0.6666667f) {
            return 1;
        }
        int i = 2;
        while (true) {
            int i2 = i * 2;
            double d = 1.0d / i2;
            if (d + (0.3333333432674408d * d) <= f) {
                return i;
            }
            i = i2;
        }
    }

    public static int roundToPowerOfTwo(int i) {
        int i2 = 1;
        while (i2 < i) {
            i2 *= 2;
        }
        return i2;
    }

    private DownsampleUtil() {
    }

    public static int determineSampleSize(RotationOptions rotationOptions, ResizeOptions resizeOptions, EncodedImage encodedImage, int i) {
        int ratioToSampleSize;
        if (EncodedImage.isMetaDataAvailable(encodedImage)) {
            float determineDownsampleRatio = determineDownsampleRatio(rotationOptions, resizeOptions, encodedImage);
            if (encodedImage.getImageFormat() == DefaultImageFormats.JPEG) {
                ratioToSampleSize = ratioToSampleSizeJPEG(determineDownsampleRatio);
            } else {
                ratioToSampleSize = ratioToSampleSize(determineDownsampleRatio);
            }
            int max = Math.max(encodedImage.getHeight(), encodedImage.getWidth());
            float f = resizeOptions != null ? resizeOptions.maxBitmapSize : i;
            while (max / ratioToSampleSize > f) {
                ratioToSampleSize = encodedImage.getImageFormat() == DefaultImageFormats.JPEG ? ratioToSampleSize * 2 : ratioToSampleSize + 1;
            }
            return ratioToSampleSize;
        }
        return 1;
    }

    public static int determineSampleSizeJPEG(EncodedImage encodedImage, int i, int i2) {
        int sampleSize = encodedImage.getSampleSize();
        while ((((encodedImage.getWidth() * encodedImage.getHeight()) * i) / sampleSize) / sampleSize > i2) {
            sampleSize *= 2;
        }
        return sampleSize;
    }

    public static float determineDownsampleRatio(RotationOptions rotationOptions, ResizeOptions resizeOptions, EncodedImage encodedImage) {
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(EncodedImage.isMetaDataAvailable(encodedImage)));
        if (resizeOptions == null || resizeOptions.height <= 0 || resizeOptions.width <= 0 || encodedImage.getWidth() == 0 || encodedImage.getHeight() == 0) {
            return 1.0f;
        }
        int rotationAngle = getRotationAngle(rotationOptions, encodedImage);
        boolean z = rotationAngle == 90 || rotationAngle == 270;
        int height = z ? encodedImage.getHeight() : encodedImage.getWidth();
        int width = z ? encodedImage.getWidth() : encodedImage.getHeight();
        float f = resizeOptions.width / height;
        float f2 = resizeOptions.height / width;
        float max = Math.max(f, f2);
        FragmentActivity.values("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f", Integer.valueOf(resizeOptions.width), Integer.valueOf(resizeOptions.height), Integer.valueOf(height), Integer.valueOf(width), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(max));
        return max;
    }

    public static int ratioToSampleSize(float f) {
        if (f > 0.6666667f) {
            return 1;
        }
        int i = 2;
        while (true) {
            double d = i;
            if ((1.0d / d) + ((1.0d / (Math.pow(d, 2.0d) - d)) * 0.3333333432674408d) <= f) {
                return i - 1;
            }
            i++;
        }
    }

    private static int getRotationAngle(RotationOptions rotationOptions, EncodedImage encodedImage) {
        boolean z = false;
        if (rotationOptions.useImageMetadata()) {
            int rotationAngle = encodedImage.getRotationAngle();
            Fragment.AnonymousClass8.valueOf(Boolean.valueOf((rotationAngle == 0 || rotationAngle == 90 || rotationAngle == 180 || rotationAngle == 270) ? true : true));
            return rotationAngle;
        }
        return 0;
    }
}
