package com.google.android.gms.internal.gtm;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzfq implements Runnable {
    private final /* synthetic */ zzfo zzapm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfq(zzfo zzfoVar) {
        this.zzapm = zzfoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzem zzemVar;
        this.zzapm.zzapi = false;
        zzemVar = this.zzapm.zzapg;
        zzemVar.dispatch();
    }
}
