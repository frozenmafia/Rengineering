package com.google.android.gms.measurement.internal;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzkk implements zzej {
    final /* synthetic */ String zza;
    final /* synthetic */ zzkt zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkk(zzkt zzktVar, String str) {
        this.zzb = zzktVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final void zza(String str, int i, Throwable th, byte[] bArr, Map map) {
        this.zzb.zzK(i, th, bArr, this.zza);
    }
}
