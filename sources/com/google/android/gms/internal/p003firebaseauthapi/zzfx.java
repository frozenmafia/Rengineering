package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfx */
/* loaded from: classes7.dex */
public final class zzfx extends zzzw<zzfx, zzfw> implements zzaba {
    private static final zzfx zzb;
    private int zze;
    private int zzf;

    static {
        zzfx zzfxVar = new zzfx();
        zzb = zzfxVar;
        zzzw.zzF(zzfx.class, zzfxVar);
    }

    private zzfx() {
    }

    public static zzfw zzb() {
        return zzb.zzt();
    }

    public static zzfx zzd(zzyu zzyuVar, zzzj zzzjVar) throws zzaae {
        return (zzfx) zzzw.zzw(zzb, zzyuVar, zzzjVar);
    }

    public final int zza() {
        return this.zze;
    }

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
                    return new zzfw(null);
                }
                return new zzfx();
            }
            return zzE(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}
