package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum RoundLineupStatus {
    LINEUP_ANNOUNCED("LINEUP_ANNOUNCED"),
    LINEUP_EXPECTED("LINEUP_EXPECTED"),
    LINEUP_UNAVAILABLE("LINEUP_UNAVAILABLE"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    RoundLineupStatus(String str) {
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

        public final RoundLineupStatus safeValueOf(String str) {
            RoundLineupStatus roundLineupStatus;
            runAnimators.ag$a(str, "rawValue");
            RoundLineupStatus[] values = RoundLineupStatus.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    roundLineupStatus = null;
                    break;
                }
                roundLineupStatus = values[i];
                if (runAnimators.values((Object) roundLineupStatus.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return roundLineupStatus == null ? RoundLineupStatus.UNKNOWN__ : roundLineupStatus;
        }
    }
}
