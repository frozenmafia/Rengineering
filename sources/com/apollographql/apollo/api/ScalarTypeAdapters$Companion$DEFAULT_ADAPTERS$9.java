package com.apollographql.apollo.api;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.reportFullyDrawn;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$9 extends Lambda implements Styleable.ChangeBounds<reportFullyDrawn<?>, Object> {
    public static final ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$9 INSTANCE = new ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$9();

    ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$9() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final Object invoke(reportFullyDrawn<?> reportfullydrawn) {
        runAnimators.valueOf(reportfullydrawn, "value");
        if (reportfullydrawn instanceof reportFullyDrawn.toString) {
            return (List) ((reportFullyDrawn.toString) reportfullydrawn).values;
        }
        throw new IllegalArgumentException("Can't decode: " + reportfullydrawn + " into List");
    }
}
