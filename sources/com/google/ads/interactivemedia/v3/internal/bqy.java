package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class bqy extends bnk implements RandomAccess {
    private static final bqy a;

    /* renamed from: b  reason: collision with root package name */
    private Object[] f952b;
    private int c;

    static {
        bqy bqyVar = new bqy(new Object[0], 0);
        a = bqyVar;
        bqyVar.b();
    }

    bqy() {
        this(new Object[10], 0);
    }

    public static bqy e() {
        return a;
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
    public final void add(int i, Object obj) {
        int i2;
        a();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(f(i));
        }
        Object[] objArr = this.f952b;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f952b, i, objArr2, i + 1, this.c - i);
            this.f952b = objArr2;
        }
        this.f952b[i] = obj;
        this.c++;
        this.modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpq
    public final /* synthetic */ bpq d(int i) {
        if (i < this.c) {
            throw new IllegalArgumentException();
        }
        return new bqy(Arrays.copyOf(this.f952b, i), this.c);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        g(i);
        return this.f952b[i];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnk, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        a();
        g(i);
        Object[] objArr = this.f952b;
        Object obj = objArr[i];
        if (i < this.c - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.c--;
        this.modCount++;
        return obj;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnk, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        g(i);
        Object[] objArr = this.f952b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    private bqy(Object[] objArr, int i) {
        this.f952b = objArr;
        this.c = i;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnk, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i = this.c;
        Object[] objArr = this.f952b;
        if (i == objArr.length) {
            this.f952b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f952b;
        int i2 = this.c;
        this.c = i2 + 1;
        objArr2[i2] = obj;
        this.modCount++;
        return true;
    }
}
