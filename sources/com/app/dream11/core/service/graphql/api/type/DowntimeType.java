package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum DowntimeType {
    FLUCTUATING("FLUCTUATING"),
    DISABLED("DISABLED"),
    OTHER("OTHER"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    DowntimeType(String str) {
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

        public final DowntimeType safeValueOf(String str) {
            DowntimeType downtimeType;
            runAnimators.ag$a(str, "rawValue");
            DowntimeType[] values = DowntimeType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    downtimeType = null;
                    break;
                }
                downtimeType = values[i];
                if (runAnimators.values((Object) downtimeType.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return downtimeType == null ? DowntimeType.UNKNOWN__ : downtimeType;
        }
    }
}
