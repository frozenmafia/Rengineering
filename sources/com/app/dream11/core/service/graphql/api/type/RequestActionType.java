package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum RequestActionType {
    TEXT_MESSAGE("TEXT_MESSAGE"),
    REMATCH("REMATCH"),
    CHALLENGE("CHALLENGE"),
    CONTEST_SHARE("CONTEST_SHARE"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    RequestActionType(String str) {
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

        public final RequestActionType safeValueOf(String str) {
            RequestActionType requestActionType;
            runAnimators.ag$a(str, "rawValue");
            RequestActionType[] values = RequestActionType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    requestActionType = null;
                    break;
                }
                requestActionType = values[i];
                if (runAnimators.values((Object) requestActionType.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return requestActionType == null ? RequestActionType.UNKNOWN__ : requestActionType;
        }
    }
}
