package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes6.dex */
public enum LeaderboardType {
    WEEKLY_LEADERBOARD("WEEKLY_LEADERBOARD"),
    TOUR_LEADERBOARD("TOUR_LEADERBOARD"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    LeaderboardType(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }

        public final LeaderboardType safeValueOf(String str) {
            LeaderboardType leaderboardType;
            runAnimators.ag$a(str, "rawValue");
            LeaderboardType[] values = LeaderboardType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    leaderboardType = null;
                    break;
                }
                leaderboardType = values[i];
                if (runAnimators.values((Object) leaderboardType.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return leaderboardType == null ? LeaderboardType.UNKNOWN__ : leaderboardType;
        }
    }
}
