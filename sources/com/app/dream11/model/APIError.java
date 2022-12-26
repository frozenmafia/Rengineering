package com.app.dream11.model;

import java.io.Serializable;
/* loaded from: classes6.dex */
public class APIError implements Serializable {
    private static final long serialVersionUID = 2944863815220770055L;
    private String errorType;
    private PaymentErrorExtraModel extra;

    public String getErrorType() {
        return this.errorType;
    }

    public void setErrorType(String str) {
        this.errorType = str;
    }

    public PaymentErrorExtraModel getExtra() {
        return this.extra;
    }

    public void setExtra(PaymentErrorExtraModel paymentErrorExtraModel) {
        this.extra = paymentErrorExtraModel;
    }
}
