package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes4.dex */
final class bqg extends bnk implements RandomAccess, bpq, bqw {
    private static final bqg a;

    /* renamed from: b  reason: collision with root package name */
    private long[] f941b;
    private int c;

    static {
        bqg bqgVar = new bqg(new long[0], 0);
        a = bqgVar;
        bqgVar.b();
    }

    bqg() {
        this(new long[10], 0);
    }

    private final String g(int i) {
        int i2 = this.c;
        return "Index:" + i + ", Size:" + i2;
    }

    private final void h(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(g(i));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnk, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        a();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(g(i));
        }
        long[] jArr = this.f941b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f941b, i, jArr2, i + 1, this.c - i);
            this.f941b = jArr2;
        }
        this.f941b[i] = longValue;
        this.c++;
        this.modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnk, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        bpr.i(collection);
        if (!(collection instanceof bqg)) {
            return super.addAll(collection);
        }
        bqg bqgVar = (bqg) collection;
        int i = bqgVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f941b;
            if (i3 > jArr.length) {
                this.f941b = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(bqgVar.f941b, 0, this.f941b, this.c, bqgVar.c);
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
        return new bqg(Arrays.copyOf(this.f941b, i), this.c);
    }

    public final long e(int i) {
        h(i);
        return this.f941b[i];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnk, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqg)) {
            return super.equals(obj);
        }
        bqg bqgVar = (bqg) obj;
        if (this.c != bqgVar.c) {
            return false;
        }
        long[] jArr = bqgVar.f941b;
        for (int i = 0; i < this.c; i++) {
            if (this.f941b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void f(long j) {
        a();
        int i = this.c;
        long[] jArr = this.f941b;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f941b = jArr2;
        }
        long[] jArr3 = this.f941b;
        int i2 = this.c;
        this.c = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(e(i));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnk, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + bpr.c(this.f941b[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            int i = this.c;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f941b[i2] == longValue) {
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
        h(i);
        long[] jArr = this.f941b;
        long j = jArr[i];
        if (i < this.c - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.c--;
        this.modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        a();
        if (i2 >= i) {
            long[] jArr = this.f941b;
            System.arraycopy(jArr, i2, jArr, i, this.c - i2);
            this.c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnk, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        a();
        h(i);
        long[] jArr = this.f941b;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    private bqg(long[] jArr, int i) {
        this.f941b = jArr;
        this.c = i;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnk, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        f(((Long) obj).longValue());
        return true;
    }
}
