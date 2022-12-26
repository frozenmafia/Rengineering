package com.apxor.androidsdk.plugins.survey.e;

import org.json.JSONObject;
/* loaded from: classes6.dex */
public class g extends d {
    public g(String str) {
        super(str);
    }

    @Override // com.apxor.androidsdk.plugins.survey.e.d
    public int a() {
        return 5;
    }

    @Override // com.apxor.androidsdk.plugins.survey.e.d
    public boolean f() {
        return g() != null;
    }

    public JSONObject g() {
        return optJSONObject("text_config");
    }
}
