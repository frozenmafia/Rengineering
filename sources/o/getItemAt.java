package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import o.ViewInfoStore;
/* loaded from: classes5.dex */
public final class getItemAt extends calculateCachedEnd<Double> implements ViewInfoStore.toString, RandomAccess, executeRefCountingFunction {
    private static final getItemAt toString;
    private int ag$a;
    private double[] ah$a;

    static {
        getItemAt getitemat = new getItemAt(new double[0], 0);
        toString = getitemat;
        getitemat.valueOf();
    }

    public static getItemAt ah$a() {
        return toString;
    }

    public getItemAt() {
        this(new double[10], 0);
    }

    private getItemAt(double[] dArr, int i) {
        this.ah$a = dArr;
        this.ag$a = i;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i, int i2) {
        values();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.ah$a;
        System.arraycopy(dArr, i2, dArr, i, this.ag$a - i2);
        this.ag$a -= i2 - i;
        this.modCount++;
    }

    @Override // o.calculateCachedEnd, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getItemAt)) {
            return super.equals(obj);
        }
        getItemAt getitemat = (getItemAt) obj;
        if (this.ag$a != getitemat.ag$a) {
            return false;
        }
        double[] dArr = getitemat.ah$a;
        for (int i = 0; i < this.ag$a; i++) {
            if (Double.doubleToLongBits(this.ah$a[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // o.calculateCachedEnd, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.ag$a; i2++) {
            i = (i * 31) + ViewInfoStore.ah$a(Double.doubleToLongBits(this.ah$a[i2]));
        }
        return i;
    }

    @Override // o.ViewInfoStore$HaptikSDK$b
    /* renamed from: ag$a */
    public ViewInfoStore.toString valueOf(int i) {
        if (i < this.ag$a) {
            throw new IllegalArgumentException();
        }
        return new getItemAt(Arrays.copyOf(this.ah$a, i), this.ag$a);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: ah$a */
    public Double get(int i) {
        return Double.valueOf(values(i));
    }

    public double values(int i) {
        HaptikSDK$c(i);
        return this.ah$a[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            int size = size();
            for (int i = 0; i < size; i++) {
                if (this.ah$a[i] == doubleValue) {
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
        return this.ag$a;
    }

    @Override // o.calculateCachedEnd, java.util.AbstractList, java.util.List
    /* renamed from: valueOf */
    public Double set(int i, Double d) {
        return Double.valueOf(ah$a(i, d.doubleValue()));
    }

    public double ah$a(int i, double d) {
        values();
        HaptikSDK$c(i);
        double[] dArr = this.ah$a;
        double d2 = dArr[i];
        dArr[i] = d;
        return d2;
    }

    @Override // o.calculateCachedEnd, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: valueOf */
    public boolean add(Double d) {
        ah$a(d.doubleValue());
        return true;
    }

    @Override // o.calculateCachedEnd, java.util.AbstractList, java.util.List
    /* renamed from: ag$a */
    public void add(int i, Double d) {
        toString(i, d.doubleValue());
    }

    public void ah$a(double d) {
        values();
        int i = this.ag$a;
        double[] dArr = this.ah$a;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.ah$a = dArr2;
        }
        double[] dArr3 = this.ah$a;
        int i2 = this.ag$a;
        this.ag$a = i2 + 1;
        dArr3[i2] = d;
    }

    private void toString(int i, double d) {
        int i2;
        values();
        if (i < 0 || i > (i2 = this.ag$a)) {
            throw new IndexOutOfBoundsException(HaptikSDK$b(i));
        }
        double[] dArr = this.ah$a;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.ah$a, i, dArr2, i + 1, this.ag$a - i);
            this.ah$a = dArr2;
        }
        this.ah$a[i] = d;
        this.ag$a++;
        this.modCount++;
    }

    @Override // o.calculateCachedEnd, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        values();
        ViewInfoStore.valueOf(collection);
        if (!(collection instanceof getItemAt)) {
            return super.addAll(collection);
        }
        getItemAt getitemat = (getItemAt) collection;
        int i = getitemat.ag$a;
        if (i == 0) {
            return false;
        }
        int i2 = this.ag$a;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.ah$a;
        if (i3 > dArr.length) {
            this.ah$a = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(getitemat.ah$a, 0, this.ah$a, this.ag$a, getitemat.ag$a);
        this.ag$a = i3;
        this.modCount++;
        return true;
    }

    @Override // o.calculateCachedEnd, java.util.AbstractList, java.util.List
    /* renamed from: toString */
    public Double remove(int i) {
        int i2;
        values();
        HaptikSDK$c(i);
        double[] dArr = this.ah$a;
        double d = dArr[i];
        if (i < this.ag$a - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.ag$a--;
        this.modCount++;
        return Double.valueOf(d);
    }

    private void HaptikSDK$c(int i) {
        if (i < 0 || i >= this.ag$a) {
            throw new IndexOutOfBoundsException(HaptikSDK$b(i));
        }
    }

    private String HaptikSDK$b(int i) {
        return "Index:" + i + ", Size:" + this.ag$a;
    }
}
