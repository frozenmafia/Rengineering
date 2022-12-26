package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import o.ViewInfoStore;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class findOnePartiallyVisibleChild extends calculateCachedEnd<Boolean> implements ViewInfoStore.valueOf, RandomAccess, executeRefCountingFunction {
    private static final findOnePartiallyVisibleChild values;
    private boolean[] ag$a;
    private int toString;

    static {
        findOnePartiallyVisibleChild findonepartiallyvisiblechild = new findOnePartiallyVisibleChild(new boolean[0], 0);
        values = findonepartiallyvisiblechild;
        findonepartiallyvisiblechild.valueOf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public findOnePartiallyVisibleChild() {
        this(new boolean[10], 0);
    }

    private findOnePartiallyVisibleChild(boolean[] zArr, int i) {
        this.ag$a = zArr;
        this.toString = i;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i, int i2) {
        values();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.ag$a;
        System.arraycopy(zArr, i2, zArr, i, this.toString - i2);
        this.toString -= i2 - i;
        this.modCount++;
    }

    @Override // o.calculateCachedEnd, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof findOnePartiallyVisibleChild)) {
            return super.equals(obj);
        }
        findOnePartiallyVisibleChild findonepartiallyvisiblechild = (findOnePartiallyVisibleChild) obj;
        if (this.toString != findonepartiallyvisiblechild.toString) {
            return false;
        }
        boolean[] zArr = findonepartiallyvisiblechild.ag$a;
        for (int i = 0; i < this.toString; i++) {
            if (this.ag$a[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // o.calculateCachedEnd, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.toString; i2++) {
            i = (i * 31) + ViewInfoStore.valueOf(this.ag$a[i2]);
        }
        return i;
    }

    @Override // o.ViewInfoStore$HaptikSDK$b
    /* renamed from: ag$a */
    public ViewInfoStore.valueOf valueOf(int i) {
        if (i < this.toString) {
            throw new IllegalArgumentException();
        }
        return new findOnePartiallyVisibleChild(Arrays.copyOf(this.ag$a, i), this.toString);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: ah$a */
    public Boolean get(int i) {
        return Boolean.valueOf(values(i));
    }

    public boolean values(int i) {
        HaptikSDK$b(i);
        return this.ag$a[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int size = size();
            for (int i = 0; i < size; i++) {
                if (this.ag$a[i] == booleanValue) {
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.toString;
    }

    @Override // o.calculateCachedEnd, java.util.AbstractList, java.util.List
    /* renamed from: ah$a */
    public Boolean set(int i, Boolean bool) {
        return Boolean.valueOf(ag$a(i, bool.booleanValue()));
    }

    public boolean ag$a(int i, boolean z) {
        values();
        HaptikSDK$b(i);
        boolean[] zArr = this.ag$a;
        boolean z2 = zArr[i];
        zArr[i] = z;
        return z2;
    }

    @Override // o.calculateCachedEnd, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: values */
    public boolean add(Boolean bool) {
        ah$a(bool.booleanValue());
        return true;
    }

    @Override // o.calculateCachedEnd, java.util.AbstractList, java.util.List
    /* renamed from: values */
    public void add(int i, Boolean bool) {
        valueOf(i, bool.booleanValue());
    }

    public void ah$a(boolean z) {
        values();
        int i = this.toString;
        boolean[] zArr = this.ag$a;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.ag$a = zArr2;
        }
        boolean[] zArr3 = this.ag$a;
        int i2 = this.toString;
        this.toString = i2 + 1;
        zArr3[i2] = z;
    }

    private void valueOf(int i, boolean z) {
        int i2;
        values();
        if (i < 0 || i > (i2 = this.toString)) {
            throw new IndexOutOfBoundsException(HaptikSDK$c(i));
        }
        boolean[] zArr = this.ag$a;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.ag$a, i, zArr2, i + 1, this.toString - i);
            this.ag$a = zArr2;
        }
        this.ag$a[i] = z;
        this.toString++;
        this.modCount++;
    }

    @Override // o.calculateCachedEnd, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        values();
        ViewInfoStore.valueOf(collection);
        if (!(collection instanceof findOnePartiallyVisibleChild)) {
            return super.addAll(collection);
        }
        findOnePartiallyVisibleChild findonepartiallyvisiblechild = (findOnePartiallyVisibleChild) collection;
        int i = findonepartiallyvisiblechild.toString;
        if (i == 0) {
            return false;
        }
        int i2 = this.toString;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.ag$a;
        if (i3 > zArr.length) {
            this.ag$a = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(findonepartiallyvisiblechild.ag$a, 0, this.ag$a, this.toString, findonepartiallyvisiblechild.toString);
        this.toString = i3;
        this.modCount++;
        return true;
    }

    @Override // o.calculateCachedEnd, java.util.AbstractList, java.util.List
    /* renamed from: toString */
    public Boolean remove(int i) {
        int i2;
        values();
        HaptikSDK$b(i);
        boolean[] zArr = this.ag$a;
        boolean z = zArr[i];
        if (i < this.toString - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.toString--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    private void HaptikSDK$b(int i) {
        if (i < 0 || i >= this.toString) {
            throw new IndexOutOfBoundsException(HaptikSDK$c(i));
        }
    }

    private String HaptikSDK$c(int i) {
        return "Index:" + i + ", Size:" + this.toString;
    }
}
