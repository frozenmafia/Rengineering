package com.google.android.gms.internal.p003firebaseauthapi;

import android.content.Context;
import com.google.android.gms.common.api.Api;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzug  reason: invalid package */
/* loaded from: classes5.dex */
public final class zzug {
    public static final Api.ClientKey<zztm> zza;
    public static final Api<zzuf> zzb;
    private static final Api.AbstractClientBuilder<zztm, zzuf> zzc;

    static {
        Api.ClientKey<zztm> clientKey = new Api.ClientKey<>();
        zza = clientKey;
        zzud zzudVar = new zzud();
        zzc = zzudVar;
        zzb = new Api<>("InternalFirebaseAuth.FIREBASE_AUTH_API", zzudVar, clientKey);
    }

    public static zzti zza(Context context, zzuf zzufVar) {
        return new zzti(context, zzufVar);
    }
}
