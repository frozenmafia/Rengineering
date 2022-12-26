package androidx.collection;

import java.util.Iterator;
import o.Styleable;
import o.Transition;
import o.copySize;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes5.dex */
public final class SparseArrayKt {
    public static final <T> int getSize(SparseArrayCompat<T> sparseArrayCompat) {
        runAnimators.valueOf(sparseArrayCompat, "receiver$0");
        return sparseArrayCompat.size();
    }

    public static final <T> boolean contains(SparseArrayCompat<T> sparseArrayCompat, int i) {
        runAnimators.valueOf(sparseArrayCompat, "receiver$0");
        return sparseArrayCompat.containsKey(i);
    }

    public static final <T> void set(SparseArrayCompat<T> sparseArrayCompat, int i, T t) {
        runAnimators.valueOf(sparseArrayCompat, "receiver$0");
        sparseArrayCompat.put(i, t);
    }

    public static final <T> SparseArrayCompat<T> plus(SparseArrayCompat<T> sparseArrayCompat, SparseArrayCompat<T> sparseArrayCompat2) {
        runAnimators.valueOf(sparseArrayCompat, "receiver$0");
        runAnimators.valueOf(sparseArrayCompat2, "other");
        SparseArrayCompat<T> sparseArrayCompat3 = new SparseArrayCompat<>(sparseArrayCompat.size() + sparseArrayCompat2.size());
        sparseArrayCompat3.putAll(sparseArrayCompat);
        sparseArrayCompat3.putAll(sparseArrayCompat2);
        return sparseArrayCompat3;
    }

    public static final <T> T getOrDefault(SparseArrayCompat<T> sparseArrayCompat, int i, T t) {
        runAnimators.valueOf(sparseArrayCompat, "receiver$0");
        return sparseArrayCompat.get(i, t);
    }

    public static final <T> T getOrElse(SparseArrayCompat<T> sparseArrayCompat, int i, Styleable.ArcMotion<? extends T> arcMotion) {
        runAnimators.valueOf(sparseArrayCompat, "receiver$0");
        runAnimators.valueOf(arcMotion, "defaultValue");
        T t = sparseArrayCompat.get(i);
        return t != null ? t : arcMotion.invoke();
    }

    public static final <T> boolean isNotEmpty(SparseArrayCompat<T> sparseArrayCompat) {
        runAnimators.valueOf(sparseArrayCompat, "receiver$0");
        return !sparseArrayCompat.isEmpty();
    }

    public static final <T> boolean remove(SparseArrayCompat<T> sparseArrayCompat, int i, T t) {
        runAnimators.valueOf(sparseArrayCompat, "receiver$0");
        return sparseArrayCompat.remove(i, t);
    }

    public static final <T> void forEach(SparseArrayCompat<T> sparseArrayCompat, Transition<? super Integer, ? super T, setAnimationMatrix> transition) {
        runAnimators.valueOf(sparseArrayCompat, "receiver$0");
        runAnimators.valueOf(transition, "action");
        int size = sparseArrayCompat.size();
        for (int i = 0; i < size; i++) {
            transition.invoke(Integer.valueOf(sparseArrayCompat.keyAt(i)), sparseArrayCompat.valueAt(i));
        }
    }

    public static final <T> copySize keyIterator(final SparseArrayCompat<T> sparseArrayCompat) {
        runAnimators.valueOf(sparseArrayCompat, "receiver$0");
        return new copySize() { // from class: androidx.collection.SparseArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            public final void setIndex(int i) {
                this.index = i;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseArrayCompat.size();
            }

            @Override // o.copySize
            public int nextInt() {
                SparseArrayCompat sparseArrayCompat2 = sparseArrayCompat;
                int i = this.index;
                this.index = i + 1;
                return sparseArrayCompat2.keyAt(i);
            }
        };
    }

    public static final <T> Iterator<T> valueIterator(SparseArrayCompat<T> sparseArrayCompat) {
        runAnimators.valueOf(sparseArrayCompat, "receiver$0");
        return new SparseArrayKt$valueIterator$1(sparseArrayCompat);
    }
}
