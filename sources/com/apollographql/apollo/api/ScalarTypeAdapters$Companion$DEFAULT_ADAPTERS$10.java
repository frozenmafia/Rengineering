package com.apollographql.apollo.api;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.reportFullyDrawn;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$10 extends Lambda implements Styleable.ChangeBounds<reportFullyDrawn<?>, Object> {
    public static final ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$10 INSTANCE = new ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$10();

    ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$10() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final Object invoke(reportFullyDrawn<?> reportfullydrawn) {
        runAnimators.valueOf(reportfullydrawn, "value");
        T t = reportfullydrawn.values;
        if (t == 0) {
            runAnimators.values();
        }
        return t;
    }
}
