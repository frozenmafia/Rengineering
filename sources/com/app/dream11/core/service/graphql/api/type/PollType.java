package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes6.dex */
public enum PollType {
    FACTUAL("FACTUAL"),
    OPINION("OPINION"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    PollType(String str) {
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

        public final PollType safeValueOf(String str) {
            PollType pollType;
            runAnimators.ag$a(str, "rawValue");
            PollType[] values = PollType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    pollType = null;
                    break;
                }
                pollType = values[i];
                if (runAnimators.values((Object) pollType.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return pollType == null ? PollType.UNKNOWN__ : pollType;
        }
    }
}
