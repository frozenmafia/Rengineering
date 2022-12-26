package com.facebook.jni;

import o.ComputableLiveData;
/* loaded from: classes6.dex */
public class ThreadScopeSupport {
    private static native void runStdFunctionImpl(long j);

    static {
        ComputableLiveData.values("fbjni");
    }

    private static void runStdFunction(long j) {
        runStdFunctionImpl(j);
    }
}
