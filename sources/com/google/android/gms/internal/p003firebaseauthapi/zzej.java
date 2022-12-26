package com.google.android.gms.internal.p003firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzej  reason: invalid package */
/* loaded from: classes7.dex */
final class zzej implements zzbg<zzbb, zzbb> {
    private static final Logger zza = Logger.getLogger(zzej.class.getName());

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzbg
    public final Class<zzbb> zza() {
        return zzbb.class;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzbg
    public final Class<zzbb> zzb() {
        return zzbb.class;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzbg
    public final /* synthetic */ zzbb zzc(zzbf<zzbb> zzbfVar) throws GeneralSecurityException {
        return new zzei(zzbfVar, null);
    }
}
