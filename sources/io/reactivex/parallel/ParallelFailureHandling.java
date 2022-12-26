package io.reactivex.parallel;

import o.FrameworkSQLiteOpenHelper;
/* loaded from: classes7.dex */
public enum ParallelFailureHandling implements FrameworkSQLiteOpenHelper<Long, Throwable, ParallelFailureHandling> {
    STOP,
    ERROR,
    SKIP,
    RETRY;

    @Override // o.FrameworkSQLiteOpenHelper
    public ParallelFailureHandling apply(Long l, Throwable th) {
        return this;
    }
}
