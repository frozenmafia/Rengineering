package com.google.android.gms.internal.p003firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbk  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzbk implements zzbm {
    final /* synthetic */ zzbi zza;
    final /* synthetic */ zzav zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbk(zzbi zzbiVar, zzav zzavVar) {
        this.zza = zzbiVar;
        this.zzb = zzavVar;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzbm
    public final <Q> zzan<Q> zza(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new zzbh(this.zza, this.zzb, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzbm
    public final zzan<?> zzb() {
        zzbi zzbiVar = this.zza;
        return new zzbh(zzbiVar, this.zzb, zzbiVar.zzd());
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzbm
    public final Class<?> zzc() {
        return this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzbm
    public final Class<?> zzd() {
        return this.zzb.getClass();
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzbm
    public final Set<Class<?>> zze() {
        return this.zza.zzh();
    }
}
