package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zziq  reason: invalid package */
/* loaded from: classes7.dex */
public final class zziq extends zzzw<zziq, zzip> implements zzaba {
    private static final zziq zzb;
    private zzie zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zziq zziqVar = new zziq();
        zzb = zziqVar;
        zzzw.zzF(zziq.class, zziqVar);
    }

    private zziq() {
    }

    public static zzip zzd() {
        return zzb.zzt();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzg(zziq zziqVar, zzie zzieVar) {
        zzieVar.getClass();
        zziqVar.zze = zzieVar;
    }

    public final int zza() {
        return this.zzg;
    }

    public final zzie zzb() {
        zzie zzieVar = this.zze;
        return zzieVar == null ? zzie.zzd() : zzieVar;
    }

    public final zzig zzc() {
        zzig zzb2 = zzig.zzb(this.zzf);
        return zzb2 == null ? zzig.UNRECOGNIZED : zzb2;
    }

    public final zzjk zzf() {
        zzjk zzb2 = zzjk.zzb(this.zzh);
        return zzb2 == null ? zzjk.UNRECOGNIZED : zzb2;
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
                    return new zzip(null);
                }
                return new zziq();
            }
            return zzE(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final boolean zzl() {
        return this.zze != null;
    }
}
