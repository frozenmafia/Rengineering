package com.google.android.gms.internal.gtm;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzai implements Runnable {
    private final /* synthetic */ zzae zzvw;
    private final /* synthetic */ zzcd zzwa;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzai(zzae zzaeVar, zzcd zzcdVar) {
        this.zzvw = zzaeVar;
        this.zzwa = zzcdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbb zzbbVar;
        zzbbVar = this.zzvw.zzvu;
        zzbbVar.zza(this.zzwa);
    }
}
