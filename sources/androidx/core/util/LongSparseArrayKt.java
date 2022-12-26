package androidx.core.util;

import android.util.LongSparseArray;
import java.util.Iterator;
import o.Styleable;
import o.Transition;
import o.calculateMatrix;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class LongSparseArrayKt {
    public static final <T> int getSize(LongSparseArray<T> longSparseArray) {
        runAnimators.ag$a(longSparseArray, "<this>");
        return longSparseArray.size();
    }

    public static final <T> boolean contains(LongSparseArray<T> longSparseArray, long j) {
        runAnimators.ag$a(longSparseArray, "<this>");
        return longSparseArray.indexOfKey(j) >= 0;
    }

    public static final <T> void set(LongSparseArray<T> longSparseArray, long j, T t) {
        runAnimators.ag$a(longSparseArray, "<this>");
        longSparseArray.put(j, t);
    }

    public static final <T> LongSparseArray<T> plus(LongSparseArray<T> longSparseArray, LongSparseArray<T> longSparseArray2) {
        runAnimators.ag$a(longSparseArray, "<this>");
        runAnimators.ag$a(longSparseArray2, "other");
        LongSparseArray<T> longSparseArray3 = new LongSparseArray<>(longSparseArray.size() + longSparseArray2.size());
        putAll(longSparseArray3, longSparseArray);
        putAll(longSparseArray3, longSparseArray2);
        return longSparseArray3;
    }

    public static final <T> boolean containsKey(LongSparseArray<T> longSparseArray, long j) {
        runAnimators.ag$a(longSparseArray, "<this>");
        return longSparseArray.indexOfKey(j) >= 0;
    }

    public static final <T> boolean containsValue(LongSparseArray<T> longSparseArray, T t) {
        runAnimators.ag$a(longSparseArray, "<this>");
        return longSparseArray.indexOfValue(t) >= 0;
    }

    public static final <T> T getOrDefault(LongSparseArray<T> longSparseArray, long j, T t) {
        runAnimators.ag$a(longSparseArray, "<this>");
        T t2 = longSparseArray.get(j);
        return t2 == null ? t : t2;
    }

    public static final <T> T getOrElse(LongSparseArray<T> longSparseArray, long j, Styleable.ArcMotion<? extends T> arcMotion) {
        runAnimators.ag$a(longSparseArray, "<this>");
        runAnimators.ag$a(arcMotion, "defaultValue");
        T t = longSparseArray.get(j);
        return t == null ? arcMotion.invoke() : t;
    }

    public static final <T> boolean isEmpty(LongSparseArray<T> longSparseArray) {
        runAnimators.ag$a(longSparseArray, "<this>");
        return longSparseArray.size() == 0;
    }

    public static final <T> boolean isNotEmpty(LongSparseArray<T> longSparseArray) {
        runAnimators.ag$a(longSparseArray, "<this>");
        return longSparseArray.size() != 0;
    }

    public static final <T> boolean remove(LongSparseArray<T> longSparseArray, long j, T t) {
        runAnimators.ag$a(longSparseArray, "<this>");
        int indexOfKey = longSparseArray.indexOfKey(j);
        if (indexOfKey < 0 || !runAnimators.values(t, longSparseArray.valueAt(indexOfKey))) {
            return false;
        }
        longSparseArray.removeAt(indexOfKey);
        return true;
    }

    public static final <T> void forEach(LongSparseArray<T> longSparseArray, Transition<? super Long, ? super T, setAnimationMatrix> transition) {
        runAnimators.ag$a(longSparseArray, "<this>");
        runAnimators.ag$a(transition, "action");
        int size = longSparseArray.size();
        if (size <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            transition.invoke(Long.valueOf(longSparseArray.keyAt(i)), longSparseArray.valueAt(i));
            if (i2 >= size) {
                return;
            }
            i = i2;
        }
    }

    public static final <T> calculateMatrix keyIterator(final LongSparseArray<T> longSparseArray) {
        runAnimators.ag$a(longSparseArray, "<this>");
        return new calculateMatrix() { // from class: androidx.core.util.LongSparseArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            public final void setIndex(int i) {
                this.index = i;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < longSparseArray.size();
            }

            @Override // o.calculateMatrix
            public long nextLong() {
                LongSparseArray<T> longSparseArray2 = longSparseArray;
                int i = this.index;
                this.index = i + 1;
                return longSparseArray2.keyAt(i);
            }
        };
    }

    public static final <T> Iterator<T> valueIterator(LongSparseArray<T> longSparseArray) {
        runAnimators.ag$a(longSparseArray, "<this>");
        return new LongSparseArrayKt$valueIterator$1(longSparseArray);
    }

    public static final <T> void putAll(LongSparseArray<T> longSparseArray, LongSparseArray<T> longSparseArray2) {
        runAnimators.ag$a(longSparseArray, "<this>");
        runAnimators.ag$a(longSparseArray2, "other");
        int size = longSparseArray2.size();
        if (size <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            longSparseArray.put(longSparseArray2.keyAt(i), longSparseArray2.valueAt(i));
            if (i2 >= size) {
                return;
            }
            i = i2;
        }
    }
}
