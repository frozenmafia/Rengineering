package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
/* loaded from: classes4.dex */
public final class ahy implements AdErrorEvent {
    private final AdError a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f565b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ahy(AdError adError) {
        this.a = adError;
        this.f565b = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ahy(AdError adError, Object obj) {
        this.a = adError;
        this.f565b = obj;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdErrorEvent
    public final AdError getError() {
        return this.a;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdErrorEvent
    public final Object getUserRequestContext() {
        return this.f565b;
    }
}
