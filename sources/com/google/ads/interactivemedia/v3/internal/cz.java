package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes4.dex */
public final class cz extends InputStream {
    private final cx a;

    /* renamed from: b  reason: collision with root package name */
    private final db f1007b;
    private long f;
    private boolean d = false;
    private boolean e = false;
    private final byte[] c = new byte[1];

    public cz(cx cxVar, db dbVar) {
        this.a = cxVar;
        this.f1007b = dbVar;
    }

    private final void b() throws IOException {
        if (this.d) {
            return;
        }
        this.a.b(this.f1007b);
        this.d = true;
    }

    public final void a() throws IOException {
        b();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.e) {
            return;
        }
        this.a.d();
        this.e = true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (read(this.c) == -1) {
            return -1;
        }
        return this.c[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        af.w(!this.e);
        b();
        int a = this.a.a(bArr, i, i2);
        if (a == -1) {
            return -1;
        }
        this.f += a;
        return a;
    }
}
