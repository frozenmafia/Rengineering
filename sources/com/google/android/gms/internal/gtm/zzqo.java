package com.google.android.gms.internal.gtm;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzqo {
    private static final Class<?> zzaxg = zzom();

    private static Class<?> zzom() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static zzqp zzon() {
        if (zzaxg != null) {
            try {
                return zzdc("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return zzqp.zzaxk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.gtm.zzqp zzoo() {
        /*
            java.lang.Class<?> r0 = com.google.android.gms.internal.gtm.zzqo.zzaxg
            if (r0 == 0) goto Lb
            java.lang.String r0 = "loadGeneratedRegistry"
            com.google.android.gms.internal.gtm.zzqp r0 = zzdc(r0)     // Catch: java.lang.Exception -> Lb
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto L12
            com.google.android.gms.internal.gtm.zzqp r0 = com.google.android.gms.internal.gtm.zzqp.zzoo()
        L12:
            if (r0 != 0) goto L18
            com.google.android.gms.internal.gtm.zzqp r0 = zzon()
        L18:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzqo.zzoo():com.google.android.gms.internal.gtm.zzqp");
    }

    private static final zzqp zzdc(String str) throws Exception {
        return (zzqp) zzaxg.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }
}
