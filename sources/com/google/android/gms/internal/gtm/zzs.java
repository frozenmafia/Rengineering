package com.google.android.gms.internal.gtm;

import com.google.android.gms.analytics.zzi;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes7.dex */
public final class zzs extends zzi<zzs> {
    private Map<Integer, String> zzuh = new HashMap(4);

    public final String toString() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Integer, String> entry : this.zzuh.entrySet()) {
            String valueOf = String.valueOf(entry.getKey());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
            sb.append("dimension");
            sb.append(valueOf);
            hashMap.put(sb.toString(), entry.getValue());
        }
        return zza((Object) hashMap);
    }

    public final Map<Integer, String> zzbk() {
        return Collections.unmodifiableMap(this.zzuh);
    }

    @Override // com.google.android.gms.analytics.zzi
    public final /* synthetic */ void zzb(zzs zzsVar) {
        zzsVar.zzuh.putAll(this.zzuh);
    }
}
