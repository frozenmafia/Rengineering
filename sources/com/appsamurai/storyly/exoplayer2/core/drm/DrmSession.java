package com.appsamurai.storyly.exoplayer2.core.drm;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import o.BundleKt$ah$a;
import o.getSplashScreenView;
/* loaded from: classes3.dex */
public interface DrmSession {
    Map<String, String> HaptikSDK$c();

    getSplashScreenView ag$a();

    boolean ag$a(String str);

    UUID ah$a();

    boolean invoke();

    DrmSessionException valueOf();

    void valueOf(BundleKt$ah$a bundleKt$ah$a);

    int values();

    void values(BundleKt$ah$a bundleKt$ah$a);

    /* loaded from: classes3.dex */
    public static class DrmSessionException extends IOException {
        public final int errorCode;

        public DrmSessionException(Throwable th, int i) {
            super(th);
            this.errorCode = i;
        }
    }
}
