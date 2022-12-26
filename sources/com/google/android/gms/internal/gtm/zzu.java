package com.google.android.gms.internal.gtm;

import com.google.android.gms.analytics.zzi;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes7.dex */
public final class zzu extends zzi<zzu> {
    private final Map<String, Object> zztc = new HashMap();

    public final String toString() {
        return zza((Object) this.zztc);
    }

    public final void set(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        if (str != null && str.startsWith("&")) {
            str = str.substring(1);
        }
        Preconditions.checkNotEmpty(str, "Name can not be empty or \"&\"");
        this.zztc.put(str, str2);
    }

    public final Map<String, Object> zzbm() {
        return Collections.unmodifiableMap(this.zztc);
    }

    @Override // com.google.android.gms.analytics.zzi
    public final /* synthetic */ void zzb(zzu zzuVar) {
        zzu zzuVar2 = zzuVar;
        Preconditions.checkNotNull(zzuVar2);
        zzuVar2.zztc.putAll(this.zztc);
    }
}
