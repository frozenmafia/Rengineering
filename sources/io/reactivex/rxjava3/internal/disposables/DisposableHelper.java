package io.reactivex.rxjava3.internal.disposables;

import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import o.dataStart;
import o.endMetadataList;
/* loaded from: classes5.dex */
public enum DisposableHelper implements dataStart {
    DISPOSED;

    @Override // o.dataStart
    public void dispose() {
    }

    @Override // o.dataStart
    public boolean isDisposed() {
        return true;
    }

    public static boolean isDisposed(dataStart datastart) {
        return datastart == DISPOSED;
    }

    public static boolean set(AtomicReference<dataStart> atomicReference, dataStart datastart) {
        dataStart datastart2;
        do {
            datastart2 = atomicReference.get();
            if (datastart2 == DISPOSED) {
                if (datastart != null) {
                    datastart.dispose();
                    return false;
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(datastart2, datastart));
        if (datastart2 != null) {
            datastart2.dispose();
            return true;
        }
        return true;
    }

    public static boolean setOnce(AtomicReference<dataStart> atomicReference, dataStart datastart) {
        Objects.requireNonNull(datastart, "d is null");
        if (atomicReference.compareAndSet(null, datastart)) {
            return true;
        }
        datastart.dispose();
        if (atomicReference.get() != DISPOSED) {
            reportDisposableSet();
            return false;
        }
        return false;
    }

    public static boolean replace(AtomicReference<dataStart> atomicReference, dataStart datastart) {
        dataStart datastart2;
        do {
            datastart2 = atomicReference.get();
            if (datastart2 == DISPOSED) {
                if (datastart != null) {
                    datastart.dispose();
                    return false;
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(datastart2, datastart));
        return true;
    }

    public static boolean dispose(AtomicReference<dataStart> atomicReference) {
        dataStart andSet;
        dataStart datastart = atomicReference.get();
        DisposableHelper disposableHelper = DISPOSED;
        if (datastart == disposableHelper || (andSet = atomicReference.getAndSet(disposableHelper)) == disposableHelper) {
            return false;
        }
        if (andSet != null) {
            andSet.dispose();
            return true;
        }
        return true;
    }

    public static boolean validate(dataStart datastart, dataStart datastart2) {
        if (datastart2 == null) {
            endMetadataList.valueOf(new NullPointerException("next is null"));
            return false;
        } else if (datastart != null) {
            datastart2.dispose();
            reportDisposableSet();
            return false;
        } else {
            return true;
        }
    }

    public static void reportDisposableSet() {
        endMetadataList.valueOf(new ProtocolViolationException("Disposable already set!"));
    }

    public static boolean trySet(AtomicReference<dataStart> atomicReference, dataStart datastart) {
        if (atomicReference.compareAndSet(null, datastart)) {
            return true;
        }
        if (atomicReference.get() == DISPOSED) {
            datastart.dispose();
            return false;
        }
        return false;
    }
}
