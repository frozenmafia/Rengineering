package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import o.checkSelectForSwipe;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class isSpanIndexCacheEnabled extends setUsingSpansToEstimateScrollbarDimensions<Double> implements checkSelectForSwipe.valueOf, RandomAccess, getMaxDragScroll {
    private static final isSpanIndexCacheEnabled values;
    private int ag$a;
    private double[] valueOf;

    static {
        isSpanIndexCacheEnabled isspanindexcacheenabled = new isSpanIndexCacheEnabled(new double[0], 0);
        values = isspanindexcacheenabled;
        isspanindexcacheenabled.valueOf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public isSpanIndexCacheEnabled() {
        this(new double[10], 0);
    }

    private isSpanIndexCacheEnabled(double[] dArr, int i) {
        this.valueOf = dArr;
        this.ag$a = i;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i, int i2) {
        ag$a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.valueOf;
        System.arraycopy(dArr, i2, dArr, i, this.ag$a - i2);
        this.ag$a -= i2 - i;
        this.modCount++;
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isSpanIndexCacheEnabled)) {
            return super.equals(obj);
        }
        isSpanIndexCacheEnabled isspanindexcacheenabled = (isSpanIndexCacheEnabled) obj;
        if (this.ag$a != isspanindexcacheenabled.ag$a) {
            return false;
        }
        double[] dArr = isspanindexcacheenabled.valueOf;
        for (int i = 0; i < this.ag$a; i++) {
            if (Double.doubleToLongBits(this.valueOf[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.ag$a; i2++) {
            i = (i * 31) + checkSelectForSwipe.toString(Double.doubleToLongBits(this.valueOf[i2]));
        }
        return i;
    }

    @Override // o.checkSelectForSwipe$ah$b
    /* renamed from: values */
    public checkSelectForSwipe.valueOf toString(int i) {
        if (i < this.ag$a) {
            throw new IllegalArgumentException();
        }
        return new isSpanIndexCacheEnabled(Arrays.copyOf(this.valueOf, i), this.ag$a);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: valueOf */
    public Double get(int i) {
        return Double.valueOf(ag$a(i));
    }

    public double ag$a(int i) {
        HaptikSDK$b(i);
        return this.valueOf[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.ag$a;
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractList, java.util.List
    /* renamed from: values */
    public Double set(int i, Double d) {
        return Double.valueOf(ah$a(i, d.doubleValue()));
    }

    public double ah$a(int i, double d) {
        ag$a();
        HaptikSDK$b(i);
        double[] dArr = this.valueOf;
        double d2 = dArr[i];
        dArr[i] = d;
        return d2;
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: ag$a */
    public boolean add(Double d) {
        ag$a(d.doubleValue());
        return true;
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractList, java.util.List
    /* renamed from: toString */
    public void add(int i, Double d) {
        ag$a(i, d.doubleValue());
    }

    public void ag$a(double d) {
        ag$a();
        int i = this.ag$a;
        double[] dArr = this.valueOf;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.valueOf = dArr2;
        }
        double[] dArr3 = this.valueOf;
        int i2 = this.ag$a;
        this.ag$a = i2 + 1;
        dArr3[i2] = d;
    }

    private void ag$a(int i, double d) {
        int i2;
        ag$a();
        if (i < 0 || i > (i2 = this.ag$a)) {
            throw new IndexOutOfBoundsException(ah$b(i));
        }
        double[] dArr = this.valueOf;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.valueOf, i, dArr2, i + 1, this.ag$a - i);
            this.valueOf = dArr2;
        }
        this.valueOf[i] = d;
        this.ag$a++;
        this.modCount++;
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        ag$a();
        collection.getClass();
        if (!(collection instanceof isSpanIndexCacheEnabled)) {
            return super.addAll(collection);
        }
        isSpanIndexCacheEnabled isspanindexcacheenabled = (isSpanIndexCacheEnabled) collection;
        int i = isspanindexcacheenabled.ag$a;
        if (i == 0) {
            return false;
        }
        int i2 = this.ag$a;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.valueOf;
        if (i3 > dArr.length) {
            this.valueOf = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(isspanindexcacheenabled.valueOf, 0, this.valueOf, this.ag$a, isspanindexcacheenabled.ag$a);
        this.ag$a = i3;
        this.modCount++;
        return true;
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        ag$a();
        for (int i = 0; i < this.ag$a; i++) {
            if (obj.equals(Double.valueOf(this.valueOf[i]))) {
                double[] dArr = this.valueOf;
                System.arraycopy(dArr, i + 1, dArr, i, (this.ag$a - i) - 1);
                this.ag$a--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractList, java.util.List
    /* renamed from: ah$a */
    public Double remove(int i) {
        int i2;
        ag$a();
        HaptikSDK$b(i);
        double[] dArr = this.valueOf;
        double d = dArr[i];
        if (i < this.ag$a - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.ag$a--;
        this.modCount++;
        return Double.valueOf(d);
    }

    private void HaptikSDK$b(int i) {
        if (i < 0 || i >= this.ag$a) {
            throw new IndexOutOfBoundsException(ah$b(i));
        }
    }

    private String ah$b(int i) {
        return "Index:" + i + ", Size:" + this.ag$a;
    }
}
