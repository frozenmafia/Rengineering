package com.app.dream11.model;

import java.io.Serializable;
/* loaded from: classes6.dex */
public class PaymentOptionResponse implements Serializable {
    private static final long serialVersionUID = 121;
    private APIError error;
    private PaymentResponse response;
    private boolean success;

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean z) {
        this.success = z;
    }

    public PaymentResponse getResponse() {
        return this.response;
    }

    public void setResponse(PaymentResponse paymentResponse) {
        this.response = paymentResponse;
    }

    public APIError getError() {
        return this.error;
    }

    public void setError(APIError aPIError) {
        this.error = aPIError;
    }
}
