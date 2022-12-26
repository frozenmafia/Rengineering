package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import o.Fragment;
/* loaded from: classes4.dex */
public class NativeBlurFilter {
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);

    static {
        NativeFiltersLoader.load();
    }

    public static void iterativeBoxBlur(Bitmap bitmap, int i, int i2) {
        bitmap.getClass();
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(i > 0));
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(i2 > 0));
        nativeIterativeBoxBlur(bitmap, i, i2);
    }
}
