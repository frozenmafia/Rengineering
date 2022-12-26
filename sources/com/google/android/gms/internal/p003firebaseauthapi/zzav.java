package com.google.android.gms.internal.p003firebaseauthapi;

import com.google.android.gms.internal.p003firebaseauthapi.zzaaz;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzav  reason: invalid package */
/* loaded from: classes7.dex */
public abstract class zzav<KeyProtoT extends zzaaz> {
    private final Class<KeyProtoT> zza;
    private final Map<Class<?>, zzau<?, KeyProtoT>> zzb;
    private final Class<?> zzc;

    /* JADX INFO: Access modifiers changed from: protected */
    @SafeVarargs
    public zzav(Class<KeyProtoT> cls, zzau<?, KeyProtoT>... zzauVarArr) {
        this.zza = cls;
        HashMap hashMap = new HashMap();
        for (int i = 0; i <= 0; i++) {
            zzau<?, KeyProtoT> zzauVar = zzauVarArr[i];
            if (!hashMap.containsKey(zzauVar.zza())) {
                hashMap.put(zzauVar.zza(), zzauVar);
            } else {
                String valueOf = String.valueOf(zzauVar.zza().getCanonicalName());
                throw new IllegalArgumentException(valueOf.length() != 0 ? "KeyTypeManager constructed with duplicate factories for primitive ".concat(valueOf) : new String("KeyTypeManager constructed with duplicate factories for primitive "));
            }
        }
        this.zzc = zzauVarArr[0].zza();
        this.zzb = Collections.unmodifiableMap(hashMap);
    }

    public zzat<?, KeyProtoT> zza() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract zzid zzb();

    public abstract KeyProtoT zzc(zzyu zzyuVar) throws zzaae;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Class<?> zzd() {
        return this.zzc;
    }

    public final Class<KeyProtoT> zze() {
        return this.zza;
    }

    public final <P> P zzf(KeyProtoT keyprotot, Class<P> cls) throws GeneralSecurityException {
        zzau<?, KeyProtoT> zzauVar = this.zzb.get(cls);
        if (zzauVar == null) {
            String canonicalName = cls.getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41);
            sb.append("Requested primitive class ");
            sb.append(canonicalName);
            sb.append(" not supported.");
            throw new IllegalArgumentException(sb.toString());
        }
        return (P) zzauVar.zzb(keyprotot);
    }

    public abstract String zzg();

    public final Set<Class<?>> zzh() {
        return this.zzb.keySet();
    }

    public abstract void zzi(KeyProtoT keyprotot) throws GeneralSecurityException;
}
