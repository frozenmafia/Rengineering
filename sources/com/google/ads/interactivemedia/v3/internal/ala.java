package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.esp.EspAdapter;
import com.google.ads.interactivemedia.v3.api.esp.EspCollectSignalsCallback;
import com.google.ads.interactivemedia.v3.api.esp.EspVersion;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ala implements EspCollectSignalsCallback {
    final /* synthetic */ TaskCompletionSource a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ alb f615b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ala(alb albVar, TaskCompletionSource taskCompletionSource) {
        this.f615b = albVar;
        this.a = taskCompletionSource;
    }

    @Override // com.google.ads.interactivemedia.v3.api.esp.EspCollectSignalsCallback
    public final void onFailure(Exception exc) {
        this.a.trySetException(exc);
    }

    @Override // com.google.ads.interactivemedia.v3.api.esp.EspCollectSignalsCallback
    public final void onSuccess(String str) {
        EspAdapter espAdapter;
        EspAdapter espAdapter2;
        espAdapter = this.f615b.a;
        EspVersion version = espAdapter.getVersion();
        espAdapter2 = this.f615b.a;
        this.a.trySetResult(com.google.ads.interactivemedia.v3.impl.data.bc.create(version, espAdapter2.getSDKVersion(), this.f615b.e(), str));
    }
}
