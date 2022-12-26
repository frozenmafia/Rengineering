package io.reactivex.rxjava3.parallel;

import o.addBoolean;
/* loaded from: classes7.dex */
public enum ParallelFailureHandling implements addBoolean<Long, Throwable, ParallelFailureHandling> {
    STOP,
    ERROR,
    SKIP,
    RETRY;

    @Override // o.addBoolean
    public ParallelFailureHandling apply(Long l, Throwable th) {
        return this;
    }
}
