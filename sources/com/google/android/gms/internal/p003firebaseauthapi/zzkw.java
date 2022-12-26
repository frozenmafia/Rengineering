package com.google.android.gms.internal.p003firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkw  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzkw implements zzkx<Signature> {
    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzkx
    public final /* synthetic */ Signature zza(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return Signature.getInstance(str);
        }
        return Signature.getInstance(str, provider);
    }
}
