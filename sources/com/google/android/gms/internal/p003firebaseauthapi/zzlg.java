package com.google.android.gms.internal.p003firebaseauthapi;

import java.security.SecureRandom;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlg  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzlg {
    private static final ThreadLocal<SecureRandom> zza = new zzlf();

    public static byte[] zza(int i) {
        byte[] bArr = new byte[i];
        zza.get().nextBytes(bArr);
        return bArr;
    }
}
