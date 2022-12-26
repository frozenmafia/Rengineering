package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes4.dex */
final class bnq extends bnk implements RandomAccess, bpq, bqw {
    private static final bnq a;

    /* renamed from: b  reason: collision with root package name */
    private boolean[] f905b;
    private int c;

    static {
        bnq bnqVar = new bnq(new boolean[0], 0);
        a = bnqVar;
        bnqVar.b();
    }

    bnq() {
        this(new boolean[10], 0);
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
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(f(i));
        }
        boolean[] zArr = this.f905b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f905b, i, zArr2, i + 1, this.c - i);
            this.f905b = zArr2;
        }
        this.f905b[i] = booleanValue;
        this.c++;
        this.modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnk, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        bpr.i(collection);
        if (!(collection instanceof bnq)) {
            return super.addAll(collection);
        }
        bnq bnqVar = (bnq) collection;
        int i = bnqVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f905b;
            if (i3 > zArr.length) {
                this.f905b = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(bnqVar.f905b, 0, this.f905b, this.c, bnqVar.c);
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
        return new bnq(Arrays.copyOf(this.f905b, i), this.c);
    }

    public final void e(boolean z) {
        a();
        int i = this.c;
        boolean[] zArr = this.f905b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f905b = zArr2;
        }
        boolean[] zArr3 = this.f905b;
        int i2 = this.c;
        this.c = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnk, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnq)) {
            return super.equals(obj);
        }
        bnq bnqVar = (bnq) obj;
        if (this.c != bnqVar.c) {
            return false;
        }
        boolean[] zArr = bnqVar.f905b;
        for (int i = 0; i < this.c; i++) {
            if (this.f905b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        g(i);
        return Boolean.valueOf(this.f905b[i]);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnk, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + bpr.a(this.f905b[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int i = this.c;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f905b[i2] == booleanValue) {
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
        boolean[] zArr = this.f905b;
        boolean z = zArr[i];
        if (i < this.c - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        a();
        if (i2 >= i) {
            boolean[] zArr = this.f905b;
            System.arraycopy(zArr, i2, zArr, i, this.c - i2);
            this.c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnk, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        g(i);
        boolean[] zArr = this.f905b;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    private bnq(boolean[] zArr, int i) {
        this.f905b = zArr;
        this.c = i;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnk, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        e(((Boolean) obj).booleanValue());
        return true;
    }
}
