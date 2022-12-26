package com.google.android.gms.internal.gtm;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzsw {
    private static final zzsw zzbdr = new zzsw();
    private final ConcurrentMap<Class<?>, zzsz<?>> zzbdt = new ConcurrentHashMap();
    private final zzta zzbds = new zzrz();

    public static zzsw zzqs() {
        return zzbdr;
    }

    public final <T> zzsz<T> zzi(Class<T> cls) {
        zzre.zza(cls, "messageType");
        zzsz<T> zzszVar = (zzsz<T>) this.zzbdt.get(cls);
        if (zzszVar == null) {
            zzsz<T> zzh = this.zzbds.zzh(cls);
            zzre.zza(cls, "messageType");
            zzre.zza(zzh, "schema");
            zzsz<T> zzszVar2 = (zzsz<T>) this.zzbdt.putIfAbsent(cls, zzh);
            return zzszVar2 != null ? zzszVar2 : zzh;
        }
        return zzszVar;
    }

    public final <T> zzsz<T> zzaf(T t) {
        return zzi(t.getClass());
    }

    private zzsw() {
    }
}
