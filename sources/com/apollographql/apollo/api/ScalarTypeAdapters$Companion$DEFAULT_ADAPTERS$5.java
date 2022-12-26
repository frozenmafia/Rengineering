package com.apollographql.apollo.api;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.reportFullyDrawn;
import o.reportFullyDrawn$HaptikSDK$c;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$5 extends Lambda implements Styleable.ChangeBounds<reportFullyDrawn<?>, Object> {
    public static final ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$5 INSTANCE = new ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$5();

    ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$5() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final Object invoke(reportFullyDrawn<?> reportfullydrawn) {
        float parseFloat;
        runAnimators.valueOf(reportfullydrawn, "value");
        if (reportfullydrawn instanceof reportFullyDrawn$HaptikSDK$c) {
            parseFloat = ((Number) ((reportFullyDrawn$HaptikSDK$c) reportfullydrawn).values).floatValue();
        } else if (!(reportfullydrawn instanceof reportFullyDrawn.invoke)) {
            throw new IllegalArgumentException("Can't decode: " + reportfullydrawn + " into Float");
        } else {
            parseFloat = Float.parseFloat((String) ((reportFullyDrawn.invoke) reportfullydrawn).values);
        }
        return Float.valueOf(parseFloat);
    }
}
