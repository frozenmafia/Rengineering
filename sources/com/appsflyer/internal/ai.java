package com.appsflyer.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ai extends am {
    private static List<String> AFKeystoreWrapper = Arrays.asList("onelink.me", "onelnk.com", "app.aflink.com");
    b AFInAppEventParameterName;
    boolean AFInAppEventType;
    private String valueOf;
    private String values;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface b {
        void AFInAppEventType(Map<String, String> map);

        void valueOf(String str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ai(Uri uri, ah ahVar) {
        super(ahVar);
        String[] strArr;
        this.AFInAppEventType = false;
        if (TextUtils.isEmpty(uri.getHost()) || TextUtils.isEmpty(uri.getPath())) {
            return;
        }
        boolean z = false;
        for (String str : AFKeystoreWrapper) {
            if (uri.getHost().contains(str)) {
                z = true;
            }
        }
        if (f.init != null) {
            StringBuilder sb = new StringBuilder("Validate if link ");
            sb.append(uri);
            sb.append(" belongs to custom domains: ");
            sb.append(Arrays.asList(f.init));
            AFLogger.AFInAppEventType(sb.toString());
            for (String str2 : f.init) {
                if (uri.getHost().contains(str2) && !TextUtils.isEmpty(str2)) {
                    AFLogger.AFKeystoreWrapper("Link matches custom domain: ".concat(String.valueOf(str2)));
                    this.AFInAppEventType = true;
                    z = true;
                }
            }
        }
        String[] split = uri.getPath().split("/");
        if (z && split.length == 3) {
            this.oneLinkId = split[1];
            this.values = split[2];
            this.valueOf = uri.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean values() {
        return (TextUtils.isEmpty(this.oneLinkId) || TextUtils.isEmpty(this.values) || this.oneLinkId.equals("app")) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.appsflyer.internal.am
    protected final void initRequest(HttpsURLConnection httpsURLConnection) throws JSONException, IOException {
        httpsURLConnection.setRequestMethod("GET");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.appsflyer.internal.am
    protected final String getOneLinkUrl() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(BASE_URL, AppsFlyerLib.getInstance().getHostPrefix(), ah.AFInAppEventParameterName().getHostName()));
        sb.append("/");
        sb.append(this.oneLinkId);
        sb.append("?id=");
        sb.append(this.values);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.appsflyer.internal.am
    protected final void handleResponse(String str) {
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
            this.AFInAppEventParameterName.AFInAppEventType(hashMap);
        } catch (JSONException e) {
            this.AFInAppEventParameterName.valueOf("Can't parse one link data");
            AFLogger.values("Error while parsing to json ".concat(String.valueOf(str)), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.appsflyer.internal.am
    protected final void onErrorResponse() {
        String str = this.valueOf;
        if (str == null) {
            str = "Can't get one link data";
        }
        this.AFInAppEventParameterName.valueOf(str);
    }
}
