package com.google.android.gms.internal.gtm;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzaj implements Runnable {
    private final /* synthetic */ zzae zzvw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaj(zzae zzaeVar) {
        this.zzvw = zzaeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbb zzbbVar;
        zzbbVar = this.zzvw.zzvu;
        zzbbVar.zzch();
    }
}
