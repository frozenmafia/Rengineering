package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes6.dex */
public enum FeedType {
    TEAM_SHARE("TEAM_SHARE"),
    CONTEST_SHARE("CONTEST_SHARE"),
    GENERAL_SHARE("GENERAL_SHARE"),
    FREE_TEXT("FREE_TEXT"),
    POLLS("POLLS"),
    VIDEO_SHARE("VIDEO_SHARE"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    FeedType(String str) {
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

        public final FeedType safeValueOf(String str) {
            FeedType feedType;
            runAnimators.ag$a(str, "rawValue");
            FeedType[] values = FeedType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    feedType = null;
                    break;
                }
                feedType = values[i];
                if (runAnimators.values((Object) feedType.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return feedType == null ? FeedType.UNKNOWN__ : feedType;
        }
    }
}
