package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzjx implements Runnable {
    final long zza;
    final long zzb;
    final /* synthetic */ zzjy zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjx(zzjy zzjyVar, long j, long j2) {
        this.zzc = zzjyVar;
        this.zza = j;
        this.zzb = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zzt.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjw
            @Override // java.lang.Runnable
            public final void run() {
                zzjx zzjxVar = zzjx.this;
                zzjy zzjyVar = zzjxVar.zzc;
                long j = zzjxVar.zza;
                long j2 = zzjxVar.zzb;
                zzjyVar.zza.zzg();
                zzjyVar.zza.zzt.zzay().zzc().zza("Application going to the background");
                zzjyVar.zza.zzt.zzm().zzm.zza(true);
                Bundle bundle = new Bundle();
                if (!zzjyVar.zza.zzt.zzf().zzu()) {
                    zzjyVar.zza.zzb.zzb(j2);
                    zzjyVar.zza.zzb.zzd(false, false, j2);
                }
                zzjyVar.zza.zzt.zzq().zzH("auto", "_ab", j, bundle);
            }
        });
    }
}
