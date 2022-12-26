package com.google.android.gms.internal.p003firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.KeyAgreement;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkr  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzkr implements zzkx<KeyAgreement> {
    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzkx
    public final /* synthetic */ KeyAgreement zza(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return KeyAgreement.getInstance(str);
        }
        return KeyAgreement.getInstance(str, provider);
    }
}
