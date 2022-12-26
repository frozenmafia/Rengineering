package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzr  reason: invalid package */
/* loaded from: classes7.dex */
final class zzzr implements zzaax {
    private static final zzzr zza = new zzzr();

    private zzzr() {
    }

    public static zzzr zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzaax
    public final zzaaw zzb(Class<?> cls) {
        if (!zzzw.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unsupported message type: ".concat(valueOf) : new String("Unsupported message type: "));
        }
        try {
            return (zzaaw) zzzw.zzv(cls.asSubclass(zzzw.class)).zzj(3, null, null);
        } catch (Exception e) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? "Unable to get message info for ".concat(valueOf2) : new String("Unable to get message info for "), e);
        }
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzaax
    public final boolean zzc(Class<?> cls) {
        return zzzw.class.isAssignableFrom(cls);
    }
}
