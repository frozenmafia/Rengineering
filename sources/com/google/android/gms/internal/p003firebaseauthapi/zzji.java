package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzji */
/* loaded from: classes7.dex */
public final class zzji extends zzzw<zzji, zzjh> implements zzaba {
    private static final zzji zzb;
    private String zze = "";
    private zzij zzf;

    static {
        zzji zzjiVar = new zzji();
        zzb = zzjiVar;
        zzzw.zzF(zzji.class, zzjiVar);
    }

    private zzji() {
    }

    public static zzji zzc() {
        return zzb;
    }

    public static zzji zzd(zzyu zzyuVar, zzzj zzzjVar) throws zzaae {
        return (zzji) zzzw.zzw(zzb, zzyuVar, zzzjVar);
    }

    public final zzij zza() {
        zzij zzijVar = this.zzf;
        return zzijVar == null ? zzij.zzc() : zzijVar;
    }

    public final String zze() {
        return this.zze;
    }

    public final boolean zzf() {
        return this.zzf != null;
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
                    return new zzjh(null);
                }
                return new zzji();
            }
            return zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}
