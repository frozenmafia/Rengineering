package androidx.core.util;

import android.util.SparseIntArray;
import o.Styleable;
import o.Transition;
import o.copySize;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class SparseIntArrayKt {
    public static final int getSize(SparseIntArray sparseIntArray) {
        runAnimators.ag$a(sparseIntArray, "<this>");
        return sparseIntArray.size();
    }

    public static final boolean contains(SparseIntArray sparseIntArray, int i) {
        runAnimators.ag$a(sparseIntArray, "<this>");
        return sparseIntArray.indexOfKey(i) >= 0;
    }

    public static final void set(SparseIntArray sparseIntArray, int i, int i2) {
        runAnimators.ag$a(sparseIntArray, "<this>");
        sparseIntArray.put(i, i2);
    }

    public static final SparseIntArray plus(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2) {
        runAnimators.ag$a(sparseIntArray, "<this>");
        runAnimators.ag$a(sparseIntArray2, "other");
        SparseIntArray sparseIntArray3 = new SparseIntArray(sparseIntArray.size() + sparseIntArray2.size());
        putAll(sparseIntArray3, sparseIntArray);
        putAll(sparseIntArray3, sparseIntArray2);
        return sparseIntArray3;
    }

    public static final boolean containsKey(SparseIntArray sparseIntArray, int i) {
        runAnimators.ag$a(sparseIntArray, "<this>");
        return sparseIntArray.indexOfKey(i) >= 0;
    }

    public static final boolean containsValue(SparseIntArray sparseIntArray, int i) {
        runAnimators.ag$a(sparseIntArray, "<this>");
        return sparseIntArray.indexOfValue(i) >= 0;
    }

    public static final int getOrDefault(SparseIntArray sparseIntArray, int i, int i2) {
        runAnimators.ag$a(sparseIntArray, "<this>");
        return sparseIntArray.get(i, i2);
    }

    public static final int getOrElse(SparseIntArray sparseIntArray, int i, Styleable.ArcMotion<Integer> arcMotion) {
        runAnimators.ag$a(sparseIntArray, "<this>");
        runAnimators.ag$a(arcMotion, "defaultValue");
        int indexOfKey = sparseIntArray.indexOfKey(i);
        return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : arcMotion.invoke().intValue();
    }

    public static final boolean isEmpty(SparseIntArray sparseIntArray) {
        runAnimators.ag$a(sparseIntArray, "<this>");
        return sparseIntArray.size() == 0;
    }

    public static final boolean isNotEmpty(SparseIntArray sparseIntArray) {
        runAnimators.ag$a(sparseIntArray, "<this>");
        return sparseIntArray.size() != 0;
    }

    public static final boolean remove(SparseIntArray sparseIntArray, int i, int i2) {
        runAnimators.ag$a(sparseIntArray, "<this>");
        int indexOfKey = sparseIntArray.indexOfKey(i);
        if (indexOfKey < 0 || i2 != sparseIntArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseIntArray.removeAt(indexOfKey);
        return true;
    }

    public static final void forEach(SparseIntArray sparseIntArray, Transition<? super Integer, ? super Integer, setAnimationMatrix> transition) {
        runAnimators.ag$a(sparseIntArray, "<this>");
        runAnimators.ag$a(transition, "action");
        int size = sparseIntArray.size();
        if (size <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            transition.invoke(Integer.valueOf(sparseIntArray.keyAt(i)), Integer.valueOf(sparseIntArray.valueAt(i)));
            if (i2 >= size) {
                return;
            }
            i = i2;
        }
    }

    public static final copySize keyIterator(final SparseIntArray sparseIntArray) {
        runAnimators.ag$a(sparseIntArray, "<this>");
        return new copySize() { // from class: androidx.core.util.SparseIntArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            public final void setIndex(int i) {
                this.index = i;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseIntArray.size();
            }

            @Override // o.copySize
            public int nextInt() {
                SparseIntArray sparseIntArray2 = sparseIntArray;
                int i = this.index;
                this.index = i + 1;
                return sparseIntArray2.keyAt(i);
            }
        };
    }

    public static final copySize valueIterator(final SparseIntArray sparseIntArray) {
        runAnimators.ag$a(sparseIntArray, "<this>");
        return new copySize() { // from class: androidx.core.util.SparseIntArrayKt$valueIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            public final void setIndex(int i) {
                this.index = i;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseIntArray.size();
            }

            @Override // o.copySize
            public int nextInt() {
                SparseIntArray sparseIntArray2 = sparseIntArray;
                int i = this.index;
                this.index = i + 1;
                return sparseIntArray2.valueAt(i);
            }
        };
    }

    public static final void putAll(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2) {
        runAnimators.ag$a(sparseIntArray, "<this>");
        runAnimators.ag$a(sparseIntArray2, "other");
        int size = sparseIntArray2.size();
        if (size <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            sparseIntArray.put(sparseIntArray2.keyAt(i), sparseIntArray2.valueAt(i));
            if (i2 >= size) {
                return;
            }
            i = i2;
        }
    }
}
