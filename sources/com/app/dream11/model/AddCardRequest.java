package com.app.dream11.model;

import o.onActionViewExpanded;
/* loaded from: classes6.dex */
public class AddCardRequest extends CommonRequest {
    String cardExpMonth;
    String cardExpYear;
    String cardNumber;
    String nameOnCard;

    public AddCardRequest(String str, String str2, String str3, String str4, onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider) {
        super(onactionviewexpanded, iEventDataProvider);
        this.cardNumber = str;
        this.cardExpMonth = str2;
        this.cardExpYear = str3;
        this.nameOnCard = str4;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public void setCardNumber(String str) {
        this.cardNumber = str;
    }

    public String getCardExpMonth() {
        return this.cardExpMonth;
    }

    public void setCardExpMonth(String str) {
        this.cardExpMonth = str;
    }

    public String getCardExpYear() {
        return this.cardExpYear;
    }

    public void setCardExpYear(String str) {
        this.cardExpYear = str;
    }

    public String getNameOnCard() {
        return this.nameOnCard;
    }

    public void setNameOnCard(String str) {
        this.nameOnCard = str;
    }
}
