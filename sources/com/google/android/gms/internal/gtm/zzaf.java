package com.google.android.gms.internal.gtm;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzaf implements Runnable {
    private final /* synthetic */ int zzvv;
    private final /* synthetic */ zzae zzvw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaf(zzae zzaeVar, int i) {
        this.zzvw = zzaeVar;
        this.zzvv = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbb zzbbVar;
        zzbbVar = this.zzvw.zzvu;
        zzbbVar.zzg(this.zzvv * 1000);
    }
}
