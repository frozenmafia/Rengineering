package com.google.android.gms.internal.p003firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Provider;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkv  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzkv implements zzkx<MessageDigest> {
    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzkx
    public final /* synthetic */ MessageDigest zza(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return MessageDigest.getInstance(str);
        }
        return MessageDigest.getInstance(str, provider);
    }
}
