package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum MemberStateType {
    JOINED("JOINED"),
    INVITED("INVITED"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    MemberStateType(String str) {
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

        public final MemberStateType safeValueOf(String str) {
            MemberStateType memberStateType;
            runAnimators.ag$a(str, "rawValue");
            MemberStateType[] values = MemberStateType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    memberStateType = null;
                    break;
                }
                memberStateType = values[i];
                if (runAnimators.values((Object) memberStateType.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return memberStateType == null ? MemberStateType.UNKNOWN__ : memberStateType;
        }
    }
}
