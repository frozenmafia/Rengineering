package com.app.dream11.model;

import o.onActionViewExpanded;
/* loaded from: classes3.dex */
public class SendOtpRequest extends BaseDeviceRequest {
    private String mobileNum;
    private String otp;

    public SendOtpRequest(onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider) {
        super(onactionviewexpanded, iEventDataProvider);
    }

    public String getMobileNum() {
        return this.mobileNum;
    }

    public String getOtp() {
        return this.otp;
    }

    public void setMobileNum(String str) {
        this.mobileNum = str;
    }

    public void setOtp(String str) {
        this.otp = str;
    }
}
