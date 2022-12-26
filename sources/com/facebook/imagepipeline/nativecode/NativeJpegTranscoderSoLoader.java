package com.facebook.imagepipeline.nativecode;

import android.os.Build;
import o.ComputableLiveData;
/* loaded from: classes4.dex */
public class NativeJpegTranscoderSoLoader {
    private static boolean sInitialized;

    public static void ensure() {
        synchronized (NativeJpegTranscoderSoLoader.class) {
            if (!sInitialized) {
                if (Build.VERSION.SDK_INT <= 16) {
                    try {
                        ComputableLiveData.ag$a("fb_jpegturbo", 1);
                    } catch (UnsatisfiedLinkError unused) {
                    }
                }
                ComputableLiveData.values("native-imagetranscoder");
                sInitialized = true;
            }
        }
    }
}
