package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhj  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzhj extends zzzw<zzhj, zzhi> implements zzaba {
    private static final zzhj zzb;
    private int zze;
    private int zzf;
    private zzyu zzg = zzyu.zzb;

    static {
        zzhj zzhjVar = new zzhj();
        zzb = zzhjVar;
        zzzw.zzF(zzhj.class, zzhjVar);
    }

    private zzhj() {
    }

    public static zzhi zza() {
        return zzb.zzt();
    }

    public static zzhj zzc() {
        return zzb;
    }

    public final zzhl zzd() {
        zzhl zzb2 = zzhl.zzb(this.zze);
        return zzb2 == null ? zzhl.UNRECOGNIZED : zzb2;
    }

    public final zzhq zze() {
        zzhq zzb2 = zzhq.zzb(this.zzf);
        return zzb2 == null ? zzhq.UNRECOGNIZED : zzb2;
    }

    public final zzyu zzf() {
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
                    return new zzhi(null);
                }
                return new zzhj();
            }
            return zzE(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
