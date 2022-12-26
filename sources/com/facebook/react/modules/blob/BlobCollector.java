package com.facebook.react.modules.blob;

import com.facebook.soloader.SoLoader;
/* loaded from: classes4.dex */
class BlobCollector {
    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeInstall(Object obj, long j);

    BlobCollector() {
    }

    static {
        SoLoader.values("reactnativeblob");
    }
}
