package com.app.dream11.model;

import o.onActionViewExpanded;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class LoginVerifyOTPRequest extends BaseCampaignRequest {
    private final String mobileNumber;
    private final String otp;

    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public final String getOtp() {
        return this.otp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginVerifyOTPRequest(onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider, String str, String str2) {
        super(onactionviewexpanded, iEventDataProvider, false, 4, null);
        runAnimators.ag$a(onactionviewexpanded, "device");
        runAnimators.ag$a(iEventDataProvider, "eventsData");
        runAnimators.ag$a(str, "mobileNumber");
        runAnimators.ag$a(str2, "otp");
        this.mobileNumber = str;
        this.otp = str2;
    }
}
