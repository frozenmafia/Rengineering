package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.analytics.zzi;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
/* loaded from: classes7.dex */
public final class zzz extends zzi<zzz> {
    private String zzus;
    private String zzut;
    private String zzuu;
    private String zzuv;
    private boolean zzuw;
    private String zzux;
    private boolean zzuy;
    private double zzuz;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("hitType", this.zzus);
        hashMap.put("clientId", this.zzut);
        hashMap.put("userId", this.zzuu);
        hashMap.put("androidAdId", this.zzuv);
        hashMap.put("AdTargetingEnabled", Boolean.valueOf(this.zzuw));
        hashMap.put("sessionControl", this.zzux);
        hashMap.put("nonInteraction", Boolean.valueOf(this.zzuy));
        hashMap.put("sampleRate", Double.valueOf(this.zzuz));
        return zza((Object) hashMap);
    }

    public final String zzbs() {
        return this.zzus;
    }

    public final void zzl(String str) {
        this.zzus = str;
    }

    public final String zzbt() {
        return this.zzut;
    }

    public final void setClientId(String str) {
        this.zzut = str;
    }

    public final String zzbu() {
        return this.zzuu;
    }

    public final void setUserId(String str) {
        this.zzuu = str;
    }

    public final String zzbv() {
        return this.zzuv;
    }

    public final void zzm(String str) {
        this.zzuv = str;
    }

    public final boolean zzbw() {
        return this.zzuw;
    }

    public final void zza(boolean z) {
        this.zzuw = z;
    }

    public final String zzbx() {
        return this.zzux;
    }

    public final boolean zzby() {
        return this.zzuy;
    }

    public final void zzb(boolean z) {
        this.zzuy = true;
    }

    public final double zzbz() {
        return this.zzuz;
    }

    @Override // com.google.android.gms.analytics.zzi
    public final /* synthetic */ void zzb(zzz zzzVar) {
        zzz zzzVar2 = zzzVar;
        if (!TextUtils.isEmpty(this.zzus)) {
            zzzVar2.zzus = this.zzus;
        }
        if (!TextUtils.isEmpty(this.zzut)) {
            zzzVar2.zzut = this.zzut;
        }
        if (!TextUtils.isEmpty(this.zzuu)) {
            zzzVar2.zzuu = this.zzuu;
        }
        if (!TextUtils.isEmpty(this.zzuv)) {
            zzzVar2.zzuv = this.zzuv;
        }
        boolean z = true;
        if (this.zzuw) {
            zzzVar2.zzuw = true;
        }
        if (!TextUtils.isEmpty(this.zzux)) {
            zzzVar2.zzux = this.zzux;
        }
        boolean z2 = this.zzuy;
        if (z2) {
            zzzVar2.zzuy = z2;
        }
        double d = this.zzuz;
        int i = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
        if (i != 0) {
            Preconditions.checkArgument((i < 0 || d > 100.0d) ? false : false, "Sample rate must be between 0% and 100%");
            zzzVar2.zzuz = d;
        }
    }
}
