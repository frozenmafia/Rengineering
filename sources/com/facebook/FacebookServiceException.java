package com.facebook;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class FacebookServiceException extends FacebookException {
    public static final values Companion = new values(null);
    private static final long serialVersionUID = 1;
    private final FacebookRequestError requestError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FacebookServiceException(FacebookRequestError facebookRequestError, String str) {
        super(str);
        runAnimators.ag$a(facebookRequestError, "requestError");
        this.requestError = facebookRequestError;
    }

    public final FacebookRequestError getRequestError() {
        return this.requestError;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public String toString() {
        String str = "{FacebookServiceException: httpResponseCode: " + this.requestError.getInitSettings() + ", facebookErrorCode: " + this.requestError.valueOf() + ", facebookErrorType: " + this.requestError.HaptikSDK$b() + ", message: " + this.requestError.values() + "}";
        runAnimators.ah$a(str, "StringBuilder()\n        .append(\"{FacebookServiceException: \")\n        .append(\"httpResponseCode: \")\n        .append(requestError.requestStatusCode)\n        .append(\", facebookErrorCode: \")\n        .append(requestError.errorCode)\n        .append(\", facebookErrorType: \")\n        .append(requestError.errorType)\n        .append(\", message: \")\n        .append(requestError.errorMessage)\n        .append(\"}\")\n        .toString()");
        return str;
    }

    /* loaded from: classes4.dex */
    public static final class values {
        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        private values() {
        }
    }
}
