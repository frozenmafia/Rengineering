package com.google.android.gms.internal.p003firebaseauthapi;

import o.shouldMeasureTwice;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpa  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzpa implements zzuz<zzxl> {
    final /* synthetic */ zztl zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzpa(zzpt zzptVar, zztl zztlVar) {
        this.zza = zztlVar;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzuy
    public final void zza(String str) {
        this.zza.zzh(shouldMeasureTwice.valueOf(str));
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzuz
    public final /* bridge */ /* synthetic */ void zzb(zzxl zzxlVar) {
        this.zza.zzb(zzxlVar.zzb());
    }
}
