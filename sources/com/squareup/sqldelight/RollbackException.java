package com.squareup.sqldelight;

import o.getTargetTypes;
/* loaded from: classes7.dex */
public final class RollbackException extends Throwable {
    private final Object value;

    public RollbackException() {
        this(null, 1, null);
    }

    public RollbackException(Object obj) {
        this.value = obj;
    }

    public /* synthetic */ RollbackException(Object obj, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : obj);
    }

    public final Object getValue() {
        return this.value;
    }
}
