package com.google.android.gms.internal.p003firebaseauthapi;

import com.google.android.gms.internal.p003firebaseauthapi.zzaaz;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzat  reason: invalid package */
/* loaded from: classes7.dex */
public abstract class zzat<KeyFormatProtoT extends zzaaz, KeyT> {
    private final Class<KeyFormatProtoT> zza;

    public zzat(Class<KeyFormatProtoT> cls) {
        this.zza = cls;
    }

    public abstract KeyFormatProtoT zza(zzyu zzyuVar) throws zzaae;

    public final Class<KeyFormatProtoT> zzb() {
        return this.zza;
    }

    public abstract KeyT zzc(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;

    public Map<String, zzas<KeyFormatProtoT>> zzd() throws GeneralSecurityException {
        return Collections.emptyMap();
    }

    public abstract void zze(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;
}
