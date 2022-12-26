package com.apxor.androidsdk.plugins.realtimeui.utils;
/* loaded from: classes3.dex */
public class c {
    public static float[] a(float f, int i) {
        float[] fArr = new float[8];
        if ((i & 1) == 1) {
            fArr[0] = f;
            fArr[1] = f;
        }
        if ((i & 4) == 4) {
            fArr[2] = f;
            fArr[3] = f;
        }
        if ((i & 16) == 16) {
            fArr[4] = f;
            fArr[5] = f;
        }
        if ((i & 8) == 8) {
            fArr[6] = f;
            fArr[7] = f;
        }
        return fArr;
    }
}
