package com.facebook.hermes.reactexecutor;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.soloader.SoLoader;
/* loaded from: classes4.dex */
public class HermesExecutor extends JavaScriptExecutor {
    private static String mode_;

    public static native boolean canLoadFile(String str);

    private static native HybridData initHybrid(long j);

    private static native HybridData initHybridDefaultConfig();

    static {
        loadLibrary();
    }

    public static void loadLibrary() throws UnsatisfiedLinkError {
        if (mode_ == null) {
            SoLoader.values("hermes");
            try {
                SoLoader.values("hermes-executor-debug");
                mode_ = "Debug";
            } catch (UnsatisfiedLinkError unused) {
                SoLoader.values("hermes-executor-release");
                mode_ = "Release";
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HermesExecutor(RuntimeConfig runtimeConfig) {
        super(runtimeConfig == null ? initHybridDefaultConfig() : initHybrid(runtimeConfig.heapSizeMB));
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public String getName() {
        return "HermesExecutor" + mode_;
    }
}
