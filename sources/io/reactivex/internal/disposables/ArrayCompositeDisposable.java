package io.reactivex.internal.disposables;

import java.util.concurrent.atomic.AtomicReferenceArray;
import o.FrameworkSQLiteDatabase;
/* loaded from: classes7.dex */
public final class ArrayCompositeDisposable extends AtomicReferenceArray<FrameworkSQLiteDatabase.AnonymousClass2> implements FrameworkSQLiteDatabase.AnonymousClass2 {
    private static final long serialVersionUID = 2746389416410565408L;

    public ArrayCompositeDisposable(int i) {
        super(i);
    }

    public boolean setResource(int i, FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass22;
        do {
            anonymousClass22 = get(i);
            if (anonymousClass22 == DisposableHelper.DISPOSED) {
                anonymousClass2.dispose();
                return false;
            }
        } while (!compareAndSet(i, anonymousClass22, anonymousClass2));
        if (anonymousClass22 != null) {
            anonymousClass22.dispose();
            return true;
        }
        return true;
    }

    public FrameworkSQLiteDatabase.AnonymousClass2 replaceResource(int i, FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass22;
        do {
            anonymousClass22 = get(i);
            if (anonymousClass22 == DisposableHelper.DISPOSED) {
                anonymousClass2.dispose();
                return null;
            }
        } while (!compareAndSet(i, anonymousClass22, anonymousClass2));
        return anonymousClass22;
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public void dispose() {
        FrameworkSQLiteDatabase.AnonymousClass2 andSet;
        if (get(0) != DisposableHelper.DISPOSED) {
            int length = length();
            for (int i = 0; i < length; i++) {
                if (get(i) != DisposableHelper.DISPOSED && (andSet = getAndSet(i, DisposableHelper.DISPOSED)) != DisposableHelper.DISPOSED && andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public boolean isDisposed() {
        return get(0) == DisposableHelper.DISPOSED;
    }
}
