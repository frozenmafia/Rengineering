package o;

import java.util.Arrays;
import java.util.RandomAccess;
/* loaded from: classes5.dex */
public final class getDelegateDatabase<E> extends calculateCachedEnd<E> implements RandomAccess {
    private static final getDelegateDatabase<Object> toString;
    private int valueOf;
    private E[] values;

    static {
        getDelegateDatabase<Object> getdelegatedatabase = new getDelegateDatabase<>(new Object[0], 0);
        toString = getdelegatedatabase;
        getdelegatedatabase.valueOf();
    }

    public static <E> getDelegateDatabase<E> ah$a() {
        return (getDelegateDatabase<E>) toString;
    }

    getDelegateDatabase() {
        this(new Object[10], 0);
    }

    private getDelegateDatabase(E[] eArr, int i) {
        this.values = eArr;
        this.valueOf = i;
    }

    @Override // o.ViewInfoStore$HaptikSDK$b
    /* renamed from: values */
    public getDelegateDatabase<E> valueOf(int i) {
        if (i < this.valueOf) {
            throw new IllegalArgumentException();
        }
        return new getDelegateDatabase<>(Arrays.copyOf(this.values, i), this.valueOf);
    }

    @Override // o.calculateCachedEnd, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        values();
        int i = this.valueOf;
        E[] eArr = this.values;
        if (i == eArr.length) {
            this.values = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.values;
        int i2 = this.valueOf;
        this.valueOf = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    @Override // o.calculateCachedEnd, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        int i2;
        values();
        if (i < 0 || i > (i2 = this.valueOf)) {
            throw new IndexOutOfBoundsException(ag$a(i));
        }
        E[] eArr = this.values;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = (E[]) ah$a(((i2 * 3) / 2) + 1);
            System.arraycopy(this.values, 0, eArr2, 0, i);
            System.arraycopy(this.values, i, eArr2, i + 1, this.valueOf - i);
            this.values = eArr2;
        }
        this.values[i] = e;
        this.valueOf++;
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        toString(i);
        return this.values[i];
    }

    @Override // o.calculateCachedEnd, java.util.AbstractList, java.util.List
    public E remove(int i) {
        int i2;
        values();
        toString(i);
        E[] eArr = this.values;
        E e = eArr[i];
        if (i < this.valueOf - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.valueOf--;
        this.modCount++;
        return e;
    }

    @Override // o.calculateCachedEnd, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        values();
        toString(i);
        E[] eArr = this.values;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.valueOf;
    }

    private static <E> E[] ah$a(int i) {
        return (E[]) new Object[i];
    }

    private void toString(int i) {
        if (i < 0 || i >= this.valueOf) {
            throw new IndexOutOfBoundsException(ag$a(i));
        }
    }

    private String ag$a(int i) {
        return "Index:" + i + ", Size:" + this.valueOf;
    }
}
