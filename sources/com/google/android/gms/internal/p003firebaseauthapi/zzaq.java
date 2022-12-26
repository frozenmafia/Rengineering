package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaq  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzaq {
    private final zzij zza;

    private zzaq(zzij zzijVar) {
        this.zza = zzijVar;
    }

    public static zzaq zze(String str, byte[] bArr, int i) {
        zzjk zzjkVar;
        zzii zza = zzij.zza();
        zza.zzb(str);
        zza.zzc(zzyu.zzn(bArr));
        zzjk zzjkVar2 = zzjk.UNKNOWN_PREFIX;
        int i2 = i - 1;
        if (i2 == 0) {
            zzjkVar = zzjk.TINK;
        } else if (i2 != 1) {
            zzjkVar = i2 != 2 ? zzjk.CRUNCHY : zzjk.RAW;
        } else {
            zzjkVar = zzjk.LEGACY;
        }
        zza.zza(zzjkVar);
        return new zzaq(zza.zzk());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzij zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zza.zzf();
    }

    public final byte[] zzc() {
        return this.zza.zze().zzs();
    }

    public final int zzd() {
        zzjk zzd = this.zza.zzd();
        zzjk zzjkVar = zzjk.UNKNOWN_PREFIX;
        int ordinal = zzd.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        return 4;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }
}
