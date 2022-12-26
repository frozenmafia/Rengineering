package com.app.dream11.model;
/* loaded from: classes3.dex */
public class EmptyStateVm {
    String buttonTxt;
    String desc;
    IEmptyStateHandler handler;
    boolean shouldShowButton;
    boolean showPrimaryCta;
    String title;

    /* loaded from: classes3.dex */
    public interface IEmptyStateHandler {
        void onButtonClick();
    }

    public EmptyStateVm() {
    }

    public EmptyStateVm(String str, String str2, String str3, IEmptyStateHandler iEmptyStateHandler, boolean z, boolean z2) {
        this.title = str;
        this.desc = str2;
        this.buttonTxt = str3;
        this.handler = iEmptyStateHandler;
        this.shouldShowButton = z;
        this.showPrimaryCta = z2;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public String getButtonTxt() {
        return this.buttonTxt;
    }

    public void setButtonTxt(String str) {
        this.buttonTxt = str;
    }

    public IEmptyStateHandler getHandler() {
        return this.handler;
    }

    public void setHandler(IEmptyStateHandler iEmptyStateHandler) {
        this.handler = iEmptyStateHandler;
    }

    public boolean isShouldShowButton() {
        return this.shouldShowButton;
    }

    public void setShouldShowButton(boolean z) {
        this.shouldShowButton = z;
    }

    public boolean isShowPrimaryCta() {
        return this.showPrimaryCta;
    }

    public void setShowPrimaryCta(boolean z) {
        this.showPrimaryCta = z;
    }
}
