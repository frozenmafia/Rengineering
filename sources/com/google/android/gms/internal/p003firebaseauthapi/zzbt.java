package com.google.android.gms.internal.p003firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbt  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzbt implements zzbg<zzag, zzag> {
    private static final Logger zza = Logger.getLogger(zzbt.class.getName());

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzbg
    public final Class<zzag> zza() {
        return zzag.class;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzbg
    public final Class<zzag> zzb() {
        return zzag.class;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzbg
    public final /* synthetic */ zzag zzc(zzbf<zzag> zzbfVar) throws GeneralSecurityException {
        return new zzbs(zzbfVar, null);
    }
}
