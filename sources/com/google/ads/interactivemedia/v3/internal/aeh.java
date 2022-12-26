package com.google.ads.interactivemedia.v3.internal;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.io.IOException;
/* loaded from: classes4.dex */
final class aeh {
    private boolean d;
    private boolean e;
    private boolean f;
    private final int a = TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES;

    /* renamed from: b  reason: collision with root package name */
    private final cn f511b = new cn(0);
    private long g = C.TIME_UNSET;
    private long h = C.TIME_UNSET;
    private long i = C.TIME_UNSET;
    private final ci c = new ci();

    /* JADX INFO: Access modifiers changed from: package-private */
    public aeh(int i) {
    }

    private final void e(zd zdVar) {
        this.c.C(cp.f);
        this.d = true;
        zdVar.h();
    }

    public final int a(zd zdVar, zt ztVar, int i) throws IOException {
        if (i <= 0) {
            e(zdVar);
            return 0;
        }
        boolean z = this.f;
        long j = C.TIME_UNSET;
        if (!z) {
            long b2 = zdVar.b();
            int min = (int) Math.min(112800L, b2);
            long j2 = b2 - min;
            if (zdVar.d() != j2) {
                ztVar.a = j2;
                return 1;
            }
            this.c.B(min);
            zdVar.h();
            zdVar.f(this.c.H(), 0, min);
            ci ciVar = this.c;
            int c = ciVar.c();
            int d = ciVar.d();
            int i2 = d - 188;
            while (true) {
                if (i2 < c) {
                    break;
                }
                byte[] H = ciVar.H();
                int i3 = -4;
                int i4 = 0;
                while (true) {
                    if (i3 > 4) {
                        break;
                    }
                    int i5 = (i3 * 188) + i2;
                    if (i5 < c || i5 >= d || H[i5] != 71) {
                        i4 = 0;
                    } else {
                        i4++;
                        if (i4 == 5) {
                            long g = aez.g(ciVar, i2, i);
                            if (g != C.TIME_UNSET) {
                                j = g;
                                break;
                            }
                        }
                    }
                    i3++;
                }
                i2--;
            }
            this.h = j;
            this.f = true;
            return 0;
        } else if (this.h == C.TIME_UNSET) {
            e(zdVar);
            return 0;
        } else if (this.e) {
            long j3 = this.g;
            if (j3 == C.TIME_UNSET) {
                e(zdVar);
                return 0;
            }
            long b3 = this.f511b.b(this.h) - this.f511b.b(j3);
            this.i = b3;
            if (b3 < 0) {
                cc.e("TsDurationReader", "Invalid duration: " + b3 + ". Using TIME_UNSET instead.");
                this.i = C.TIME_UNSET;
            }
            e(zdVar);
            return 0;
        } else {
            int min2 = (int) Math.min(112800L, zdVar.b());
            if (zdVar.d() != 0) {
                ztVar.a = 0L;
                return 1;
            }
            this.c.B(min2);
            zdVar.h();
            zdVar.f(this.c.H(), 0, min2);
            ci ciVar2 = this.c;
            int c2 = ciVar2.c();
            int d2 = ciVar2.d();
            while (true) {
                if (c2 >= d2) {
                    break;
                }
                if (ciVar2.H()[c2] == 71) {
                    long g2 = aez.g(ciVar2, c2, i);
                    if (g2 != C.TIME_UNSET) {
                        j = g2;
                        break;
                    }
                }
                c2++;
            }
            this.g = j;
            this.e = true;
            return 0;
        }
    }

    public final long b() {
        return this.i;
    }

    public final cn c() {
        return this.f511b;
    }

    public final boolean d() {
        return this.d;
    }
}
