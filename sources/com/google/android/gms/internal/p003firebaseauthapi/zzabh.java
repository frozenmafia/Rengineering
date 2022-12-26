package com.google.android.gms.internal.p003firebaseauthapi;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabh  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzabh {
    private static final zzabh zza = new zzabh();
    private final ConcurrentMap<Class<?>, zzabl<?>> zzc = new ConcurrentHashMap();
    private final zzabm zzb = new zzaar();

    private zzabh() {
    }

    public static zzabh zza() {
        return zza;
    }

    public final <T> zzabl<T> zzb(Class<T> cls) {
        zzaac.zzf(cls, "messageType");
        zzabl<T> zzablVar = (zzabl<T>) this.zzc.get(cls);
        if (zzablVar == null) {
            zzablVar = this.zzb.zza(cls);
            zzaac.zzf(cls, "messageType");
            zzaac.zzf(zzablVar, "schema");
            zzabl putIfAbsent = this.zzc.putIfAbsent(cls, zzablVar);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
        }
        return zzablVar;
    }
}
