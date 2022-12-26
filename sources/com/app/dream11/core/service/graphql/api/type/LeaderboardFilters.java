package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum LeaderboardFilters {
    MY_NETWORK("MY_NETWORK"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    LeaderboardFilters(String str) {
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

        public final LeaderboardFilters safeValueOf(String str) {
            LeaderboardFilters leaderboardFilters;
            runAnimators.ag$a(str, "rawValue");
            LeaderboardFilters[] values = LeaderboardFilters.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    leaderboardFilters = null;
                    break;
                }
                leaderboardFilters = values[i];
                if (runAnimators.values((Object) leaderboardFilters.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return leaderboardFilters == null ? LeaderboardFilters.UNKNOWN__ : leaderboardFilters;
        }
    }
}
