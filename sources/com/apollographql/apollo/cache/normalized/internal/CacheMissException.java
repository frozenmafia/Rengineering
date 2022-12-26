package com.apollographql.apollo.cache.normalized.internal;

import o.ContextAwareKt;
import o.runAnimators;
/* loaded from: classes.dex */
public final class CacheMissException extends IllegalStateException {
    private final String fieldName;
    private final ContextAwareKt record;

    public final ContextAwareKt getRecord() {
        return this.record;
    }

    public final String getFieldName() {
        return this.fieldName;
    }

    public CacheMissException(ContextAwareKt contextAwareKt, String str) {
        runAnimators.valueOf(contextAwareKt, "record");
        runAnimators.valueOf(str, "fieldName");
        this.record = contextAwareKt;
        this.fieldName = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing value: " + this.fieldName + " for " + this.record;
    }
}
