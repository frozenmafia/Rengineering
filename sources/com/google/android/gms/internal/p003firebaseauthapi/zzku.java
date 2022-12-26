package com.google.android.gms.internal.p003firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Mac;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzku  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzku implements zzkx<Mac> {
    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzkx
    public final /* synthetic */ Mac zza(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return Mac.getInstance(str);
        }
        return Mac.getInstance(str, provider);
    }
}
