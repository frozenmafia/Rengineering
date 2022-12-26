package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zziz  reason: invalid package */
/* loaded from: classes7.dex */
public final class zziz extends zzzw<zziz, zziy> implements zzaba {
    private static final zziz zzb;
    private int zze;
    private zzjc zzf;

    static {
        zziz zzizVar = new zziz();
        zzb = zzizVar;
        zzzw.zzF(zziz.class, zzizVar);
    }

    private zziz() {
    }

    public static zziy zzb() {
        return zzb.zzt();
    }

    public static zziz zzd(zzyu zzyuVar, zzzj zzzjVar) throws zzaae {
        return (zziz) zzzw.zzw(zzb, zzyuVar, zzzjVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzg(zziz zzizVar, zzjc zzjcVar) {
        zzjcVar.getClass();
        zzizVar.zzf = zzjcVar;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzjc zze() {
        zzjc zzjcVar = this.zzf;
        return zzjcVar == null ? zzjc.zzb() : zzjcVar;
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
                    return new zziy(null);
                }
                return new zziz();
            }
            return zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}
