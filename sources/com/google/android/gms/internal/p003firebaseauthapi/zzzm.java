package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzm  reason: invalid package */
/* loaded from: classes7.dex */
final class zzzm {
    private static final zzzk<?> zza = new zzzl();
    private static final zzzk<?> zzb;

    static {
        zzzk<?> zzzkVar;
        try {
            zzzkVar = (zzzk) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzzkVar = null;
        }
        zzb = zzzkVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzzk<?> zza() {
        zzzk<?> zzzkVar = zzb;
        if (zzzkVar != null) {
            return zzzkVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzzk<?> zzb() {
        return zza;
    }
}
