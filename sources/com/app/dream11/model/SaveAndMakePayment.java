package com.app.dream11.model;

import o.onActionViewExpanded;
/* loaded from: classes6.dex */
public class SaveAndMakePayment extends CommonRequest {
    String amount;
    String cardExpMonth;
    String cardExpYear;
    String cardNumber;
    String cardSecurityCode;
    Integer depositOfferId;
    String nameOnCard;

    public Integer getDepositOfferId() {
        return this.depositOfferId;
    }

    public void setDepositOfferId(Integer num) {
        this.depositOfferId = num;
    }

    public SaveAndMakePayment(String str, String str2, String str3, String str4, String str5, String str6, onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider) {
        super(onactionviewexpanded, iEventDataProvider);
        this.cardNumber = str;
        this.cardExpMonth = str2;
        this.cardExpYear = str3;
        this.nameOnCard = str4;
        this.amount = str5;
        this.cardSecurityCode = str6;
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

    public String getAmt() {
        return this.amount;
    }

    public void setAmt(String str) {
        this.amount = str;
    }

    public String getCardSecurityCode() {
        return this.cardSecurityCode;
    }

    public void setCardSecurityCode(String str) {
        this.cardSecurityCode = str;
    }
}
