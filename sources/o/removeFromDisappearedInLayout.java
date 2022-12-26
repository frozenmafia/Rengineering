package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes5.dex */
public final class removeFromDisappearedInLayout extends calculateCachedEnd<Long> implements ViewInfoStore$HaptikSDK$a, RandomAccess, executeRefCountingFunction {
    private static final removeFromDisappearedInLayout valueOf;
    private long[] toString;
    private int values;

    static {
        removeFromDisappearedInLayout removefromdisappearedinlayout = new removeFromDisappearedInLayout(new long[0], 0);
        valueOf = removefromdisappearedinlayout;
        removefromdisappearedinlayout.valueOf();
    }

    public static removeFromDisappearedInLayout ah$a() {
        return valueOf;
    }

    public removeFromDisappearedInLayout() {
        this(new long[10], 0);
    }

    private removeFromDisappearedInLayout(long[] jArr, int i) {
        this.toString = jArr;
        this.values = i;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i, int i2) {
        values();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.toString;
        System.arraycopy(jArr, i2, jArr, i, this.values - i2);
        this.values -= i2 - i;
        this.modCount++;
    }

    @Override // o.calculateCachedEnd, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof removeFromDisappearedInLayout)) {
            return super.equals(obj);
        }
        removeFromDisappearedInLayout removefromdisappearedinlayout = (removeFromDisappearedInLayout) obj;
        if (this.values != removefromdisappearedinlayout.values) {
            return false;
        }
        long[] jArr = removefromdisappearedinlayout.toString;
        for (int i = 0; i < this.values; i++) {
            if (this.toString[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // o.calculateCachedEnd, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.values; i2++) {
            i = (i * 31) + ViewInfoStore.ah$a(this.toString[i2]);
        }
        return i;
    }

    @Override // o.ViewInfoStore$HaptikSDK$b
    /* renamed from: values */
    public ViewInfoStore$HaptikSDK$a valueOf(int i) {
        if (i < this.values) {
            throw new IllegalArgumentException();
        }
        return new removeFromDisappearedInLayout(Arrays.copyOf(this.toString, i), this.values);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: ag$a */
    public Long get(int i) {
        return Long.valueOf(ah$a(i));
    }

    public long ah$a(int i) {
        HaptikSDK$c(i);
        return this.toString[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            int size = size();
            for (int i = 0; i < size; i++) {
                if (this.toString[i] == longValue) {
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
        return this.values;
    }

    @Override // o.calculateCachedEnd, java.util.AbstractList, java.util.List
    /* renamed from: toString */
    public Long set(int i, Long l) {
        return Long.valueOf(values(i, l.longValue()));
    }

    public long values(int i, long j) {
        values();
        HaptikSDK$c(i);
        long[] jArr = this.toString;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    @Override // o.calculateCachedEnd, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: valueOf */
    public boolean add(Long l) {
        ag$a(l.longValue());
        return true;
    }

    @Override // o.calculateCachedEnd, java.util.AbstractList, java.util.List
    /* renamed from: ag$a */
    public void add(int i, Long l) {
        valueOf(i, l.longValue());
    }

    public void ag$a(long j) {
        values();
        int i = this.values;
        long[] jArr = this.toString;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.toString = jArr2;
        }
        long[] jArr3 = this.toString;
        int i2 = this.values;
        this.values = i2 + 1;
        jArr3[i2] = j;
    }

    private void valueOf(int i, long j) {
        int i2;
        values();
        if (i < 0 || i > (i2 = this.values)) {
            throw new IndexOutOfBoundsException(invoke(i));
        }
        long[] jArr = this.toString;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.toString, i, jArr2, i + 1, this.values - i);
            this.toString = jArr2;
        }
        this.toString[i] = j;
        this.values++;
        this.modCount++;
    }

    @Override // o.calculateCachedEnd, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        values();
        ViewInfoStore.valueOf(collection);
        if (!(collection instanceof removeFromDisappearedInLayout)) {
            return super.addAll(collection);
        }
        removeFromDisappearedInLayout removefromdisappearedinlayout = (removeFromDisappearedInLayout) collection;
        int i = removefromdisappearedinlayout.values;
        if (i == 0) {
            return false;
        }
        int i2 = this.values;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.toString;
        if (i3 > jArr.length) {
            this.toString = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(removefromdisappearedinlayout.toString, 0, this.toString, this.values, removefromdisappearedinlayout.values);
        this.values = i3;
        this.modCount++;
        return true;
    }

    @Override // o.calculateCachedEnd, java.util.AbstractList, java.util.List
    /* renamed from: toString */
    public Long remove(int i) {
        int i2;
        values();
        HaptikSDK$c(i);
        long[] jArr = this.toString;
        long j = jArr[i];
        if (i < this.values - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.values--;
        this.modCount++;
        return Long.valueOf(j);
    }

    private void HaptikSDK$c(int i) {
        if (i < 0 || i >= this.values) {
            throw new IndexOutOfBoundsException(invoke(i));
        }
    }

    private String invoke(int i) {
        return "Index:" + i + ", Size:" + this.values;
    }
}
