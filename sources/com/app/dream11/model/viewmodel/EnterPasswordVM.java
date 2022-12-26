package com.app.dream11.model.viewmodel;

import androidx.databinding.Bindable;
import o.MotionInterpolator;
/* loaded from: classes3.dex */
public class EnterPasswordVM extends BasePageVM {
    private String emailText;
    private MotionInterpolator handler;
    private String loginButtonText;
    private String pageTitle;
    private String password;

    public EnterPasswordVM(MotionInterpolator motionInterpolator, String str, String str2, String str3) {
        this.handler = motionInterpolator;
        this.pageTitle = str;
        this.loginButtonText = str3;
        this.emailText = str2;
    }

    public String getPageTitle() {
        return this.pageTitle;
    }

    public MotionInterpolator getHandler() {
        return this.handler;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public String getEmailText() {
        return this.emailText;
    }

    public void setEmailText(String str) {
        this.emailText = str;
    }

    @Bindable
    public String getLoginButtonText() {
        return this.loginButtonText;
    }
}
