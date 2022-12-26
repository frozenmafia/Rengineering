package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgr  reason: invalid package */
/* loaded from: classes7.dex */
public enum zzgr implements zzzy {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    DO_NOT_USE_CRUNCHY_UNCOMPRESSED(3),
    UNRECOGNIZED(-1);
    
    private static final zzzz<zzgr> zzf = new zzzz<zzgr>() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgq
    };
    private final int zzh;

    zzgr(int i) {
        this.zzh = i;
    }

    public static zzgr zzb(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
                }
                return COMPRESSED;
            }
            return UNCOMPRESSED;
        }
        return UNKNOWN_FORMAT;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(getClass().getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb.append(" number=");
            sb.append(zza());
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzh;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
