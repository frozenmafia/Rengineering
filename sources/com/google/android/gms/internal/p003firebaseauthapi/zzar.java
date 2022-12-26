package com.google.android.gms.internal.p003firebaseauthapi;

import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzar  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzar {
    public static zzaq zza(String str) throws GeneralSecurityException {
        if (zzbn.zzk().containsKey(str)) {
            return zzbn.zzk().get(str);
        }
        throw new GeneralSecurityException(str.length() != 0 ? "cannot find key template: ".concat(str) : new String("cannot find key template: "));
    }
}
