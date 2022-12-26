package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzht  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzht extends zzzw<zzht, zzhs> implements zzaba {
    private static final zzht zzb;
    private int zze;
    private zzhz zzf;
    private zzyu zzg = zzyu.zzb;

    static {
        zzht zzhtVar = new zzht();
        zzb = zzhtVar;
        zzzw.zzF(zzht.class, zzhtVar);
    }

    private zzht() {
    }

    public static zzhs zzb() {
        return zzb.zzt();
    }

    public static zzht zzd() {
        return zzb;
    }

    public static zzht zze(zzyu zzyuVar, zzzj zzzjVar) throws zzaae {
        return (zzht) zzzw.zzw(zzb, zzyuVar, zzzjVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzht zzhtVar, zzhz zzhzVar) {
        zzhzVar.getClass();
        zzhtVar.zzf = zzhzVar;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzhz zzf() {
        zzhz zzhzVar = this.zzf;
        return zzhzVar == null ? zzhz.zze() : zzhzVar;
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
                    return new zzhs(null);
                }
                return new zzht();
            }
            return zzE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
