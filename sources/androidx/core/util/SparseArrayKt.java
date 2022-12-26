package androidx.core.util;

import android.util.SparseArray;
import java.util.Iterator;
import o.Styleable;
import o.Transition;
import o.copySize;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class SparseArrayKt {
    public static final <T> int getSize(SparseArray<T> sparseArray) {
        runAnimators.ag$a(sparseArray, "<this>");
        return sparseArray.size();
    }

    public static final <T> boolean contains(SparseArray<T> sparseArray, int i) {
        runAnimators.ag$a(sparseArray, "<this>");
        return sparseArray.indexOfKey(i) >= 0;
    }

    public static final <T> void set(SparseArray<T> sparseArray, int i, T t) {
        runAnimators.ag$a(sparseArray, "<this>");
        sparseArray.put(i, t);
    }

    public static final <T> SparseArray<T> plus(SparseArray<T> sparseArray, SparseArray<T> sparseArray2) {
        runAnimators.ag$a(sparseArray, "<this>");
        runAnimators.ag$a(sparseArray2, "other");
        SparseArray<T> sparseArray3 = new SparseArray<>(sparseArray.size() + sparseArray2.size());
        putAll(sparseArray3, sparseArray);
        putAll(sparseArray3, sparseArray2);
        return sparseArray3;
    }

    public static final <T> boolean containsKey(SparseArray<T> sparseArray, int i) {
        runAnimators.ag$a(sparseArray, "<this>");
        return sparseArray.indexOfKey(i) >= 0;
    }

    public static final <T> boolean containsValue(SparseArray<T> sparseArray, T t) {
        runAnimators.ag$a(sparseArray, "<this>");
        return sparseArray.indexOfValue(t) >= 0;
    }

    public static final <T> T getOrDefault(SparseArray<T> sparseArray, int i, T t) {
        runAnimators.ag$a(sparseArray, "<this>");
        T t2 = sparseArray.get(i);
        return t2 == null ? t : t2;
    }

    public static final <T> T getOrElse(SparseArray<T> sparseArray, int i, Styleable.ArcMotion<? extends T> arcMotion) {
        runAnimators.ag$a(sparseArray, "<this>");
        runAnimators.ag$a(arcMotion, "defaultValue");
        T t = sparseArray.get(i);
        return t == null ? arcMotion.invoke() : t;
    }

    public static final <T> boolean isEmpty(SparseArray<T> sparseArray) {
        runAnimators.ag$a(sparseArray, "<this>");
        return sparseArray.size() == 0;
    }

    public static final <T> boolean isNotEmpty(SparseArray<T> sparseArray) {
        runAnimators.ag$a(sparseArray, "<this>");
        return sparseArray.size() != 0;
    }

    public static final <T> boolean remove(SparseArray<T> sparseArray, int i, T t) {
        runAnimators.ag$a(sparseArray, "<this>");
        int indexOfKey = sparseArray.indexOfKey(i);
        if (indexOfKey < 0 || !runAnimators.values(t, sparseArray.valueAt(indexOfKey))) {
            return false;
        }
        sparseArray.removeAt(indexOfKey);
        return true;
    }

    public static final <T> void forEach(SparseArray<T> sparseArray, Transition<? super Integer, ? super T, setAnimationMatrix> transition) {
        runAnimators.ag$a(sparseArray, "<this>");
        runAnimators.ag$a(transition, "action");
        int size = sparseArray.size();
        if (size <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            transition.invoke(Integer.valueOf(sparseArray.keyAt(i)), sparseArray.valueAt(i));
            if (i2 >= size) {
                return;
            }
            i = i2;
        }
    }

    public static final <T> copySize keyIterator(final SparseArray<T> sparseArray) {
        runAnimators.ag$a(sparseArray, "<this>");
        return new copySize() { // from class: androidx.core.util.SparseArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            public final void setIndex(int i) {
                this.index = i;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseArray.size();
            }

            @Override // o.copySize
            public int nextInt() {
                SparseArray<T> sparseArray2 = sparseArray;
                int i = this.index;
                this.index = i + 1;
                return sparseArray2.keyAt(i);
            }
        };
    }

    public static final <T> Iterator<T> valueIterator(SparseArray<T> sparseArray) {
        runAnimators.ag$a(sparseArray, "<this>");
        return new SparseArrayKt$valueIterator$1(sparseArray);
    }

    public static final <T> void putAll(SparseArray<T> sparseArray, SparseArray<T> sparseArray2) {
        runAnimators.ag$a(sparseArray, "<this>");
        runAnimators.ag$a(sparseArray2, "other");
        int size = sparseArray2.size();
        if (size <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            sparseArray.put(sparseArray2.keyAt(i), sparseArray2.valueAt(i));
            if (i2 >= size) {
                return;
            }
            i = i2;
        }
    }
}
