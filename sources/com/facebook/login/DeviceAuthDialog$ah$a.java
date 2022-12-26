package com.facebook.login;

import com.facebook.login.DeviceAuthDialog;
import java.util.ArrayList;
import o.getTargetTypes;
import o.runAnimators;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public final class DeviceAuthDialog$ah$a {
    public /* synthetic */ DeviceAuthDialog$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    private DeviceAuthDialog$ah$a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceAuthDialog.toString values(JSONObject jSONObject) throws JSONException {
        String optString;
        JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length = jSONArray.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                String optString2 = optJSONObject.optString("permission");
                runAnimators.ah$a(optString2, "permission");
                if (!(optString2.length() == 0) && !runAnimators.values((Object) optString2, (Object) "installed") && (optString = optJSONObject.optString("status")) != null) {
                    int hashCode = optString.hashCode();
                    if (hashCode != -1309235419) {
                        if (hashCode != 280295099) {
                            if (hashCode == 568196142 && optString.equals("declined")) {
                                arrayList2.add(optString2);
                            }
                        } else if (optString.equals("granted")) {
                            arrayList.add(optString2);
                        }
                    } else if (optString.equals("expired")) {
                        arrayList3.add(optString2);
                    }
                }
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return new DeviceAuthDialog.toString(arrayList, arrayList2, arrayList3);
    }
}
