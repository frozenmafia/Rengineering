package com.google.android.gms.internal.gtm;

import java.io.PrintStream;
/* loaded from: classes7.dex */
public final class zzpf {
    private static final zzpg zzavi;
    private static final int zzavj;

    /* loaded from: classes7.dex */
    static final class zza extends zzpg {
        zza() {
        }

        @Override // com.google.android.gms.internal.gtm.zzpg
        public final void zza(Throwable th, PrintStream printStream) {
            th.printStackTrace(printStream);
        }
    }

    public static void zza(Throwable th, PrintStream printStream) {
        zzavi.zza(th, printStream);
    }

    private static Integer zzmu() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    static {
        /*
            r0 = 1
            java.lang.Integer r1 = zzmu()     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L15
            int r2 = r1.intValue()     // Catch: java.lang.Throwable -> L2a
            r3 = 19
            if (r2 < r3) goto L15
            com.google.android.gms.internal.gtm.zzpk r2 = new com.google.android.gms.internal.gtm.zzpk     // Catch: java.lang.Throwable -> L2a
            r2.<init>()     // Catch: java.lang.Throwable -> L2a
            goto L63
        L15:
            java.lang.String r2 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r2 = java.lang.Boolean.getBoolean(r2)     // Catch: java.lang.Throwable -> L2a
            r2 = r2 ^ r0
            if (r2 == 0) goto L24
            com.google.android.gms.internal.gtm.zzpj r2 = new com.google.android.gms.internal.gtm.zzpj     // Catch: java.lang.Throwable -> L2a
            r2.<init>()     // Catch: java.lang.Throwable -> L2a
            goto L63
        L24:
            com.google.android.gms.internal.gtm.zzpf$zza r2 = new com.google.android.gms.internal.gtm.zzpf$zza     // Catch: java.lang.Throwable -> L2a
            r2.<init>()     // Catch: java.lang.Throwable -> L2a
            goto L63
        L2a:
            r2 = move-exception
            goto L2e
        L2c:
            r2 = move-exception
            r1 = 0
        L2e:
            java.io.PrintStream r3 = java.lang.System.err
            java.lang.Class<com.google.android.gms.internal.gtm.zzpf$zza> r4 = com.google.android.gms.internal.gtm.zzpf.zza.class
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = java.lang.String.valueOf(r4)
            int r6 = r6.length()
            int r6 = r6 + 133
            r5.<init>(r6)
            java.lang.String r6 = "An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = "will be used. The error is: "
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.println(r4)
            java.io.PrintStream r3 = java.lang.System.err
            r2.printStackTrace(r3)
            com.google.android.gms.internal.gtm.zzpf$zza r2 = new com.google.android.gms.internal.gtm.zzpf$zza
            r2.<init>()
        L63:
            com.google.android.gms.internal.gtm.zzpf.zzavi = r2
            if (r1 != 0) goto L68
            goto L6c
        L68:
            int r0 = r1.intValue()
        L6c:
            com.google.android.gms.internal.gtm.zzpf.zzavj = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzpf.<clinit>():void");
    }
}
