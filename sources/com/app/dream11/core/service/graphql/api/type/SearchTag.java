package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum SearchTag {
    GIF("GIF"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    SearchTag(String str) {
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

        public final SearchTag safeValueOf(String str) {
            SearchTag searchTag;
            runAnimators.ag$a(str, "rawValue");
            SearchTag[] values = SearchTag.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    searchTag = null;
                    break;
                }
                searchTag = values[i];
                if (runAnimators.values((Object) searchTag.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return searchTag == null ? SearchTag.UNKNOWN__ : searchTag;
        }
    }
}
