package androidx.collection;

import java.util.Iterator;
import o.Styleable;
import o.Transition;
import o.calculateMatrix;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes5.dex */
public final class LongSparseArrayKt {
    public static final <T> int getSize(LongSparseArray<T> longSparseArray) {
        runAnimators.valueOf(longSparseArray, "receiver$0");
        return longSparseArray.size();
    }

    public static final <T> boolean contains(LongSparseArray<T> longSparseArray, long j) {
        runAnimators.valueOf(longSparseArray, "receiver$0");
        return longSparseArray.containsKey(j);
    }

    public static final <T> void set(LongSparseArray<T> longSparseArray, long j, T t) {
        runAnimators.valueOf(longSparseArray, "receiver$0");
        longSparseArray.put(j, t);
    }

    public static final <T> LongSparseArray<T> plus(LongSparseArray<T> longSparseArray, LongSparseArray<T> longSparseArray2) {
        runAnimators.valueOf(longSparseArray, "receiver$0");
        runAnimators.valueOf(longSparseArray2, "other");
        LongSparseArray<T> longSparseArray3 = new LongSparseArray<>(longSparseArray.size() + longSparseArray2.size());
        longSparseArray3.putAll(longSparseArray);
        longSparseArray3.putAll(longSparseArray2);
        return longSparseArray3;
    }

    public static final <T> T getOrDefault(LongSparseArray<T> longSparseArray, long j, T t) {
        runAnimators.valueOf(longSparseArray, "receiver$0");
        return longSparseArray.get(j, t);
    }

    public static final <T> T getOrElse(LongSparseArray<T> longSparseArray, long j, Styleable.ArcMotion<? extends T> arcMotion) {
        runAnimators.valueOf(longSparseArray, "receiver$0");
        runAnimators.valueOf(arcMotion, "defaultValue");
        T t = longSparseArray.get(j);
        return t != null ? t : arcMotion.invoke();
    }

    public static final <T> boolean isNotEmpty(LongSparseArray<T> longSparseArray) {
        runAnimators.valueOf(longSparseArray, "receiver$0");
        return !longSparseArray.isEmpty();
    }

    public static final <T> boolean remove(LongSparseArray<T> longSparseArray, long j, T t) {
        runAnimators.valueOf(longSparseArray, "receiver$0");
        return longSparseArray.remove(j, t);
    }

    public static final <T> void forEach(LongSparseArray<T> longSparseArray, Transition<? super Long, ? super T, setAnimationMatrix> transition) {
        runAnimators.valueOf(longSparseArray, "receiver$0");
        runAnimators.valueOf(transition, "action");
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            transition.invoke(Long.valueOf(longSparseArray.keyAt(i)), longSparseArray.valueAt(i));
        }
    }

    public static final <T> calculateMatrix keyIterator(final LongSparseArray<T> longSparseArray) {
        runAnimators.valueOf(longSparseArray, "receiver$0");
        return new calculateMatrix() { // from class: androidx.collection.LongSparseArrayKt$keyIterator$1
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
                LongSparseArray longSparseArray2 = longSparseArray;
                int i = this.index;
                this.index = i + 1;
                return longSparseArray2.keyAt(i);
            }
        };
    }

    public static final <T> Iterator<T> valueIterator(LongSparseArray<T> longSparseArray) {
        runAnimators.valueOf(longSparseArray, "receiver$0");
        return new LongSparseArrayKt$valueIterator$1(longSparseArray);
    }
}
