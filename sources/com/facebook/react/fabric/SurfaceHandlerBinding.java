package com.facebook.react.fabric;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeMap;
import o.isFragmentViewChild;
/* loaded from: classes6.dex */
public class SurfaceHandlerBinding {
    private final HybridData mHybridData;

    private native String getModuleNameNative();

    private native int getSurfaceIdNative();

    private static native HybridData initHybrid(int i, String str);

    private native boolean isRunningNative();

    private native void setDisplayModeNative(int i);

    private native void setLayoutConstraintsNative(float f, float f2, float f3, float f4, float f5, float f6, boolean z, boolean z2, float f7);

    private native void setPropsNative(NativeMap nativeMap);

    private native void setSurfaceIdNative(int i);

    private native void startNative();

    private native void stopNative();

    static {
        isFragmentViewChild.ag$a();
    }
}
