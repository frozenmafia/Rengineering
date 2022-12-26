package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes4.dex */
final class bpe extends bnk implements RandomAccess, bpq, bqw {
    private static final bpe a;

    /* renamed from: b  reason: collision with root package name */
    private float[] f929b;
    private int c;

    static {
        bpe bpeVar = new bpe(new float[0], 0);
        a = bpeVar;
        bpeVar.b();
    }

    bpe() {
        this(new float[10], 0);
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
        float floatValue = ((Float) obj).floatValue();
        a();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(f(i));
        }
        float[] fArr = this.f929b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f929b, i, fArr2, i + 1, this.c - i);
            this.f929b = fArr2;
        }
        this.f929b[i] = floatValue;
        this.c++;
        this.modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnk, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        bpr.i(collection);
        if (!(collection instanceof bpe)) {
            return super.addAll(collection);
        }
        bpe bpeVar = (bpe) collection;
        int i = bpeVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f929b;
            if (i3 > fArr.length) {
                this.f929b = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(bpeVar.f929b, 0, this.f929b, this.c, bpeVar.c);
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
        return new bpe(Arrays.copyOf(this.f929b, i), this.c);
    }

    public final void e(float f) {
        a();
        int i = this.c;
        float[] fArr = this.f929b;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f929b = fArr2;
        }
        float[] fArr3 = this.f929b;
        int i2 = this.c;
        this.c = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnk, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpe)) {
            return super.equals(obj);
        }
        bpe bpeVar = (bpe) obj;
        if (this.c != bpeVar.c) {
            return false;
        }
        float[] fArr = bpeVar.f929b;
        for (int i = 0; i < this.c; i++) {
            if (Float.floatToIntBits(this.f929b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        g(i);
        return Float.valueOf(this.f929b[i]);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnk, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f929b[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            int i = this.c;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f929b[i2] == floatValue) {
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
        float[] fArr = this.f929b;
        float f = fArr[i];
        if (i < this.c - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.c--;
        this.modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        a();
        if (i2 >= i) {
            float[] fArr = this.f929b;
            System.arraycopy(fArr, i2, fArr, i, this.c - i2);
            this.c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnk, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        a();
        g(i);
        float[] fArr = this.f929b;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    private bpe(float[] fArr, int i) {
        this.f929b = fArr;
        this.c = i;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnk, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        e(((Float) obj).floatValue());
        return true;
    }
}
