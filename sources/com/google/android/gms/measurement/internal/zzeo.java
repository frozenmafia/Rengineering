package com.google.android.gms.measurement.internal;
/* loaded from: classes7.dex */
final class zzeo implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzep zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeo(zzep zzepVar, boolean z) {
        this.zzb = zzepVar;
        this.zza = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkt zzktVar;
        zzktVar = this.zzb.zzb;
        zzktVar.zzJ(this.zza);
    }
}
