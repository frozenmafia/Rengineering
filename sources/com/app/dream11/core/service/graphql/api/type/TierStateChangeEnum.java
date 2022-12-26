package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum TierStateChangeEnum {
    UPGRADED("upgraded"),
    DOWNGRADED("downgraded"),
    MAINTAINED("maintained"),
    NOCHANGE("noChange"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    TierStateChangeEnum(String str) {
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

        public final TierStateChangeEnum safeValueOf(String str) {
            TierStateChangeEnum tierStateChangeEnum;
            runAnimators.ag$a(str, "rawValue");
            TierStateChangeEnum[] values = TierStateChangeEnum.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    tierStateChangeEnum = null;
                    break;
                }
                tierStateChangeEnum = values[i];
                if (runAnimators.values((Object) tierStateChangeEnum.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return tierStateChangeEnum == null ? TierStateChangeEnum.UNKNOWN__ : tierStateChangeEnum;
        }
    }
}
