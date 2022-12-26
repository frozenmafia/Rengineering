package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.io.IOException;
import java.io.RandomAccessFile;
/* loaded from: classes4.dex */
public final class dl extends cs {
    private RandomAccessFile a;

    /* renamed from: b  reason: collision with root package name */
    private Uri f1015b;
    private long c;
    private boolean d;

    public dl() {
        super(false);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.k
    public final int a(byte[] bArr, int i, int i2) throws dk {
        if (i2 == 0) {
            return 0;
        }
        if (this.c == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.a;
            int i3 = cp.a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(this.c, i2));
            if (read > 0) {
                this.c -= read;
                g(read);
            }
            return read;
        } catch (IOException e) {
            throw new dk(e, 2000);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
        if (r0 != false) goto L31;
     */
    @Override // com.google.ads.interactivemedia.v3.internal.cx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(com.google.ads.interactivemedia.v3.internal.db r8) throws com.google.ads.interactivemedia.v3.internal.dk {
        /*
            r7 = this;
            android.net.Uri r0 = r8.a
            r7.f1015b = r0
            r7.i(r8)
            r1 = 1
            r2 = 2000(0x7d0, float:2.803E-42)
            r3 = 2006(0x7d6, float:2.811E-42)
            java.lang.String r4 = r0.getPath()     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L59 java.io.FileNotFoundException -> L60
            com.google.ads.interactivemedia.v3.internal.af.s(r4)     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L59 java.io.FileNotFoundException -> L60
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L59 java.io.FileNotFoundException -> L60
            java.lang.String r6 = "r"
            r5.<init>(r4, r6)     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L59 java.io.FileNotFoundException -> L60
            r7.a = r5
            long r3 = r8.e     // Catch: java.io.IOException -> L4b
            r5.seek(r3)     // Catch: java.io.IOException -> L4b
            long r3 = r8.f     // Catch: java.io.IOException -> L4b
            r5 = -1
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L32
            java.io.RandomAccessFile r0 = r7.a     // Catch: java.io.IOException -> L4b
            long r3 = r0.length()     // Catch: java.io.IOException -> L4b
            long r5 = r8.e     // Catch: java.io.IOException -> L4b
            long r3 = r3 - r5
        L32:
            r7.c = r3     // Catch: java.io.IOException -> L4b
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L42
            r7.d = r1
            r7.j(r8)
            long r0 = r7.c
            return r0
        L42:
            com.google.ads.interactivemedia.v3.internal.dk r8 = new com.google.ads.interactivemedia.v3.internal.dk
            r0 = 2008(0x7d8, float:2.814E-42)
            r1 = 0
            r8.<init>(r1, r1, r0)
            throw r8
        L4b:
            r8 = move-exception
            com.google.ads.interactivemedia.v3.internal.dk r0 = new com.google.ads.interactivemedia.v3.internal.dk
            r0.<init>(r8, r2)
            throw r0
        L52:
            r8 = move-exception
            com.google.ads.interactivemedia.v3.internal.dk r0 = new com.google.ads.interactivemedia.v3.internal.dk
            r0.<init>(r8, r2)
            throw r0
        L59:
            r8 = move-exception
            com.google.ads.interactivemedia.v3.internal.dk r0 = new com.google.ads.interactivemedia.v3.internal.dk
            r0.<init>(r8, r3)
            throw r0
        L60:
            r8 = move-exception
            java.lang.String r2 = r0.getQuery()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L8e
            java.lang.String r2 = r0.getFragment()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L8e
            int r0 = com.google.ads.interactivemedia.v3.internal.cp.a
            r1 = 21
            if (r0 < r1) goto L86
            java.lang.Throwable r0 = r8.getCause()
            boolean r0 = com.google.ads.interactivemedia.v3.internal.dj.a(r0)
            if (r0 == 0) goto L86
            goto L88
        L86:
            r3 = 2005(0x7d5, float:2.81E-42)
        L88:
            com.google.ads.interactivemedia.v3.internal.dk r0 = new com.google.ads.interactivemedia.v3.internal.dk
            r0.<init>(r8, r3)
            throw r0
        L8e:
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r4 = r0.getPath()
            r2[r3] = r4
            java.lang.String r3 = r0.getQuery()
            r2[r1] = r3
            r1 = 2
            java.lang.String r0 = r0.getFragment()
            r2[r1] = r0
            com.google.ads.interactivemedia.v3.internal.dk r0 = new com.google.ads.interactivemedia.v3.internal.dk
            java.lang.String r1 = "uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r2 = 1004(0x3ec, float:1.407E-42)
            r0.<init>(r1, r8, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.dl.b(com.google.ads.interactivemedia.v3.internal.db):long");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cx
    public final Uri c() {
        return this.f1015b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cx
    public final void d() throws dk {
        this.f1015b = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.a;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.a = null;
                if (this.d) {
                    this.d = false;
                    h();
                }
            } catch (IOException e) {
                throw new dk(e, 2000);
            }
        } catch (Throwable th) {
            this.a = null;
            if (this.d) {
                this.d = false;
                h();
            }
            throw th;
        }
    }
}
