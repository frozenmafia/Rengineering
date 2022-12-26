package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhz  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzhz extends zzzw<zzhz, zzhy> implements zzaba {
    private static final zzhz zzb;
    private int zze;
    private int zzf;

    static {
        zzhz zzhzVar = new zzhz();
        zzb = zzhzVar;
        zzzw.zzF(zzhz.class, zzhzVar);
    }

    private zzhz() {
    }

    public static zzhy zzc() {
        return zzb.zzt();
    }

    public static zzhz zze() {
        return zzb;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzhq zzb() {
        zzhq zzb2 = zzhq.zzb(this.zze);
        return zzb2 == null ? zzhq.UNRECOGNIZED : zzb2;
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
                    return new zzhy(null);
                }
                return new zzhz();
            }
            return zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}
