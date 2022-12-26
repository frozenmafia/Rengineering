package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.os.RemoteException;
import java.util.List;
/* loaded from: classes7.dex */
final class zzdt implements Runnable {
    private final /* synthetic */ zzdq zzanc;

    private zzdt(zzdq zzdqVar) {
        this.zzanc = zzdqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        List list;
        List<zzee> list2;
        Context context;
        com.google.android.gms.tagmanager.zzcm zzcmVar;
        this.zzanc.state = 3;
        str = this.zzanc.zzaec;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append("Container ");
        sb.append(str);
        sb.append(" loading failed.");
        zzev.zzac(sb.toString());
        list = this.zzanc.zzana;
        if (list != null) {
            list2 = this.zzanc.zzana;
            for (zzee zzeeVar : list2) {
                if (!zzeeVar.zzki()) {
                    String zzkf = zzeeVar.zzkf();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(zzkf).length() + 45);
                    sb2.append("Discarded event ");
                    sb2.append(zzkf);
                    sb2.append(" (marked as non-passthrough).");
                    zzev.zzab(sb2.toString());
                } else {
                    try {
                        zzcmVar = this.zzanc.zzamx;
                        zzcmVar.logEventInternalNoInterceptor("app", zzeeVar.zzkf(), zzeeVar.zzkg(), zzeeVar.currentTimeMillis());
                        String zzkf2 = zzeeVar.zzkf();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(zzkf2).length() + 50);
                        sb3.append("Logged event ");
                        sb3.append(zzkf2);
                        sb3.append(" to Firebase (marked as passthrough).");
                        zzev.zzab(sb3.toString());
                    } catch (RemoteException e) {
                        context = this.zzanc.zzrm;
                        zzea.zza("Error logging event with measurement proxy:", e, context);
                    }
                }
            }
            this.zzanc.zzana = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdt(zzdq zzdqVar, zzdr zzdrVar) {
        this(zzdqVar);
    }
}
