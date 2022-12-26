package com.app.dream11.model.viewmodel;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;
import o.checkMatchParent;
/* loaded from: classes3.dex */
public class ManageWalletVM extends BaseObservable {
    private Double balance;
    private checkMatchParent handler;
    private boolean rechargeable;
    private boolean shouldShowProgressBar;
    private boolean showAlertDialog = false;
    private boolean showUi;
    private String title;
    private String walletLogo;
    private String walletType;

    @Bindable
    public boolean isRechargeable() {
        return this.rechargeable;
    }

    public void setRechargeable(boolean z) {
        this.rechargeable = z;
        notifyPropertyChanged(332);
    }

    @Bindable
    public Double getBalance() {
        return this.balance;
    }

    public void setBalance(Double d) {
        this.balance = d;
        notifyPropertyChanged(12);
    }

    @Bindable
    public String getWalletLogo() {
        return this.walletLogo;
    }

    public void setWalletLogo(String str) {
        this.walletLogo = str;
        notifyPropertyChanged(BR.walletLogo);
    }

    @Bindable
    public checkMatchParent getHandler() {
        return this.handler;
    }

    public void setHandler(checkMatchParent checkmatchparent) {
        this.handler = checkmatchparent;
        notifyPropertyChanged(143);
    }

    @Bindable
    public String getWalletType() {
        return this.walletType;
    }

    public void setWalletType(String str) {
        this.walletType = str;
        notifyPropertyChanged(BR.walletType);
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
        notifyPropertyChanged(500);
    }

    @Bindable
    public boolean getShowAlertDialog() {
        return this.showAlertDialog;
    }

    public void setShowAlertDialog(boolean z) {
        this.showAlertDialog = z;
        notifyPropertyChanged(404);
    }

    @Bindable
    public boolean isShowUi() {
        return this.showUi;
    }

    public void setShowUi(boolean z) {
        this.showUi = z;
        notifyPropertyChanged(BR.showUi);
    }

    @Bindable
    public boolean isShouldShowProgressBar() {
        return this.shouldShowProgressBar;
    }

    public void setShouldShowProgressBar(boolean z) {
        this.shouldShowProgressBar = z;
        notifyPropertyChanged(400);
    }
}
