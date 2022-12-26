package com.google.android.gms.internal.p003firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzju  reason: invalid package */
/* loaded from: classes7.dex */
final class zzju extends ThreadLocal<Cipher> {
    protected static final Cipher zza() {
        try {
            return zzkp.zza.zza("AES/CTR/NoPadding");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Cipher initialValue() {
        return zza();
    }
}
