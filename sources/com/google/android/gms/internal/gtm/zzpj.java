package com.google.android.gms.internal.gtm;

import java.io.PrintStream;
import java.util.List;
/* loaded from: classes7.dex */
final class zzpj extends zzpg {
    private final zzph zzavo = new zzph();

    @Override // com.google.android.gms.internal.gtm.zzpg
    public final void zza(Throwable th, PrintStream printStream) {
        th.printStackTrace(printStream);
        List<Throwable> zza = this.zzavo.zza(th, false);
        if (zza == null) {
            return;
        }
        synchronized (zza) {
            for (Throwable th2 : zza) {
                printStream.print("Suppressed: ");
                th2.printStackTrace(printStream);
            }
        }
    }
}
