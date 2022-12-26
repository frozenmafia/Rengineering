package com.apollographql.apollo.api;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.reportFullyDrawn;
import o.reportFullyDrawn$HaptikSDK$c;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$3 extends Lambda implements Styleable.ChangeBounds<reportFullyDrawn<?>, Object> {
    public static final ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$3 INSTANCE = new ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$3();

    ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$3() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final Object invoke(reportFullyDrawn<?> reportfullydrawn) {
        int parseInt;
        runAnimators.valueOf(reportfullydrawn, "value");
        if (reportfullydrawn instanceof reportFullyDrawn$HaptikSDK$c) {
            parseInt = ((Number) ((reportFullyDrawn$HaptikSDK$c) reportfullydrawn).values).intValue();
        } else if (!(reportfullydrawn instanceof reportFullyDrawn.invoke)) {
            throw new IllegalArgumentException("Can't decode: " + reportfullydrawn + " into Integer");
        } else {
            parseInt = Integer.parseInt((String) ((reportFullyDrawn.invoke) reportfullydrawn).values);
        }
        return Integer.valueOf(parseInt);
    }
}
