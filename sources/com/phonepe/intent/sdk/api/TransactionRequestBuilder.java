package com.phonepe.intent.sdk.api;

import com.phonepe.intent.sdk.api.TransactionRequest;
import java.util.HashMap;
/* loaded from: classes5.dex */
public class TransactionRequestBuilder {

    /* renamed from: irjuc  reason: collision with root package name */
    public TransactionRequest.TransactionRequestBuilder f1401irjuc = new TransactionRequest.TransactionRequestBuilder();

    public TransactionRequest build() {
        return this.f1401irjuc.build();
    }

    public TransactionRequestBuilder setChecksum(String str) {
        this.f1401irjuc.setChecksum(str);
        return this;
    }

    public TransactionRequestBuilder setData(String str) {
        this.f1401irjuc.setData(str);
        return this;
    }

    public TransactionRequestBuilder setHeaders(HashMap<String, String> hashMap) {
        this.f1401irjuc.setHeaders(hashMap);
        return this;
    }

    public TransactionRequestBuilder setRedirectUrl(String str) {
        this.f1401irjuc.setRedirectUrl(str);
        return this;
    }

    public TransactionRequestBuilder setUrl(String str) {
        this.f1401irjuc.setUrl(str);
        return this;
    }
}
