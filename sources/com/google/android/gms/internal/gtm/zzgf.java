package com.google.android.gms.internal.gtm;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzgf implements Runnable {
    final /* synthetic */ zzfy zzaqb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgf(zzfy zzfyVar) {
        this.zzaqb = zzfyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzaqb.zzamv.execute(new zzgg(this));
    }
}
