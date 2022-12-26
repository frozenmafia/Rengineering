package com.apxor.androidsdk.plugins.survey.e;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
/* loaded from: classes6.dex */
public class f extends d {
    public f(String str) {
        super(str);
    }

    @Override // com.apxor.androidsdk.plugins.survey.e.d
    public int a() {
        return 1;
    }

    @Override // com.apxor.androidsdk.plugins.survey.e.d
    public boolean f() {
        return g() != null;
    }

    public List<b> g() {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = getJSONArray("choices");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(new b(jSONArray.getJSONObject(i).toString()));
            }
        } catch (JSONException unused) {
        }
        if (arrayList.size() > 0) {
            return arrayList;
        }
        return null;
    }

    public boolean h() {
        return optBoolean("randomize_choices", false);
    }
}
