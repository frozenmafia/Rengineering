package o;

import java.util.concurrent.atomic.AtomicReferenceArray;
/* loaded from: classes5.dex */
public final class addTouchables<T> {
    private volatile AtomicReferenceArray<T> array;

    public addTouchables(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    public final int valueOf() {
        return this.array.length();
    }

    public final T ag$a(int i) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    public final void values(int i, T t) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, t);
            return;
        }
        AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(addTransitionInternal.ah$a(i + 1, length * 2));
        for (int i2 = 0; i2 < length; i2++) {
            atomicReferenceArray2.set(i2, atomicReferenceArray.get(i2));
        }
        atomicReferenceArray2.set(i, t);
        this.array = atomicReferenceArray2;
    }
}
