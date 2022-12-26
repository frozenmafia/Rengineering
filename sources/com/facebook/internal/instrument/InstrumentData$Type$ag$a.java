package com.facebook.internal.instrument;

import com.facebook.internal.instrument.InstrumentData;
/* loaded from: classes4.dex */
public final /* synthetic */ class InstrumentData$Type$ag$a {
    public static final /* synthetic */ int[] values;

    static {
        int[] iArr = new int[InstrumentData.Type.valuesCustom().length];
        iArr[InstrumentData.Type.Analysis.ordinal()] = 1;
        iArr[InstrumentData.Type.AnrReport.ordinal()] = 2;
        iArr[InstrumentData.Type.CrashReport.ordinal()] = 3;
        iArr[InstrumentData.Type.CrashShield.ordinal()] = 4;
        iArr[InstrumentData.Type.ThreadCheck.ordinal()] = 5;
        values = iArr;
    }
}
