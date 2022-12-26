package com.google.android.gms.internal.gtm;

import android.os.Looper;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzbt implements Runnable {
    private final /* synthetic */ zzbs zzyu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbt(zzbs zzbsVar) {
        this.zzyu = zzbsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzap zzapVar;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            boolean zzez = this.zzyu.zzez();
            this.zzyu.zzyt = 0L;
            if (zzez) {
                this.zzyu.run();
                return;
            }
            return;
        }
        zzapVar = this.zzyu.zzwc;
        zzapVar.zzcq().zza(this);
    }
}
