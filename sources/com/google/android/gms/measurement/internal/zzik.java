package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzik implements Runnable {
    final /* synthetic */ zzie zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzim zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzik(zzim zzimVar, zzie zzieVar, long j) {
        this.zzc = zzimVar;
        this.zza = zzieVar;
        this.zzb = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzim.zzq(this.zzc, this.zza, false, this.zzb);
        zzim zzimVar = this.zzc;
        zzimVar.zza = null;
        zzimVar.zzt.zzt().zzG(null);
    }
}
