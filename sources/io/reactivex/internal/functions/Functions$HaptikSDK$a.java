package io.reactivex.internal.functions;

import java.util.concurrent.Callable;
import o.FrameworkSQLiteOpenHelperFactory;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class Functions$HaptikSDK$a<T, U> implements Callable<U>, FrameworkSQLiteOpenHelperFactory<T, U> {
    final U toString;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Functions$HaptikSDK$a(U u) {
        this.toString = u;
    }

    @Override // java.util.concurrent.Callable
    public U call() throws Exception {
        return this.toString;
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public U apply(T t) throws Exception {
        return this.toString;
    }
}
