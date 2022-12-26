package com.google.android.gms.internal.gtm;

import android.net.Uri;
import android.util.Pair;
import java.util.Queue;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzgj implements Runnable {
    private final /* synthetic */ zzfy zzaqb;
    private final /* synthetic */ Uri zzaqp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgj(zzfy zzfyVar, Uri uri) {
        this.zzaqb = zzfyVar;
        this.zzaqp = uri;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i;
        Pair zzc;
        zzfd zzfdVar;
        boolean z;
        zzgt zzgtVar;
        Queue queue;
        String valueOf = String.valueOf(this.zzaqp);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("Preview requested to uri ");
        sb.append(valueOf);
        zzev.zzab(sb.toString());
        obj = this.zzaqb.zzapv;
        synchronized (obj) {
            i = this.zzaqb.zzapx;
            if (i == 2) {
                zzev.zzab("Still initializing. Defer preview container loading.");
                queue = this.zzaqb.zzapy;
                queue.add(this);
                return;
            }
            zzc = this.zzaqb.zzc((String[]) null);
            String str = (String) zzc.first;
            if (str == null) {
                zzev.zzac("Preview failed (no container found)");
                return;
            }
            zzfdVar = this.zzaqb.zzapt;
            if (!zzfdVar.zza(str, this.zzaqp)) {
                String valueOf2 = String.valueOf(this.zzaqp);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 73);
                sb2.append("Cannot preview the app with the uri: ");
                sb2.append(valueOf2);
                sb2.append(". Launching current version instead.");
                zzev.zzac(sb2.toString());
                return;
            }
            z = this.zzaqb.zzrq;
            if (!z) {
                String valueOf3 = String.valueOf(this.zzaqp);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 84);
                sb3.append("Deferring container loading for preview uri: ");
                sb3.append(valueOf3);
                sb3.append("(Tag Manager has not been initialized).");
                zzev.zzab(sb3.toString());
                return;
            }
            String valueOf4 = String.valueOf(this.zzaqp);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 36);
            sb4.append("Starting to load preview container: ");
            sb4.append(valueOf4);
            zzev.zzaw(sb4.toString());
            zzgtVar = this.zzaqb.zzaps;
            if (!zzgtVar.zzla()) {
                zzev.zzac("Failed to reset TagManager service for preview");
                return;
            }
            this.zzaqb.zzrq = false;
            this.zzaqb.zzapx = 1;
            this.zzaqb.zzag();
        }
    }
}
