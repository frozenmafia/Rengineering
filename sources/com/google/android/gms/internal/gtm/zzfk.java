package com.google.android.gms.internal.gtm;

import android.content.Context;
/* loaded from: classes7.dex */
public final class zzfk {
    private final String zzaec;
    private final com.google.android.gms.tagmanager.zzcm zzamx;
    private final com.google.android.gms.tagmanager.zzcd zzanh;
    private final Context zzrm;

    public zzfk(Context context, com.google.android.gms.tagmanager.zzcm zzcmVar, com.google.android.gms.tagmanager.zzcd zzcdVar, String str) {
        this.zzrm = context.getApplicationContext();
        this.zzamx = zzcmVar;
        this.zzanh = zzcdVar;
        this.zzaec = str;
    }

    public final zzff zza(zznm zznmVar, zznu zznuVar) {
        return new zzff(this.zzrm, this.zzaec, zznmVar, zznuVar, this.zzamx, this.zzanh);
    }
}
