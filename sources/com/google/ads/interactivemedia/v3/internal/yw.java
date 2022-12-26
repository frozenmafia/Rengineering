package com.google.ads.interactivemedia.v3.internal;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
/* loaded from: classes4.dex */
public final class yw implements zd {

    /* renamed from: b  reason: collision with root package name */
    private final k f1371b;
    private final long c;
    private long d;
    private int f;
    private int g;
    private byte[] e = new byte[65536];
    private final byte[] a = new byte[4096];

    static {
        aj.b("media3.extractor");
    }

    public yw(k kVar, long j, long j2) {
        this.f1371b = kVar;
        this.d = j;
        this.c = j2;
    }

    private final int m(byte[] bArr, int i, int i2) {
        int i3 = this.g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.e, 0, bArr, i, min);
        r(min);
        return min;
    }

    private final int n(byte[] bArr, int i, int i2, int i3, boolean z) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int a = this.f1371b.a(bArr, i + i3, i2 - i3);
        if (a == -1) {
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        return i3 + a;
    }

    private final int o(int i) {
        int min = Math.min(this.g, i);
        r(min);
        return min;
    }

    private final void p(int i) {
        if (i != -1) {
            this.d += i;
        }
    }

    private final void q(int i) {
        int i2 = this.f + i;
        int length = this.e.length;
        if (i2 > length) {
            this.e = Arrays.copyOf(this.e, cp.d(length + length, 65536 + i2, i2 + 524288));
        }
    }

    private final void r(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zd, com.google.ads.interactivemedia.v3.internal.k
    public final int a(byte[] bArr, int i, int i2) throws IOException {
        int m = m(bArr, i, i2);
        if (m == 0) {
            m = n(bArr, i, i2, 0, true);
        }
        p(m);
        return m;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zd
    public final long b() {
        return this.c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zd
    public final long c() {
        return this.d + this.f;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zd
    public final long d() {
        return this.d;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zd
    public final void e(int i) throws IOException {
        j(i, false);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zd
    public final void f(byte[] bArr, int i, int i2) throws IOException {
        k(bArr, i, i2, false);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zd
    public final void g(byte[] bArr, int i, int i2) throws IOException {
        l(bArr, i, i2, false);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zd
    public final void h() {
        this.f = 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zd
    public final void i(int i) throws IOException {
        int o2 = o(i);
        while (o2 < i && o2 != -1) {
            o2 = n(this.a, -o2, Math.min(i, o2 + 4096), o2, false);
        }
        p(o2);
    }

    public final boolean j(int i, boolean z) throws IOException {
        q(i);
        int i2 = this.g - this.f;
        while (i2 < i) {
            i2 = n(this.e, this.f, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.g = this.f + i2;
        }
        this.f += i;
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zd
    public final boolean k(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (j(i2, z)) {
            System.arraycopy(this.e, this.f - i2, bArr, i, i2);
            return true;
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zd
    public final boolean l(byte[] bArr, int i, int i2, boolean z) throws IOException {
        int m = m(bArr, i, i2);
        while (m < i2 && m != -1) {
            m = n(bArr, i, i2, m, z);
        }
        p(m);
        return m != -1;
    }
}
