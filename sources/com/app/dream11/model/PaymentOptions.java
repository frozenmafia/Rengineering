package com.app.dream11.model;

import java.io.Serializable;
/* loaded from: classes3.dex */
public class PaymentOptions implements Serializable {
    private static final long serialVersionUID = 121;
    private int AndroidStatus;
    private String CCGatewayValue;
    private String DateOfAdd;
    private String GatewayIcon;
    private String GatewayValue;
    private String IOSPayGateway;
    private int IosStatus;
    private int IsWalletLinkable;
    private int IsWalletLinked;
    private int MobileStatus;
    private String PayGatewayName;
    private String PayOption;
    private String PayTmGatewayValue;
    private String PayType;
    private int PayTypePriority;
    private int Priority;
    private String PromotionText;
    private int Status;
    private int appsPriority;
    private String errorMessage;
    private int id;
    private boolean isAvailable;
    private boolean isExpanded = false;
    private boolean isRechargeable;
    private String offerTag;
    private double walletBalance;

    public String getOfferTag() {
        return this.offerTag;
    }

    public void setOfferTag(String str) {
        this.offerTag = str;
    }

    public int getIsWalletLinked() {
        return this.IsWalletLinked;
    }

    public void setIsWalletLinked(int i) {
        this.IsWalletLinked = i;
    }

    public int getIsWalletLinkable() {
        return this.IsWalletLinkable;
    }

    public void setIsWalletLinkable(int i) {
        this.IsWalletLinkable = i;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return this.id;
    }

    public void setIOSPayGateway(String str) {
        this.IOSPayGateway = str;
    }

    public String getIOSPayGateway() {
        return this.IOSPayGateway;
    }

    public void setAndroidStatus(int i) {
        this.AndroidStatus = i;
    }

    public int getAndroidStatus() {
        return this.AndroidStatus;
    }

    public void setGatewayIcon(String str) {
        this.GatewayIcon = str;
    }

    public String getGatewayIcon() {
        return this.GatewayIcon;
    }

    public void setAppsPriority(int i) {
        this.appsPriority = i;
    }

    public int getAppsPriority() {
        return this.appsPriority;
    }

    public void setPriority(int i) {
        this.Priority = i;
    }

    public int getPriority() {
        return this.Priority;
    }

    public void setPayTypePriority(int i) {
        this.PayTypePriority = i;
    }

    public int getPayTypePriority() {
        return this.PayTypePriority;
    }

    public void setPayType(String str) {
        this.PayType = str;
    }

    public String getPayType() {
        return this.PayType;
    }

    public void setPayOption(String str) {
        this.PayOption = str;
    }

    public String getPayOption() {
        return this.PayOption;
    }

    public void setGatewayValue(String str) {
        this.GatewayValue = str;
    }

    public String getGatewayValue() {
        return this.GatewayValue;
    }

    public void setStatus(int i) {
        this.Status = i;
    }

    public int getStatus() {
        return this.Status;
    }

    public void setPayGatewayName(String str) {
        this.PayGatewayName = str;
    }

    public String getPayGatewayName() {
        return this.PayGatewayName;
    }

    public void setCCGatewayValue(String str) {
        this.CCGatewayValue = str;
    }

    public String getCCGatewayValue() {
        return this.CCGatewayValue;
    }

    public void setDateOfAdd(String str) {
        this.DateOfAdd = str;
    }

    public String getDateOfAdd() {
        return this.DateOfAdd;
    }

    public void setPayTmGatewayValue(String str) {
        this.PayTmGatewayValue = str;
    }

    public String getPayTmGatewayValue() {
        return this.PayTmGatewayValue;
    }

    public void setMobileStatus(int i) {
        this.MobileStatus = i;
    }

    public int getMobileStatus() {
        return this.MobileStatus;
    }

    public void setIosStatus(int i) {
        this.IosStatus = i;
    }

    public int getIosStatus() {
        return this.IosStatus;
    }

    public double getWalletBalance() {
        return this.walletBalance;
    }

    public void setWalletBalance(double d) {
        this.walletBalance = d;
    }

    public String getPromotionText() {
        return this.PromotionText;
    }

    public void setPromotionText(String str) {
        this.PromotionText = str;
    }

    public boolean isExpanded() {
        return this.isExpanded;
    }

    public void setExpanded(boolean z) {
        this.isExpanded = z;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    public void setAvailable(boolean z) {
        this.isAvailable = z;
    }

    public boolean isRechargeable() {
        return this.isRechargeable;
    }

    public void setRechargeable(boolean z) {
        this.isRechargeable = z;
    }
}
