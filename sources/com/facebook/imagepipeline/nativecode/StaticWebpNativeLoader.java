package com.facebook.imagepipeline.nativecode;

import android.os.Build;
import o.ComputableLiveData;
/* loaded from: classes4.dex */
public class StaticWebpNativeLoader {
    private static boolean sInitialized;

    public static void ensure() {
        synchronized (StaticWebpNativeLoader.class) {
            if (!sInitialized) {
                if (Build.VERSION.SDK_INT <= 16) {
                    try {
                        ComputableLiveData.values("fb_jpegturbo");
                    } catch (UnsatisfiedLinkError unused) {
                    }
                }
                ComputableLiveData.values("static-webp");
                sInitialized = true;
            }
        }
    }
}
