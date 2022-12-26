package com.facebook.react.fabric;

import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
/* loaded from: classes6.dex */
public class CoreComponentsRegistry {
    private final HybridData mHybridData;

    private native HybridData initHybrid(ComponentFactory componentFactory);

    static {
        SoLoader.values("fabricjni");
    }
}
