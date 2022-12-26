package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum InningStatus {
    IN_PROGRESS("IN_PROGRESS"),
    COMPLETED("COMPLETED"),
    DECLARED("DECLARED"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    InningStatus(String str) {
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

        public final InningStatus safeValueOf(String str) {
            InningStatus inningStatus;
            runAnimators.ag$a(str, "rawValue");
            InningStatus[] values = InningStatus.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    inningStatus = null;
                    break;
                }
                inningStatus = values[i];
                if (runAnimators.values((Object) inningStatus.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return inningStatus == null ? InningStatus.UNKNOWN__ : inningStatus;
        }
    }
}
