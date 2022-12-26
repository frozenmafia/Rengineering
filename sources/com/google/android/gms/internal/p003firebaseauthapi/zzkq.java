package com.google.android.gms.internal.p003firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Cipher;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkq  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzkq implements zzkx<Cipher> {
    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzkx
    public final /* synthetic */ Cipher zza(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return Cipher.getInstance(str);
        }
        return Cipher.getInstance(str, provider);
    }
}
