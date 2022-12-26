package com.google.android.gms.internal.gtm;
/* loaded from: classes7.dex */
final class zzag implements Runnable {
    private final /* synthetic */ zzae zzvw;
    private final /* synthetic */ boolean zzvx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzag(zzae zzaeVar, boolean z) {
        this.zzvw = zzaeVar;
        this.zzvx = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbb zzbbVar;
        zzbbVar = this.zzvw.zzvu;
        zzbbVar.zzec();
    }
}
