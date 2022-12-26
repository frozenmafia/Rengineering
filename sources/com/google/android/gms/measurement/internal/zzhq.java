package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzhq implements Runnable {
    final /* synthetic */ Boolean zza;
    final /* synthetic */ zzhx zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhq(zzhx zzhxVar, Boolean bool) {
        this.zzb = zzhxVar;
        this.zza = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzaa(this.zza, true);
    }
}
