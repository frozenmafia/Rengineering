package com.google.android.gms.internal.gtm;
/* loaded from: classes7.dex */
final class zzst {
    private static final zzsr zzbdp = zzqr();
    private static final zzsr zzbdq = new zzss();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzsr zzqp() {
        return zzbdp;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzsr zzqq() {
        return zzbdq;
    }

    private static zzsr zzqr() {
        try {
            return (zzsr) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
