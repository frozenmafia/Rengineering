package com.google.ads.interactivemedia.v3.internal;

import java.io.File;
/* loaded from: classes4.dex */
public final class asd {
    private final apb a;

    /* renamed from: b  reason: collision with root package name */
    private final File f695b;
    private final File c;
    private final File d;
    private byte[] e;

    public asd(apb apbVar, File file, File file2, File file3) {
        this.a = apbVar;
        this.f695b = file;
        this.c = file3;
        this.d = file2;
    }

    public final apb a() {
        return this.a;
    }

    public final File b() {
        return this.c;
    }

    public final File c() {
        return this.f695b;
    }

    public final boolean d() {
        return this.a.b() - (System.currentTimeMillis() / 1000) < 3600;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] e() {
        /*
            r3 = this;
            byte[] r0 = r3.e
            r1 = 0
            if (r0 != 0) goto L27
            java.io.File r0 = r3.d
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L20
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L20
            com.google.ads.interactivemedia.v3.internal.bnz r0 = com.google.ads.interactivemedia.v3.internal.bnz.w(r2)     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L21
            byte[] r0 = r0.C()     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L21
            com.google.android.gms.common.util.IOUtils.closeQuietly(r2)
            goto L25
        L18:
            r0 = move-exception
            r1 = r2
            goto L1c
        L1b:
            r0 = move-exception
        L1c:
            com.google.android.gms.common.util.IOUtils.closeQuietly(r1)
            throw r0
        L20:
            r2 = r1
        L21:
            com.google.android.gms.common.util.IOUtils.closeQuietly(r2)
            r0 = r1
        L25:
            r3.e = r0
        L27:
            byte[] r0 = r3.e
            if (r0 != 0) goto L2c
            return r1
        L2c:
            int r1 = r0.length
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.asd.e():byte[]");
    }
}
