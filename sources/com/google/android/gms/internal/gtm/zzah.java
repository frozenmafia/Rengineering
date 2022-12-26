package com.google.android.gms.internal.gtm;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzah implements Runnable {
    private final /* synthetic */ zzae zzvw;
    private final /* synthetic */ String zzvy;
    private final /* synthetic */ Runnable zzvz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzah(zzae zzaeVar, String str, Runnable runnable) {
        this.zzvw = zzaeVar;
        this.zzvy = str;
        this.zzvz = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbb zzbbVar;
        zzbbVar = this.zzvw.zzvu;
        zzbbVar.zzy(this.zzvy);
        Runnable runnable = this.zzvz;
        if (runnable != null) {
            runnable.run();
        }
    }
}
