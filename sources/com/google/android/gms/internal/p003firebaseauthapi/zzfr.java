package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfr  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzfr extends zzzw<zzfr, zzfq> implements zzaba {
    private static final zzfr zzb;
    private int zze;

    static {
        zzfr zzfrVar = new zzfr();
        zzb = zzfrVar;
        zzzw.zzF(zzfr.class, zzfrVar);
    }

    private zzfr() {
    }

    public static zzfq zzb() {
        return zzb.zzt();
    }

    public static zzfr zzd() {
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(zzfr zzfrVar, int i) {
        zzfrVar.zze = 16;
    }

    public final int zza() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzzw
    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzfq(null);
                }
                return new zzfr();
            }
            return zzE(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        return (byte) 1;
    }
}
