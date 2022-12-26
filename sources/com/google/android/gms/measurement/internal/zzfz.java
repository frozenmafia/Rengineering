package com.google.android.gms.measurement.internal;
/* loaded from: classes7.dex */
final class zzfz implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzgj zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfz(zzgj zzgjVar, zzq zzqVar) {
        this.zzb = zzgjVar;
        this.zza = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkt zzktVar;
        zzkt zzktVar2;
        zzktVar = this.zzb.zza;
        zzktVar.zzA();
        zzktVar2 = this.zzb.zza;
        zzktVar2.zzQ(this.zza);
    }
}
