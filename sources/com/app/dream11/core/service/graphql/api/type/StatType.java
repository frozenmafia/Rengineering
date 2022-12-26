package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum StatType {
    PRCNT("PRCNT"),
    IMAGE("IMAGE"),
    OTHER("OTHER"),
    NUMBER("NUMBER"),
    DATE("DATE"),
    DISPLAY_NAME("DISPLAY_NAME"),
    PROGRESS_BAR("PROGRESS_BAR"),
    SKILL_SCORE("SKILL_SCORE"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    StatType(String str) {
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

        public final StatType safeValueOf(String str) {
            StatType statType;
            runAnimators.ag$a(str, "rawValue");
            StatType[] values = StatType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    statType = null;
                    break;
                }
                statType = values[i];
                if (runAnimators.values((Object) statType.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return statType == null ? StatType.UNKNOWN__ : statType;
        }
    }
}
