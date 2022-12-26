package com.app.dream11.model.viewmodel;

import androidx.databinding.Bindable;
import o.debugWidget;
import o.loadFont;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class LoginPageVM extends BasePageVM {
    private final boolean enableAgeConsent;
    private final debugWidget handler;
    private String inputEmailOrMobile;
    private String inputError;
    private boolean isAgeConsentGiven;
    private final String pageTitle;

    public LoginPageVM(debugWidget debugwidget, String str) {
        runAnimators.ag$a(debugwidget, "handler");
        runAnimators.ag$a(str, "pageTitle");
        this.handler = debugwidget;
        this.pageTitle = str;
        this.enableAgeConsent = loadFont.valueOf;
    }

    public final debugWidget getHandler() {
        return this.handler;
    }

    public final String getPageTitle() {
        return this.pageTitle;
    }

    @Bindable
    public final String getInputError() {
        return this.inputError;
    }

    public final void setInputError(String str) {
        this.inputError = str;
        notifyPropertyChanged(161);
    }

    @Bindable
    public final String getInputEmailOrMobile() {
        return this.inputEmailOrMobile;
    }

    public final void setInputEmailOrMobile(String str) {
        this.inputEmailOrMobile = str;
        notifyPropertyChanged(160);
        notifyPropertyChanged(216);
    }

    @Bindable
    public final boolean isLoginEnabled() {
        return (!loadFont.valueOf || this.isAgeConsentGiven) && !loadFont.ah$a((CharSequence) this.inputEmailOrMobile);
    }

    @Bindable
    public final boolean getIsAgeConsentGiven() {
        return this.isAgeConsentGiven;
    }

    public final void setIsAgeConsentGiven(boolean z) {
        this.isAgeConsentGiven = z;
        notifyPropertyChanged(169);
        notifyPropertyChanged(216);
    }

    @Bindable
    public final boolean getEnableAgeConsent() {
        return this.enableAgeConsent;
    }
}
