package com.facebook;

import o.runAnimators;
/* loaded from: classes4.dex */
public final class FacebookDialogException extends FacebookException {
    public static final FacebookDialogException$ah$a Companion = new FacebookDialogException$ah$a(null);
    public static final long serialVersionUID = 1;
    private final int errorCode;
    private final String failingUrl;

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getFailingUrl() {
        return this.failingUrl;
    }

    public FacebookDialogException(String str, int i, String str2) {
        super(str);
        this.errorCode = i;
        this.failingUrl = str2;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public String toString() {
        String str = "{FacebookDialogException: errorCode: " + this.errorCode + ", message: " + getMessage() + ", url: " + this.failingUrl + "}";
        runAnimators.ah$a(str, "StringBuilder()\n        .append(\"{FacebookDialogException: \")\n        .append(\"errorCode: \")\n        .append(errorCode)\n        .append(\", message: \")\n        .append(message)\n        .append(\", url: \")\n        .append(failingUrl)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}
