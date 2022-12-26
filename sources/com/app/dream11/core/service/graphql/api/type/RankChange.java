package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum RankChange {
    INC("INC"),
    DEC("DEC"),
    NONE("NONE"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    RankChange(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }

        public final RankChange safeValueOf(String str) {
            RankChange rankChange;
            runAnimators.ag$a(str, "rawValue");
            RankChange[] values = RankChange.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    rankChange = null;
                    break;
                }
                rankChange = values[i];
                if (runAnimators.values((Object) rankChange.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return rankChange == null ? RankChange.UNKNOWN__ : rankChange;
        }
    }
}
