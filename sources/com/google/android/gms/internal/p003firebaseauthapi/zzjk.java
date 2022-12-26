package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjk  reason: invalid package */
/* loaded from: classes7.dex */
public enum zzjk implements zzzy {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    
    private static final zzzz<zzjk> zzg = new zzzz<zzjk>() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjj
    };
    private final int zzi;

    zzjk(int i) {
        this.zzi = i;
    }

    public static zzjk zzb(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return CRUNCHY;
                    }
                    return RAW;
                }
                return LEGACY;
            }
            return TINK;
        }
        return UNKNOWN_PREFIX;
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
            return this.zzi;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
