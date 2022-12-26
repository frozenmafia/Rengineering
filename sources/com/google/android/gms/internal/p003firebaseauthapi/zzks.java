package com.google.android.gms.internal.p003firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzks  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzks implements zzkx<KeyFactory> {
    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzkx
    public final /* synthetic */ KeyFactory zza(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return KeyFactory.getInstance(str);
        }
        return KeyFactory.getInstance(str, provider);
    }
}
