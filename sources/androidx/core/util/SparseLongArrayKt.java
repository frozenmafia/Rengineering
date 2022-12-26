package androidx.core.util;

import android.util.SparseLongArray;
import o.Styleable;
import o.Transition;
import o.calculateMatrix;
import o.copySize;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class SparseLongArrayKt {
    public static final int getSize(SparseLongArray sparseLongArray) {
        runAnimators.ag$a(sparseLongArray, "<this>");
        return sparseLongArray.size();
    }

    public static final boolean contains(SparseLongArray sparseLongArray, int i) {
        runAnimators.ag$a(sparseLongArray, "<this>");
        return sparseLongArray.indexOfKey(i) >= 0;
    }

    public static final void set(SparseLongArray sparseLongArray, int i, long j) {
        runAnimators.ag$a(sparseLongArray, "<this>");
        sparseLongArray.put(i, j);
    }

    public static final SparseLongArray plus(SparseLongArray sparseLongArray, SparseLongArray sparseLongArray2) {
        runAnimators.ag$a(sparseLongArray, "<this>");
        runAnimators.ag$a(sparseLongArray2, "other");
        SparseLongArray sparseLongArray3 = new SparseLongArray(sparseLongArray.size() + sparseLongArray2.size());
        putAll(sparseLongArray3, sparseLongArray);
        putAll(sparseLongArray3, sparseLongArray2);
        return sparseLongArray3;
    }

    public static final boolean containsKey(SparseLongArray sparseLongArray, int i) {
        runAnimators.ag$a(sparseLongArray, "<this>");
        return sparseLongArray.indexOfKey(i) >= 0;
    }

    public static final boolean containsValue(SparseLongArray sparseLongArray, long j) {
        runAnimators.ag$a(sparseLongArray, "<this>");
        return sparseLongArray.indexOfValue(j) >= 0;
    }

    public static final long getOrDefault(SparseLongArray sparseLongArray, int i, long j) {
        runAnimators.ag$a(sparseLongArray, "<this>");
        return sparseLongArray.get(i, j);
    }

    public static final long getOrElse(SparseLongArray sparseLongArray, int i, Styleable.ArcMotion<Long> arcMotion) {
        runAnimators.ag$a(sparseLongArray, "<this>");
        runAnimators.ag$a(arcMotion, "defaultValue");
        int indexOfKey = sparseLongArray.indexOfKey(i);
        return indexOfKey >= 0 ? sparseLongArray.valueAt(indexOfKey) : arcMotion.invoke().longValue();
    }

    public static final boolean isEmpty(SparseLongArray sparseLongArray) {
        runAnimators.ag$a(sparseLongArray, "<this>");
        return sparseLongArray.size() == 0;
    }

    public static final boolean isNotEmpty(SparseLongArray sparseLongArray) {
        runAnimators.ag$a(sparseLongArray, "<this>");
        return sparseLongArray.size() != 0;
    }

    public static final boolean remove(SparseLongArray sparseLongArray, int i, long j) {
        runAnimators.ag$a(sparseLongArray, "<this>");
        int indexOfKey = sparseLongArray.indexOfKey(i);
        if (indexOfKey < 0 || j != sparseLongArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseLongArray.removeAt(indexOfKey);
        return true;
    }

    public static final void forEach(SparseLongArray sparseLongArray, Transition<? super Integer, ? super Long, setAnimationMatrix> transition) {
        runAnimators.ag$a(sparseLongArray, "<this>");
        runAnimators.ag$a(transition, "action");
        int size = sparseLongArray.size();
        if (size <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            transition.invoke(Integer.valueOf(sparseLongArray.keyAt(i)), Long.valueOf(sparseLongArray.valueAt(i)));
            if (i2 >= size) {
                return;
            }
            i = i2;
        }
    }

    public static final copySize keyIterator(final SparseLongArray sparseLongArray) {
        runAnimators.ag$a(sparseLongArray, "<this>");
        return new copySize() { // from class: androidx.core.util.SparseLongArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            public final void setIndex(int i) {
                this.index = i;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseLongArray.size();
            }

            @Override // o.copySize
            public int nextInt() {
                SparseLongArray sparseLongArray2 = sparseLongArray;
                int i = this.index;
                this.index = i + 1;
                return sparseLongArray2.keyAt(i);
            }
        };
    }

    public static final calculateMatrix valueIterator(final SparseLongArray sparseLongArray) {
        runAnimators.ag$a(sparseLongArray, "<this>");
        return new calculateMatrix() { // from class: androidx.core.util.SparseLongArrayKt$valueIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            public final void setIndex(int i) {
                this.index = i;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseLongArray.size();
            }

            @Override // o.calculateMatrix
            public long nextLong() {
                SparseLongArray sparseLongArray2 = sparseLongArray;
                int i = this.index;
                this.index = i + 1;
                return sparseLongArray2.valueAt(i);
            }
        };
    }

    public static final void putAll(SparseLongArray sparseLongArray, SparseLongArray sparseLongArray2) {
        runAnimators.ag$a(sparseLongArray, "<this>");
        runAnimators.ag$a(sparseLongArray2, "other");
        int size = sparseLongArray2.size();
        if (size <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            sparseLongArray.put(sparseLongArray2.keyAt(i), sparseLongArray2.valueAt(i));
            if (i2 >= size) {
                return;
            }
            i = i2;
        }
    }
}
