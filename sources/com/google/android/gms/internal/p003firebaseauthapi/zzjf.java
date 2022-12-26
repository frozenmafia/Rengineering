package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjf */
/* loaded from: classes7.dex */
public final class zzjf extends zzzw<zzjf, zzje> implements zzaba {
    private static final zzjf zzb;
    private int zze;
    private zzji zzf;

    static {
        zzjf zzjfVar = new zzjf();
        zzb = zzjfVar;
        zzzw.zzF(zzjf.class, zzjfVar);
    }

    private zzjf() {
    }

    public static zzje zzb() {
        return zzb.zzt();
    }

    public static zzjf zzd(zzyu zzyuVar, zzzj zzzjVar) throws zzaae {
        return (zzjf) zzzw.zzw(zzb, zzyuVar, zzzjVar);
    }

    public static /* synthetic */ void zzg(zzjf zzjfVar, zzji zzjiVar) {
        zzjiVar.getClass();
        zzjfVar.zzf = zzjiVar;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzji zze() {
        zzji zzjiVar = this.zzf;
        return zzjiVar == null ? zzji.zzc() : zzjiVar;
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
                    return new zzje(null);
                }
                return new zzjf();
            }
            return zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}
