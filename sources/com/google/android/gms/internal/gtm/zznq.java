package com.google.android.gms.internal.gtm;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes7.dex */
public final class zznq {
    private final Map<String, zznx> zzats = new HashMap();
    private zznx zzatt;

    public final zznq zza(String str, zznx zznxVar) {
        this.zzats.put(str, zznxVar);
        return this;
    }

    public final zznq zzb(zznx zznxVar) {
        this.zzatt = zznxVar;
        return this;
    }

    public final zzno zzlv() {
        return new zzno(this.zzats, this.zzatt);
    }
}
