package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zziw */
/* loaded from: classes7.dex */
public final class zziw extends zzzw<zziw, zzit> implements zzaba {
    private static final zziw zzb;
    private int zze;
    private zzaab<zziv> zzf = zzz();

    static {
        zziw zziwVar = new zziw();
        zzb = zziwVar;
        zzzw.zzF(zziw.class, zziwVar);
    }

    private zziw() {
    }

    public static zzit zza() {
        return zzb.zzt();
    }

    public static /* synthetic */ void zze(zziw zziwVar, zziv zzivVar) {
        zzivVar.getClass();
        zzaab<zziv> zzaabVar = zziwVar.zzf;
        if (!zzaabVar.zzc()) {
            zziwVar.zzf = zzzw.zzA(zzaabVar);
        }
        zziwVar.zzf.add(zzivVar);
    }

    public final zziv zzb(int i) {
        return this.zzf.get(0);
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
                    return new zzit(null);
                }
                return new zziw();
            }
            return zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zziv.class});
        }
        return (byte) 1;
    }
}
