package com.app.dream11.model;

import com.app.dream11.core.service.graphql.api.fragment.DreamPayConfigFragment;
import com.google.gson.internal.LinkedHashTreeMap;
/* loaded from: classes3.dex */
public class PaymentDisplayOption {
    DreamPayConfigFragment dreamPayConfig;
    PayGateways paymentResponse;
    LinkedHashTreeMap<String, PaymentOptionList> paymentType;

    public LinkedHashTreeMap<String, PaymentOptionList> getPaymentType() {
        return this.paymentType;
    }

    public void setPaymentType(LinkedHashTreeMap<String, PaymentOptionList> linkedHashTreeMap) {
        this.paymentType = linkedHashTreeMap;
    }

    public PayGateways getPaymentResponse() {
        return this.paymentResponse;
    }

    public void setPaymentResponse(PayGateways payGateways) {
        this.paymentResponse = payGateways;
    }

    public DreamPayConfigFragment getDreamPayConfig() {
        return this.dreamPayConfig;
    }

    public void setDreamPayConfig(DreamPayConfigFragment dreamPayConfigFragment) {
        this.dreamPayConfig = dreamPayConfigFragment;
    }
}
