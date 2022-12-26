package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes6.dex */
public enum TierType {
    BRONZE("BRONZE"),
    SILVER("SILVER"),
    GOLD("GOLD"),
    PLATINUM("PLATINUM"),
    DIAMOND("DIAMOND"),
    TROPHY("TROPHY"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    TierType(String str) {
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

        public final TierType safeValueOf(String str) {
            TierType tierType;
            runAnimators.ag$a(str, "rawValue");
            TierType[] values = TierType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    tierType = null;
                    break;
                }
                tierType = values[i];
                if (runAnimators.values((Object) tierType.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return tierType == null ? TierType.UNKNOWN__ : tierType;
        }
    }
}
