package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzho  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzho extends zzzw<zzho, zzhn> implements zzaba {
    private static final zzho zzb;
    private zzyu zze = zzyu.zzb;
    private zziw zzf;

    static {
        zzho zzhoVar = new zzho();
        zzb = zzhoVar;
        zzzw.zzF(zzho.class, zzhoVar);
    }

    private zzho() {
    }

    public static zzhn zza() {
        return zzb.zzt();
    }

    public static zzho zzc(byte[] bArr, zzzj zzzjVar) throws zzaae {
        return (zzho) zzzw.zzx(zzb, bArr, zzzjVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzho zzhoVar, zziw zziwVar) {
        zziwVar.getClass();
        zzhoVar.zzf = zziwVar;
    }

    public final zzyu zzd() {
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
                    return new zzhn(null);
                }
                return new zzho();
            }
            return zzE(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}
