package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum UserType {
    NORMAL("NORMAL"),
    CELEBRITY("CELEBRITY"),
    PAGE("PAGE"),
    EMPLOYEE("EMPLOYEE"),
    SPORTAN("SPORTAN"),
    DELETED("DELETED"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    UserType(String str) {
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

        public final UserType safeValueOf(String str) {
            UserType userType;
            runAnimators.ag$a(str, "rawValue");
            UserType[] values = UserType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    userType = null;
                    break;
                }
                userType = values[i];
                if (runAnimators.values((Object) userType.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return userType == null ? UserType.UNKNOWN__ : userType;
        }
    }
}
