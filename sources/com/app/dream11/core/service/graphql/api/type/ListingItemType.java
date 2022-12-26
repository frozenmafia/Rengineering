package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum ListingItemType {
    DEPOSIT_OPTION("DEPOSIT_OPTION"),
    SUB_SECTION("SUB_SECTION"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    ListingItemType(String str) {
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

        public final ListingItemType safeValueOf(String str) {
            ListingItemType listingItemType;
            runAnimators.ag$a(str, "rawValue");
            ListingItemType[] values = ListingItemType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    listingItemType = null;
                    break;
                }
                listingItemType = values[i];
                if (runAnimators.values((Object) listingItemType.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return listingItemType == null ? ListingItemType.UNKNOWN__ : listingItemType;
        }
    }
}
