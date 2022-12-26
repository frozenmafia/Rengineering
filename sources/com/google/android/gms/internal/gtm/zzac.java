package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.apxor.androidsdk.core.Constants;
import com.google.android.gms.analytics.zzi;
import java.util.HashMap;
/* loaded from: classes7.dex */
public final class zzac extends zzi<zzac> {
    public String mCategory;
    public String zzvk;
    public long zzvl;
    public String zzvm;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("variableName", this.zzvk);
        hashMap.put("timeInMillis", Long.valueOf(this.zzvl));
        hashMap.put(Constants.CATEGORY, this.mCategory);
        hashMap.put("label", this.zzvm);
        return zza((Object) hashMap);
    }

    @Override // com.google.android.gms.analytics.zzi
    public final /* synthetic */ void zzb(zzac zzacVar) {
        zzac zzacVar2 = zzacVar;
        if (!TextUtils.isEmpty(this.zzvk)) {
            zzacVar2.zzvk = this.zzvk;
        }
        long j = this.zzvl;
        if (j != 0) {
            zzacVar2.zzvl = j;
        }
        if (!TextUtils.isEmpty(this.mCategory)) {
            zzacVar2.mCategory = this.mCategory;
        }
        if (TextUtils.isEmpty(this.zzvm)) {
            return;
        }
        zzacVar2.zzvm = this.zzvm;
    }
}
