package com.google.android.gms.measurement.internal;
/* loaded from: classes7.dex */
final class zzjg implements Runnable {
    final /* synthetic */ zzdx zza;
    final /* synthetic */ zzjl zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjg(zzjl zzjlVar, zzdx zzdxVar) {
        this.zzb = zzjlVar;
        this.zza = zzdxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb) {
            this.zzb.zzb = false;
            if (!this.zzb.zza.zzL()) {
                this.zzb.zza.zzt.zzay().zzj().zza("Connected to service");
                this.zzb.zza.zzJ(this.zza);
            }
        }
    }
}
