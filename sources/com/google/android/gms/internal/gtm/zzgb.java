package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Queue;
/* loaded from: classes7.dex */
final class zzgb implements Runnable {
    private boolean zzaqc = false;
    private final /* synthetic */ String zzaqd;
    private final /* synthetic */ Bundle zzaqe;
    private final /* synthetic */ String zzaqf;
    private final /* synthetic */ long zzaqg;
    private final /* synthetic */ String zzaqh;
    private final /* synthetic */ zzga zzaqi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgb(zzga zzgaVar, String str, Bundle bundle, String str2, long j, String str3) {
        this.zzaqi = zzgaVar;
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
        int i3;
        Context context;
        Queue queue;
        int i4;
        int i5;
        Context context2;
        Context context3;
        com.google.android.gms.tagmanager.zzcm zzcmVar;
        zzgt zzgtVar;
        i = this.zzaqi.zzaqb.zzapx;
        if (i != 3) {
            i2 = this.zzaqi.zzaqb.zzapx;
            if (i2 == 4) {
                zzev.zzab(String.format("Container failed to load: skipping  event interceptor by logging event back to Firebase directly: name = %s, origin = %s, params = %s.", this.zzaqd, this.zzaqf, this.zzaqe));
                try {
                    zzcmVar = this.zzaqi.zzaqb.zzamx;
                    zzcmVar.logEventInternalNoInterceptor(this.zzaqf, this.zzaqd, this.zzaqe, this.zzaqg);
                    return;
                } catch (RemoteException e) {
                    context3 = this.zzaqi.zzaqb.zzrm;
                    zzea.zza("Error logging event on measurement proxy: ", e, context3);
                    return;
                }
            }
            i3 = this.zzaqi.zzaqb.zzapx;
            if (i3 != 1) {
                i4 = this.zzaqi.zzaqb.zzapx;
                if (i4 != 2) {
                    i5 = this.zzaqi.zzaqb.zzapx;
                    StringBuilder sb = new StringBuilder(28);
                    sb.append("Unexpected state:");
                    sb.append(i5);
                    String sb2 = sb.toString();
                    context2 = this.zzaqi.zzaqb.zzrm;
                    zzea.zzb(sb2, context2);
                    return;
                }
            }
            if (!this.zzaqc) {
                zzev.zzab(String.format("Container not loaded yet: deferring event interceptor by enqueuing the event: name = %s, origin = %s, params = %s.", this.zzaqd, this.zzaqh, this.zzaqe));
                this.zzaqc = true;
                queue = this.zzaqi.zzaqb.zzapy;
                queue.add(this);
                return;
            }
            context = this.zzaqi.zzaqb.zzrm;
            zzea.zzb("Invalid state - not expecting to see a deferredevent during container loading.", context);
            return;
        }
        zzgtVar = this.zzaqi.zzaqb.zzaps;
        zzgtVar.zza(this.zzaqd, this.zzaqe, this.zzaqf, this.zzaqg, true);
    }
}
