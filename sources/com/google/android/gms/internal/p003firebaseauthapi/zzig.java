package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzig  reason: invalid package */
/* loaded from: classes7.dex */
public enum zzig implements zzzy {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    
    private static final zzzz<zzig> zzf = new zzzz<zzig>() { // from class: com.google.android.gms.internal.firebase-auth-api.zzif
    };
    private final int zzh;

    zzig(int i) {
        this.zzh = i;
    }

    public static zzig zzb(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return DESTROYED;
                }
                return DISABLED;
            }
            return ENABLED;
        }
        return UNKNOWN_STATUS;
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
