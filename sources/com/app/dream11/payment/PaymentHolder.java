package com.app.dream11.payment;

import com.app.dream11.model.PaymentOptions;
import com.app.dream11.model.SaveCardDetails;
import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public class PaymentHolder implements Serializable {
    static PaymentHolder dataHolder = null;
    private static final long serialVersionUID = 121;
    private String amt;
    private SaveCardDetails cardValue;
    private String channel;
    private long id;
    private String orderId;
    private String payOption;
    private String paymentMessage;
    private List<PaymentOptions> paymentOption;
    private String token;
    private String name = "";
    private String url = "";

    private PaymentHolder() {
    }

    public String getChannel() {
        return this.channel;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public static PaymentHolder getInstance() {
        if (dataHolder == null) {
            dataHolder = new PaymentHolder();
        }
        return dataHolder;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public List<PaymentOptions> getPaymentOption() {
        return this.paymentOption;
    }

    public void setPaymentOption(List<PaymentOptions> list) {
        this.paymentOption = list;
    }

    public String getAmt() {
        return this.amt;
    }

    public String getPayOption() {
        return this.payOption;
    }

    public void setPayOption(String str) {
        this.payOption = str;
    }

    public void setAmt(String str) {
        this.amt = str;
    }

    public String getPaymentMessage() {
        return this.paymentMessage;
    }

    public void setPaymentMessage(String str) {
        this.paymentMessage = str;
    }

    public void setCardValue(SaveCardDetails saveCardDetails) {
        this.cardValue = saveCardDetails;
    }

    public SaveCardDetails getCardValue() {
        return this.cardValue;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public void setOrderId(String str) {
        this.orderId = str;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long j) {
        this.id = j;
    }
}
