package com.google.android.gms.internal.gtm;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzak implements Runnable {
    private final /* synthetic */ zzae zzvw;
    private final /* synthetic */ zzbw zzwb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzak(zzae zzaeVar, zzbw zzbwVar) {
        this.zzvw = zzaeVar;
        this.zzwb = zzbwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbb zzbbVar;
        zzbbVar = this.zzvw.zzvu;
        zzbbVar.zzb(this.zzwb);
    }
}
