package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum TimelineType {
    BALL("BALL"),
    MILESTONE("MILESTONE"),
    LINEUP("LINEUP"),
    OVERSUMMARY("OVERSUMMARY"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    TimelineType(String str) {
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

        public final TimelineType safeValueOf(String str) {
            TimelineType timelineType;
            runAnimators.ag$a(str, "rawValue");
            TimelineType[] values = TimelineType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    timelineType = null;
                    break;
                }
                timelineType = values[i];
                if (runAnimators.values((Object) timelineType.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return timelineType == null ? TimelineType.UNKNOWN__ : timelineType;
        }
    }
}
