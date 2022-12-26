package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.analytics.zzi;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
/* loaded from: classes7.dex */
public final class zzaa extends zzi<zzaa> {
    private String zzva;
    private int zzvb;
    private int zzvc;
    private String zzvd;
    private String zzve;
    private boolean zzvf;
    private boolean zzvg;

    public zzaa() {
        this(false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private zzaa(boolean r5) {
        /*
            r4 = this;
            java.util.UUID r5 = java.util.UUID.randomUUID()
            long r0 = r5.getLeastSignificantBits()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r0 = r0 & r2
            int r1 = (int) r0
            if (r1 == 0) goto L10
            goto L23
        L10:
            long r0 = r5.getMostSignificantBits()
            long r0 = r0 & r2
            int r1 = (int) r0
            if (r1 == 0) goto L19
            goto L23
        L19:
            java.lang.String r5 = "GAv4"
            java.lang.String r0 = "UUID.randomUUID() returned 0."
            android.util.Log.e(r5, r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
        L23:
            r5 = 0
            r4.<init>(r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzaa.<init>(boolean):void");
    }

    private zzaa(boolean z, int i) {
        Preconditions.checkNotZero(i);
        this.zzvb = i;
        this.zzvg = false;
    }

    public final String zzca() {
        return this.zzva;
    }

    public final int zzcb() {
        return this.zzvb;
    }

    public final String zzcc() {
        return this.zzve;
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("screenName", this.zzva);
        hashMap.put("interstitial", Boolean.valueOf(this.zzvf));
        hashMap.put("automatic", Boolean.valueOf(this.zzvg));
        hashMap.put("screenId", Integer.valueOf(this.zzvb));
        hashMap.put("referrerScreenId", Integer.valueOf(this.zzvc));
        hashMap.put("referrerScreenName", this.zzvd);
        hashMap.put("referrerUri", this.zzve);
        return zza((Object) hashMap);
    }

    @Override // com.google.android.gms.analytics.zzi
    public final /* synthetic */ void zzb(zzaa zzaaVar) {
        zzaa zzaaVar2 = zzaaVar;
        if (!TextUtils.isEmpty(this.zzva)) {
            zzaaVar2.zzva = this.zzva;
        }
        int i = this.zzvb;
        if (i != 0) {
            zzaaVar2.zzvb = i;
        }
        int i2 = this.zzvc;
        if (i2 != 0) {
            zzaaVar2.zzvc = i2;
        }
        if (!TextUtils.isEmpty(this.zzvd)) {
            zzaaVar2.zzvd = this.zzvd;
        }
        if (!TextUtils.isEmpty(this.zzve)) {
            String str = this.zzve;
            if (TextUtils.isEmpty(str)) {
                zzaaVar2.zzve = null;
            } else {
                zzaaVar2.zzve = str;
            }
        }
        boolean z = this.zzvf;
        if (z) {
            zzaaVar2.zzvf = z;
        }
        boolean z2 = this.zzvg;
        if (z2) {
            zzaaVar2.zzvg = z2;
        }
    }
}
