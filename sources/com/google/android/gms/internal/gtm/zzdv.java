package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.os.RemoteException;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzdv implements Runnable {
    private final /* synthetic */ zzdq zzanc;
    private final zzee zzand;

    public zzdv(zzdq zzdqVar, zzee zzeeVar) {
        this.zzanc = zzdqVar;
        this.zzand = zzeeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        Context context;
        com.google.android.gms.tagmanager.zzcm zzcmVar;
        List list;
        zzff zzffVar;
        i = this.zzanc.state;
        if (i == 2) {
            String valueOf = String.valueOf(this.zzand.zzkf());
            zzev.zzab(valueOf.length() != 0 ? "Evaluating tags for event ".concat(valueOf) : new String("Evaluating tags for event "));
            zzffVar = this.zzanc.zzamz;
            zzffVar.zzb(this.zzand);
            return;
        }
        i2 = this.zzanc.state;
        if (i2 != 1) {
            i3 = this.zzanc.state;
            if (i3 == 3) {
                String zzkf = this.zzand.zzkf();
                StringBuilder sb = new StringBuilder(String.valueOf(zzkf).length() + 61);
                sb.append("Failed to evaluate tags for event ");
                sb.append(zzkf);
                sb.append(" (container failed to load)");
                zzev.zzab(sb.toString());
                if (!this.zzand.zzki()) {
                    String valueOf2 = String.valueOf(this.zzand.zzkf());
                    zzev.zzab(valueOf2.length() != 0 ? "Discarded non-passthrough event ".concat(valueOf2) : new String("Discarded non-passthrough event "));
                    return;
                }
                try {
                    zzcmVar = this.zzanc.zzamx;
                    zzcmVar.logEventInternalNoInterceptor("app", this.zzand.zzkf(), this.zzand.zzkg(), this.zzand.currentTimeMillis());
                    String zzkf2 = this.zzand.zzkf();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(zzkf2).length() + 38);
                    sb2.append("Logged passthrough event ");
                    sb2.append(zzkf2);
                    sb2.append(" to Firebase.");
                    zzev.zzab(sb2.toString());
                    return;
                } catch (RemoteException e) {
                    context = this.zzanc.zzrm;
                    zzea.zza("Error logging event with measurement proxy:", e, context);
                    return;
                }
            }
            return;
        }
        list = this.zzanc.zzana;
        list.add(this.zzand);
        String zzkf3 = this.zzand.zzkf();
        StringBuilder sb3 = new StringBuilder(String.valueOf(zzkf3).length() + 30);
        sb3.append("Added event ");
        sb3.append(zzkf3);
        sb3.append(" to pending queue.");
        zzev.zzab(sb3.toString());
    }
}
