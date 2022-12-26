package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.esp.EspInitializeCallback;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class akz implements EspInitializeCallback {
    final /* synthetic */ alb a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public akz(alb albVar) {
        this.a = albVar;
    }

    @Override // com.google.ads.interactivemedia.v3.api.esp.EspInitializeCallback
    public final void onFailure(Exception exc) {
        TaskCompletionSource taskCompletionSource;
        taskCompletionSource = this.a.d;
        taskCompletionSource.trySetException(exc);
    }

    @Override // com.google.ads.interactivemedia.v3.api.esp.EspInitializeCallback
    public final void onSuccess() {
        TaskCompletionSource taskCompletionSource;
        taskCompletionSource = this.a.d;
        taskCompletionSource.trySetResult(null);
    }
}
