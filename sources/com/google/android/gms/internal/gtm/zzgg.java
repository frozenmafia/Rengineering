package com.google.android.gms.internal.gtm;
/* loaded from: classes7.dex */
final class zzgg implements Runnable {
    private final /* synthetic */ zzgf zzaqn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgg(zzgf zzgfVar) {
        this.zzaqn = zzgfVar;
    }

    /* JADX WARN: Incorrect condition in loop: B:8:0x002f */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r2 = this;
            com.google.android.gms.internal.gtm.zzgf r0 = r2.zzaqn
            com.google.android.gms.internal.gtm.zzfy r0 = r0.zzaqb
            int r0 = com.google.android.gms.internal.gtm.zzfy.zza(r0)
            r1 = 1
            if (r0 == r1) goto L16
            com.google.android.gms.internal.gtm.zzgf r0 = r2.zzaqn
            com.google.android.gms.internal.gtm.zzfy r0 = r0.zzaqb
            int r0 = com.google.android.gms.internal.gtm.zzfy.zza(r0)
            r1 = 2
            if (r0 != r1) goto L4b
        L16:
            com.google.android.gms.internal.gtm.zzgf r0 = r2.zzaqn
            com.google.android.gms.internal.gtm.zzfy r0 = r0.zzaqb
            r1 = 4
            com.google.android.gms.internal.gtm.zzfy.zza(r0, r1)
            java.lang.String r0 = "Container load timed out after 5000ms."
            com.google.android.gms.internal.gtm.zzev.zzav(r0)
        L23:
            com.google.android.gms.internal.gtm.zzgf r0 = r2.zzaqn
            com.google.android.gms.internal.gtm.zzfy r0 = r0.zzaqb
            java.util.Queue r0 = com.google.android.gms.internal.gtm.zzfy.zze(r0)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L4b
            com.google.android.gms.internal.gtm.zzgf r0 = r2.zzaqn
            com.google.android.gms.internal.gtm.zzfy r0 = r0.zzaqb
            java.util.concurrent.ExecutorService r0 = com.google.android.gms.internal.gtm.zzfy.zzf(r0)
            com.google.android.gms.internal.gtm.zzgf r1 = r2.zzaqn
            com.google.android.gms.internal.gtm.zzfy r1 = r1.zzaqb
            java.util.Queue r1 = com.google.android.gms.internal.gtm.zzfy.zze(r1)
            java.lang.Object r1 = r1.remove()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0.execute(r1)
            goto L23
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzgg.run():void");
    }
}
