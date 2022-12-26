package com.app.dream11.model;

import java.io.Serializable;
import java.util.List;
/* loaded from: classes6.dex */
public class PaymentResponse implements Serializable {
    private static final long serialVersionUID = 121;
    private int address;
    private String cardPaymentMode;
    private boolean isNativePayment;
    private List<String> offers;
    private List<PayGateways> paygateways;
    private String payment_message;
    private PaymentOptions preferredOption;
    private String webPaymentMode;

    public boolean isNativePayment() {
        return this.isNativePayment;
    }

    public void setNativePayment(boolean z) {
        this.isNativePayment = z;
    }

    public void setOffers(List<String> list) {
        this.offers = list;
    }

    public List<String> getOffers() {
        return this.offers;
    }

    public void setPaygateways(List<PayGateways> list) {
        this.paygateways = list;
    }

    public List<PayGateways> getPaygateways() {
        return this.paygateways;
    }

    public void setPreferredOption(PaymentOptions paymentOptions) {
        this.preferredOption = paymentOptions;
    }

    public String getPayment_message() {
        return this.payment_message;
    }

    public void setPayment_message(String str) {
        this.payment_message = str;
    }

    public PaymentOptions getPreferredOption() {
        return this.preferredOption;
    }

    public void setAddress(int i) {
        this.address = i;
    }

    public int getAddress() {
        return this.address;
    }

    public String getCardPaymentMode() {
        return this.cardPaymentMode;
    }

    public void setCardPaymentMode(String str) {
        this.cardPaymentMode = str;
    }

    public String getWebPaymentMode() {
        return this.webPaymentMode;
    }

    public void setWebPaymentMode(String str) {
        this.webPaymentMode = str;
    }
}
