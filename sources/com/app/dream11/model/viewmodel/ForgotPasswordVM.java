package com.app.dream11.model.viewmodel;

import androidx.databinding.Bindable;
import o.debugPos;
/* loaded from: classes3.dex */
public class ForgotPasswordVM extends BasePageVM {
    private String contactUs;
    private String emailId;
    private debugPos handler;
    private String pageTitle;

    public ForgotPasswordVM(debugPos debugpos, String str) {
        this.handler = debugpos;
        this.pageTitle = str;
    }

    public debugPos getHandler() {
        return this.handler;
    }

    @Bindable
    public String getEmailId() {
        return this.emailId;
    }

    public void setEmailId(String str) {
        this.emailId = str;
        notifyPropertyChanged(81);
    }

    public String getPageTitle() {
        return this.pageTitle;
    }

    @Bindable
    public String getContactUs() {
        return this.contactUs;
    }

    public void setContactUs(String str) {
        this.contactUs = str;
    }
}
