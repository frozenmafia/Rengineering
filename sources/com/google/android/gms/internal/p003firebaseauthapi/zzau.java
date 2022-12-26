package com.google.android.gms.internal.p003firebaseauthapi;

import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzau  reason: invalid package */
/* loaded from: classes7.dex */
public abstract class zzau<PrimitiveT, KeyT> {
    private final Class<PrimitiveT> zza;

    public zzau(Class<PrimitiveT> cls) {
        this.zza = cls;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Class<PrimitiveT> zza() {
        return this.zza;
    }

    public abstract PrimitiveT zzb(KeyT keyt) throws GeneralSecurityException;
}
