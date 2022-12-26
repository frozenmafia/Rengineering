package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum SortField {
    PRIZEAMOUNT("PRIZEAMOUNT"),
    CONTESTSIZE("CONTESTSIZE"),
    ENTRYAMOUNT("ENTRYAMOUNT"),
    WINNER("WINNER"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    SortField(String str) {
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

        public final SortField safeValueOf(String str) {
            SortField sortField;
            runAnimators.ag$a(str, "rawValue");
            SortField[] values = SortField.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    sortField = null;
                    break;
                }
                sortField = values[i];
                if (runAnimators.values((Object) sortField.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return sortField == null ? SortField.UNKNOWN__ : sortField;
        }
    }
}
