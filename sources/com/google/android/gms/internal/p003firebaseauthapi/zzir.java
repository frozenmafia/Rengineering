package com.google.android.gms.internal.p003firebaseauthapi;

import java.util.List;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzir  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzir extends zzzw<zzir, zzio> implements zzaba {
    private static final zzir zzb;
    private int zze;
    private zzaab<zziq> zzf = zzz();

    static {
        zzir zzirVar = new zzir();
        zzb = zzirVar;
        zzzw.zzF(zzir.class, zzirVar);
    }

    private zzir() {
    }

    public static zzio zzc() {
        return zzb.zzt();
    }

    public static zzir zzf(byte[] bArr, zzzj zzzjVar) throws zzaae {
        return (zzir) zzzw.zzx(zzb, bArr, zzzjVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzir zzirVar, zziq zziqVar) {
        zziqVar.getClass();
        zzaab<zziq> zzaabVar = zzirVar.zzf;
        if (!zzaabVar.zzc()) {
            zzirVar.zzf = zzzw.zzA(zzaabVar);
        }
        zzirVar.zzf.add(zziqVar);
    }

    public final int zza() {
        return this.zzf.size();
    }

    public final int zzb() {
        return this.zze;
    }

    public final zziq zzd(int i) {
        return this.zzf.get(i);
    }

    public final List<zziq> zzg() {
        return this.zzf;
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
                    return new zzio(null);
                }
                return new zzir();
            }
            return zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zziq.class});
        }
        return (byte) 1;
    }
}
