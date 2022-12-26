package com.google.android.gms.internal.p003firebaseauthapi;

import com.google.android.gms.internal.p003firebaseauthapi.zzaaz;
import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzao  reason: invalid package */
/* loaded from: classes7.dex */
final class zzao<KeyFormatProtoT extends zzaaz, KeyProtoT extends zzaaz> {
    final zzat<KeyFormatProtoT, KeyProtoT> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzao(zzat<KeyFormatProtoT, KeyProtoT> zzatVar) {
        this.zza = zzatVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final KeyProtoT zza(zzyu zzyuVar) throws GeneralSecurityException, zzaae {
        KeyFormatProtoT zza = this.zza.zza(zzyuVar);
        this.zza.zze(zza);
        return this.zza.zzc(zza);
    }
}
