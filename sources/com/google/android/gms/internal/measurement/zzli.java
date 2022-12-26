package com.google.android.gms.internal.measurement;
/* loaded from: classes7.dex */
final class zzli {
    private static final zzlh zza;
    private static final zzlh zzb;

    static {
        zzlh zzlhVar;
        try {
            zzlhVar = (zzlh) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzlhVar = null;
        }
        zza = zzlhVar;
        zzb = new zzlh();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzlh zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzlh zzb() {
        return zzb;
    }
}
