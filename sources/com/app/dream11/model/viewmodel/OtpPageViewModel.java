package com.app.dream11.model.viewmodel;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;
import o.getGravity;
/* loaded from: classes3.dex */
public class OtpPageViewModel<H extends getGravity> extends BaseObservable {
    private H handler;
    private String mobileNumber;
    private String otp;
    private String pageTitle;
    private String timeLeftString;
    private boolean timeLeftVisibility;
    private boolean enableResendOtp = true;
    private boolean isFromVerification = false;
    private boolean isFromEmailVerification = false;

    public OtpPageViewModel(H h, String str) {
        this.handler = h;
        this.pageTitle = str;
    }

    @Bindable
    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public void setMobileNumber(String str) {
        this.mobileNumber = str;
        notifyPropertyChanged(242);
    }

    public void setIsFromVerification(Boolean bool) {
        this.isFromVerification = bool.booleanValue();
        notifyPropertyChanged(174);
    }

    @Bindable
    public Boolean getIsFromVerification() {
        return Boolean.valueOf(this.isFromVerification);
    }

    public void setIsFromEmailVerification(Boolean bool) {
        this.isFromEmailVerification = bool.booleanValue();
        notifyPropertyChanged(173);
    }

    @Bindable
    public Boolean getIsFromEmailVerification() {
        return Boolean.valueOf(this.isFromEmailVerification);
    }

    @Bindable
    public boolean isEnableResendOtp() {
        return this.enableResendOtp;
    }

    public void setEnableResendOtp(boolean z) {
        this.enableResendOtp = z;
        notifyPropertyChanged(96);
    }

    @Bindable
    public String getTimeLeftString() {
        return this.timeLeftString;
    }

    public void setTimeLeftString(String str) {
        this.timeLeftString = str;
        notifyPropertyChanged(BR.timeLeftString);
    }

    @Bindable
    public boolean isTimeLeftVisibility() {
        return this.timeLeftVisibility;
    }

    public void setTimeLeftVisibility(boolean z) {
        this.timeLeftVisibility = z;
        notifyPropertyChanged(BR.timeLeftVisibility);
    }

    @Bindable
    public H getHandler() {
        return this.handler;
    }

    public void setHandler(H h) {
        this.handler = h;
        notifyPropertyChanged(143);
    }

    @Bindable
    public String getPageTitle() {
        return this.pageTitle;
    }

    public void setPageTitle(String str) {
        this.pageTitle = str;
        notifyPropertyChanged(282);
    }

    @Bindable
    public String getOtp() {
        return this.otp;
    }

    public void setOtp(String str) {
        this.otp = str;
        notifyPropertyChanged(279);
    }
}
