package com.google.android.gms.internal.gtm;

import java.util.List;
/* loaded from: classes7.dex */
abstract class zzru {
    private static final zzru zzbch = new zzrw();
    private static final zzru zzbci = new zzrx();

    private zzru() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> List<L> zza(Object obj, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> void zza(Object obj, Object obj2, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(Object obj, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzru zzqc() {
        return zzbch;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzru zzqd() {
        return zzbci;
    }
}
