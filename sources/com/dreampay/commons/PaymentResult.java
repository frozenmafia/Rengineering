package com.dreampay.commons;

import o.runAnimators;
/* loaded from: classes4.dex */
public final class PaymentResult {
    private final Double amount;
    private final String currency;
    private final String orderId;
    private final String paymentMode;
    private final Integer status;
    private final String statusName;
    private final Integer subStatus;
    private final String subStatusName;
    private final String transactionId;

    public final Integer component1() {
        return this.status;
    }

    public final String component2() {
        return this.statusName;
    }

    public final String component3() {
        return this.orderId;
    }

    public final Double component4() {
        return this.amount;
    }

    public final String component5() {
        return this.transactionId;
    }

    public final Integer component6() {
        return this.subStatus;
    }

    public final String component7() {
        return this.subStatusName;
    }

    public final String component8() {
        return this.paymentMode;
    }

    public final String component9() {
        return this.currency;
    }

    public final PaymentResult copy(Integer num, String str, String str2, Double d, String str3, Integer num2, String str4, String str5, String str6) {
        return new PaymentResult(num, str, str2, d, str3, num2, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentResult) {
            PaymentResult paymentResult = (PaymentResult) obj;
            return runAnimators.values(this.status, paymentResult.status) && runAnimators.values((Object) this.statusName, (Object) paymentResult.statusName) && runAnimators.values((Object) this.orderId, (Object) paymentResult.orderId) && runAnimators.values(this.amount, paymentResult.amount) && runAnimators.values((Object) this.transactionId, (Object) paymentResult.transactionId) && runAnimators.values(this.subStatus, paymentResult.subStatus) && runAnimators.values((Object) this.subStatusName, (Object) paymentResult.subStatusName) && runAnimators.values((Object) this.paymentMode, (Object) paymentResult.paymentMode) && runAnimators.values((Object) this.currency, (Object) paymentResult.currency);
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.status;
        int hashCode = num == null ? 0 : num.hashCode();
        String str = this.statusName;
        int hashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.orderId;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        Double d = this.amount;
        int hashCode4 = d == null ? 0 : d.hashCode();
        String str3 = this.transactionId;
        int hashCode5 = str3 == null ? 0 : str3.hashCode();
        Integer num2 = this.subStatus;
        int hashCode6 = num2 == null ? 0 : num2.hashCode();
        String str4 = this.subStatusName;
        int hashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.paymentMode;
        int hashCode8 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.currency;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "PaymentResult(status=" + this.status + ", statusName=" + ((Object) this.statusName) + ", orderId=" + ((Object) this.orderId) + ", amount=" + this.amount + ", transactionId=" + ((Object) this.transactionId) + ", subStatus=" + this.subStatus + ", subStatusName=" + ((Object) this.subStatusName) + ", paymentMode=" + ((Object) this.paymentMode) + ", currency=" + ((Object) this.currency) + ')';
    }

    public PaymentResult(Integer num, String str, String str2, Double d, String str3, Integer num2, String str4, String str5, String str6) {
        this.status = num;
        this.statusName = str;
        this.orderId = str2;
        this.amount = d;
        this.transactionId = str3;
        this.subStatus = num2;
        this.subStatusName = str4;
        this.paymentMode = str5;
        this.currency = str6;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final String getStatusName() {
        return this.statusName;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final Double getAmount() {
        return this.amount;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final Integer getSubStatus() {
        return this.subStatus;
    }

    public final String getSubStatusName() {
        return this.subStatusName;
    }

    public final String getPaymentMode() {
        return this.paymentMode;
    }

    public final String getCurrency() {
        return this.currency;
    }
}
