package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.analytics.zzi;
import java.util.HashMap;
/* loaded from: classes7.dex */
public final class zzy extends zzi<zzy> {
    public String zzuq;
    public boolean zzur;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("description", this.zzuq);
        hashMap.put("fatal", Boolean.valueOf(this.zzur));
        return zza((Object) hashMap);
    }

    @Override // com.google.android.gms.analytics.zzi
    public final /* synthetic */ void zzb(zzy zzyVar) {
        zzy zzyVar2 = zzyVar;
        if (!TextUtils.isEmpty(this.zzuq)) {
            zzyVar2.zzuq = this.zzuq;
        }
        boolean z = this.zzur;
        if (z) {
            zzyVar2.zzur = z;
        }
    }
}
