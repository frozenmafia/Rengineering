package com.google.ads.interactivemedia.v3.internal;

import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
final class boc extends bod {
    private final InputStream f;
    private final byte[] g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m = Integer.MAX_VALUE;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ boc(InputStream inputStream) {
        bpr.j(inputStream, "input");
        this.f = inputStream;
        this.g = new byte[4096];
        this.h = 0;
        this.j = 0;
        this.l = 0;
    }

    private static int I(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        try {
            return inputStream.read(bArr, i, i2);
        } catch (bpt e) {
            e.j();
            throw e;
        }
    }

    private final List J(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.f.read(bArr, i2, min - i2);
                if (read == -1) {
                    throw bpt.i();
                }
                this.l += read;
                i2 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void K() {
        int i = this.h + this.i;
        this.h = i;
        int i2 = this.l + i;
        int i3 = this.m;
        if (i2 <= i3) {
            this.i = 0;
            return;
        }
        int i4 = i2 - i3;
        this.i = i4;
        this.h = i - i4;
    }

    private final void L(int i) throws IOException {
        if (M(i)) {
            return;
        }
        if (i > (Integer.MAX_VALUE - this.l) - this.j) {
            throw bpt.h();
        }
        throw bpt.i();
    }

    private final boolean M(int i) throws IOException {
        int i2 = this.j;
        int i3 = this.h;
        if (i2 + i <= i3) {
            throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
        }
        int i4 = this.l;
        if (i <= (Integer.MAX_VALUE - i4) - i2 && i4 + i2 + i <= this.m) {
            if (i2 > 0) {
                if (i3 > i2) {
                    byte[] bArr = this.g;
                    System.arraycopy(bArr, i2, bArr, 0, i3 - i2);
                }
                i4 = this.l + i2;
                this.l = i4;
                i3 = this.h - i2;
                this.h = i3;
                this.j = 0;
            }
            int I = I(this.f, this.g, i3, Math.min(4096 - i3, (Integer.MAX_VALUE - i4) - i3));
            if (I == 0 || I < -1 || I > 4096) {
                throw new IllegalStateException(String.valueOf(this.f.getClass()) + "#read(byte[]) returned invalid result: " + I + "\nThe InputStream implementation is buggy.");
            } else if (I > 0) {
                this.h += I;
                K();
                if (this.h >= i) {
                    return true;
                }
                return M(i);
            } else {
                return false;
            }
        }
        return false;
    }

    private final byte[] N(int i) throws IOException {
        if (i == 0) {
            return bpr.f934b;
        }
        if (i >= 0) {
            int i2 = this.l;
            int i3 = this.j;
            int i4 = i2 + i3 + i;
            if (C.RATE_UNSET_INT + i4 <= 0) {
                int i5 = this.m;
                if (i4 > i5) {
                    B((i5 - i2) - i3);
                    throw bpt.i();
                }
                int i6 = this.h - i3;
                int i7 = i - i6;
                if (i7 >= 4096) {
                    try {
                        if (i7 > this.f.available()) {
                            return null;
                        }
                    } catch (bpt e) {
                        e.j();
                        throw e;
                    }
                }
                byte[] bArr = new byte[i];
                System.arraycopy(this.g, this.j, bArr, 0, i6);
                this.l += this.h;
                this.j = 0;
                this.h = 0;
                while (i6 < i) {
                    int I = I(this.f, bArr, i6, i - i6);
                    if (I == -1) {
                        throw bpt.i();
                    }
                    this.l += I;
                    i6 += I;
                }
                return bArr;
            }
            throw bpt.h();
        }
        throw bpt.f();
    }

    private final byte[] O(int i) throws IOException {
        byte[] N = N(i);
        if (N != null) {
            return N;
        }
        int i2 = this.j;
        int i3 = this.h;
        int i4 = i3 - i2;
        this.l += i3;
        this.j = 0;
        this.h = 0;
        List<byte[]> J = J(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.g, i2, bArr, 0, i4);
        for (byte[] bArr2 : J) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bod
    public final void A(int i) {
        this.m = i;
        K();
    }

    public final void B(int i) throws IOException {
        int i2 = this.h;
        int i3 = this.j;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.j = i3 + i;
        } else if (i >= 0) {
            int i5 = this.l;
            int i6 = i5 + i3;
            int i7 = this.m;
            if (i6 + i > i7) {
                B((i7 - i5) - i3);
                throw bpt.i();
            }
            this.l = i6;
            this.h = 0;
            this.j = 0;
            while (i4 < i) {
                try {
                    long j = i - i4;
                    try {
                        long skip = this.f.skip(j);
                        int i8 = (skip > 0L ? 1 : (skip == 0L ? 0 : -1));
                        if (i8 < 0 || skip > j) {
                            throw new IllegalStateException(String.valueOf(this.f.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                        } else if (i8 == 0) {
                            break;
                        } else {
                            i4 += (int) skip;
                        }
                    } catch (bpt e) {
                        e.j();
                        throw e;
                    }
                } finally {
                    this.l += i4;
                    K();
                }
            }
            if (i4 >= i) {
                return;
            }
            int i9 = this.h;
            int i10 = i9 - this.j;
            this.j = i9;
            L(1);
            while (true) {
                int i11 = i - i10;
                int i12 = this.h;
                if (i11 <= i12) {
                    this.j = i11;
                    return;
                }
                i10 += i12;
                this.j = i12;
                L(1);
            }
        } else {
            throw bpt.f();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bod
    public final boolean C() throws IOException {
        return this.j == this.h && !M(1);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bod
    public final boolean D() throws IOException {
        return r() != 0;
    }

    public final byte a() throws IOException {
        if (this.j == this.h) {
            L(1);
        }
        byte[] bArr = this.g;
        int i = this.j;
        this.j = i + 1;
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
        return this.l + this.j;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bod
    public final int e(int i) throws bpt {
        if (i >= 0) {
            int i2 = i + this.l + this.j;
            int i3 = this.m;
            if (i2 <= i3) {
                this.m = i2;
                K();
                return i3;
            }
            throw bpt.i();
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
        int i = this.j;
        if (this.h - i < 4) {
            L(4);
            i = this.j;
        }
        byte[] bArr = this.g;
        this.j = i + 4;
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
        int i = this.j;
        if (this.h - i < 8) {
            L(8);
            i = this.j;
        }
        byte[] bArr = this.g;
        this.j = i + 8;
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
        int i = this.h;
        int i2 = this.j;
        if (j <= i - i2 && j > 0) {
            bnz u = bnz.u(this.g, i2, j);
            this.j += j;
            return u;
        } else if (j != 0) {
            byte[] N = N(j);
            if (N != null) {
                return bnz.t(N);
            }
            int i3 = this.j;
            int i4 = this.h;
            int i5 = i4 - i3;
            this.l += i4;
            this.j = 0;
            this.h = 0;
            List<byte[]> J = J(j - i5);
            byte[] bArr = new byte[j];
            System.arraycopy(this.g, i3, bArr, 0, i5);
            for (byte[] bArr2 : J) {
                int length = bArr2.length;
                System.arraycopy(bArr2, 0, bArr, i5, length);
                i5 += length;
            }
            return bnz.x(bArr);
        } else {
            return bnz.f907b;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bod
    public final String x() throws IOException {
        int j = j();
        if (j > 0) {
            int i = this.h;
            int i2 = this.j;
            if (j <= i - i2) {
                String str = new String(this.g, i2, j, bpr.a);
                this.j += j;
                return str;
            }
        }
        if (j == 0) {
            return "";
        }
        if (j <= this.h) {
            L(j);
            String str2 = new String(this.g, this.j, j, bpr.a);
            this.j += j;
            return str2;
        }
        return new String(O(j), bpr.a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bod
    public final String y() throws IOException {
        byte[] O;
        byte[] bArr;
        int j = j();
        int i = this.j;
        int i2 = this.h;
        if (j <= i2 - i && j > 0) {
            bArr = this.g;
            this.j = i + j;
        } else if (j == 0) {
            return "";
        } else {
            if (j <= i2) {
                L(j);
                O = this.g;
                this.j = j;
            } else {
                O = O(j);
            }
            bArr = O;
            i = 0;
        }
        return bsf.h(bArr, i, j);
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
            if (this.h - this.j < 10) {
                while (i2 < 10) {
                    if (a() < 0) {
                        i2++;
                    }
                }
                throw bpt.e();
            }
            while (i2 < 10) {
                byte[] bArr = this.g;
                int i3 = this.j;
                this.j = i3 + 1;
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
            int r0 = r5.j
            int r1 = r5.h
            if (r1 != r0) goto L7
            goto L6c
        L7:
            byte[] r2 = r5.g
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.j = r3
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
            r5.j = r1
            return r0
        L6c:
            long r0 = r5.s()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.boc.j():int");
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.boc.r():long");
    }
}
