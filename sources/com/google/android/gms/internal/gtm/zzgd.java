package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.os.Bundle;
import java.util.Queue;
/* loaded from: classes7.dex */
final class zzgd implements Runnable {
    private boolean zzaqc = false;
    private final /* synthetic */ String zzaqd;
    private final /* synthetic */ Bundle zzaqe;
    private final /* synthetic */ String zzaqf;
    private final /* synthetic */ long zzaqg;
    private final /* synthetic */ String zzaqh;
    private final /* synthetic */ zzgc zzaqj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgd(zzgc zzgcVar, String str, Bundle bundle, String str2, long j, String str3) {
        this.zzaqj = zzgcVar;
        this.zzaqd = str;
        this.zzaqe = bundle;
        this.zzaqf = str2;
        this.zzaqg = j;
        this.zzaqh = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        Queue queue;
        int i3;
        int i4;
        int i5;
        Context context;
        zzgt zzgtVar;
        i = this.zzaqj.zzaqb.zzapx;
        if (i != 3) {
            i2 = this.zzaqj.zzaqb.zzapx;
            if (i2 != 1) {
                i3 = this.zzaqj.zzaqb.zzapx;
                if (i3 != 2) {
                    i4 = this.zzaqj.zzaqb.zzapx;
                    if (i4 == 4) {
                        zzev.zzab(String.format("Container failed to load: skipping event listener by ignoring the event: name = %s, origin = %s, params = %s.", this.zzaqd, this.zzaqh, this.zzaqe));
                        return;
                    }
                    i5 = this.zzaqj.zzaqb.zzapx;
                    StringBuilder sb = new StringBuilder(28);
                    sb.append("Unexpected state:");
                    sb.append(i5);
                    String sb2 = sb.toString();
                    context = this.zzaqj.zzaqb.zzrm;
                    zzea.zzb(sb2, context);
                    return;
                }
            }
            if (!this.zzaqc) {
                zzev.zzab(String.format("Container not loaded yet: deferring event listener by enqueuing the event: name = %s, origin = %s, params = %s.", this.zzaqd, this.zzaqh, this.zzaqe));
                this.zzaqc = true;
                queue = this.zzaqj.zzaqb.zzapy;
                queue.add(this);
                return;
            }
            zzev.zzac("Invalid state - not expecting to see a deferred event during container loading.");
            return;
        }
        zzgtVar = this.zzaqj.zzaqb.zzaps;
        zzgtVar.zza(this.zzaqd, this.zzaqe, this.zzaqf, this.zzaqg, false);
    }
}
