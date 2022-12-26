package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
/* loaded from: classes4.dex */
public abstract class NativeArray implements NativeArrayInterface {
    private HybridData mHybridData;

    @Override // com.facebook.react.bridge.NativeArrayInterface
    public native String toString();

    static {
        ReactBridge.staticInit();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public NativeArray(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
