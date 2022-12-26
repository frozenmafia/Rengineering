package com.app.dream11.dream11;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.app.dream11.utils.BasicNameValuePair;
import com.app.dream11.utils.NameValuePair;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import o.isCancelled;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class UTMParams implements Serializable {
    public static String ORGANIC_VALUE = "Organic";
    private static final long serialVersionUID = 8392809730839496411L;
    private isCancelled appsFlyerData;
    private String deeplinkUrl;
    private String utmRef;
    private String utmRefValue = "";
    private List<BasicNameValuePair> namedValuePair = new ArrayList();

    public UTMParams(String str, JSONObject jSONObject, String str2, isCancelled iscancelled) {
        this.deeplinkUrl = str;
        this.utmRef = str2;
        this.appsFlyerData = iscancelled;
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                for (String str3 : parse.getQueryParameterNames()) {
                    if (str3.startsWith("utm")) {
                        this.namedValuePair.add(new BasicNameValuePair(str3, parse.getQueryParameter(str3)));
                    }
                }
            }
        } else if (jSONObject != null) {
            try {
                addParamFromJson(jSONObject, "utm_campaign");
                addParamFromJson(jSONObject, "utm_content");
                addParamFromJson(jSONObject, "utm_term");
                addParamFromJson(jSONObject, "utm_source");
                addParamFromJson(jSONObject, "utm_medium");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            List<BasicNameValuePair> list = this.namedValuePair;
            if (list != null && list.isEmpty()) {
                if (this.appsFlyerData.HaptikSDK$e()) {
                    this.namedValuePair.add(new BasicNameValuePair("utm_campaign", this.appsFlyerData.HaptikSDK$b()));
                    this.namedValuePair.add(new BasicNameValuePair("utm_content", this.appsFlyerData.ah$a()));
                    this.namedValuePair.add(new BasicNameValuePair("utm_source", this.appsFlyerData.ah$b()));
                    this.namedValuePair.add(new BasicNameValuePair("utm_term", this.appsFlyerData.valueOf()));
                    this.namedValuePair.add(new BasicNameValuePair("utm_medium", this.appsFlyerData.ag$a()));
                } else {
                    this.namedValuePair.add(new BasicNameValuePair("utm_campaign", ORGANIC_VALUE));
                    this.namedValuePair.add(new BasicNameValuePair("utm_content", ORGANIC_VALUE));
                    this.namedValuePair.add(new BasicNameValuePair("utm_source", ORGANIC_VALUE));
                }
            }
            this.namedValuePair.add(new BasicNameValuePair("utm_ref", this.utmRef));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void addParamFromJson(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject.has(str) && (jSONObject.get(str) instanceof String)) {
            this.namedValuePair.add(new BasicNameValuePair(str, jSONObject.get(str).toString()));
        }
    }

    public List<NameValuePair> getNamedValuePair() {
        Log.d("UTM", "params: " + this.namedValuePair.toString());
        return new ArrayList(this.namedValuePair);
    }

    public boolean isEmpty() {
        return this.namedValuePair.isEmpty();
    }

    public String getValueForName(String str) {
        for (BasicNameValuePair basicNameValuePair : this.namedValuePair) {
            if (basicNameValuePair.getName().equals(str)) {
                return basicNameValuePair.getValue();
            }
        }
        return "";
    }
}
