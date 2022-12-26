package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
/* loaded from: classes4.dex */
final class sr implements cx {
    private final cx a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1272b;
    private final sq c;
    private final byte[] d;
    private int e;

    public sr(cx cxVar, int i, sq sqVar) {
        af.u(i > 0);
        this.a = cxVar;
        this.f1272b = i;
        this.c = sqVar;
        this.d = new byte[1];
        this.e = i;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.k
    public final int a(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.e;
        if (i3 == 0) {
            int i4 = 0;
            if (this.a.a(this.d, 0, 1) != -1) {
                int i5 = (this.d[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr2 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int a = this.a.a(bArr2, i4, i6);
                        if (a != -1) {
                            i4 += a;
                            i6 -= a;
                        }
                    }
                    while (i5 > 0) {
                        int i7 = i5 - 1;
                        if (bArr2[i7] != 0) {
                            break;
                        }
                        i5 = i7;
                    }
                    if (i5 > 0) {
                        this.c.a(new ci(bArr2, i5));
                    }
                }
                i3 = this.f1272b;
                this.e = i3;
            }
            return -1;
        }
        int a2 = this.a.a(bArr, i, Math.min(i3, i2));
        if (a2 != -1) {
            this.e -= a2;
        }
        return a2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cx
    public final long b(db dbVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cx
    public final Uri c() {
        return this.a.c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cx
    public final void d() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cx
    public final Map e() {
        return this.a.e();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cx
    public final void f(dv dvVar) {
        af.s(dvVar);
        this.a.f(dvVar);
    }
}
