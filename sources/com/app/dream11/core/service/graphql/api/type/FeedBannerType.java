package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum FeedBannerType {
    WEEKLY_LEADERBOARD_BANNER("WEEKLY_LEADERBOARD_BANNER"),
    LEAGUE_BANNER("LEAGUE_BANNER"),
    DEPOSIT_BANNER("DEPOSIT_BANNER"),
    ONBOARDING_DEPOSIT_BANNER("ONBOARDING_DEPOSIT_BANNER"),
    ONBOARDING_BANNER("ONBOARDING_BANNER"),
    MONNEYBACK_BANNER("MONNEYBACK_BANNER"),
    MATCH_LISTING_BANNER("MATCH_LISTING_BANNER"),
    PRIZE_BREAKUP_BANNER("PRIZE_BREAKUP_BANNER"),
    LEADERBOARD_BANNER("LEADERBOARD_BANNER"),
    GLOBAL_LEADERBOARD_BANNER("GLOBAL_LEADERBOARD_BANNER"),
    CONTESTS_HOME_BANNER("CONTESTS_HOME_BANNER"),
    ONBOARDING_CONTESTS_HOME_BANNER("ONBOARDING_CONTESTS_HOME_BANNER"),
    REGISTRATION_BANNER("REGISTRATION_BANNER"),
    REFERRAL_REGISTRATION_BANNER("REFERRAL_REGISTRATION_BANNER"),
    FANCODE_SSO_BANNER("FANCODE_SSO_BANNER"),
    SIDE_NAV_BANNER("SIDE_NAV_BANNER"),
    CHAT_BANNER("CHAT_BANNER"),
    WINNER_TAB_BANNER("WINNER_TAB_BANNER"),
    ALL("ALL"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    FeedBannerType(String str) {
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

        public final FeedBannerType safeValueOf(String str) {
            FeedBannerType feedBannerType;
            runAnimators.ag$a(str, "rawValue");
            FeedBannerType[] values = FeedBannerType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    feedBannerType = null;
                    break;
                }
                feedBannerType = values[i];
                if (runAnimators.values((Object) feedBannerType.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return feedBannerType == null ? FeedBannerType.UNKNOWN__ : feedBannerType;
        }
    }
}
