package com.apollographql.apollo.api;

import java.util.Map;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.reportFullyDrawn;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$8 extends Lambda implements Styleable.ChangeBounds<reportFullyDrawn<?>, Object> {
    public static final ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$8 INSTANCE = new ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$8();

    ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$8() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final Object invoke(reportFullyDrawn<?> reportfullydrawn) {
        runAnimators.valueOf(reportfullydrawn, "value");
        if (reportfullydrawn instanceof reportFullyDrawn.valueOf) {
            return (Map) ((reportFullyDrawn.valueOf) reportfullydrawn).values;
        }
        throw new IllegalArgumentException("Can't decode: " + reportfullydrawn + " into Map");
    }
}
