package com.app.dream11.model;

import java.io.Serializable;
import java.util.List;
/* loaded from: classes6.dex */
public class PayGateways implements Serializable {
    private static final long serialVersionUID = 121;
    private String GatewayIcon;
    private List<PaymentOptions> options;
    private List<PayGateways> payTypes;
    private String title;

    public void setTitle(String str) {
        this.title = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setOptions(List<PaymentOptions> list) {
        this.options = list;
    }

    public List<PaymentOptions> getOptions() {
        return this.options;
    }

    public List<PayGateways> getPayTypes() {
        return this.payTypes;
    }

    public String getGatewayIcon() {
        return this.GatewayIcon;
    }

    public void setGatewayIcon(String str) {
        this.GatewayIcon = str;
    }
}
