package com.facebook.login;

import com.facebook.internal.CallbackManagerImpl;
import o.getTargetTypes;
import o.runAnimators;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public final class LoginClient$ah$a {
    public /* synthetic */ LoginClient$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    private LoginClient$ah$a() {
    }

    public final int ah$a() {
        return CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
    }

    public final String values() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        runAnimators.ah$a(jSONObject2, "e2e.toString()");
        return jSONObject2;
    }
}
