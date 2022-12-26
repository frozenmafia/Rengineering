package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
/* loaded from: classes4.dex */
public class CxxModuleWrapper extends CxxModuleWrapperBase {
    private static native CxxModuleWrapper makeDsoNative(String str, String str2);

    protected CxxModuleWrapper(HybridData hybridData) {
        super(hybridData);
    }

    public static CxxModuleWrapper makeDso(String str, String str2) {
        SoLoader.values(str);
        return makeDsoNative(SoLoader.ag$a(str).getAbsolutePath(), str2);
    }
}
