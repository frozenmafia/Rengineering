package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.analytics.zzi;
import java.util.HashMap;
/* loaded from: classes7.dex */
public final class zzq extends zzi<zzq> {
    private String zztv;
    private String zztw;
    private String zztx;
    private String zzty;

    @Override // com.google.android.gms.analytics.zzi
    /* renamed from: zza */
    public final void zzb(zzq zzqVar) {
        if (!TextUtils.isEmpty(this.zztv)) {
            zzqVar.zztv = this.zztv;
        }
        if (!TextUtils.isEmpty(this.zztw)) {
            zzqVar.zztw = this.zztw;
        }
        if (!TextUtils.isEmpty(this.zztx)) {
            zzqVar.zztx = this.zztx;
        }
        if (TextUtils.isEmpty(this.zzty)) {
            return;
        }
        zzqVar.zzty = this.zzty;
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("appName", this.zztv);
        hashMap.put("appVersion", this.zztw);
        hashMap.put("appId", this.zztx);
        hashMap.put("appInstallerId", this.zzty);
        return zza((Object) hashMap);
    }

    public final String zzaz() {
        return this.zztv;
    }

    public final void setAppName(String str) {
        this.zztv = str;
    }

    public final String zzba() {
        return this.zztw;
    }

    public final void setAppVersion(String str) {
        this.zztw = str;
    }

    public final String zzbb() {
        return this.zztx;
    }

    public final void setAppId(String str) {
        this.zztx = str;
    }

    public final String zzbc() {
        return this.zzty;
    }

    public final void setAppInstallerId(String str) {
        this.zzty = str;
    }
}
