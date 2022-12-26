package io.reactivex.internal.util;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import o.FrameworkSQLiteOpenHelperFactory;
/* loaded from: classes7.dex */
public enum ArrayListSupplier implements Callable<List<Object>>, FrameworkSQLiteOpenHelperFactory<Object, List<Object>> {
    INSTANCE;

    public static <T> Callable<List<T>> asCallable() {
        return INSTANCE;
    }

    public static <T, O> FrameworkSQLiteOpenHelperFactory<O, List<T>> asFunction() {
        return INSTANCE;
    }

    @Override // java.util.concurrent.Callable
    public List<Object> call() throws Exception {
        return new ArrayList();
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public List<Object> apply(Object obj) throws Exception {
        return new ArrayList();
    }
}
