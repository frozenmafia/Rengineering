package com.google.android.gms.internal.gtm;

import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzct implements zzbw {
    private final /* synthetic */ Runnable zzacj;
    private final /* synthetic */ zzcq zzack;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzct(zzcq zzcqVar, Runnable runnable) {
        this.zzack = zzcqVar;
        this.zzacj = runnable;
    }

    @Override // com.google.android.gms.internal.gtm.zzbw
    public final void zza(Throwable th) {
        Handler handler;
        handler = this.zzack.handler;
        handler.post(this.zzacj);
    }
}
