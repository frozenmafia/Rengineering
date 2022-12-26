package com.google.android.gms.internal.p003firebaseauthapi;

import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdb  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzdb {
    public static final String zza;
    @Deprecated
    public static final zzjn zzb;
    @Deprecated
    public static final zzjn zzc;

    static {
        new zzda();
        zza = "type.googleapis.com/google.crypto.tink.AesSivKey";
        zzb = zzjn.zzb();
        zzc = zzjn.zzb();
        try {
            zzbn.zzn(new zzdd());
            zzbn.zzm(new zzda(), true);
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
