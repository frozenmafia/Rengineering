package com.apollographql.apollo.api;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.reportFullyDrawn;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$2 extends Lambda implements Styleable.ChangeBounds<reportFullyDrawn<?>, Object> {
    public static final ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$2 INSTANCE = new ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$2();

    ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$2() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final Object invoke(reportFullyDrawn<?> reportfullydrawn) {
        boolean parseBoolean;
        runAnimators.valueOf(reportfullydrawn, "value");
        if (reportfullydrawn instanceof reportFullyDrawn.values) {
            parseBoolean = ((Boolean) ((reportFullyDrawn.values) reportfullydrawn).values).booleanValue();
        } else if (!(reportfullydrawn instanceof reportFullyDrawn.invoke)) {
            throw new IllegalArgumentException("Can't decode: " + reportfullydrawn + " into Boolean");
        } else {
            parseBoolean = Boolean.parseBoolean((String) ((reportFullyDrawn.invoke) reportfullydrawn).values);
        }
        return Boolean.valueOf(parseBoolean);
    }
}
