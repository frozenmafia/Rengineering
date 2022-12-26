package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes5.dex */
public final class addToDisappearedInLayout extends calculateCachedEnd<Integer> implements ViewInfoStore$HaptikSDK$c, RandomAccess, executeRefCountingFunction {
    private static final addToDisappearedInLayout values;
    private int ag$a;
    private int[] valueOf;

    static {
        addToDisappearedInLayout addtodisappearedinlayout = new addToDisappearedInLayout(new int[0], 0);
        values = addtodisappearedinlayout;
        addtodisappearedinlayout.valueOf();
    }

    public static addToDisappearedInLayout ah$a() {
        return values;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public addToDisappearedInLayout() {
        this(new int[10], 0);
    }

    private addToDisappearedInLayout(int[] iArr, int i) {
        this.valueOf = iArr;
        this.ag$a = i;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i, int i2) {
        values();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.valueOf;
        System.arraycopy(iArr, i2, iArr, i, this.ag$a - i2);
        this.ag$a -= i2 - i;
        this.modCount++;
    }

    @Override // o.calculateCachedEnd, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof addToDisappearedInLayout)) {
            return super.equals(obj);
        }
        addToDisappearedInLayout addtodisappearedinlayout = (addToDisappearedInLayout) obj;
        if (this.ag$a != addtodisappearedinlayout.ag$a) {
            return false;
        }
        int[] iArr = addtodisappearedinlayout.valueOf;
        for (int i = 0; i < this.ag$a; i++) {
            if (this.valueOf[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // o.calculateCachedEnd, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.ag$a; i2++) {
            i = (i * 31) + this.valueOf[i2];
        }
        return i;
    }

    @Override // o.ViewInfoStore$HaptikSDK$b
    /* renamed from: values */
    public ViewInfoStore$HaptikSDK$c valueOf(int i) {
        if (i < this.ag$a) {
            throw new IllegalArgumentException();
        }
        return new addToDisappearedInLayout(Arrays.copyOf(this.valueOf, i), this.ag$a);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: toString */
    public Integer get(int i) {
        return Integer.valueOf(ag$a(i));
    }

    @Override // o.ViewInfoStore$HaptikSDK$c
    public int ag$a(int i) {
        invoke(i);
        return this.valueOf[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int size = size();
            for (int i = 0; i < size; i++) {
                if (this.valueOf[i] == intValue) {
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
    /* renamed from: toString */
    public Integer set(int i, Integer num) {
        return Integer.valueOf(ah$a(i, num.intValue()));
    }

    public int ah$a(int i, int i2) {
        values();
        invoke(i);
        int[] iArr = this.valueOf;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    @Override // o.calculateCachedEnd, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: values */
    public boolean add(Integer num) {
        ah$a(num.intValue());
        return true;
    }

    @Override // o.calculateCachedEnd, java.util.AbstractList, java.util.List
    /* renamed from: ah$a */
    public void add(int i, Integer num) {
        toString(i, num.intValue());
    }

    @Override // o.ViewInfoStore$HaptikSDK$c
    public void ah$a(int i) {
        values();
        int i2 = this.ag$a;
        int[] iArr = this.valueOf;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.valueOf = iArr2;
        }
        int[] iArr3 = this.valueOf;
        int i3 = this.ag$a;
        this.ag$a = i3 + 1;
        iArr3[i3] = i;
    }

    private void toString(int i, int i2) {
        int i3;
        values();
        if (i < 0 || i > (i3 = this.ag$a)) {
            throw new IndexOutOfBoundsException(HaptikSDK$a(i));
        }
        int[] iArr = this.valueOf;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.valueOf, i, iArr2, i + 1, this.ag$a - i);
            this.valueOf = iArr2;
        }
        this.valueOf[i] = i2;
        this.ag$a++;
        this.modCount++;
    }

    @Override // o.calculateCachedEnd, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        values();
        ViewInfoStore.valueOf(collection);
        if (!(collection instanceof addToDisappearedInLayout)) {
            return super.addAll(collection);
        }
        addToDisappearedInLayout addtodisappearedinlayout = (addToDisappearedInLayout) collection;
        int i = addtodisappearedinlayout.ag$a;
        if (i == 0) {
            return false;
        }
        int i2 = this.ag$a;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.valueOf;
        if (i3 > iArr.length) {
            this.valueOf = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(addtodisappearedinlayout.valueOf, 0, this.valueOf, this.ag$a, addtodisappearedinlayout.ag$a);
        this.ag$a = i3;
        this.modCount++;
        return true;
    }

    @Override // o.calculateCachedEnd, java.util.AbstractList, java.util.List
    /* renamed from: HaptikSDK$c */
    public Integer remove(int i) {
        int i2;
        values();
        invoke(i);
        int[] iArr = this.valueOf;
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
            throw new IndexOutOfBoundsException(HaptikSDK$a(i));
        }
    }

    private String HaptikSDK$a(int i) {
        return "Index:" + i + ", Size:" + this.ag$a;
    }
}
