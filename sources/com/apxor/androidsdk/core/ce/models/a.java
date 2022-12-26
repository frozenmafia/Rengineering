package com.apxor.androidsdk.core.ce.models;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.apxor.androidsdk.core.SDKController;
import com.apxor.androidsdk.core.ce.Constants;
import com.apxor.androidsdk.core.ce.ContextEvaluator;
import com.apxor.androidsdk.core.utils.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
class a {
    private static final String a = "a";

    /* renamed from: b  reason: collision with root package name */
    private String f236b;
    private JSONArray c;
    private JSONArray d;
    private boolean e = false;

    private boolean a(String str, String str2, String str3) {
        if (Constants.EQ.equals(str)) {
            return str2.equals(str3);
        }
        return false;
    }

    private boolean a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return true;
        }
        if (ContextEvaluator.getInstance().compareLongValues(jSONObject.getInt("val"), Build.VERSION.SDK_INT, jSONObject.getString("op"))) {
            return true;
        }
        Logger.e(a, "API check failed", null);
        return false;
    }

    private boolean a(JSONObject jSONObject, JSONArray jSONArray) {
        JSONArray jSONArray2;
        if (jSONObject == null) {
            return false;
        }
        try {
            int length = jSONArray.length();
            boolean z = false;
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String string = jSONObject2.getString("name");
                if (!jSONObject.has(string)) {
                    return false;
                }
                Object obj = jSONObject.get(string);
                if (obj instanceof JSONArray) {
                    jSONArray2 = (JSONArray) obj;
                } else {
                    JSONArray jSONArray3 = new JSONArray();
                    jSONArray3.put(obj);
                    jSONArray2 = jSONArray3;
                }
                int length2 = jSONArray2.length();
                String string2 = jSONObject2.getString("operator");
                String optString = jSONObject2.optString("type");
                String str = "value";
                if (!optString.isEmpty()) {
                    JSONArray jSONArray4 = jSONObject2.getJSONArray("value");
                    int length3 = jSONArray4.length();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length3) {
                            break;
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(str, jSONArray4.get(i2));
                        int i3 = i2;
                        int i4 = length3;
                        String str2 = str;
                        String str3 = string2;
                        boolean compareValues = ContextEvaluator.getInstance().compareValues(jSONObject3, jSONArray2, optString, string2, "value", length2);
                        if (compareValues) {
                            z = compareValues;
                            break;
                        }
                        i2 = i3 + 1;
                        string2 = str3;
                        z = compareValues;
                        length3 = i4;
                        str = str2;
                    }
                } else {
                    try {
                        JSONArray jSONArray5 = jSONObject2.getJSONArray("value");
                        int length4 = jSONArray5.length();
                        for (int i5 = 0; i5 < length4; i5++) {
                            String string3 = jSONArray5.getString(i5);
                            for (int i6 = 0; i6 < length2; i6++) {
                                z = a(string2, string3, jSONArray2.getString(i6));
                                if (z) {
                                    break;
                                }
                            }
                            if (z) {
                                break;
                            }
                        }
                    } catch (Exception e) {
                        e = e;
                        SDKController.getInstance().logException("attr_comp", e);
                        return false;
                    }
                }
                if (!z) {
                    break;
                }
            }
            return z;
        } catch (Exception e2) {
            e = e2;
        }
    }

    private boolean b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return true;
        }
        if (ContextEvaluator.getInstance().compareStrings(jSONObject.getString("val"), Build.BRAND + com.dreampay.commons.constants.Constants.WHITE_SPACE + Build.MODEL, jSONObject.getString("op"))) {
            return true;
        }
        Logger.e(a, "Model check failed", null);
        return false;
    }

    private boolean c(JSONObject jSONObject) {
        if (jSONObject == null) {
            return true;
        }
        long j = jSONObject.getLong("val");
        String string = jSONObject.getString("op");
        Context context = SDKController.getInstance().getContext();
        int i = -1;
        if (context != null) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                if (packageInfo != null) {
                    i = packageInfo.versionCode;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (ContextEvaluator.getInstance().compareLongValues(j, i, string)) {
            return true;
        }
        Logger.e(a, "Version check failed", null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        if (this.e) {
            if (this.f236b.equals("FTU")) {
                return SDKController.getInstance().isFirstSession();
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArray;
        JSONArray jSONArray2 = this.d;
        return (jSONArray2 == null || jSONArray2.length() < 1 || a(jSONObject2, this.d)) && ((jSONArray = this.c) == null || jSONArray.length() < 1 || a(jSONObject, this.c));
    }

    public boolean d(JSONObject jSONObject) {
        try {
            this.f236b = jSONObject.getString(Constants.AUDIENCE_TYPE);
            JSONObject jSONObject2 = jSONObject.getJSONObject(Constants.ATTRIBUTES);
            this.c = jSONObject2.optJSONArray("user");
            this.d = jSONObject2.optJSONArray(Constants.SESSION_ATTR);
        } catch (JSONException unused) {
        }
        if (c(jSONObject.optJSONObject("ver")) && a(jSONObject.optJSONObject("api")) && b(jSONObject.optJSONObject("hw"))) {
            this.e = true;
            return this.e;
        }
        return false;
    }
}
