package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum CodeType {
    ADD_CASH("ADD_CASH"),
    ONBOARDING("ONBOARDING"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    CodeType(String str) {
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

        public final CodeType safeValueOf(String str) {
            CodeType codeType;
            runAnimators.ag$a(str, "rawValue");
            CodeType[] values = CodeType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    codeType = null;
                    break;
                }
                codeType = values[i];
                if (runAnimators.values((Object) codeType.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return codeType == null ? CodeType.UNKNOWN__ : codeType;
        }
    }
}
