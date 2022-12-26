package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import com.facebook.imagepipeline.image.EncodedImage;
import o.FragmentActivity;
/* loaded from: classes4.dex */
public interface PlatformDecoder {
    FragmentActivity.AnonymousClass1<Bitmap> decodeFromEncodedImage(EncodedImage encodedImage, Bitmap.Config config, Rect rect);

    FragmentActivity.AnonymousClass1<Bitmap> decodeFromEncodedImageWithColorSpace(EncodedImage encodedImage, Bitmap.Config config, Rect rect, ColorSpace colorSpace);

    FragmentActivity.AnonymousClass1<Bitmap> decodeJPEGFromEncodedImage(EncodedImage encodedImage, Bitmap.Config config, Rect rect, int i);

    FragmentActivity.AnonymousClass1<Bitmap> decodeJPEGFromEncodedImageWithColorSpace(EncodedImage encodedImage, Bitmap.Config config, Rect rect, int i, ColorSpace colorSpace);
}
