package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzij  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzij extends zzzw<zzij, zzii> implements zzaba {
    private static final zzij zzb;
    private String zze = "";
    private zzyu zzf = zzyu.zzb;
    private int zzg;

    static {
        zzij zzijVar = new zzij();
        zzb = zzijVar;
        zzzw.zzF(zzij.class, zzijVar);
    }

    private zzij() {
    }

    public static zzii zza() {
        return zzb.zzt();
    }

    public static zzij zzc() {
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzg(zzij zzijVar, String str) {
        str.getClass();
        zzijVar.zze = str;
    }

    public final zzjk zzd() {
        zzjk zzb2 = zzjk.zzb(this.zzg);
        return zzb2 == null ? zzjk.UNRECOGNIZED : zzb2;
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
                    return new zzii(null);
                }
                return new zzij();
            }
            return zzE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
