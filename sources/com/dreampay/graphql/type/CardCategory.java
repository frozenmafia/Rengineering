package com.dreampay.graphql.type;

import com.dreampay.commons.constants.Constants;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes4.dex */
public enum CardCategory {
    CREDIT(Constants.CREDIT),
    DEBIT(Constants.DEBIT),
    OTHERS("OTHERS"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    CardCategory(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }

        public final CardCategory safeValueOf(String str) {
            CardCategory cardCategory;
            runAnimators.ag$a(str, "rawValue");
            CardCategory[] values = CardCategory.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    cardCategory = null;
                    break;
                }
                cardCategory = values[i];
                if (runAnimators.values((Object) cardCategory.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return cardCategory == null ? CardCategory.UNKNOWN__ : cardCategory;
        }
    }
}
