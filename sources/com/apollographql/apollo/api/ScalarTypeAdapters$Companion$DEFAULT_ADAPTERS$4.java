package com.apollographql.apollo.api;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.reportFullyDrawn;
import o.reportFullyDrawn$HaptikSDK$c;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$4 extends Lambda implements Styleable.ChangeBounds<reportFullyDrawn<?>, Object> {
    public static final ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$4 INSTANCE = new ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$4();

    ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$4() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final Object invoke(reportFullyDrawn<?> reportfullydrawn) {
        long parseLong;
        runAnimators.valueOf(reportfullydrawn, "value");
        if (reportfullydrawn instanceof reportFullyDrawn$HaptikSDK$c) {
            parseLong = ((Number) ((reportFullyDrawn$HaptikSDK$c) reportfullydrawn).values).longValue();
        } else if (!(reportfullydrawn instanceof reportFullyDrawn.invoke)) {
            throw new IllegalArgumentException("Can't decode: " + reportfullydrawn + " into Long");
        } else {
            parseLong = Long.parseLong((String) ((reportFullyDrawn.invoke) reportfullydrawn).values);
        }
        return Long.valueOf(parseLong);
    }
}
