package com.google.android.gms.internal.p003firebaseauthapi;

import java.util.List;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpg  reason: invalid package */
/* loaded from: classes7.dex */
final class zzpg implements zzuz<zzwh> {
    final /* synthetic */ zzuz zza;
    final /* synthetic */ zzwq zzb;
    final /* synthetic */ zzph zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzpg(zzph zzphVar, zzuz zzuzVar, zzwq zzwqVar) {
        this.zzc = zzphVar;
        this.zza = zzuzVar;
        this.zzb = zzwqVar;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzuy
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzuz
    public final /* synthetic */ void zzb(zzwh zzwhVar) {
        List<zzwj> zzb = zzwhVar.zzb();
        if (zzb == null || zzb.isEmpty()) {
            this.zza.zza("No users");
        } else {
            this.zzc.zza.zzi(this.zzb, zzb.get(0));
        }
    }
}
