package com.google.android.gms.measurement.internal;
/* loaded from: classes7.dex */
final class zzgd implements Runnable {
    final /* synthetic */ zzaw zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzgj zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgd(zzgj zzgjVar, zzaw zzawVar, String str) {
        this.zzc = zzgjVar;
        this.zza = zzawVar;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkt zzktVar;
        zzkt zzktVar2;
        zzktVar = this.zzc.zza;
        zzktVar.zzA();
        zzktVar2 = this.zzc.zza;
        zzktVar2.zzF(this.zza, this.zzb);
    }
}
