package com.google.ads.interactivemedia.v3.api;
/* loaded from: classes4.dex */
public interface AdErrorEvent {

    /* loaded from: classes4.dex */
    public interface AdErrorListener {
        void onAdError(AdErrorEvent adErrorEvent);
    }

    AdError getError();

    Object getUserRequestContext();
}
