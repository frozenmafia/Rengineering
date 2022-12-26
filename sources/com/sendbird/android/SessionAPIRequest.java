package com.sendbird.android;

import com.sendbird.android.constant.StringSet;
import com.sendbird.android.shadow.com.google.gson.JsonElement;
import com.sendbird.android.shadow.okhttp3.OkHttpClient;
import com.sendbird.android.shadow.okhttp3.Request;
import java.util.Map;
/* loaded from: classes5.dex */
class SessionAPIRequest extends APIRequest {
    public SessionAPIRequest(OkHttpClient okHttpClient, Map<String, String> map) {
        super(okHttpClient, map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.sendbird.android.APIRequest
    public Request.Builder makeRequestBuilder(String str) throws SendBirdException {
        Request.Builder makeRequestBuilder = super.makeRequestBuilder(str);
        makeRequestBuilder.removeHeader(StringSet.SessionKey);
        return makeRequestBuilder;
    }

    @Override // com.sendbird.android.APIRequest
    protected JsonElement handleApiException(SendBirdException sendBirdException, Request request) throws SendBirdException {
        throw sendBirdException;
    }
}
