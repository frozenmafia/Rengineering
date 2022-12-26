package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class swipeIfNecessary extends setUsingSpansToEstimateScrollbarDimensions<Integer> implements checkSelectForSwipe$HaptikSDK$a, RandomAccess, getMaxDragScroll {
    private static final swipeIfNecessary valueOf;
    private int ag$a;
    private int[] ah$a;

    static {
        swipeIfNecessary swipeifnecessary = new swipeIfNecessary(new int[0], 0);
        valueOf = swipeifnecessary;
        swipeifnecessary.valueOf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public swipeIfNecessary() {
        this(new int[10], 0);
    }

    private swipeIfNecessary(int[] iArr, int i) {
        this.ah$a = iArr;
        this.ag$a = i;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i, int i2) {
        ag$a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.ah$a;
        System.arraycopy(iArr, i2, iArr, i, this.ag$a - i2);
        this.ag$a -= i2 - i;
        this.modCount++;
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof swipeIfNecessary)) {
            return super.equals(obj);
        }
        swipeIfNecessary swipeifnecessary = (swipeIfNecessary) obj;
        if (this.ag$a != swipeifnecessary.ag$a) {
            return false;
        }
        int[] iArr = swipeifnecessary.ah$a;
        for (int i = 0; i < this.ag$a; i++) {
            if (this.ah$a[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.ag$a; i2++) {
            i = (i * 31) + this.ah$a[i2];
        }
        return i;
    }

    @Override // o.checkSelectForSwipe$ah$b
    /* renamed from: ag$a */
    public checkSelectForSwipe$HaptikSDK$a toString(int i) {
        if (i < this.ag$a) {
            throw new IllegalArgumentException();
        }
        return new swipeIfNecessary(Arrays.copyOf(this.ah$a, i), this.ag$a);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: ah$a */
    public Integer get(int i) {
        return Integer.valueOf(valueOf(i));
    }

    public int valueOf(int i) {
        invoke(i);
        return this.ah$a[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.ag$a;
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractList, java.util.List
    /* renamed from: ah$a */
    public Integer set(int i, Integer num) {
        return Integer.valueOf(valueOf(i, num.intValue()));
    }

    public int valueOf(int i, int i2) {
        ag$a();
        invoke(i);
        int[] iArr = this.ah$a;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: ah$a */
    public boolean add(Integer num) {
        values(num.intValue());
        return true;
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractList, java.util.List
    /* renamed from: valueOf */
    public void add(int i, Integer num) {
        ag$a(i, num.intValue());
    }

    public void values(int i) {
        ag$a();
        int i2 = this.ag$a;
        int[] iArr = this.ah$a;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.ah$a = iArr2;
        }
        int[] iArr3 = this.ah$a;
        int i3 = this.ag$a;
        this.ag$a = i3 + 1;
        iArr3[i3] = i;
    }

    private void ag$a(int i, int i2) {
        int i3;
        ag$a();
        if (i < 0 || i > (i3 = this.ag$a)) {
            throw new IndexOutOfBoundsException(ah$b(i));
        }
        int[] iArr = this.ah$a;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.ah$a, i, iArr2, i + 1, this.ag$a - i);
            this.ah$a = iArr2;
        }
        this.ah$a[i] = i2;
        this.ag$a++;
        this.modCount++;
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        ag$a();
        collection.getClass();
        if (!(collection instanceof swipeIfNecessary)) {
            return super.addAll(collection);
        }
        swipeIfNecessary swipeifnecessary = (swipeIfNecessary) collection;
        int i = swipeifnecessary.ag$a;
        if (i == 0) {
            return false;
        }
        int i2 = this.ag$a;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.ah$a;
        if (i3 > iArr.length) {
            this.ah$a = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(swipeifnecessary.ah$a, 0, this.ah$a, this.ag$a, swipeifnecessary.ag$a);
        this.ag$a = i3;
        this.modCount++;
        return true;
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        ag$a();
        for (int i = 0; i < this.ag$a; i++) {
            if (obj.equals(Integer.valueOf(this.ah$a[i]))) {
                int[] iArr = this.ah$a;
                System.arraycopy(iArr, i + 1, iArr, i, (this.ag$a - i) - 1);
                this.ag$a--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractList, java.util.List
    /* renamed from: HaptikSDK$b */
    public Integer remove(int i) {
        int i2;
        ag$a();
        invoke(i);
        int[] iArr = this.ah$a;
        int i3 = iArr[i];
        if (i < this.ag$a - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.ag$a--;
        this.modCount++;
        return Integer.valueOf(i3);
    }

    private void invoke(int i) {
        if (i < 0 || i >= this.ag$a) {
            throw new IndexOutOfBoundsException(ah$b(i));
        }
    }

    private String ah$b(int i) {
        return "Index:" + i + ", Size:" + this.ag$a;
    }
}
