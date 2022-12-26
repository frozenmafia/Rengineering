package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzih implements Runnable {
    final /* synthetic */ zzie zza;
    final /* synthetic */ zzie zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzim zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzih(zzim zzimVar, zzie zzieVar, zzie zzieVar2, long j, boolean z) {
        this.zze = zzimVar;
        this.zza = zzieVar;
        this.zzb = zzieVar2;
        this.zzc = j;
        this.zzd = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzim.zzo(this.zze, this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
