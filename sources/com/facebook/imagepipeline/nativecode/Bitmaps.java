package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import o.Fragment;
/* loaded from: classes4.dex */
public class Bitmaps {
    private static native void nativeCopyBitmap(Bitmap bitmap, int i, Bitmap bitmap2, int i2, int i3);

    static {
        ImagePipelineNativeLoader.load();
    }

    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(bitmap2.getConfig() == bitmap.getConfig()));
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(bitmap.isMutable()));
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(bitmap.getWidth() == bitmap2.getWidth()));
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(bitmap.getHeight() == bitmap2.getHeight()));
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }
}
