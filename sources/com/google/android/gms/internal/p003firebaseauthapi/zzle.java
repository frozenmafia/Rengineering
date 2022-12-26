package com.google.android.gms.internal.p003firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzle  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzle implements zzbb {
    private final zzek zza;
    private final int zzb;

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzbb
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!zzkd.zzb(this.zza.zza(bArr2, this.zzb), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    public zzle(zzek zzekVar, int i) throws GeneralSecurityException {
        this.zza = zzekVar;
        this.zzb = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        zzekVar.zza(new byte[0], i);
    }
}
