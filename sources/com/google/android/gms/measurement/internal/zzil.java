package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzil implements Runnable {
    final /* synthetic */ zzim zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzil(zzim zzimVar) {
        this.zza = zzimVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzim.zzm(this.zza, null);
    }
}
