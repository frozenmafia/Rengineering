package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes4.dex */
final class bov extends bnk implements RandomAccess, bpq, bqw {
    private static final bov a;

    /* renamed from: b  reason: collision with root package name */
    private double[] f919b;
    private int c;

    static {
        bov bovVar = new bov(new double[0], 0);
        a = bovVar;
        bovVar.b();
    }

    bov() {
        this(new double[10], 0);
    }

    private final String f(int i) {
        int i2 = this.c;
        return "Index:" + i + ", Size:" + i2;
    }

    private final void g(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(f(i));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnk, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        a();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(f(i));
        }
        double[] dArr = this.f919b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f919b, i, dArr2, i + 1, this.c - i);
            this.f919b = dArr2;
        }
        this.f919b[i] = doubleValue;
        this.c++;
        this.modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnk, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        bpr.i(collection);
        if (!(collection instanceof bov)) {
            return super.addAll(collection);
        }
        bov bovVar = (bov) collection;
        int i = bovVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f919b;
            if (i3 > dArr.length) {
                this.f919b = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(bovVar.f919b, 0, this.f919b, this.c, bovVar.c);
            this.c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpq
    public final /* synthetic */ bpq d(int i) {
        if (i < this.c) {
            throw new IllegalArgumentException();
        }
        return new bov(Arrays.copyOf(this.f919b, i), this.c);
    }

    public final void e(double d) {
        a();
        int i = this.c;
        double[] dArr = this.f919b;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f919b = dArr2;
        }
        double[] dArr3 = this.f919b;
        int i2 = this.c;
        this.c = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnk, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bov)) {
            return super.equals(obj);
        }
        bov bovVar = (bov) obj;
        if (this.c != bovVar.c) {
            return false;
        }
        double[] dArr = bovVar.f919b;
        for (int i = 0; i < this.c; i++) {
            if (Double.doubleToLongBits(this.f919b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        g(i);
        return Double.valueOf(this.f919b[i]);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnk, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + bpr.c(Double.doubleToLongBits(this.f919b[i2]));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            int i = this.c;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f919b[i2] == doubleValue) {
                    return i2;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnk, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        a();
        g(i);
        double[] dArr = this.f919b;
        double d = dArr[i];
        if (i < this.c - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.c--;
        this.modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        a();
        if (i2 >= i) {
            double[] dArr = this.f919b;
            System.arraycopy(dArr, i2, dArr, i, this.c - i2);
            this.c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnk, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        a();
        g(i);
        double[] dArr = this.f919b;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    private bov(double[] dArr, int i) {
        this.f919b = dArr;
        this.c = i;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnk, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        e(((Double) obj).doubleValue());
        return true;
    }
}
