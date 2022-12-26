package o;

import java.util.Arrays;
import java.util.RandomAccess;
/* loaded from: classes7.dex */
public final class canDropOver<E> extends setUsingSpansToEstimateScrollbarDimensions<E> implements RandomAccess {
    private static final canDropOver<Object> values;
    private int ag$a;
    private E[] valueOf;

    static {
        canDropOver<Object> candropover = new canDropOver<>(new Object[0], 0);
        values = candropover;
        candropover.valueOf();
    }

    public static <E> canDropOver<E> values() {
        return (canDropOver<E>) values;
    }

    canDropOver() {
        this(new Object[10], 0);
    }

    private canDropOver(E[] eArr, int i) {
        this.valueOf = eArr;
        this.ag$a = i;
    }

    @Override // o.checkSelectForSwipe$ah$b
    /* renamed from: valueOf */
    public canDropOver<E> toString(int i) {
        if (i < this.ag$a) {
            throw new IllegalArgumentException();
        }
        return new canDropOver<>(Arrays.copyOf(this.valueOf, i), this.ag$a);
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        ag$a();
        int i = this.ag$a;
        E[] eArr = this.valueOf;
        if (i == eArr.length) {
            this.valueOf = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.valueOf;
        int i2 = this.ag$a;
        this.ag$a = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        int i2;
        ag$a();
        if (i < 0 || i > (i2 = this.ag$a)) {
            throw new IndexOutOfBoundsException(values(i));
        }
        E[] eArr = this.valueOf;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = (E[]) ah$a(((i2 * 3) / 2) + 1);
            System.arraycopy(this.valueOf, 0, eArr2, 0, i);
            System.arraycopy(this.valueOf, i, eArr2, i + 1, this.ag$a - i);
            this.valueOf = eArr2;
        }
        this.valueOf[i] = e;
        this.ag$a++;
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        ag$a(i);
        return this.valueOf[i];
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractList, java.util.List
    public E remove(int i) {
        int i2;
        ag$a();
        ag$a(i);
        E[] eArr = this.valueOf;
        E e = eArr[i];
        if (i < this.ag$a - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.ag$a--;
        this.modCount++;
        return e;
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        ag$a();
        ag$a(i);
        E[] eArr = this.valueOf;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.ag$a;
    }

    private static <E> E[] ah$a(int i) {
        return (E[]) new Object[i];
    }

    private void ag$a(int i) {
        if (i < 0 || i >= this.ag$a) {
            throw new IndexOutOfBoundsException(values(i));
        }
    }

    private String values(int i) {
        return "Index:" + i + ", Size:" + this.ag$a;
    }
}
