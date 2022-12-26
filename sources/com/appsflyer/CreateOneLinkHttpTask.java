package com.appsflyer;

import android.content.Context;
import com.appsflyer.internal.ah;
import com.appsflyer.internal.am;
import com.appsflyer.internal.as;
import com.appsflyer.share.LinkGenerator;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class CreateOneLinkHttpTask extends am {
    private static final String BRAND_DOMAIN = "brand_domain";
    private static final String TRACKING_LINK_DATA_KEY = "data";
    private static final String TRACKING_LINK_LIVE_TIME_KEY = "ttl";
    private String brandDomain;
    private Context context;
    private Map<String, String> data;
    private boolean mTrackingStopped;
    private String packageName;
    private ResponseListener responseListener;
    private String ttl;

    /* loaded from: classes3.dex */
    public interface ResponseListener {
        void onResponse(String str);

        void onResponseError(String str);
    }

    public CreateOneLinkHttpTask(String str, Map<String, String> map, ah ahVar, Context context, boolean z) {
        super(ahVar);
        this.packageName = "";
        this.mTrackingStopped = false;
        this.mTrackingStopped = z;
        this.context = context;
        if (context != null) {
            this.packageName = context.getPackageName();
        } else {
            AFLogger.AFInAppEventParameterName("CreateOneLinkHttpTask: context can't be null");
        }
        this.oneLinkId = str;
        this.ttl = "-1";
        this.data = map;
    }

    public void setListener(ResponseListener responseListener) {
        this.responseListener = responseListener;
    }

    public void setBrandDomain(String str) {
        this.brandDomain = str;
    }

    @Override // com.appsflyer.internal.am
    public void initRequest(HttpsURLConnection httpsURLConnection) throws JSONException, IOException {
        if (this.mTrackingStopped) {
            return;
        }
        httpsURLConnection.setRequestMethod("POST");
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setUseCaches(false);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject(this.data);
        jSONObject.put(TRACKING_LINK_LIVE_TIME_KEY, this.ttl);
        jSONObject.put("data", jSONObject2);
        String str = this.brandDomain;
        if (str != null) {
            jSONObject.put(BRAND_DOMAIN, str);
        }
        httpsURLConnection.connect();
        DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
        dataOutputStream.writeBytes(jSONObject.toString());
        dataOutputStream.flush();
        dataOutputStream.close();
    }

    @Override // com.appsflyer.internal.am
    public String getOneLinkUrl() {
        return as.AFKeystoreWrapper(BASE_URL) + "/" + this.oneLinkId;
    }

    @Override // com.appsflyer.internal.am
    public void handleResponse(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                this.responseListener.onResponse(jSONObject.optString(keys.next()));
            }
        } catch (JSONException e) {
            this.responseListener.onResponseError("Can't parse one link data");
            AFLogger.values("Error while parsing to json " + str, e);
        }
    }

    @Override // com.appsflyer.internal.am
    public void onErrorResponse() {
        LinkGenerator addParameters = new LinkGenerator("af_app_invites").setBaseURL(this.oneLinkId, AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_DOMAIN), this.packageName).addParameter("af_siteid", this.packageName).addParameters(this.data);
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
        if (string != null) {
            addParameters.setReferrerCustomerId(string);
        }
        this.responseListener.onResponse(addParameters.generateLink());
    }
}
