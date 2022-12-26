package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class boa extends bod {
    private final byte[] f;
    private int g;
    private int h;
    private int i;
    private final int j;
    private int k;
    private int l = Integer.MAX_VALUE;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ boa(byte[] bArr, int i, int i2) {
        this.f = bArr;
        this.g = i2 + i;
        this.i = i;
        this.j = i;
    }

    private final void I() {
        int i = this.g + this.h;
        this.g = i;
        int i2 = i - this.j;
        int i3 = this.l;
        if (i2 <= i3) {
            this.h = 0;
            return;
        }
        int i4 = i2 - i3;
        this.h = i4;
        this.g = i - i4;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bod
    public final void A(int i) {
        this.l = i;
        I();
    }

    public final void B(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.g;
            int i3 = this.i;
            if (i <= i2 - i3) {
                this.i = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw bpt.f();
        }
        throw bpt.i();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bod
    public final boolean C() throws IOException {
        return this.i == this.g;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bod
    public final boolean D() throws IOException {
        return r() != 0;
    }

    public final byte a() throws IOException {
        int i = this.i;
        if (i == this.g) {
            throw bpt.i();
        }
        byte[] bArr = this.f;
        this.i = i + 1;
        return bArr[i];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bod
    public final double b() throws IOException {
        return Double.longBitsToDouble(q());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bod
    public final float c() throws IOException {
        return Float.intBitsToFloat(i());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bod
    public final int d() {
        return this.i - this.j;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bod
    public final int e(int i) throws bpt {
        if (i >= 0) {
            int d = i + d();
            if (d >= 0) {
                int i2 = this.l;
                if (d <= i2) {
                    this.l = d;
                    I();
                    return i2;
                }
                throw bpt.i();
            }
            throw bpt.g();
        }
        throw bpt.f();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bod
    public final int f() throws IOException {
        return j();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bod
    public final int g() throws IOException {
        return i();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bod
    public final int h() throws IOException {
        return j();
    }

    public final int i() throws IOException {
        int i = this.i;
        if (this.g - i < 4) {
            throw bpt.i();
        }
        byte[] bArr = this.f;
        this.i = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bod
    public final int k() throws IOException {
        return i();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bod
    public final int l() throws IOException {
        return F(j());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bod
    public final int m() throws IOException {
        if (C()) {
            this.k = 0;
            return 0;
        }
        int j = j();
        this.k = j;
        if (bsi.a(j) != 0) {
            return j;
        }
        throw bpt.c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bod
    public final int n() throws IOException {
        return j();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bod
    public final long o() throws IOException {
        return q();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bod
    public final long p() throws IOException {
        return r();
    }

    public final long q() throws IOException {
        int i = this.i;
        if (this.g - i < 8) {
            throw bpt.i();
        }
        byte[] bArr = this.f;
        this.i = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    final long s() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte a = a();
            j |= (a & Byte.MAX_VALUE) << i;
            if ((a & 128) == 0) {
                return j;
            }
        }
        throw bpt.e();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bod
    public final long t() throws IOException {
        return q();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bod
    public final long u() throws IOException {
        return G(r());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bod
    public final long v() throws IOException {
        return r();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bod
    public final bnz w() throws IOException {
        int j = j();
        if (j > 0) {
            int i = this.g;
            int i2 = this.i;
            if (j <= i - i2) {
                bnz u = bnz.u(this.f, i2, j);
                this.i += j;
                return u;
            }
        }
        if (j != 0) {
            if (j > 0) {
                int i3 = this.g;
                int i4 = this.i;
                if (j <= i3 - i4) {
                    int i5 = j + i4;
                    this.i = i5;
                    return bnz.x(Arrays.copyOfRange(this.f, i4, i5));
                }
            }
            if (j <= 0) {
                throw bpt.f();
            }
            throw bpt.i();
        }
        return bnz.f907b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bod
    public final String x() throws IOException {
        int j = j();
        if (j > 0) {
            int i = this.g;
            int i2 = this.i;
            if (j <= i - i2) {
                String str = new String(this.f, i2, j, bpr.a);
                this.i += j;
                return str;
            }
        }
        if (j == 0) {
            return "";
        }
        if (j < 0) {
            throw bpt.f();
        }
        throw bpt.i();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bod
    public final String y() throws IOException {
        int j = j();
        if (j > 0) {
            int i = this.g;
            int i2 = this.i;
            if (j <= i - i2) {
                String h = bsf.h(this.f, i2, j);
                this.i += j;
                return h;
            }
        }
        if (j == 0) {
            return "";
        }
        if (j <= 0) {
            throw bpt.f();
        }
        throw bpt.i();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bod
    public final void z(int i) throws bpt {
        if (this.k != i) {
            throw bpt.b();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bod
    public final boolean E(int i) throws IOException {
        int m;
        int b2 = bsi.b(i);
        int i2 = 0;
        if (b2 == 0) {
            if (this.g - this.i < 10) {
                while (i2 < 10) {
                    if (a() < 0) {
                        i2++;
                    }
                }
                throw bpt.e();
            }
            while (i2 < 10) {
                byte[] bArr = this.f;
                int i3 = this.i;
                this.i = i3 + 1;
                if (bArr[i3] < 0) {
                    i2++;
                }
            }
            throw bpt.e();
            return true;
        } else if (b2 == 1) {
            B(8);
            return true;
        } else if (b2 == 2) {
            B(j());
            return true;
        } else if (b2 != 3) {
            if (b2 != 4) {
                if (b2 == 5) {
                    B(4);
                    return true;
                }
                throw bpt.a();
            }
            return false;
        } else {
            do {
                m = m();
                if (m == 0) {
                    break;
                }
            } while (E(m));
            z(bsi.c(bsi.a(i), 4));
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        if (r2[r3] >= 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.i
            int r1 = r5.g
            if (r1 != r0) goto L7
            goto L6c
        L7:
            byte[] r2 = r5.f
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.i = r3
            return r0
        L12:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6c
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L23
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L69
        L23:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L30
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2e:
            r1 = r3
            goto L69
        L30:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L69
        L3e:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L69
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L69
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6c
        L69:
            r5.i = r1
            return r0
        L6c:
            long r0 = r5.s()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.boa.j():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ae, code lost:
        if (r2[r3] >= 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long r() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 188
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.boa.r():long");
    }
}
