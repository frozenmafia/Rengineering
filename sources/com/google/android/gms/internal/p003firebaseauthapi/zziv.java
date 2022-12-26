package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zziv  reason: invalid package */
/* loaded from: classes7.dex */
public final class zziv extends zzzw<zziv, zziu> implements zzaba {
    private static final zziv zzb;
    private String zze = "";
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zziv zzivVar = new zziv();
        zzb = zzivVar;
        zzzw.zzF(zziv.class, zzivVar);
    }

    private zziv() {
    }

    public static zziu zzb() {
        return zzb.zzt();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zziv zzivVar, String str) {
        str.getClass();
        zzivVar.zze = str;
    }

    public final int zza() {
        return this.zzg;
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
                    return new zziu(null);
                }
                return new zziv();
            }
            return zzE(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
