package com.google.android.gms.internal.p003firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcw  reason: invalid package */
/* loaded from: classes7.dex */
final class zzcw extends ThreadLocal<Cipher> {
    protected static final Cipher zza() {
        try {
            return zzkp.zza.zza("AES/GCM-SIV/NoPadding");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Cipher initialValue() {
        return zza();
    }
}
