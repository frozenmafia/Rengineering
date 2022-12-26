package io.reactivex.rxjava3.internal.disposables;

import java.util.concurrent.atomic.AtomicReferenceArray;
import o.dataStart;
/* loaded from: classes7.dex */
public final class ArrayCompositeDisposable extends AtomicReferenceArray<dataStart> implements dataStart {
    private static final long serialVersionUID = 2746389416410565408L;

    public ArrayCompositeDisposable(int i) {
        super(i);
    }

    public boolean setResource(int i, dataStart datastart) {
        dataStart datastart2;
        do {
            datastart2 = get(i);
            if (datastart2 == DisposableHelper.DISPOSED) {
                datastart.dispose();
                return false;
            }
        } while (!compareAndSet(i, datastart2, datastart));
        if (datastart2 != null) {
            datastart2.dispose();
            return true;
        }
        return true;
    }

    public dataStart replaceResource(int i, dataStart datastart) {
        dataStart datastart2;
        do {
            datastart2 = get(i);
            if (datastart2 == DisposableHelper.DISPOSED) {
                datastart.dispose();
                return null;
            }
        } while (!compareAndSet(i, datastart2, datastart));
        return datastart2;
    }

    @Override // o.dataStart
    public void dispose() {
        dataStart andSet;
        if (get(0) != DisposableHelper.DISPOSED) {
            int length = length();
            for (int i = 0; i < length; i++) {
                if (get(i) != DisposableHelper.DISPOSED && (andSet = getAndSet(i, DisposableHelper.DISPOSED)) != DisposableHelper.DISPOSED && andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }

    @Override // o.dataStart
    public boolean isDisposed() {
        return get(0) == DisposableHelper.DISPOSED;
    }
}
