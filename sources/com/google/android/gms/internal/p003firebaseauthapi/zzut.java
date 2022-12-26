package com.google.android.gms.internal.p003firebaseauthapi;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzut  reason: invalid package */
/* loaded from: classes5.dex */
public final class zzut implements Runnable {
    final /* synthetic */ zzuv zza;
    final /* synthetic */ zzuu zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzut(zzuu zzuuVar, zzuv zzuvVar) {
        this.zzb = zzuuVar;
        this.zza = zzuvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb.zza.zzh) {
            if (!this.zzb.zza.zzh.isEmpty()) {
                this.zza.zza(this.zzb.zza.zzh.get(0), new Object[0]);
            }
        }
    }
}
