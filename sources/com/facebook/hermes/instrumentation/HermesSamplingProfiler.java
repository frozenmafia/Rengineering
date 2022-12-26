package com.facebook.hermes.instrumentation;

import com.facebook.soloader.SoLoader;
/* loaded from: classes6.dex */
public class HermesSamplingProfiler {
    public static native void disable();

    public static native void dumpSampledTraceToFile(String str);

    public static native void enable();

    static {
        SoLoader.values("jsijniprofiler");
    }

    private HermesSamplingProfiler() {
    }
}
