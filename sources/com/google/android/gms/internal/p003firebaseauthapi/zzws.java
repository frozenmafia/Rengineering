package com.google.android.gms.internal.p003firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import java.io.UnsupportedEncodingException;
import java.util.List;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzws  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzws {
    public static long zza(String str) {
        Preconditions.checkNotEmpty(str);
        List<String> zzd = zzae.zzb('.').zzd(str);
        if (zzd.size() < 2) {
            String valueOf = String.valueOf(str);
            throw new RuntimeException(valueOf.length() != 0 ? "Invalid idToken ".concat(valueOf) : new String("Invalid idToken "));
        }
        try {
            zzwt zza = zzwt.zza(new String(Base64Utils.decodeUrlSafeNoPadding(zzd.get(1)), "UTF-8"));
            return zza.zzb().longValue() - zza.zzc().longValue();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Unable to decode token", e);
        }
    }
}
