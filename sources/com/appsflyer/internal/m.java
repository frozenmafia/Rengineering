package com.appsflyer.internal;

import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class m implements Runnable {
    private final bd AFInAppEventParameterName;

    public m() {
    }

    public static JSONObject AFInAppEventParameterName(Map<String, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), AFInAppEventParameterName(entry.getValue()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    private static Object AFInAppEventParameterName(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                for (Object obj2 : (Collection) obj) {
                    jSONArray.put(AFInAppEventParameterName(obj2));
                }
                return jSONArray;
            } else if (obj.getClass().isArray()) {
                int length = Array.getLength(obj);
                JSONArray jSONArray2 = new JSONArray();
                for (int i = 0; i < length; i++) {
                    jSONArray2.put(AFInAppEventParameterName(Array.get(obj, i)));
                }
                return jSONArray2;
            } else if (obj instanceof Map) {
                return AFInAppEventParameterName((Map<String, ?>) obj);
            } else {
                return ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) ? obj : obj.toString();
            }
        } catch (Exception unused) {
            return JSONObject.NULL;
        }
    }

    public static Map<String, Object> AFKeystoreWrapper(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = valueOf((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = AFKeystoreWrapper((JSONObject) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }

    private static List<Object> valueOf(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = valueOf((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = AFKeystoreWrapper((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public m(bd bdVar) {
        this.AFInAppEventParameterName = bdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.net.HttpURLConnection AFKeystoreWrapper() {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.m.AFKeystoreWrapper():java.net.HttpURLConnection");
    }

    @Override // java.lang.Runnable
    public void run() {
        HttpURLConnection AFKeystoreWrapper = AFKeystoreWrapper();
        if (AFKeystoreWrapper != null) {
            AFKeystoreWrapper.disconnect();
        }
    }
}
