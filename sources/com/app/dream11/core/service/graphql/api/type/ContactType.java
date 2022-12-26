package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum ContactType {
    MOBILE("MOBILE"),
    EMAIL("EMAIL"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    ContactType(String str) {
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

        public final ContactType safeValueOf(String str) {
            ContactType contactType;
            runAnimators.ag$a(str, "rawValue");
            ContactType[] values = ContactType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    contactType = null;
                    break;
                }
                contactType = values[i];
                if (runAnimators.values((Object) contactType.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return contactType == null ? ContactType.UNKNOWN__ : contactType;
        }
    }
}
