package com.google.android.gms.internal.p003firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlk  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzlk extends zzkh {
    public zzlk(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzkh
    final zzkf zzc(byte[] bArr, int i) throws InvalidKeyException {
        return new zzlj(bArr, i);
    }
}
