package com.giphy.sdk.core.network.engine;

import com.giphy.sdk.core.network.response.ErrorResponse;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class ApiException extends Exception {
    private final ErrorResponse errorResponse;

    public final ErrorResponse getErrorResponse() {
        return this.errorResponse;
    }

    public ApiException(ErrorResponse errorResponse) {
        runAnimators.ag$a(errorResponse, "errorResponse");
        this.errorResponse = errorResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiException(String str, ErrorResponse errorResponse) {
        super(str);
        runAnimators.ag$a(str, "detailMessage");
        runAnimators.ag$a(errorResponse, "errorResponse");
        this.errorResponse = errorResponse;
    }
}
