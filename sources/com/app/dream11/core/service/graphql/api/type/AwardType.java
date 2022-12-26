package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes6.dex */
public enum AwardType {
    TROPHY("TROPHY"),
    MEDAL("MEDAL"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    AwardType(String str) {
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

        public final AwardType safeValueOf(String str) {
            AwardType awardType;
            runAnimators.ag$a(str, "rawValue");
            AwardType[] values = AwardType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    awardType = null;
                    break;
                }
                awardType = values[i];
                if (runAnimators.values((Object) awardType.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return awardType == null ? AwardType.UNKNOWN__ : awardType;
        }
    }
}
