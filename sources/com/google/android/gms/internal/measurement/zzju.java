package com.google.android.gms.internal.measurement;
/* loaded from: classes7.dex */
final class zzju {
    private static final zzjs zza = new zzjt();
    private static final zzjs zzb;

    static {
        zzjs zzjsVar;
        try {
            zzjsVar = (zzjs) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzjsVar = null;
        }
        zzb = zzjsVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzjs zza() {
        zzjs zzjsVar = zzb;
        if (zzjsVar != null) {
            return zzjsVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzjs zzb() {
        return zza;
    }
}
