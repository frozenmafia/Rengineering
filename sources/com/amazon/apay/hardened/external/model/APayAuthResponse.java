package com.amazon.apay.hardened.external.model;

import android.content.Intent;
import o.WindowMetricsCalculatorDecorator;
import o.setHandler;
/* loaded from: classes.dex */
public class APayAuthResponse {
    public Status ag$a;
    public String ah$a;
    public String toString;
    public String valueOf;

    /* loaded from: classes.dex */
    public enum Status {
        GRANTED,
        DENIED
    }

    public APayAuthResponse(Status status, String str, String str2, String str3) {
        this.ag$a = status;
        this.toString = str;
        this.ah$a = str2;
        this.valueOf = str3;
    }

    public static APayAuthResponse ag$a(Intent intent) {
        WindowMetricsCalculatorDecorator.valueOf("fromIntent called", new Object[0]);
        if (intent != null) {
            try {
                if (intent.getExtras() != null && intent.getExtras().containsKey("AUTH_STATUS")) {
                    WindowMetricsCalculatorDecorator.valueOf("Intent contains AUTH_STATUS extra", new Object[0]);
                    return new APayAuthResponse((Status) intent.getExtras().getSerializable("AUTH_STATUS"), intent.getExtras().getString("authCode"), intent.getExtras().getString("lwaClientId"), intent.getExtras().getString("redirectUri"));
                }
            } catch (Exception e) {
                WindowMetricsCalculatorDecorator.valueOf(e, "Error while reading authorization result", new Object[0]);
                setHandler.ag$a("AuthResponseParsingError");
            }
        }
        WindowMetricsCalculatorDecorator.valueOf("Intent does not contain AUTH_STATUS extra", new Object[0]);
        return null;
    }

    public Status ag$a() {
        return this.ag$a;
    }

    public String ah$a() {
        return this.toString;
    }

    public String toString() {
        return "AuthorizationResponse{status=" + this.ag$a.name() + ", authCode='" + this.toString + "', clientId='" + this.ah$a + "', redirectUri='" + this.valueOf + "'}";
    }

    public String values() {
        return this.valueOf;
    }
}
