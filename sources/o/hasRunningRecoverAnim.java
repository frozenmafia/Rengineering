package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class hasRunningRecoverAnim extends setUsingSpansToEstimateScrollbarDimensions<Long> implements checkSelectForSwipe$HaptikSDK$c, RandomAccess, getMaxDragScroll {
    private static final hasRunningRecoverAnim values;
    private int ag$a;
    private long[] toString;

    static {
        hasRunningRecoverAnim hasrunningrecoveranim = new hasRunningRecoverAnim(new long[0], 0);
        values = hasrunningrecoveranim;
        hasrunningrecoveranim.valueOf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public hasRunningRecoverAnim() {
        this(new long[10], 0);
    }

    private hasRunningRecoverAnim(long[] jArr, int i) {
        this.toString = jArr;
        this.ag$a = i;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i, int i2) {
        ag$a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.toString;
        System.arraycopy(jArr, i2, jArr, i, this.ag$a - i2);
        this.ag$a -= i2 - i;
        this.modCount++;
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hasRunningRecoverAnim)) {
            return super.equals(obj);
        }
        hasRunningRecoverAnim hasrunningrecoveranim = (hasRunningRecoverAnim) obj;
        if (this.ag$a != hasrunningrecoveranim.ag$a) {
            return false;
        }
        long[] jArr = hasrunningrecoveranim.toString;
        for (int i = 0; i < this.ag$a; i++) {
            if (this.toString[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.ag$a; i2++) {
            i = (i * 31) + checkSelectForSwipe.toString(this.toString[i2]);
        }
        return i;
    }

    @Override // o.checkSelectForSwipe$ah$b
    /* renamed from: ah$a */
    public checkSelectForSwipe$HaptikSDK$c toString(int i) {
        if (i < this.ag$a) {
            throw new IllegalArgumentException();
        }
        return new hasRunningRecoverAnim(Arrays.copyOf(this.toString, i), this.ag$a);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: values */
    public Long get(int i) {
        return Long.valueOf(valueOf(i));
    }

    public long valueOf(int i) {
        HaptikSDK$c(i);
        return this.toString[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.ag$a;
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractList, java.util.List
    /* renamed from: toString */
    public Long set(int i, Long l) {
        return Long.valueOf(toString(i, l.longValue()));
    }

    public long toString(int i, long j) {
        ag$a();
        HaptikSDK$c(i);
        long[] jArr = this.toString;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: ag$a */
    public boolean add(Long l) {
        ah$a(l.longValue());
        return true;
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractList, java.util.List
    /* renamed from: ah$a */
    public void add(int i, Long l) {
        ag$a(i, l.longValue());
    }

    public void ah$a(long j) {
        ag$a();
        int i = this.ag$a;
        long[] jArr = this.toString;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.toString = jArr2;
        }
        long[] jArr3 = this.toString;
        int i2 = this.ag$a;
        this.ag$a = i2 + 1;
        jArr3[i2] = j;
    }

    private void ag$a(int i, long j) {
        int i2;
        ag$a();
        if (i < 0 || i > (i2 = this.ag$a)) {
            throw new IndexOutOfBoundsException(HaptikSDK$b(i));
        }
        long[] jArr = this.toString;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.toString, i, jArr2, i + 1, this.ag$a - i);
            this.toString = jArr2;
        }
        this.toString[i] = j;
        this.ag$a++;
        this.modCount++;
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        ag$a();
        collection.getClass();
        if (!(collection instanceof hasRunningRecoverAnim)) {
            return super.addAll(collection);
        }
        hasRunningRecoverAnim hasrunningrecoveranim = (hasRunningRecoverAnim) collection;
        int i = hasrunningrecoveranim.ag$a;
        if (i == 0) {
            return false;
        }
        int i2 = this.ag$a;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.toString;
        if (i3 > jArr.length) {
            this.toString = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(hasrunningrecoveranim.toString, 0, this.toString, this.ag$a, hasrunningrecoveranim.ag$a);
        this.ag$a = i3;
        this.modCount++;
        return true;
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        ag$a();
        for (int i = 0; i < this.ag$a; i++) {
            if (obj.equals(Long.valueOf(this.toString[i]))) {
                long[] jArr = this.toString;
                System.arraycopy(jArr, i + 1, jArr, i, (this.ag$a - i) - 1);
                this.ag$a--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractList, java.util.List
    /* renamed from: ag$a */
    public Long remove(int i) {
        int i2;
        ag$a();
        HaptikSDK$c(i);
        long[] jArr = this.toString;
        long j = jArr[i];
        if (i < this.ag$a - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.ag$a--;
        this.modCount++;
        return Long.valueOf(j);
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
