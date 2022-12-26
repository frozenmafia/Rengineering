package com.dreampay.commons;

import o.getTargetTypes;
import o.isFullSpan;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class AuthModel {
    @isFullSpan(valueOf = "accountKey")
    private final String accountKey;
    @isFullSpan(valueOf = "amount")
    private final double amount;
    @isFullSpan(valueOf = "currency")
    private final String currency;
    @isFullSpan(valueOf = "customer")
    private final Customer customer;
    @isFullSpan(valueOf = "merchantKey")
    private final String merchantKey;
    @isFullSpan(valueOf = "orderNumber")
    private final String orderNumber;
    @isFullSpan(valueOf = "postPaymentUrl")
    private final PostPaymentUrl postPaymentUrl;

    public final String component1() {
        return this.merchantKey;
    }

    public final String component2() {
        return this.accountKey;
    }

    public final String component3() {
        return this.orderNumber;
    }

    public final double component4() {
        return this.amount;
    }

    public final Customer component5() {
        return this.customer;
    }

    public final String component6() {
        return this.currency;
    }

    public final PostPaymentUrl component7() {
        return this.postPaymentUrl;
    }

    public final AuthModel copy(String str, String str2, String str3, double d, Customer customer, String str4, PostPaymentUrl postPaymentUrl) {
        runAnimators.ag$a(str, "merchantKey");
        runAnimators.ag$a(str2, "accountKey");
        runAnimators.ag$a(customer, "customer");
        return new AuthModel(str, str2, str3, d, customer, str4, postPaymentUrl);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AuthModel) {
            AuthModel authModel = (AuthModel) obj;
            return runAnimators.values((Object) this.merchantKey, (Object) authModel.merchantKey) && runAnimators.values((Object) this.accountKey, (Object) authModel.accountKey) && runAnimators.values((Object) this.orderNumber, (Object) authModel.orderNumber) && runAnimators.values(Double.valueOf(this.amount), Double.valueOf(authModel.amount)) && runAnimators.values(this.customer, authModel.customer) && runAnimators.values((Object) this.currency, (Object) authModel.currency) && runAnimators.values(this.postPaymentUrl, authModel.postPaymentUrl);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.merchantKey.hashCode();
        int hashCode2 = this.accountKey.hashCode();
        String str = this.orderNumber;
        int hashCode3 = str == null ? 0 : str.hashCode();
        int doubleToLongBits = Double.doubleToLongBits(this.amount);
        int hashCode4 = this.customer.hashCode();
        String str2 = this.currency;
        int hashCode5 = str2 == null ? 0 : str2.hashCode();
        PostPaymentUrl postPaymentUrl = this.postPaymentUrl;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + doubleToLongBits) * 31) + hashCode4) * 31) + hashCode5) * 31) + (postPaymentUrl != null ? postPaymentUrl.hashCode() : 0);
    }

    public String toString() {
        return "AuthModel(merchantKey=" + this.merchantKey + ", accountKey=" + this.accountKey + ", orderNumber=" + ((Object) this.orderNumber) + ", amount=" + this.amount + ", customer=" + this.customer + ", currency=" + ((Object) this.currency) + ", postPaymentUrl=" + this.postPaymentUrl + ')';
    }

    public AuthModel(String str, String str2, String str3, double d, Customer customer, String str4, PostPaymentUrl postPaymentUrl) {
        runAnimators.ag$a(str, "merchantKey");
        runAnimators.ag$a(str2, "accountKey");
        runAnimators.ag$a(customer, "customer");
        this.merchantKey = str;
        this.accountKey = str2;
        this.orderNumber = str3;
        this.amount = d;
        this.customer = customer;
        this.currency = str4;
        this.postPaymentUrl = postPaymentUrl;
    }

    public /* synthetic */ AuthModel(String str, String str2, String str3, double d, Customer customer, String str4, PostPaymentUrl postPaymentUrl, int i, getTargetTypes gettargettypes) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? 0.0d : d, customer, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : postPaymentUrl);
    }

    public final String getMerchantKey() {
        return this.merchantKey;
    }

    public final String getAccountKey() {
        return this.accountKey;
    }

    public final String getOrderNumber() {
        return this.orderNumber;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final Customer getCustomer() {
        return this.customer;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final PostPaymentUrl getPostPaymentUrl() {
        return this.postPaymentUrl;
    }
}
