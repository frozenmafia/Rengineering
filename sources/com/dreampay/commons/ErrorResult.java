package com.dreampay.commons;

import com.dreampay.commons.constants.Constants;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class ErrorResult extends Throwable {
    public static final Companion Companion = new Companion(null);
    private static final String UNKNOWN_ERROR_CODE = "FE100";
    private static final String UNKNOWN_ERROR_MESSAGE = "Unknown error";
    private final String code;
    private final String description;

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }

        public final ErrorResult unknown() {
            return new ErrorResult(ErrorResult.UNKNOWN_ERROR_CODE, ErrorResult.UNKNOWN_ERROR_MESSAGE);
        }

        public final ErrorResult userCancelled() {
            return new ErrorResult(Constants.ErrorCodes.USER_CANCELLED, Constants.ErrorMessages.USER_CANCELLED);
        }
    }

    public ErrorResult(String str, String str2) {
        runAnimators.ag$a(str, "code");
        runAnimators.ag$a(str2, "description");
        this.code = str;
        this.description = str2;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }
}
