package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzid  reason: invalid package */
/* loaded from: classes7.dex */
public enum zzid implements zzzy {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);
    
    private static final zzzz<zzid> zzg = new zzzz<zzid>() { // from class: com.google.android.gms.internal.firebase-auth-api.zzic
    };
    private final int zzi;

    zzid(int i) {
        this.zzi = i;
    }

    public static zzid zzb(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return REMOTE;
                    }
                    return ASYMMETRIC_PUBLIC;
                }
                return ASYMMETRIC_PRIVATE;
            }
            return SYMMETRIC;
        }
        return UNKNOWN_KEYMATERIAL;
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
