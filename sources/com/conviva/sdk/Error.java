package com.conviva.sdk;

import com.conviva.api.ConvivaConstants;
/* loaded from: classes4.dex */
class Error {
    private String errorMsg;
    private ConvivaConstants.ErrorSeverity errorSeverity;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Error(String str, ConvivaConstants.ErrorSeverity errorSeverity) {
        this.errorMsg = str;
        this.errorSeverity = errorSeverity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConvivaConstants.ErrorSeverity getErrorSeverity() {
        return this.errorSeverity;
    }
}
