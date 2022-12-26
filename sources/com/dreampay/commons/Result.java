package com.dreampay.commons;
/* loaded from: classes4.dex */
public final class Result<T> {
    private final T data;
    private final ErrorResult error;

    public Result(T t, ErrorResult errorResult) {
        this.data = t;
        this.error = errorResult;
    }

    public final T getData() {
        return this.data;
    }

    public final ErrorResult getError() {
        return this.error;
    }
}
