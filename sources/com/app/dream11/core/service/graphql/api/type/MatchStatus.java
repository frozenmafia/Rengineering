package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes.dex */
public enum MatchStatus {
    ABANDONED("ABANDONED"),
    COMPLETED("COMPLETED"),
    IN_PROGRESS("IN_PROGRESS"),
    NOT_STARTED("NOT_STARTED"),
    WAITING_FOR_REVIEW("WAITING_FOR_REVIEW"),
    UP_COMING("UP_COMING"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    MatchStatus(String str) {
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

        public final MatchStatus safeValueOf(String str) {
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
}
