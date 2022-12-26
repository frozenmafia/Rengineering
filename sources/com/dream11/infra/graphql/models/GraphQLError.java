package com.dream11.infra.graphql.models;

import o.runAnimators;
/* loaded from: classes4.dex */
public final class GraphQLError extends Exception {
    private final int errorHttpCode;
    private final String errorMessage;
    private final String errorMessageTitle;
    private final String operationName;
    private final String serviceErrorCode;

    public final String getOperationName() {
        return this.operationName;
    }

    public final int getErrorHttpCode() {
        return this.errorHttpCode;
    }

    public final String getServiceErrorCode() {
        return this.serviceErrorCode;
    }

    public final String getErrorMessageTitle() {
        return this.errorMessageTitle;
    }

    public GraphQLError(String str, int i, String str2, String str3, String str4) {
        runAnimators.ag$a(str, "operationName");
        runAnimators.ag$a(str2, "serviceErrorCode");
        runAnimators.ag$a(str3, "errorMessageTitle");
        this.operationName = str;
        this.errorHttpCode = i;
        this.serviceErrorCode = str2;
        this.errorMessageTitle = str3;
        this.errorMessage = str4;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphQLError(String str, int i, String str2) {
        this(str, i, "", "", str2);
        runAnimators.ag$a(str, "operationName");
        runAnimators.ag$a(str2, "message");
    }
}
