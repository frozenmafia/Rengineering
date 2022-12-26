package com.facebook.react.fabric;

import com.facebook.jni.HybridData;
import o.isFragmentViewChild;
/* loaded from: classes6.dex */
public class ComponentFactory {
    private final HybridData mHybridData = initHybrid();

    private static native HybridData initHybrid();

    static {
        isFragmentViewChild.ag$a();
    }
}
