package com.google.android.gms.measurement.internal;
/* loaded from: classes7.dex */
final class zzju implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzkc zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzju(zzkc zzkcVar, long j) {
        this.zzb = zzkcVar;
        this.zza = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkc.zzl(this.zzb, this.zza);
    }
}
