package com.app.dream11.core.service.graphql.api.type;

import com.dreampay.commons.constants.Constants;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum ContestJoinMessageType {
    LOW_BALANCE("LOW_BALANCE"),
    CHOOSE_TEAM("CHOOSE_TEAM"),
    VERIFY_PROFILE("VERIFY_PROFILE"),
    CREATE_TEAM("CREATE_TEAM"),
    CONTEST_FULL("CONTEST_FULL"),
    SUCCESS(Constants.Upi.PHONEPE_SUCCESS),
    UNKNOWN("UNKNOWN"),
    JOINED_SUCCESS("JOINED_SUCCESS"),
    CONTEST_QUEUE("CONTEST_QUEUE"),
    VERIFY_DETAILED_PROFILE("VERIFY_DETAILED_PROFILE"),
    VERIFY_BANK_DETAILS("VERIFY_BANK_DETAILS"),
    SELF_EXCLUSION("SELF_EXCLUSION"),
    ERROR("ERROR"),
    PARTIAL_BATCH_JOIN("PARTIAL_BATCH_JOIN"),
    BATCH_JOIN_LOW_BALANCE("BATCH_JOIN_LOW_BALANCE"),
    BATCH_JOIN_NON_QUEUED("BATCH_JOIN_NON_QUEUED"),
    BATCH_JOIN_FAILED("BATCH_JOIN_FAILED"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    ContestJoinMessageType(String str) {
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

        public final ContestJoinMessageType safeValueOf(String str) {
            ContestJoinMessageType contestJoinMessageType;
            runAnimators.ag$a(str, "rawValue");
            ContestJoinMessageType[] values = ContestJoinMessageType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    contestJoinMessageType = null;
                    break;
                }
                contestJoinMessageType = values[i];
                if (runAnimators.values((Object) contestJoinMessageType.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return contestJoinMessageType == null ? ContestJoinMessageType.UNKNOWN__ : contestJoinMessageType;
        }
    }
}
