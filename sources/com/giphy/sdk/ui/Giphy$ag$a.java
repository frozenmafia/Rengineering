package com.giphy.sdk.ui;

import java.util.Map;
import o.publishProgress;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
/* loaded from: classes4.dex */
final class Giphy$ag$a implements Interceptor {
    public static final Giphy$ag$a values = new Giphy$ag$a();

    Giphy$ag$a() {
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Request.Builder newBuilder = chain.request().newBuilder();
        for (Map.Entry<String, String> entry : publishProgress.values.values().entrySet()) {
            newBuilder.addHeader(entry.getKey(), entry.getValue());
        }
        return chain.proceed(newBuilder.build());
    }
}
