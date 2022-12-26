package com.google.android.gms.internal.p003firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbj  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzbj implements zzbm {
    final /* synthetic */ zzav zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbj(zzav zzavVar) {
        this.zza = zzavVar;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzbm
    public final <Q> zzan<Q> zza(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new zzap(this.zza, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzbm
    public final zzan<?> zzb() {
        zzav zzavVar = this.zza;
        return new zzap(zzavVar, zzavVar.zzd());
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzbm
    public final Class<?> zzc() {
        return this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzbm
    public final Class<?> zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzbm
    public final Set<Class<?>> zze() {
        return this.zza.zzh();
    }
}
