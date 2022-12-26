package com.google.android.gms.internal.gtm;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzdr implements Runnable {
    private final /* synthetic */ zzdq zzanc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdr(zzdq zzdqVar) {
        this.zzanc = zzdqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        zzff zzffVar;
        i = this.zzanc.state;
        if (i == 2) {
            zzffVar = this.zzanc.zzamz;
            zzffVar.dispatch();
        }
    }
}
