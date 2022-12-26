package com.facebook.internal.instrument;

import com.facebook.internal.instrument.InstrumentData;
import o.Visibility;
import o.getTargetTypes;
/* loaded from: classes4.dex */
public final class InstrumentData$ah$a {
    public /* synthetic */ InstrumentData$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    private InstrumentData$ah$a() {
    }

    public static final /* synthetic */ InstrumentData.Type ah$a(InstrumentData$ah$a instrumentData$ah$a, String str) {
        return instrumentData$ah$a.ah$a(str);
    }

    public final InstrumentData.Type ah$a(String str) {
        if (Visibility.Mode.ah$a(str, "crash_log_", false, 2, (Object) null)) {
            return InstrumentData.Type.CrashReport;
        }
        if (Visibility.Mode.ah$a(str, "shield_log_", false, 2, (Object) null)) {
            return InstrumentData.Type.CrashShield;
        }
        if (Visibility.Mode.ah$a(str, "thread_check_log_", false, 2, (Object) null)) {
            return InstrumentData.Type.ThreadCheck;
        }
        if (Visibility.Mode.ah$a(str, "analysis_log_", false, 2, (Object) null)) {
            return InstrumentData.Type.Analysis;
        }
        if (Visibility.Mode.ah$a(str, "anr_log_", false, 2, (Object) null)) {
            return InstrumentData.Type.AnrReport;
        }
        return InstrumentData.Type.Unknown;
    }
}
