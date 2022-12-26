package com.google.ads.interactivemedia.v3.internal;

import android.os.StrictMode;
/* loaded from: classes4.dex */
public final class aqc {
    public static Object a(atd atdVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return atdVar.a();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
