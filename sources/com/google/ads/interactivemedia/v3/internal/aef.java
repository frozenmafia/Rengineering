package com.google.ads.interactivemedia.v3.internal;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.io.IOException;
/* loaded from: classes4.dex */
final class aef implements ys {
    private final cn a;
    private final int c;
    private final int d = TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES;

    /* renamed from: b  reason: collision with root package name */
    private final ci f510b = new ci();

    public aef(int i, cn cnVar, int i2) {
        this.c = i;
        this.a = cnVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ys
    public final yr a(zd zdVar, long j) throws IOException {
        int f;
        int f2;
        long j2;
        long d = zdVar.d();
        int min = (int) Math.min(112800L, zdVar.b() - d);
        this.f510b.B(min);
        zdVar.f(this.f510b.H(), 0, min);
        ci ciVar = this.f510b;
        int d2 = ciVar.d();
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (ciVar.a() >= 188 && (f2 = (f = aez.f(ciVar.H(), ciVar.c(), d2)) + 188) <= d2) {
            long g = aez.g(ciVar, f, this.c);
            if (g != C.TIME_UNSET) {
                long b2 = this.a.b(g);
                if (b2 > j) {
                    if (j5 == C.TIME_UNSET) {
                        return yr.d(b2, d);
                    }
                    j2 = d + j3;
                } else if (100000 + b2 > j) {
                    j2 = d + f;
                } else {
                    j3 = f;
                    j5 = b2;
                }
                return yr.e(j2);
            }
            ciVar.F(f2);
            j4 = f2;
        }
        return j5 != C.TIME_UNSET ? yr.f(j5, d + j4) : yr.a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ys
    public final void b() {
        this.f510b.C(cp.f);
    }
}
