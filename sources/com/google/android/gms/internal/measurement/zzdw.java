package com.google.android.gms.internal.measurement;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzdw extends zzch {
    private final com.google.android.gms.measurement.internal.zzgs zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdw(com.google.android.gms.measurement.internal.zzgs zzgsVar) {
        this.zza = zzgsVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final int zzd() {
        return System.identityHashCode(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final void zze(String str, String str2, Bundle bundle, long j) {
        this.zza.onEvent(str, str2, bundle, j);
    }
}
