package com.facebook.imagepipeline.nativecode;

import android.os.Build;
import com.facebook.imageformat.DefaultImageFormats;
import com.facebook.imageformat.ImageFormat;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import o.FragmentAnim;
/* loaded from: classes4.dex */
public class WebpTranscoderImpl implements WebpTranscoder {
    private static native void nativeTranscodeWebpToJpeg(InputStream inputStream, OutputStream outputStream, int i) throws IOException;

    private static native void nativeTranscodeWebpToPng(InputStream inputStream, OutputStream outputStream) throws IOException;

    @Override // com.facebook.imagepipeline.nativecode.WebpTranscoder
    public boolean isWebpNativelySupported(ImageFormat imageFormat) {
        if (imageFormat == DefaultImageFormats.WEBP_SIMPLE) {
            return Build.VERSION.SDK_INT >= 14;
        } else if (imageFormat == DefaultImageFormats.WEBP_LOSSLESS || imageFormat == DefaultImageFormats.WEBP_EXTENDED || imageFormat == DefaultImageFormats.WEBP_EXTENDED_WITH_ALPHA) {
            return FragmentAnim.AnonymousClass2.AnonymousClass1.values;
        } else {
            if (imageFormat == DefaultImageFormats.WEBP_ANIMATED) {
                return false;
            }
            throw new IllegalArgumentException("Image format is not a WebP.");
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.WebpTranscoder
    public void transcodeWebpToJpeg(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        StaticWebpNativeLoader.ensure();
        nativeTranscodeWebpToJpeg((InputStream) inputStream.getClass(), (OutputStream) outputStream.getClass(), i);
    }

    @Override // com.facebook.imagepipeline.nativecode.WebpTranscoder
    public void transcodeWebpToPng(InputStream inputStream, OutputStream outputStream) throws IOException {
        StaticWebpNativeLoader.ensure();
        nativeTranscodeWebpToPng((InputStream) inputStream.getClass(), (OutputStream) outputStream.getClass());
    }
}
