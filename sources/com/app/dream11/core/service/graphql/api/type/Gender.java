package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes6.dex */
public enum Gender {
    MALE("MALE"),
    FEMALE("FEMALE"),
    OTHERS("OTHERS"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    Gender(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }

        public final Gender safeValueOf(String str) {
            Gender gender;
            runAnimators.ag$a(str, "rawValue");
            Gender[] values = Gender.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    gender = null;
                    break;
                }
                gender = values[i];
                if (runAnimators.values((Object) gender.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return gender == null ? Gender.UNKNOWN__ : gender;
        }
    }
}
