package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes4.dex */
final class aqv extends aqj {
    final /* synthetic */ TaskCompletionSource a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aqv(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqk
    public final void b(int i) {
        this.a.trySetException(new aqs(i));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqk
    public final void c(aqp aqpVar) {
        this.a.trySetResult(aqpVar.a());
    }
}
