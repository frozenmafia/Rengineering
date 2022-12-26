package com.facebook.react.perflogger;

import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
/* loaded from: classes4.dex */
public abstract class NativeModulePerfLogger {
    private static volatile boolean valueOf;
    private final HybridData mHybridData;

    public abstract void HaptikSDK$a(String str, int i);

    public abstract void HaptikSDK$b(String str, int i);

    public abstract void HaptikSDK$c(String str, int i);

    public abstract void ag$a(String str, int i);

    public abstract void ah$a(String str, int i);

    public abstract void ah$b(String str, int i);

    public abstract void invoke(String str, int i);

    public abstract void toString(String str, int i);

    public abstract void valueOf(String str, int i);

    protected abstract HybridData values();

    public abstract void values(String str, int i);

    protected NativeModulePerfLogger() {
        valueOf();
        ag$a();
        this.mHybridData = values();
    }

    private static void ag$a() {
        synchronized (NativeModulePerfLogger.class) {
            if (!valueOf) {
                SoLoader.values("reactperfloggerjni");
                valueOf = true;
            }
        }
    }

    protected void valueOf() {
        synchronized (this) {
        }
    }
}
