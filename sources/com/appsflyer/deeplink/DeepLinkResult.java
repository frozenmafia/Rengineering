package com.appsflyer.deeplink;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class DeepLinkResult {
    private final DeepLink deepLink;
    private final c error;
    private final b status;

    /* loaded from: classes3.dex */
    public enum b {
        FOUND,
        NOT_FOUND,
        ERROR
    }

    /* loaded from: classes3.dex */
    public enum c {
        TIMEOUT,
        NETWORK,
        HTTP_STATUS_CODE,
        UNEXPECTED
    }

    public DeepLinkResult(DeepLink deepLink, c cVar) {
        this.deepLink = deepLink;
        this.error = cVar;
        if (cVar != null) {
            this.status = b.ERROR;
        } else if (deepLink != null) {
            this.status = b.FOUND;
        } else {
            this.status = b.NOT_FOUND;
        }
    }

    public c getError() {
        return this.error;
    }

    public DeepLink getDeepLink() {
        return this.deepLink;
    }

    public b getStatus() {
        return this.status;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("deepLink", this.deepLink);
            jSONObject.put("error", this.error);
            jSONObject.put("status", this.status);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }
}
