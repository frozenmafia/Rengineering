package com.amazon.apay.hardened.external.model;

import android.content.Intent;
import o.WindowMetricsCalculatorDecorator;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class APayError extends Exception {
    public ErrorType a;

    /* renamed from: b  reason: collision with root package name */
    public String f50b;

    /* loaded from: classes.dex */
    public enum ErrorType {
        AUTH_ERROR,
        PAYMENT_ERROR,
        BROWSING_EXPERIENCE
    }

    public APayError(JSONObject jSONObject) throws JSONException {
        super(jSONObject.getString("message"));
        this.a = ErrorType.valueOf(jSONObject.getString("errorType"));
        this.f50b = jSONObject.getString("code");
    }

    public static APayError fromIntent(Intent intent) {
        if (intent != null && intent.getStringExtra("error") != null) {
            String stringExtra = intent.getStringExtra("error");
            WindowMetricsCalculatorDecorator.valueOf.valueOf("%s", stringExtra);
            try {
                return new APayError(new JSONObject(stringExtra));
            } catch (JSONException e) {
                WindowMetricsCalculatorDecorator.valueOf.toString(e);
            }
        }
        return null;
    }

    public Intent getApayErrorIntent() {
        Intent intent = new Intent();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorType", this.a);
            jSONObject.put("code", this.f50b);
            jSONObject.put("message", getMessage());
            intent.putExtra("error", jSONObject.toString());
            return intent;
        } catch (JSONException e) {
            WindowMetricsCalculatorDecorator.valueOf.toString(e);
            return new Intent();
        }
    }

    public String getCode() {
        return this.f50b;
    }

    public ErrorType getType() {
        return this.a;
    }

    public APayError(ErrorType errorType, String str, String str2) {
        super(str2);
        this.a = errorType;
        this.f50b = str;
    }

    public APayError(ErrorType errorType, String str, String str2, Throwable th) {
        super(str2, th);
        this.a = errorType;
        this.f50b = str;
    }
}
