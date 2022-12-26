package io.reactivex.internal.disposables;

import io.reactivex.exceptions.ProtocolViolationException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.setProgressBackgroundColor;
/* loaded from: classes5.dex */
public enum DisposableHelper implements FrameworkSQLiteDatabase.AnonymousClass2 {
    DISPOSED;

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public void dispose() {
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public boolean isDisposed() {
        return true;
    }

    public static boolean isDisposed(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        return anonymousClass2 == DISPOSED;
    }

    public static boolean set(AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> atomicReference, FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass22;
        do {
            anonymousClass22 = atomicReference.get();
            if (anonymousClass22 == DISPOSED) {
                if (anonymousClass2 != null) {
                    anonymousClass2.dispose();
                    return false;
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(anonymousClass22, anonymousClass2));
        if (anonymousClass22 != null) {
            anonymousClass22.dispose();
            return true;
        }
        return true;
    }

    public static boolean setOnce(AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> atomicReference, FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        Objects.requireNonNull(anonymousClass2, "d is null");
        if (atomicReference.compareAndSet(null, anonymousClass2)) {
            return true;
        }
        anonymousClass2.dispose();
        if (atomicReference.get() != DISPOSED) {
            reportDisposableSet();
            return false;
        }
        return false;
    }

    public static boolean replace(AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> atomicReference, FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass22;
        do {
            anonymousClass22 = atomicReference.get();
            if (anonymousClass22 == DISPOSED) {
                if (anonymousClass2 != null) {
                    anonymousClass2.dispose();
                    return false;
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(anonymousClass22, anonymousClass2));
        return true;
    }

    public static boolean dispose(AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> atomicReference) {
        FrameworkSQLiteDatabase.AnonymousClass2 andSet;
        FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2 = atomicReference.get();
        DisposableHelper disposableHelper = DISPOSED;
        if (anonymousClass2 == disposableHelper || (andSet = atomicReference.getAndSet(disposableHelper)) == disposableHelper) {
            return false;
        }
        if (andSet != null) {
            andSet.dispose();
            return true;
        }
        return true;
    }

    public static boolean validate(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2, FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass22) {
        if (anonymousClass22 == null) {
            setProgressBackgroundColor.values(new NullPointerException("next is null"));
            return false;
        } else if (anonymousClass2 != null) {
            anonymousClass22.dispose();
            reportDisposableSet();
            return false;
        } else {
            return true;
        }
    }

    public static void reportDisposableSet() {
        setProgressBackgroundColor.values(new ProtocolViolationException("Disposable already set!"));
    }

    public static boolean trySet(AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> atomicReference, FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        if (atomicReference.compareAndSet(null, anonymousClass2)) {
            return true;
        }
        if (atomicReference.get() == DISPOSED) {
            anonymousClass2.dispose();
            return false;
        }
        return false;
    }
}
