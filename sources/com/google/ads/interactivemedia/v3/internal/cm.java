package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
/* loaded from: classes4.dex */
public final class cm {
    private long[] a = new long[10];

    /* renamed from: b  reason: collision with root package name */
    private Object[] f1000b = new Object[10];
    private int c;
    private int d;

    private final Object f() {
        af.w(this.d > 0);
        Object[] objArr = this.f1000b;
        int i = this.c;
        Object obj = objArr[i];
        objArr[i] = null;
        this.c = (i + 1) % objArr.length;
        this.d--;
        return obj;
    }

    public final int a() {
        int i;
        synchronized (this) {
            i = this.d;
        }
        return i;
    }

    public final Object b() {
        synchronized (this) {
            if (this.d == 0) {
                return null;
            }
            return f();
        }
    }

    public final Object c(long j) {
        Object obj;
        synchronized (this) {
            obj = null;
            while (this.d > 0 && j - this.a[this.c] >= 0) {
                obj = f();
            }
        }
        return obj;
    }

    public final void d(long j, Object obj) {
        synchronized (this) {
            int i = this.d;
            if (i > 0) {
                int i2 = this.c;
                if (j <= this.a[((i2 + i) - 1) % this.f1000b.length]) {
                    e();
                }
            }
            int length = this.f1000b.length;
            if (this.d >= length) {
                int i3 = length + length;
                long[] jArr = new long[i3];
                Object[] objArr = new Object[i3];
                int i4 = this.c;
                int i5 = length - i4;
                System.arraycopy(this.a, i4, jArr, 0, i5);
                System.arraycopy(this.f1000b, this.c, objArr, 0, i5);
                int i6 = this.c;
                if (i6 > 0) {
                    System.arraycopy(this.a, 0, jArr, i5, i6);
                    System.arraycopy(this.f1000b, 0, objArr, i5, this.c);
                }
                this.a = jArr;
                this.f1000b = objArr;
                this.c = 0;
            }
            int i7 = this.c;
            int i8 = this.d;
            Object[] objArr2 = this.f1000b;
            int length2 = (i7 + i8) % objArr2.length;
            this.a[length2] = j;
            objArr2[length2] = obj;
            this.d = i8 + 1;
        }
    }

    public final void e() {
        synchronized (this) {
            this.c = 0;
            this.d = 0;
            Arrays.fill(this.f1000b, (Object) null);
        }
    }
}
