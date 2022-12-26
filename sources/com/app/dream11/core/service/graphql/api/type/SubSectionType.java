package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum SubSectionType {
    WALLET_SECTION("WALLET_SECTION"),
    NETBANKING_SECTION("NETBANKING_SECTION"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    SubSectionType(String str) {
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

        public final SubSectionType safeValueOf(String str) {
            SubSectionType subSectionType;
            runAnimators.ag$a(str, "rawValue");
            SubSectionType[] values = SubSectionType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    subSectionType = null;
                    break;
                }
                subSectionType = values[i];
                if (runAnimators.values((Object) subSectionType.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return subSectionType == null ? SubSectionType.UNKNOWN__ : subSectionType;
        }
    }
}
