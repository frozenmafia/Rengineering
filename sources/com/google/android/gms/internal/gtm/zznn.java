package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes7.dex */
public final class zznn {
    private final List<zznr> zzatq = new ArrayList();
    private final Map<String, zzno> zzatr = new HashMap();
    private String version = "";
    private int zzpw = 0;

    public final zznn zza(zznr zznrVar) {
        this.zzatq.add(zznrVar);
        return this;
    }

    public final zznn zzb(zzno zznoVar) {
        this.zzatr.put(zznoVar.zzlu().get("instance_name").toString(), zznoVar);
        return this;
    }

    public final zznn zzcl(String str) {
        this.version = str;
        return this;
    }

    public final zznm zzlt() {
        return new zznm(this.zzatq, this.zzatr, this.version, 0);
    }
}
