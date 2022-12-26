package com.fancode.payment.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class MatchStatus$ah$a {
    public /* synthetic */ MatchStatus$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    private MatchStatus$ah$a() {
    }

    public final MatchStatus values(String str) {
        MatchStatus matchStatus;
        runAnimators.ag$a(str, "rawValue");
        MatchStatus[] values = MatchStatus.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                matchStatus = null;
                break;
            }
            matchStatus = values[i];
            if (runAnimators.values((Object) matchStatus.getRawValue(), (Object) str)) {
                break;
            }
            i++;
        }
        return matchStatus == null ? MatchStatus.UNKNOWN__ : matchStatus;
    }
}
