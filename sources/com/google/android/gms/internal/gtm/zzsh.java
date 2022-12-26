package com.google.android.gms.internal.gtm;
/* loaded from: classes7.dex */
final class zzsh {
    private static final zzsf zzbcu = zzqk();
    private static final zzsf zzbcv = new zzsg();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzsf zzqi() {
        return zzbcu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzsf zzqj() {
        return zzbcv;
    }

    private static zzsf zzqk() {
        try {
            return (zzsf) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
