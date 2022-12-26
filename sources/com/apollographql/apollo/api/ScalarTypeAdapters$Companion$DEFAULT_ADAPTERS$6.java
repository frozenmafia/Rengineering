package com.apollographql.apollo.api;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.reportFullyDrawn;
import o.reportFullyDrawn$HaptikSDK$c;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$6 extends Lambda implements Styleable.ChangeBounds<reportFullyDrawn<?>, Object> {
    public static final ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$6 INSTANCE = new ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$6();

    ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$6() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final Object invoke(reportFullyDrawn<?> reportfullydrawn) {
        double parseDouble;
        runAnimators.valueOf(reportfullydrawn, "value");
        if (reportfullydrawn instanceof reportFullyDrawn$HaptikSDK$c) {
            parseDouble = ((Number) ((reportFullyDrawn$HaptikSDK$c) reportfullydrawn).values).doubleValue();
        } else if (!(reportfullydrawn instanceof reportFullyDrawn.invoke)) {
            throw new IllegalArgumentException("Can't decode: " + reportfullydrawn + " into Double");
        } else {
            parseDouble = Double.parseDouble((String) ((reportFullyDrawn.invoke) reportfullydrawn).values);
        }
        return Double.valueOf(parseDouble);
    }
}
