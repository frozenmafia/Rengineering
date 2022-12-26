package com.apxor.androidsdk.core;

import android.os.Bundle;
import com.apxor.androidsdk.core.utils.Logger;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class Attributes {
    private static final String a = "Attributes";

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f171b;

    public Attributes() {
        this.f171b = new JSONObject();
    }

    private void a(Map<String, Object> map) {
        if (map == null || map.size() < 1) {
            return;
        }
        putAttributes(new JSONObject(map));
    }

    public void flatten(JSONObject jSONObject) {
        a(jSONObject, 2);
    }

    public JSONObject getAttributes() {
        return this.f171b;
    }

    public void putAttribute(String str, int i) {
        a(str, Integer.valueOf(i));
    }

    public void putAttributes(JSONObject jSONObject) {
        a(jSONObject, 1);
    }

    public void putAttribute(String str, double d) {
        a(str, Double.valueOf(d));
    }

    public Attributes(Map<String, Object> map) {
        this.f171b = new JSONObject();
        a(map);
    }

    public void putAttribute(String str, float f) {
        a(str, Float.valueOf(f));
    }

    public void putAttribute(String str, long j) {
        a(str, Long.valueOf(j));
    }

    public void putAttribute(String str, boolean z) {
        a(str, Boolean.valueOf(z));
    }

    private void a(JSONObject jSONObject, int i) {
        Object obj;
        if (jSONObject == null || jSONObject.length() < 1) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && (obj = jSONObject.get(next)) != null && !obj.toString().equals("null")) {
                    String a2 = a(next);
                    if (!(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Double) && !(obj instanceof Boolean) && !(obj instanceof String)) {
                        if (obj instanceof JSONObject) {
                            a(a2, (JSONObject) obj, i - 1);
                        } else if (obj instanceof JSONArray) {
                            a(a2, (JSONArray) obj, i);
                        } else if (obj instanceof Date) {
                            a(a2, Long.valueOf(((Date) obj).getTime()));
                        } else {
                            a(a2, obj.toString());
                        }
                    }
                    a(a2, obj);
                }
            }
        } catch (JSONException unused) {
        }
    }

    public void putAttribute(String str, String str2) {
        if (str2 == null || str2.trim().equals("")) {
            return;
        }
        a(str, str2);
    }

    public void putAttribute(String str, Date date) {
        if (date == null) {
            return;
        }
        a(str, Long.valueOf(date.getTime()));
    }

    public void putAttribute(String str, String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (String str2 : strArr) {
            jSONArray.put(str2);
        }
        a(str, jSONArray);
    }

    public Attributes(JSONObject jSONObject) {
        this(jSONObject, true);
    }

    public Attributes(JSONObject jSONObject, boolean z) {
        this.f171b = new JSONObject();
        if (z) {
            flatten(jSONObject);
        } else {
            putAttributes(jSONObject);
        }
    }

    public void putAttribute(String str, long[] jArr) {
        if (jArr == null || jArr.length <= 0) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (long j : jArr) {
            jSONArray.put(j);
        }
        a(str, jSONArray);
    }

    public void putAttribute(String str, double[] dArr) {
        if (dArr == null || dArr.length <= 0) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (double d : dArr) {
                jSONArray.put(d);
            }
            a(str, jSONArray);
        } catch (JSONException unused) {
        }
    }

    public Attributes(Bundle bundle) {
        this.f171b = new JSONObject();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null) {
                if (obj instanceof Integer) {
                    putAttribute(str, ((Integer) obj).intValue());
                } else if (obj instanceof Float) {
                    putAttribute(str, ((Float) obj).floatValue());
                } else if (obj instanceof Double) {
                    putAttribute(str, ((Double) obj).doubleValue());
                } else if (obj instanceof Long) {
                    putAttribute(str, ((Long) obj).longValue());
                } else if (obj instanceof Boolean) {
                    putAttribute(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof long[]) {
                    putAttribute(str, bundle.getLongArray(str));
                } else if (obj instanceof String[]) {
                    putAttribute(str, bundle.getStringArray(str));
                } else if (obj instanceof double[]) {
                    putAttribute(str, bundle.getDoubleArray(str));
                } else if (obj instanceof String) {
                    putAttribute(str, (String) obj);
                } else if (obj instanceof Date) {
                    putAttribute(str, ((Date) obj).getTime());
                }
            }
        }
    }

    private void a(String str, JSONObject jSONObject, int i) throws JSONException {
        if (i <= 0) {
            a(str, jSONObject.toString());
            return;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj != null && !obj.toString().equals("null")) {
                String str2 = str + "_" + next;
                if (obj instanceof JSONObject) {
                    a(str2, (JSONObject) obj, i - 1);
                } else if (obj instanceof JSONArray) {
                    a(str2, (JSONArray) obj, i - 1);
                } else if (!(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof String) && !(obj instanceof Double) && !(obj instanceof Boolean)) {
                    a(str2, obj.toString());
                } else {
                    a(str2, obj);
                }
            }
        }
    }

    private void a(String str, JSONArray jSONArray, int i) throws JSONException {
        if (i <= 0) {
            a(str, jSONArray.toString());
        } else if (str != null) {
            int length = jSONArray.length();
            if (length < 1) {
                a(str, new JSONArray());
                return;
            }
            int i2 = 0;
            Object obj = jSONArray.get(0);
            if (obj == null) {
                return;
            }
            Class<?> cls = obj.getClass();
            for (int i3 = 1; i3 < length; i3++) {
                Object obj2 = jSONArray.get(i3);
                if (obj2 != null && !obj2.getClass().equals(cls)) {
                    a(str, jSONArray.toString());
                    return;
                }
            }
            if (obj instanceof JSONObject) {
                int i4 = i - 1;
                if (i4 > 0) {
                    while (i2 < length) {
                        a(str, jSONArray.getJSONObject(i2), i4);
                        i2++;
                    }
                    return;
                }
                JSONArray jSONArray2 = new JSONArray();
                while (i2 < length) {
                    jSONArray2.put(jSONArray.getJSONObject(i2).toString());
                    i2++;
                }
                a(str, jSONArray2);
            } else if (obj instanceof JSONArray) {
                while (i2 < length) {
                    a(str, jSONArray.get(i2).toString());
                    i2++;
                }
            } else if ((obj instanceof Integer) || (obj instanceof Boolean) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof String)) {
                while (i2 < length) {
                    a(str, jSONArray.get(i2));
                    i2++;
                }
            } else {
                a(str, jSONArray.toString());
            }
        }
    }

    private String a(String str) {
        String trim = str.trim();
        if (trim.length() > 255) {
            String substring = trim.substring(0, 255);
            Logger.e(a, "Length is too long");
            return substring;
        }
        return trim;
    }

    private void a(String str, Object obj) {
        JSONArray jSONArray;
        if (str != null && obj != null) {
            try {
                if (this.f171b.has(str)) {
                    Object obj2 = this.f171b.get(str);
                    if (obj2 instanceof JSONArray) {
                        jSONArray = (JSONArray) obj2;
                    } else {
                        if (!obj.getClass().equals(obj2.getClass())) {
                            obj2 = obj2.toString();
                            obj = obj.toString();
                        }
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(obj2);
                        jSONArray = jSONArray2;
                    }
                    jSONArray.put(obj);
                    this.f171b.put(str, jSONArray);
                    return;
                }
                this.f171b.put(str, obj);
            } catch (JSONException unused) {
            }
        }
    }
}
