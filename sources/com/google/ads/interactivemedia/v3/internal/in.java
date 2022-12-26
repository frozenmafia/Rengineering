package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class in {
    final /* synthetic */ io a;

    /* renamed from: b */
    private final String f1101b;
    private int c;
    private long d;
    private ta e;
    private boolean f;
    private boolean g;

    public in(io ioVar, String str, int i, ta taVar) {
        this.a = ioVar;
        this.f1101b = str;
        this.c = i;
        this.d = taVar == null ? -1L : taVar.d;
        if (taVar == null || !taVar.b()) {
            return;
        }
        this.e = taVar;
    }

    public static /* bridge */ /* synthetic */ int a(in inVar) {
        return inVar.c;
    }

    public static /* bridge */ /* synthetic */ long b(in inVar) {
        return inVar.d;
    }

    public static /* bridge */ /* synthetic */ ta c(in inVar) {
        return inVar.e;
    }

    public static /* bridge */ /* synthetic */ String d(in inVar) {
        return inVar.f1101b;
    }

    public static /* bridge */ /* synthetic */ boolean f(in inVar) {
        return inVar.g;
    }

    public static /* bridge */ /* synthetic */ boolean g(in inVar) {
        return inVar.f;
    }

    public static /* bridge */ /* synthetic */ void k(in inVar) {
        inVar.g = true;
    }

    public static /* bridge */ /* synthetic */ void l(in inVar) {
        inVar.f = true;
    }

    public final void e(int i, ta taVar) {
        if (this.d == -1 && i == this.c && taVar != null) {
            this.d = taVar.d;
        }
    }

    public final boolean h(int i, ta taVar) {
        if (taVar == null) {
            return i == this.c;
        }
        ta taVar2 = this.e;
        return taVar2 == null ? !taVar.b() && taVar.d == this.d : taVar.d == taVar2.d && taVar.f630b == taVar2.f630b && taVar.c == taVar2.c;
    }

    public final boolean i(hu huVar) {
        long j = this.d;
        if (j == -1) {
            return false;
        }
        ta taVar = huVar.d;
        if (taVar == null) {
            return this.c != huVar.c;
        } else if (taVar.d > j) {
            return true;
        } else {
            if (this.e == null) {
                return false;
            }
            int a = huVar.f1084b.a(taVar.a);
            int a2 = huVar.f1084b.a(this.e.a);
            ta taVar2 = huVar.d;
            if (taVar2.d < this.e.d || a < a2) {
                return false;
            }
            if (a > a2) {
                return true;
            }
            if (taVar2.b()) {
                ta taVar3 = huVar.d;
                int i = taVar3.f630b;
                int i2 = taVar3.c;
                ta taVar4 = this.e;
                int i3 = taVar4.f630b;
                return i > i3 || (i == i3 && i2 > taVar4.c);
            }
            int i4 = huVar.d.e;
            return i4 == -1 || i4 > this.e.f630b;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x000d, code lost:
        if (r0 < r5.c()) goto L6;
     */
    /* JADX WARN: Incorrect condition in loop: B:36:0x0029 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(com.google.ads.interactivemedia.v3.internal.be r4, com.google.ads.interactivemedia.v3.internal.be r5) {
        /*
            r3 = this;
            int r0 = r3.c
            int r1 = r4.c()
            r2 = -1
            if (r0 < r1) goto L10
            int r4 = r5.c()
            if (r0 >= r4) goto L45
            goto L46
        L10:
            com.google.ads.interactivemedia.v3.internal.io r1 = r3.a
            com.google.ads.interactivemedia.v3.internal.bd r1 = com.google.ads.interactivemedia.v3.internal.io.b(r1)
            r4.o(r0, r1)
            com.google.ads.interactivemedia.v3.internal.io r0 = r3.a
            com.google.ads.interactivemedia.v3.internal.bd r0 = com.google.ads.interactivemedia.v3.internal.io.b(r0)
            int r0 = r0.f799o
        L21:
            com.google.ads.interactivemedia.v3.internal.io r1 = r3.a
            com.google.ads.interactivemedia.v3.internal.bd r1 = com.google.ads.interactivemedia.v3.internal.io.b(r1)
            int r1 = r1.p
            if (r0 > r1) goto L45
            java.lang.Object r1 = r4.f(r0)
            int r1 = r5.a(r1)
            if (r1 == r2) goto L42
            com.google.ads.interactivemedia.v3.internal.io r4 = r3.a
            com.google.ads.interactivemedia.v3.internal.bc r4 = com.google.ads.interactivemedia.v3.internal.io.a(r4)
            com.google.ads.interactivemedia.v3.internal.bc r4 = r5.m(r1, r4)
            int r0 = r4.c
            goto L46
        L42:
            int r0 = r0 + 1
            goto L21
        L45:
            r0 = -1
        L46:
            r3.c = r0
            r4 = 0
            if (r0 != r2) goto L4c
            return r4
        L4c:
            com.google.ads.interactivemedia.v3.internal.ta r0 = r3.e
            r1 = 1
            if (r0 != 0) goto L52
            return r1
        L52:
            java.lang.Object r0 = r0.a
            int r5 = r5.a(r0)
            if (r5 == r2) goto L5b
            return r1
        L5b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.in.j(com.google.ads.interactivemedia.v3.internal.be, com.google.ads.interactivemedia.v3.internal.be):boolean");
    }
}
