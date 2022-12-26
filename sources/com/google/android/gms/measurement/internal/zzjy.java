package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.exoplayer2.ExoPlayer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzjy {
    final /* synthetic */ zzkc zza;
    private zzjx zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjy(zzkc zzkcVar) {
        this.zza = zzkcVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(long j) {
        Handler handler;
        this.zzb = new zzjx(this, this.zza.zzt.zzav().currentTimeMillis(), j);
        handler = this.zza.zzd;
        handler.postDelayed(this.zzb, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb() {
        Handler handler;
        this.zza.zzg();
        zzjx zzjxVar = this.zzb;
        if (zzjxVar != null) {
            handler = this.zza.zzd;
            handler.removeCallbacks(zzjxVar);
        }
        this.zza.zzt.zzm().zzm.zza(false);
    }
}
