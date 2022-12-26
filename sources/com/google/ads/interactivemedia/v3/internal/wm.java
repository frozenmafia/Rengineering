package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
/* loaded from: classes4.dex */
public final class wm {
    private final byte[] a;

    /* renamed from: b  reason: collision with root package name */
    private int f1329b;
    private int c;
    private int d;
    private bdj[] e;

    public wm() {
        af.u(true);
        af.u(true);
        this.d = 0;
        this.e = new bdj[100];
        this.a = null;
    }

    public final int a() {
        int i;
        synchronized (this) {
            i = this.c;
        }
        return i * 65536;
    }

    public final void b(wg wgVar) {
        synchronized (this) {
            while (wgVar != null) {
                bdj[] bdjVarArr = this.e;
                int i = this.d;
                this.d = i + 1;
                bdjVarArr[i] = wgVar.e();
                this.c--;
                wgVar = wgVar.c();
            }
            notifyAll();
        }
    }

    public final void c() {
        synchronized (this) {
            d(0);
        }
    }

    public final void d(int i) {
        synchronized (this) {
            int i2 = this.f1329b;
            this.f1329b = i;
            if (i < i2) {
                e();
            }
        }
    }

    public final void e() {
        synchronized (this) {
            int max = Math.max(0, cp.c(this.f1329b, 65536) - this.c);
            int i = this.d;
            if (max >= i) {
                return;
            }
            Arrays.fill(this.e, max, i, (Object) null);
            this.d = max;
        }
    }

    public final bdj f() {
        bdj bdjVar;
        synchronized (this) {
            this.c++;
            int i = this.d;
            if (i > 0) {
                bdj[] bdjVarArr = this.e;
                int i2 = i - 1;
                this.d = i2;
                bdjVar = bdjVarArr[i2];
                af.s(bdjVar);
                this.e[this.d] = null;
            } else {
                bdjVar = new bdj(new byte[65536], 0);
                int i3 = this.c;
                bdj[] bdjVarArr2 = this.e;
                int length = bdjVarArr2.length;
                if (i3 > length) {
                    this.e = (bdj[]) Arrays.copyOf(bdjVarArr2, length + length);
                    return bdjVar;
                }
            }
            return bdjVar;
        }
    }

    public final void g(bdj bdjVar) {
        synchronized (this) {
            bdj[] bdjVarArr = this.e;
            int i = this.d;
            this.d = i + 1;
            bdjVarArr[i] = bdjVar;
            this.c--;
            notifyAll();
        }
    }
}
