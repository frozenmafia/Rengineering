package com.apxor.androidsdk.plugins.survey.e;

import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class e extends d {
    public e(String str) {
        super(str);
    }

    @Override // com.apxor.androidsdk.plugins.survey.e.d
    public int a() {
        return 4;
    }

    @Override // com.apxor.androidsdk.plugins.survey.e.d
    public boolean f() {
        return true;
    }

    public boolean g() {
        return optBoolean("advanced_options", true);
    }

    public int h() {
        return optInt("rating_scale", 5);
    }

    public String i() {
        return optString("rating_style", "stylized");
    }

    public JSONObject j() {
        return optJSONObject("response_cfg");
    }

    public JSONArray k() {
        return optJSONArray("rules");
    }
}
