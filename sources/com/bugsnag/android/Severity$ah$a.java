package com.bugsnag.android;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class Severity$ah$a {
    private Severity$ah$a() {
    }

    public /* synthetic */ Severity$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    public final Severity valueOf(String str) {
        Severity[] values;
        runAnimators.valueOf(str, "desc");
        for (Severity severity : Severity.values()) {
            if (runAnimators.values((Object) Severity.access$getStr$p(severity), (Object) str)) {
                return severity;
            }
        }
        return null;
    }
}
