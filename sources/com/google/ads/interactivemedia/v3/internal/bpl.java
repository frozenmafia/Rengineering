package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class bpl extends bnk implements RandomAccess, bpp, bqw {
    private static final bpl a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f933b;
    private int c;

    static {
        bpl bplVar = new bpl(new int[0], 0);
        a = bplVar;
        bplVar.b();
    }

    bpl() {
        this(new int[10], 0);
    }

    public static bpl f() {
        return a;
    }

    private final String h(int i) {
        int i2 = this.c;
        return "Index:" + i + ", Size:" + i2;
    }

    private final void i(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(h(i));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnk, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        a();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(h(i));
        }
        int[] iArr = this.f933b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f933b, i, iArr2, i + 1, this.c - i);
            this.f933b = iArr2;
        }
        this.f933b[i] = intValue;
        this.c++;
        this.modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnk, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        bpr.i(collection);
        if (!(collection instanceof bpl)) {
            return super.addAll(collection);
        }
        bpl bplVar = (bpl) collection;
        int i = bplVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f933b;
            if (i3 > iArr.length) {
                this.f933b = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(bplVar.f933b, 0, this.f933b, this.c, bplVar.c);
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
        return new bpl(Arrays.copyOf(this.f933b, i), this.c);
    }

    public final int e(int i) {
        i(i);
        return this.f933b[i];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnk, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpl)) {
            return super.equals(obj);
        }
        bpl bplVar = (bpl) obj;
        if (this.c != bplVar.c) {
            return false;
        }
        int[] iArr = bplVar.f933b;
        for (int i = 0; i < this.c; i++) {
            if (this.f933b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i) {
        a();
        int i2 = this.c;
        int[] iArr = this.f933b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f933b = iArr2;
        }
        int[] iArr3 = this.f933b;
        int i3 = this.c;
        this.c = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(e(i));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnk, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + this.f933b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i = this.c;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f933b[i2] == intValue) {
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
        i(i);
        int[] iArr = this.f933b;
        int i3 = iArr[i];
        if (i < this.c - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.c--;
        this.modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        a();
        if (i2 >= i) {
            int[] iArr = this.f933b;
            System.arraycopy(iArr, i2, iArr, i, this.c - i2);
            this.c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnk, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        i(i);
        int[] iArr = this.f933b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    private bpl(int[] iArr, int i) {
        this.f933b = iArr;
        this.c = i;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnk, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        g(((Integer) obj).intValue());
        return true;
    }
}
