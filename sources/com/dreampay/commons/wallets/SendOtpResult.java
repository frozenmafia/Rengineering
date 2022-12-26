package com.dreampay.commons.wallets;

import o.runAnimators;
/* loaded from: classes4.dex */
public final class SendOtpResult {
    private final String mobileNumber;
    private final String validateToken;

    public static /* synthetic */ SendOtpResult copy$default(SendOtpResult sendOtpResult, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sendOtpResult.mobileNumber;
        }
        if ((i & 2) != 0) {
            str2 = sendOtpResult.validateToken;
        }
        return sendOtpResult.copy(str, str2);
    }

    public final String component1() {
        return this.mobileNumber;
    }

    public final String component2() {
        return this.validateToken;
    }

    public final SendOtpResult copy(String str, String str2) {
        runAnimators.ag$a(str, "mobileNumber");
        runAnimators.ag$a(str2, "validateToken");
        return new SendOtpResult(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SendOtpResult) {
            SendOtpResult sendOtpResult = (SendOtpResult) obj;
            return runAnimators.values((Object) this.mobileNumber, (Object) sendOtpResult.mobileNumber) && runAnimators.values((Object) this.validateToken, (Object) sendOtpResult.validateToken);
        }
        return false;
    }

    public int hashCode() {
        return (this.mobileNumber.hashCode() * 31) + this.validateToken.hashCode();
    }

    public String toString() {
        return "SendOtpResult(mobileNumber=" + this.mobileNumber + ", validateToken=" + this.validateToken + ')';
    }

    public SendOtpResult(String str, String str2) {
        runAnimators.ag$a(str, "mobileNumber");
        runAnimators.ag$a(str2, "validateToken");
        this.mobileNumber = str;
        this.validateToken = str2;
    }

    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public final String getValidateToken() {
        return this.validateToken;
    }
}
