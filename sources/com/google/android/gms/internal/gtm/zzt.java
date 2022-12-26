package com.google.android.gms.internal.gtm;

import com.google.android.gms.analytics.zzi;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes7.dex */
public final class zzt extends zzi<zzt> {
    private Map<Integer, Double> zzui = new HashMap(4);

    public final String toString() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Integer, Double> entry : this.zzui.entrySet()) {
            String valueOf = String.valueOf(entry.getKey());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 6);
            sb.append("metric");
            sb.append(valueOf);
            hashMap.put(sb.toString(), entry.getValue());
        }
        return zza((Object) hashMap);
    }

    public final Map<Integer, Double> zzbl() {
        return Collections.unmodifiableMap(this.zzui);
    }

    @Override // com.google.android.gms.analytics.zzi
    public final /* synthetic */ void zzb(zzt zztVar) {
        zztVar.zzui.putAll(this.zzui);
    }
}
