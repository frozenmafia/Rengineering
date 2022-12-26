package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfc  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzfc extends zzzw<zzfc, zzfb> implements zzaba {
    private static final zzfc zzb;
    private int zze;
    private zzfi zzf;
    private zzyu zzg = zzyu.zzb;

    static {
        zzfc zzfcVar = new zzfc();
        zzb = zzfcVar;
        zzzw.zzF(zzfc.class, zzfcVar);
    }

    private zzfc() {
    }

    public static zzfb zzb() {
        return zzb.zzt();
    }

    public static zzfc zzd() {
        return zzb;
    }

    public static zzfc zze(zzyu zzyuVar, zzzj zzzjVar) throws zzaae {
        return (zzfc) zzzw.zzw(zzb, zzyuVar, zzzjVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzfc zzfcVar, zzfi zzfiVar) {
        zzfiVar.getClass();
        zzfcVar.zzf = zzfiVar;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzfi zzf() {
        zzfi zzfiVar = this.zzf;
        return zzfiVar == null ? zzfi.zzd() : zzfiVar;
    }

    public final zzyu zzg() {
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
                    return new zzfb(null);
                }
                return new zzfc();
            }
            return zzE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
