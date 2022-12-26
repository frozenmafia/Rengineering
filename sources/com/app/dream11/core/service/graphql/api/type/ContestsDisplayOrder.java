package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum ContestsDisplayOrder {
    HORIZONTAL("HORIZONTAL"),
    VERTICAL("VERTICAL"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    ContestsDisplayOrder(String str) {
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

        public final ContestsDisplayOrder safeValueOf(String str) {
            ContestsDisplayOrder contestsDisplayOrder;
            runAnimators.ag$a(str, "rawValue");
            ContestsDisplayOrder[] values = ContestsDisplayOrder.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    contestsDisplayOrder = null;
                    break;
                }
                contestsDisplayOrder = values[i];
                if (runAnimators.values((Object) contestsDisplayOrder.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return contestsDisplayOrder == null ? ContestsDisplayOrder.UNKNOWN__ : contestsDisplayOrder;
        }
    }
}
