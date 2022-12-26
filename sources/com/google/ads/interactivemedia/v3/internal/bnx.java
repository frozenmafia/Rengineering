package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class bnx extends bnw {
    private static final long serialVersionUID = 1;
    protected final byte[] a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bnx(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnz
    public byte a(int i) {
        return this.a[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.bnz
    public byte b(int i) {
        return this.a[i];
    }

    protected int c() {
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnz
    public int d() {
        return this.a.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.ads.interactivemedia.v3.internal.bnz
    public void e(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.a, i, bArr, i2, i3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnz
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bnz) && d() == ((bnz) obj).d()) {
            if (d() == 0) {
                return true;
            }
            if (obj instanceof bnx) {
                bnx bnxVar = (bnx) obj;
                int r = r();
                int r2 = bnxVar.r();
                if (r == 0 || r2 == 0 || r == r2) {
                    return g(bnxVar, 0, d());
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.bnw
    public final boolean g(bnz bnzVar, int i, int i2) {
        if (i2 > bnzVar.d()) {
            int d = d();
            throw new IllegalArgumentException("Length too large: " + i2 + d);
        }
        int i3 = i + i2;
        if (i3 > bnzVar.d()) {
            int d2 = bnzVar.d();
            throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + d2);
        } else if (bnzVar instanceof bnx) {
            bnx bnxVar = (bnx) bnzVar;
            byte[] bArr = this.a;
            byte[] bArr2 = bnxVar.a;
            int c = c();
            int c2 = c();
            int c3 = bnxVar.c() + i;
            while (c2 < c + i2) {
                if (bArr[c2] != bArr2[c3]) {
                    return false;
                }
                c2++;
                c3++;
            }
            return true;
        } else {
            return bnzVar.k(i, i3).equals(k(0, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.ads.interactivemedia.v3.internal.bnz
    public final int i(int i, int i2, int i3) {
        return bpr.d(i, this.a, c() + i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.ads.interactivemedia.v3.internal.bnz
    public final int j(int i, int i2, int i3) {
        int c = c() + i2;
        return bsf.f(i, this.a, c, i3 + c);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnz
    public final bnz k(int i, int i2) {
        int q = q(i, i2, d());
        return q == 0 ? bnz.f907b : new bnt(this.a, c() + i, q);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnz
    public final bod l() {
        return bod.H(this.a, c(), d(), true);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnz
    protected final String m(Charset charset) {
        return new String(this.a, c(), d(), charset);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnz
    public final ByteBuffer n() {
        return ByteBuffer.wrap(this.a, c(), d()).asReadOnlyBuffer();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnz
    public final boolean o() {
        int c = c();
        return bsf.j(this.a, c, d() + c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.bnz
    public final void p(bpw bpwVar) throws IOException {
        ((boh) bpwVar).M(this.a, c(), d());
    }
}
