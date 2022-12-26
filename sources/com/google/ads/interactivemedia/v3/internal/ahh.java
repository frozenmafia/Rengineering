package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public final class ahh {

    /* renamed from: b  reason: collision with root package name */
    private static WindowManager f559b;
    private static final String[] c = {"x", "y", "width", "height"};
    static float a = Resources.getSystem().getDisplayMetrics().density;

    static float a(int i) {
        return i / a;
    }

    public static JSONObject b(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", a(i));
            jSONObject.put("y", a(i2));
            jSONObject.put("width", a(i3));
            jSONObject.put("height", a(i4));
        } catch (JSONException e) {
            com.google.ads.interactivemedia.v3.impl.data.i.f("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    public static void c(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            com.google.ads.interactivemedia.v3.impl.data.i.f("Error with setting ad session id", e);
        }
    }

    public static void d(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void e(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            com.google.ads.interactivemedia.v3.impl.data.i.f("Error with setting not visible reason", e);
        }
    }

    public static void f(Context context) {
        if (context != null) {
            a = context.getResources().getDisplayMetrics().density;
            f559b = (WindowManager) context.getSystemService("window");
        }
    }

    public static void g(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            com.google.ads.interactivemedia.v3.impl.data.i.f("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    public static void h(JSONObject jSONObject) {
        float f;
        float f2 = 0.0f;
        if (Build.VERSION.SDK_INT >= 17) {
            if (f559b != null) {
                Point point = new Point(0, 0);
                f559b.getDefaultDisplay().getRealSize(point);
                f2 = a(point.x);
                f = a(point.y);
            }
            f = 0.0f;
        } else {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                float f3 = 0.0f;
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        double optDouble = optJSONObject.optDouble("x");
                        double optDouble2 = optJSONObject.optDouble("y");
                        double optDouble3 = optJSONObject.optDouble("width");
                        double optDouble4 = optJSONObject.optDouble("height");
                        f3 = Math.max(f3, (float) (optDouble + optDouble3));
                        f2 = Math.max(f2, (float) (optDouble2 + optDouble4));
                    }
                }
                f = f2;
                f2 = f3;
            }
            f = 0.0f;
        }
        ahg ahgVar = new ahg(f2, f);
        try {
            jSONObject.put("width", ahgVar.a);
            jSONObject.put("height", ahgVar.f558b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static boolean i(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            String[] strArr = c;
            int i = 0;
            while (true) {
                if (i < 4) {
                    String str = strArr[i];
                    if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                        break;
                    }
                    i++;
                } else if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""))) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                    if (optJSONArray != null || optJSONArray2 != null) {
                        if (k(optJSONArray, optJSONArray2)) {
                            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                if (!optJSONArray.optString(i2, "").equals(optJSONArray2.optString(i2, ""))) {
                                    break;
                                }
                            }
                        }
                    }
                    JSONArray optJSONArray3 = jSONObject.optJSONArray("childViews");
                    JSONArray optJSONArray4 = jSONObject2.optJSONArray("childViews");
                    if (optJSONArray3 != null || optJSONArray4 != null) {
                        if (k(optJSONArray3, optJSONArray4)) {
                            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                                if (i(optJSONArray3.optJSONObject(i3), optJSONArray4.optJSONObject(i3))) {
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static void j(JSONObject jSONObject, ael aelVar) {
        lu g = aelVar.g();
        JSONArray jSONArray = new JSONArray();
        ArrayList e = aelVar.e();
        int size = e.size();
        for (int i = 0; i < size; i++) {
            jSONArray.put((String) e.get(i));
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", g.h());
            jSONObject.put("friendlyObstructionPurpose", g.f());
            jSONObject.put("friendlyObstructionReason", g.g());
        } catch (JSONException e2) {
            com.google.ads.interactivemedia.v3.impl.data.i.f("Error with setting friendly obstruction", e2);
        }
    }

    private static boolean k(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
