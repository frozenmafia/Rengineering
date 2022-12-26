package com.facebook.react.fabric.events;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import o.isFragmentViewChild;
/* loaded from: classes6.dex */
public class EventEmitterWrapper {
    private final HybridData mHybridData = initHybrid();

    private static native HybridData initHybrid();

    private native void invokeEvent(String str, NativeMap nativeMap, int i);

    private native void invokeUniqueEvent(String str, NativeMap nativeMap, int i);

    static {
        isFragmentViewChild.ag$a();
    }

    private EventEmitterWrapper() {
    }

    public void toString(String str, WritableMap writableMap, int i) {
        synchronized (this) {
            if (ag$a()) {
                invokeEvent(str, writableMap == null ? new WritableNativeMap() : (NativeMap) writableMap, i);
            }
        }
    }

    public void valueOf(String str, WritableMap writableMap, int i) {
        synchronized (this) {
            if (ag$a()) {
                invokeUniqueEvent(str, writableMap == null ? new WritableNativeMap() : (NativeMap) writableMap, i);
            }
        }
    }

    public void values() {
        synchronized (this) {
            HybridData hybridData = this.mHybridData;
            if (hybridData != null) {
                hybridData.resetNative();
            }
        }
    }

    private boolean ag$a() {
        HybridData hybridData = this.mHybridData;
        if (hybridData != null) {
            return hybridData.isValid();
        }
        return false;
    }
}
