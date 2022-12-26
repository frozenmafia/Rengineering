package com.google.android.gms.analytics;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzl implements Runnable {
    private final /* synthetic */ zzg zzsw;
    private final /* synthetic */ zzk zzsx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzl(zzk zzkVar, zzg zzgVar) {
        this.zzsx = zzkVar;
        this.zzsw = zzgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<zzn> list;
        this.zzsw.zzap().zza(this.zzsw);
        list = this.zzsx.zzsr;
        for (zzn zznVar : list) {
            zznVar.zza(this.zzsw);
        }
        zzk zzkVar = this.zzsx;
        zzk.zzb(this.zzsw);
    }
}
