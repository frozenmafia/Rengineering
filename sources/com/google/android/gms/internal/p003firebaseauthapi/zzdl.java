package com.google.android.gms.internal.p003firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdl  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzdl implements zzbg<zzal, zzal> {
    private static final Logger zza = Logger.getLogger(zzdl.class.getName());

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzbg
    public final Class<zzal> zza() {
        return zzal.class;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzbg
    public final Class<zzal> zzb() {
        return zzal.class;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzbg
    public final /* synthetic */ zzal zzc(zzbf<zzal> zzbfVar) throws GeneralSecurityException {
        return new zzdk(zzbfVar);
    }
}
