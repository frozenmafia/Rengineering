package com.fancode.payment.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes6.dex */
public enum StreamingStatus {
    NONE("NONE"),
    NOT_STARTED("NOT_STARTED"),
    STARTED("STARTED"),
    WAITING_FOR_VOD("WAITING_FOR_VOD"),
    COMPLETED("COMPLETED"),
    VOD_AVAILABLE("VOD_AVAILABLE"),
    PAUSED("PAUSED"),
    UNKNOWN__("UNKNOWN__");
    
    public static final toString Companion = new toString(null);
    private final String rawValue;

    StreamingStatus(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    /* loaded from: classes6.dex */
    public static final class toString {
        public /* synthetic */ toString(getTargetTypes gettargettypes) {
            this();
        }

        private toString() {
        }

        public final StreamingStatus toString(String str) {
            StreamingStatus streamingStatus;
            runAnimators.ag$a(str, "rawValue");
            StreamingStatus[] values = StreamingStatus.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    streamingStatus = null;
                    break;
                }
                streamingStatus = values[i];
                if (runAnimators.values((Object) streamingStatus.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return streamingStatus == null ? StreamingStatus.UNKNOWN__ : streamingStatus;
        }
    }
}
