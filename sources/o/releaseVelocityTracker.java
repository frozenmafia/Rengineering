package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class releaseVelocityTracker extends setUsingSpansToEstimateScrollbarDimensions<Float> implements checkSelectForSwipe$HaptikSDK$b, RandomAccess, getMaxDragScroll {
    private static final releaseVelocityTracker ah$a;
    private float[] ag$a;
    private int toString;

    static {
        releaseVelocityTracker releasevelocitytracker = new releaseVelocityTracker(new float[0], 0);
        ah$a = releasevelocitytracker;
        releasevelocitytracker.valueOf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public releaseVelocityTracker() {
        this(new float[10], 0);
    }

    private releaseVelocityTracker(float[] fArr, int i) {
        this.ag$a = fArr;
        this.toString = i;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i, int i2) {
        ag$a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.ag$a;
        System.arraycopy(fArr, i2, fArr, i, this.toString - i2);
        this.toString -= i2 - i;
        this.modCount++;
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof releaseVelocityTracker)) {
            return super.equals(obj);
        }
        releaseVelocityTracker releasevelocitytracker = (releaseVelocityTracker) obj;
        if (this.toString != releasevelocitytracker.toString) {
            return false;
        }
        float[] fArr = releasevelocitytracker.ag$a;
        for (int i = 0; i < this.toString; i++) {
            if (Float.floatToIntBits(this.ag$a[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.toString; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.ag$a[i2]);
        }
        return i;
    }

    @Override // o.checkSelectForSwipe$ah$b
    /* renamed from: ag$a */
    public checkSelectForSwipe$HaptikSDK$b toString(int i) {
        if (i < this.toString) {
            throw new IllegalArgumentException();
        }
        return new releaseVelocityTracker(Arrays.copyOf(this.ag$a, i), this.toString);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: valueOf */
    public Float get(int i) {
        return Float.valueOf(values(i));
    }

    public float values(int i) {
        HaptikSDK$c(i);
        return this.ag$a[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.toString;
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractList, java.util.List
    /* renamed from: toString */
    public Float set(int i, Float f) {
        return Float.valueOf(ag$a(i, f.floatValue()));
    }

    public float ag$a(int i, float f) {
        ag$a();
        HaptikSDK$c(i);
        float[] fArr = this.ag$a;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: toString */
    public boolean add(Float f) {
        ah$a(f.floatValue());
        return true;
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractList, java.util.List
    /* renamed from: valueOf */
    public void add(int i, Float f) {
        toString(i, f.floatValue());
    }

    public void ah$a(float f) {
        ag$a();
        int i = this.toString;
        float[] fArr = this.ag$a;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.ag$a = fArr2;
        }
        float[] fArr3 = this.ag$a;
        int i2 = this.toString;
        this.toString = i2 + 1;
        fArr3[i2] = f;
    }

    private void toString(int i, float f) {
        int i2;
        ag$a();
        if (i < 0 || i > (i2 = this.toString)) {
            throw new IndexOutOfBoundsException(invoke(i));
        }
        float[] fArr = this.ag$a;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.ag$a, i, fArr2, i + 1, this.toString - i);
            this.ag$a = fArr2;
        }
        this.ag$a[i] = f;
        this.toString++;
        this.modCount++;
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        ag$a();
        collection.getClass();
        if (!(collection instanceof releaseVelocityTracker)) {
            return super.addAll(collection);
        }
        releaseVelocityTracker releasevelocitytracker = (releaseVelocityTracker) collection;
        int i = releasevelocitytracker.toString;
        if (i == 0) {
            return false;
        }
        int i2 = this.toString;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.ag$a;
        if (i3 > fArr.length) {
            this.ag$a = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(releasevelocitytracker.ag$a, 0, this.ag$a, this.toString, releasevelocitytracker.toString);
        this.toString = i3;
        this.modCount++;
        return true;
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        ag$a();
        for (int i = 0; i < this.toString; i++) {
            if (obj.equals(Float.valueOf(this.ag$a[i]))) {
                float[] fArr = this.ag$a;
                System.arraycopy(fArr, i + 1, fArr, i, (this.toString - i) - 1);
                this.toString--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractList, java.util.List
    /* renamed from: ah$a */
    public Float remove(int i) {
        int i2;
        ag$a();
        HaptikSDK$c(i);
        float[] fArr = this.ag$a;
        float f = fArr[i];
        if (i < this.toString - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.toString--;
        this.modCount++;
        return Float.valueOf(f);
    }

    private void HaptikSDK$c(int i) {
        if (i < 0 || i >= this.toString) {
            throw new IndexOutOfBoundsException(invoke(i));
        }
    }

    private String invoke(int i) {
        return "Index:" + i + ", Size:" + this.toString;
    }
}
