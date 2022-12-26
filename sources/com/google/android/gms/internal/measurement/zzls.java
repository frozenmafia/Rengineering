package com.google.android.gms.internal.measurement;
/* loaded from: classes7.dex */
final class zzls {
    private static final zzlr zza;
    private static final zzlr zzb;

    static {
        zzlr zzlrVar;
        try {
            zzlrVar = (zzlr) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzlrVar = null;
        }
        zza = zzlrVar;
        zzb = new zzlr();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzlr zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzlr zzb() {
        return zzb;
    }
}
