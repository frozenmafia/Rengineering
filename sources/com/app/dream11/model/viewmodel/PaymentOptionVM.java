package com.app.dream11.model.viewmodel;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
/* loaded from: classes3.dex */
public class PaymentOptionVM extends BaseObservable {
    private String balance;
    private String description;
    private int id;
    private Boolean isWalletLinked;
    private String logo;
    private String payOption;
    private String rightText;
    private Boolean shouldArrowVisible;
    private Boolean shouldBalanceProgressVisible;
    private Boolean shouldBalanceVisible;
    private Boolean shouldRightTextVisbile;
    private String title;
    private String type;

    @Bindable
    public int getId() {
        return this.id;
    }

    public void setId(int i) {
        this.id = i;
        notifyPropertyChanged(152);
    }

    @Bindable
    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
        notifyPropertyChanged(510);
    }

    @Bindable
    public String getPayOption() {
        return this.payOption;
    }

    public void setPayOption(String str) {
        this.payOption = str;
        notifyPropertyChanged(294);
    }

    @Bindable
    public String getLogo() {
        return this.logo;
    }

    public void setLogo(String str) {
        this.logo = str;
        notifyPropertyChanged(219);
    }

    @Bindable
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
        notifyPropertyChanged(500);
    }

    @Bindable
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String str) {
        this.description = str;
        notifyPropertyChanged(71);
    }

    @Bindable
    public String getBalance() {
        return this.balance;
    }

    public void setBalance(String str) {
        this.balance = str;
        notifyPropertyChanged(12);
    }

    @Bindable
    public String getRightText() {
        return this.rightText;
    }

    public void setRightText(String str) {
        this.rightText = str;
        notifyPropertyChanged(340);
    }

    @Bindable
    public Boolean getShouldBalanceVisible() {
        return this.shouldBalanceVisible;
    }

    public void setShouldBalanceVisible(Boolean bool) {
        this.shouldBalanceVisible = bool;
        notifyPropertyChanged(389);
    }

    @Bindable
    public Boolean getShouldRightTextVisbile() {
        return this.shouldRightTextVisbile;
    }

    public void setShouldRightTextVisbile(Boolean bool) {
        this.shouldRightTextVisbile = bool;
        notifyPropertyChanged(392);
    }

    @Bindable
    public Boolean getShouldArrowVisible() {
        return this.shouldArrowVisible;
    }

    public void setShouldArrowVisible(Boolean bool) {
        this.shouldArrowVisible = bool;
        notifyPropertyChanged(387);
    }

    @Bindable
    public Boolean getShouldBalanceProgressVisible() {
        return this.shouldBalanceProgressVisible;
    }

    public void setShouldBalanceProgressVisible(Boolean bool) {
        this.shouldBalanceProgressVisible = bool;
        notifyPropertyChanged(388);
    }

    public void setIsWalletLinked(Integer num) {
        this.isWalletLinked = Boolean.valueOf(num.intValue() == 1);
    }

    public Boolean getIsWalletLinked() {
        return this.isWalletLinked;
    }
}
