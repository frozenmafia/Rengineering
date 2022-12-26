package io.reactivex.internal.operators.maybe;

import o.FrameworkSQLiteOpenHelperFactory;
import o.SupportSQLiteOpenHelper;
import o.getSidecar;
/* loaded from: classes7.dex */
public enum MaybeToPublisher implements FrameworkSQLiteOpenHelperFactory<SupportSQLiteOpenHelper.Configuration.Builder<Object>, getSidecar<Object>> {
    INSTANCE;

    public static <T> FrameworkSQLiteOpenHelperFactory<SupportSQLiteOpenHelper.Configuration.Builder<T>, getSidecar<T>> instance() {
        return INSTANCE;
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public getSidecar<Object> apply(SupportSQLiteOpenHelper.Configuration.Builder<Object> builder) throws Exception {
        return new MaybeToFlowable(builder);
    }
}
