package com.google.ads.interactivemedia.v3.internal;

import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.util.Arrays;
/* loaded from: classes4.dex */
public abstract class ux extends up {
    private byte[] a;

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f1307b;

    public ux(cx cxVar, db dbVar, s sVar, int i, byte[] bArr) {
        super(cxVar, dbVar, 3, sVar, i, C.TIME_UNSET, C.TIME_UNSET);
        this.a = bArr == null ? cp.f : bArr;
    }

    protected abstract void a(byte[] bArr, int i) throws IOException;

    public final byte[] c() {
        return this.a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wt
    public final void e() throws IOException {
        try {
            this.n.b(this.g);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.f1307b) {
                byte[] bArr = this.a;
                int length = bArr.length;
                if (length < i2 + 16384) {
                    this.a = Arrays.copyOf(bArr, length + 16384);
                }
                i = this.n.a(this.a, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.f1307b) {
                a(this.a, i2);
            }
        } finally {
            af.e(this.n);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wt
    public final void r() {
        this.f1307b = true;
    }
}
