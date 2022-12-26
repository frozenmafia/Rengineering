package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum Sort {
    ASC("ASC"),
    DESC("DESC"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    Sort(String str) {
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

        public final Sort safeValueOf(String str) {
            Sort sort;
            runAnimators.ag$a(str, "rawValue");
            Sort[] values = Sort.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    sort = null;
                    break;
                }
                sort = values[i];
                if (runAnimators.values((Object) sort.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return sort == null ? Sort.UNKNOWN__ : sort;
        }
    }
}
