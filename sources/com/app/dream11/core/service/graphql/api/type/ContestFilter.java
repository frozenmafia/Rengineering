package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum ContestFilter {
    ENTRY_FEE("ENTRY_FEE"),
    CONTEST_SIZE("CONTEST_SIZE"),
    PRIZE_AMOUNT("PRIZE_AMOUNT"),
    CONTEST_TYPE("CONTEST_TYPE"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    ContestFilter(String str) {
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

        public final ContestFilter safeValueOf(String str) {
            ContestFilter contestFilter;
            runAnimators.ag$a(str, "rawValue");
            ContestFilter[] values = ContestFilter.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    contestFilter = null;
                    break;
                }
                contestFilter = values[i];
                if (runAnimators.values((Object) contestFilter.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return contestFilter == null ? ContestFilter.UNKNOWN__ : contestFilter;
        }
    }
}
