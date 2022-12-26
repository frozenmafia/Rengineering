package androidx.core.util;

import android.util.SparseBooleanArray;
import o.FragmentTransitionSupport;
import o.Styleable;
import o.Transition;
import o.copySize;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class SparseBooleanArrayKt {
    public static final int getSize(SparseBooleanArray sparseBooleanArray) {
        runAnimators.ag$a(sparseBooleanArray, "<this>");
        return sparseBooleanArray.size();
    }

    public static final boolean contains(SparseBooleanArray sparseBooleanArray, int i) {
        runAnimators.ag$a(sparseBooleanArray, "<this>");
        return sparseBooleanArray.indexOfKey(i) >= 0;
    }

    public static final void set(SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        runAnimators.ag$a(sparseBooleanArray, "<this>");
        sparseBooleanArray.put(i, z);
    }

    public static final SparseBooleanArray plus(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        runAnimators.ag$a(sparseBooleanArray, "<this>");
        runAnimators.ag$a(sparseBooleanArray2, "other");
        SparseBooleanArray sparseBooleanArray3 = new SparseBooleanArray(sparseBooleanArray.size() + sparseBooleanArray2.size());
        putAll(sparseBooleanArray3, sparseBooleanArray);
        putAll(sparseBooleanArray3, sparseBooleanArray2);
        return sparseBooleanArray3;
    }

    public static final boolean containsKey(SparseBooleanArray sparseBooleanArray, int i) {
        runAnimators.ag$a(sparseBooleanArray, "<this>");
        return sparseBooleanArray.indexOfKey(i) >= 0;
    }

    public static final boolean containsValue(SparseBooleanArray sparseBooleanArray, boolean z) {
        runAnimators.ag$a(sparseBooleanArray, "<this>");
        return sparseBooleanArray.indexOfValue(z) >= 0;
    }

    public static final boolean getOrDefault(SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        runAnimators.ag$a(sparseBooleanArray, "<this>");
        return sparseBooleanArray.get(i, z);
    }

    public static final boolean getOrElse(SparseBooleanArray sparseBooleanArray, int i, Styleable.ArcMotion<Boolean> arcMotion) {
        runAnimators.ag$a(sparseBooleanArray, "<this>");
        runAnimators.ag$a(arcMotion, "defaultValue");
        int indexOfKey = sparseBooleanArray.indexOfKey(i);
        return indexOfKey >= 0 ? sparseBooleanArray.valueAt(indexOfKey) : arcMotion.invoke().booleanValue();
    }

    public static final boolean isEmpty(SparseBooleanArray sparseBooleanArray) {
        runAnimators.ag$a(sparseBooleanArray, "<this>");
        return sparseBooleanArray.size() == 0;
    }

    public static final boolean isNotEmpty(SparseBooleanArray sparseBooleanArray) {
        runAnimators.ag$a(sparseBooleanArray, "<this>");
        return sparseBooleanArray.size() != 0;
    }

    public static final boolean remove(SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        runAnimators.ag$a(sparseBooleanArray, "<this>");
        int indexOfKey = sparseBooleanArray.indexOfKey(i);
        if (indexOfKey < 0 || z != sparseBooleanArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseBooleanArray.delete(i);
        return true;
    }

    public static final void forEach(SparseBooleanArray sparseBooleanArray, Transition<? super Integer, ? super Boolean, setAnimationMatrix> transition) {
        runAnimators.ag$a(sparseBooleanArray, "<this>");
        runAnimators.ag$a(transition, "action");
        int size = sparseBooleanArray.size();
        if (size <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            transition.invoke(Integer.valueOf(sparseBooleanArray.keyAt(i)), Boolean.valueOf(sparseBooleanArray.valueAt(i)));
            if (i2 >= size) {
                return;
            }
            i = i2;
        }
    }

    public static final copySize keyIterator(final SparseBooleanArray sparseBooleanArray) {
        runAnimators.ag$a(sparseBooleanArray, "<this>");
        return new copySize() { // from class: androidx.core.util.SparseBooleanArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            public final void setIndex(int i) {
                this.index = i;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseBooleanArray.size();
            }

            @Override // o.copySize
            public int nextInt() {
                SparseBooleanArray sparseBooleanArray2 = sparseBooleanArray;
                int i = this.index;
                this.index = i + 1;
                return sparseBooleanArray2.keyAt(i);
            }
        };
    }

    public static final FragmentTransitionSupport.AnonymousClass6 valueIterator(final SparseBooleanArray sparseBooleanArray) {
        runAnimators.ag$a(sparseBooleanArray, "<this>");
        return new FragmentTransitionSupport.AnonymousClass6() { // from class: androidx.core.util.SparseBooleanArrayKt$valueIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            public final void setIndex(int i) {
                this.index = i;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseBooleanArray.size();
            }

            @Override // o.FragmentTransitionSupport.AnonymousClass6
            public boolean nextBoolean() {
                SparseBooleanArray sparseBooleanArray2 = sparseBooleanArray;
                int i = this.index;
                this.index = i + 1;
                return sparseBooleanArray2.valueAt(i);
            }
        };
    }

    public static final void putAll(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        runAnimators.ag$a(sparseBooleanArray, "<this>");
        runAnimators.ag$a(sparseBooleanArray2, "other");
        int size = sparseBooleanArray2.size();
        if (size <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            sparseBooleanArray.put(sparseBooleanArray2.keyAt(i), sparseBooleanArray2.valueAt(i));
            if (i2 >= size) {
                return;
            }
            i = i2;
        }
    }
}
