package com.google.android.gms.internal.gtm;

import java.util.concurrent.ExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzds implements Runnable {
    private final /* synthetic */ zzdq zzanc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzds(zzdq zzdqVar) {
        this.zzanc = zzdqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ExecutorService executorService;
        executorService = this.zzanc.zzamv;
        executorService.execute(new zzdw(this.zzanc, null));
    }
}
