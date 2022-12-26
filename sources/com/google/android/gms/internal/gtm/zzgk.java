package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzfy;
/* loaded from: classes7.dex */
final class zzgk implements Runnable {
    private final /* synthetic */ String zzaqk;
    private final /* synthetic */ boolean zzaqq;
    private final /* synthetic */ zzfy.zzb zzaqr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgk(zzfy.zzb zzbVar, boolean z, String str) {
        this.zzaqr = zzbVar;
        this.zzaqq = z;
        this.zzaqk = str;
    }

    /* JADX WARN: Incorrect condition in loop: B:13:0x006c */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r3 = this;
            com.google.android.gms.internal.gtm.zzfy$zzb r0 = r3.zzaqr
            com.google.android.gms.internal.gtm.zzfy r0 = com.google.android.gms.internal.gtm.zzfy.this
            int r0 = com.google.android.gms.internal.gtm.zzfy.zza(r0)
            r1 = 2
            if (r0 != r1) goto L88
            boolean r0 = r3.zzaqq
            if (r0 == 0) goto L3d
            com.google.android.gms.internal.gtm.zzfy$zzb r0 = r3.zzaqr
            com.google.android.gms.internal.gtm.zzfy r0 = com.google.android.gms.internal.gtm.zzfy.this
            r1 = 3
            com.google.android.gms.internal.gtm.zzfy.zza(r0, r1)
            java.lang.String r0 = r3.zzaqk
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            int r2 = r2 + 18
            r1.<init>(r2)
            java.lang.String r2 = "Container "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " loaded."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.internal.gtm.zzev.zzab(r0)
            goto L60
        L3d:
            com.google.android.gms.internal.gtm.zzfy$zzb r0 = r3.zzaqr
            com.google.android.gms.internal.gtm.zzfy r0 = com.google.android.gms.internal.gtm.zzfy.this
            r1 = 4
            com.google.android.gms.internal.gtm.zzfy.zza(r0, r1)
            java.lang.String r0 = r3.zzaqk
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            java.lang.String r2 = "Error loading container:"
            if (r1 == 0) goto L58
            java.lang.String r0 = r2.concat(r0)
            goto L5d
        L58:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L5d:
            com.google.android.gms.internal.gtm.zzev.zzav(r0)
        L60:
            com.google.android.gms.internal.gtm.zzfy$zzb r0 = r3.zzaqr
            com.google.android.gms.internal.gtm.zzfy r0 = com.google.android.gms.internal.gtm.zzfy.this
            java.util.Queue r0 = com.google.android.gms.internal.gtm.zzfy.zze(r0)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L8d
            com.google.android.gms.internal.gtm.zzfy$zzb r0 = r3.zzaqr
            com.google.android.gms.internal.gtm.zzfy r0 = com.google.android.gms.internal.gtm.zzfy.this
            java.util.concurrent.ExecutorService r0 = com.google.android.gms.internal.gtm.zzfy.zzf(r0)
            com.google.android.gms.internal.gtm.zzfy$zzb r1 = r3.zzaqr
            com.google.android.gms.internal.gtm.zzfy r1 = com.google.android.gms.internal.gtm.zzfy.this
            java.util.Queue r1 = com.google.android.gms.internal.gtm.zzfy.zze(r1)
            java.lang.Object r1 = r1.remove()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0.execute(r1)
            goto L60
        L88:
            java.lang.String r0 = "Container load callback completed after timeout"
            com.google.android.gms.internal.gtm.zzev.zzac(r0)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzgk.run():void");
    }
}
