package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum ContestCategory {
    PAID("PAID"),
    FREE("FREE"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    ContestCategory(String str) {
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

        public final ContestCategory safeValueOf(String str) {
            ContestCategory contestCategory;
            runAnimators.ag$a(str, "rawValue");
            ContestCategory[] values = ContestCategory.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    contestCategory = null;
                    break;
                }
                contestCategory = values[i];
                if (runAnimators.values((Object) contestCategory.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return contestCategory == null ? ContestCategory.UNKNOWN__ : contestCategory;
        }
    }
}
