package com.google.android.gms.internal.p003firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdd  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzdd implements zzbg<zzak, zzak> {
    private static final Logger zza = Logger.getLogger(zzdd.class.getName());

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzbg
    public final Class<zzak> zza() {
        return zzak.class;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzbg
    public final Class<zzak> zzb() {
        return zzak.class;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzbg
    public final /* synthetic */ zzak zzc(zzbf<zzak> zzbfVar) throws GeneralSecurityException {
        return new zzdc(zzbfVar);
    }
}
