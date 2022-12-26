package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes6.dex */
public enum LevelRuleType {
    ENTRYFEE("entryFee"),
    PAIDLEAGUECOUNT("paidLeagueCount"),
    TEAMCREATED("teamCreated"),
    FREELEAGUECOUNT("freeLeagueCount"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    LevelRuleType(String str) {
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

        public final LevelRuleType safeValueOf(String str) {
            LevelRuleType levelRuleType;
            runAnimators.ag$a(str, "rawValue");
            LevelRuleType[] values = LevelRuleType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    levelRuleType = null;
                    break;
                }
                levelRuleType = values[i];
                if (runAnimators.values((Object) levelRuleType.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return levelRuleType == null ? LevelRuleType.UNKNOWN__ : levelRuleType;
        }
    }
}
