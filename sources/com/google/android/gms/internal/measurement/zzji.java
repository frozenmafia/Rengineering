package com.google.android.gms.internal.measurement;
/* loaded from: classes7.dex */
public class zzji {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzji(zzjh zzjhVar) {
    }

    public static int zzb(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long zzc(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }
}
