package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzie  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzie extends zzzw<zzie, zzib> implements zzaba {
    private static final zzie zzb;
    private String zze = "";
    private zzyu zzf = zzyu.zzb;
    private int zzg;

    static {
        zzie zzieVar = new zzie();
        zzb = zzieVar;
        zzzw.zzF(zzie.class, zzieVar);
    }

    private zzie() {
    }

    public static zzib zza() {
        return zzb.zzt();
    }

    public static zzie zzd() {
        return zzb;
    }

    public final zzid zzb() {
        zzid zzb2 = zzid.zzb(this.zzg);
        return zzb2 == null ? zzid.UNRECOGNIZED : zzb2;
    }

    public final zzyu zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzzw
    protected final Object zzj(int i, Object obj, Object obj2) {
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
                    return new zzib(null);
                }
                return new zzie();
            }
            return zzE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
