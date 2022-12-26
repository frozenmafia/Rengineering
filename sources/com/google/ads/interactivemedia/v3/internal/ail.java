package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.AdsManager;
import com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent;
import com.google.ads.interactivemedia.v3.api.StreamManager;
/* loaded from: classes4.dex */
public final class ail implements AdsManagerLoadedEvent {
    private final AdsManager a;

    /* renamed from: b  reason: collision with root package name */
    private final StreamManager f577b;
    private final Object c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ail(AdsManager adsManager, Object obj) {
        this.a = adsManager;
        this.f577b = null;
        this.c = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ail(StreamManager streamManager, Object obj) {
        this.a = null;
        this.f577b = streamManager;
        this.c = obj;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent
    public final AdsManager getAdsManager() {
        return this.a;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent
    public final StreamManager getStreamManager() {
        return this.f577b;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent
    public final Object getUserRequestContext() {
        return this.c;
    }
}
