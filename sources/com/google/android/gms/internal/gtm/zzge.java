package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.internal.gtm.zzfy;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzge implements Runnable {
    private final /* synthetic */ zzfy zzaqb;
    private final /* synthetic */ String zzaqk;
    private final /* synthetic */ String zzaql;
    private final /* synthetic */ String zzaqm = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzge(zzfy zzfyVar, String str, String str2, String str3) {
        this.zzaqb = zzfyVar;
        this.zzaqk = str;
        this.zzaql = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        zzgt zzgtVar;
        Context context;
        String str = this.zzaqk;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28);
        sb.append("Starting to load container ");
        sb.append(str);
        sb.append(".");
        zzev.zzab(sb.toString());
        i = this.zzaqb.zzapx;
        if (i != 1) {
            context = this.zzaqb.zzrm;
            zzea.zzb("Unexpected state - container loading already initiated.", context);
            return;
        }
        this.zzaqb.zzapx = 2;
        zzgtVar = this.zzaqb.zzaps;
        zzgtVar.zzb(this.zzaqk, this.zzaql, this.zzaqm, new zzfy.zzb(this.zzaqb, null));
    }
}
