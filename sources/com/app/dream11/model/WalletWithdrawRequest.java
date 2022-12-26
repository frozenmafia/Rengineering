package com.app.dream11.model;

import o.onActionViewExpanded;
/* loaded from: classes6.dex */
public class WalletWithdrawRequest extends BaseRequest {
    private Double amount;
    private Integer depositOfferId;
    private Integer paymentOptionId;
    private String wallet;

    public WalletWithdrawRequest(onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider) {
        super(onactionviewexpanded, iEventDataProvider);
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double d) {
        this.amount = d;
    }

    public String getWallet() {
        return this.wallet;
    }

    public void setWallet(String str) {
        this.wallet = str;
    }

    public Integer getPaymentOptionId() {
        return this.paymentOptionId;
    }

    public void setPaymentOptionId(Integer num) {
        this.paymentOptionId = num;
    }

    public Integer getDepositOfferId() {
        return this.depositOfferId;
    }

    public void setDepositOfferId(Integer num) {
        this.depositOfferId = num;
    }
}
