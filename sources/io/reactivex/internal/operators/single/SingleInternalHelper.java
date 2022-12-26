package io.reactivex.internal.operators.single;

import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import o.FrameworkSQLiteOpenHelperFactory;
import o.SupportSQLiteQuery;
import o.getSidecar;
import o.having;
/* loaded from: classes7.dex */
public final class SingleInternalHelper {

    /* loaded from: classes7.dex */
    enum NoSuchElementCallable implements Callable<NoSuchElementException> {
        INSTANCE;

        @Override // java.util.concurrent.Callable
        public NoSuchElementException call() throws Exception {
            return new NoSuchElementException();
        }
    }

    /* loaded from: classes7.dex */
    enum ToFlowable implements FrameworkSQLiteOpenHelperFactory<having, getSidecar> {
        INSTANCE;

        @Override // o.FrameworkSQLiteOpenHelperFactory
        public getSidecar apply(having havingVar) {
            return new SingleToFlowable(havingVar);
        }
    }

    /* loaded from: classes7.dex */
    enum ToObservable implements FrameworkSQLiteOpenHelperFactory<having, SupportSQLiteQuery> {
        INSTANCE;

        @Override // o.FrameworkSQLiteOpenHelperFactory
        public SupportSQLiteQuery apply(having havingVar) {
            return new SingleToObservable(havingVar);
        }
    }
}
