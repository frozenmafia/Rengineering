package com.nimbusds.jose.shaded.json;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import o.QueryInterceptorDatabase$$ExternalSyntheticLambda0;
import o.QueryInterceptorDatabase$$ExternalSyntheticLambda7;
import o.lambda$endTransaction$4$androidxroomQueryInterceptorDatabase;
import o.lambda$query$6$androidxroomQueryInterceptorDatabase;
import o.lambda$query$8$androidxroomQueryInterceptorDatabase;
import o.lambda$setTransactionSuccessful$5$androidxroomQueryInterceptorDatabase;
/* loaded from: classes7.dex */
public class JSONObject extends HashMap<String, Object> implements lambda$query$6$androidxroomQueryInterceptorDatabase, lambda$endTransaction$4$androidxroomQueryInterceptorDatabase, lambda$query$8$androidxroomQueryInterceptorDatabase {
    private static final long serialVersionUID = -503443796854799292L;

    public JSONObject() {
    }

    public static String escape(String str) {
        return lambda$setTransactionSuccessful$5$androidxroomQueryInterceptorDatabase.valueOf(str);
    }

    public static String toJSONString(Map<String, ? extends Object> map) {
        return toJSONString(map, lambda$setTransactionSuccessful$5$androidxroomQueryInterceptorDatabase.toString);
    }

    public static String toJSONString(Map<String, ? extends Object> map, QueryInterceptorDatabase$$ExternalSyntheticLambda0 queryInterceptorDatabase$$ExternalSyntheticLambda0) {
        StringBuilder sb = new StringBuilder();
        try {
            writeJSON(map, sb, queryInterceptorDatabase$$ExternalSyntheticLambda0);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public JSONObject(Map<String, ?> map) {
        super(map);
    }

    public static void writeJSON(Map<String, Object> map, Appendable appendable) throws IOException {
        writeJSON(map, appendable, lambda$setTransactionSuccessful$5$androidxroomQueryInterceptorDatabase.toString);
    }

    public static void writeJSON(Map<String, ? extends Object> map, Appendable appendable, QueryInterceptorDatabase$$ExternalSyntheticLambda0 queryInterceptorDatabase$$ExternalSyntheticLambda0) throws IOException {
        if (map == null) {
            appendable.append("null");
        } else {
            QueryInterceptorDatabase$$ExternalSyntheticLambda7.valueOf.toString(map, appendable, queryInterceptorDatabase$$ExternalSyntheticLambda0);
        }
    }

    @Override // o.QueryInterceptorDatabase$$ExternalSyntheticLambda1
    public void writeJSONString(Appendable appendable) throws IOException {
        writeJSON(this, appendable, lambda$setTransactionSuccessful$5$androidxroomQueryInterceptorDatabase.toString);
    }

    @Override // o.lambda$query$8$androidxroomQueryInterceptorDatabase
    public void writeJSONString(Appendable appendable, QueryInterceptorDatabase$$ExternalSyntheticLambda0 queryInterceptorDatabase$$ExternalSyntheticLambda0) throws IOException {
        writeJSON(this, appendable, queryInterceptorDatabase$$ExternalSyntheticLambda0);
    }

    public void merge(Object obj) {
        merge(this, obj);
    }

    protected static JSONObject merge(JSONObject jSONObject, Object obj) {
        if (obj == null) {
            return jSONObject;
        }
        if (obj instanceof JSONObject) {
            return merge(jSONObject, (JSONObject) obj);
        }
        throw new RuntimeException("JSON megre can not merge JSONObject with " + obj.getClass());
    }

    private static JSONObject merge(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            return jSONObject;
        }
        for (String str : jSONObject.keySet()) {
            Object obj = jSONObject.get(str);
            Object obj2 = jSONObject2.get(str);
            if (obj2 != null) {
                if (obj instanceof JSONArray) {
                    jSONObject.put(str, merge((JSONArray) obj, obj2));
                } else if (obj instanceof JSONObject) {
                    jSONObject.put(str, merge((JSONObject) obj, obj2));
                } else if (!obj.equals(obj2)) {
                    if (obj.getClass().equals(obj2.getClass())) {
                        throw new RuntimeException("JSON merge can not merge two " + obj.getClass().getName() + " Object together");
                    }
                    throw new RuntimeException("JSON merge can not merge " + obj.getClass().getName() + " with " + obj2.getClass().getName());
                }
            }
        }
        for (String str2 : jSONObject2.keySet()) {
            if (!jSONObject.containsKey(str2)) {
                jSONObject.put(str2, jSONObject2.get(str2));
            }
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static JSONArray merge(JSONArray jSONArray, Object obj) {
        if (obj == null) {
            return jSONArray;
        }
        if (jSONArray instanceof JSONArray) {
            return merge(jSONArray, (JSONArray) obj);
        }
        jSONArray.add(obj);
        return jSONArray;
    }

    private static JSONArray merge(JSONArray jSONArray, JSONArray jSONArray2) {
        jSONArray.addAll(jSONArray2);
        return jSONArray;
    }

    @Override // o.lambda$query$6$androidxroomQueryInterceptorDatabase
    public String toJSONString() {
        return toJSONString(this, lambda$setTransactionSuccessful$5$androidxroomQueryInterceptorDatabase.toString);
    }

    @Override // o.lambda$endTransaction$4$androidxroomQueryInterceptorDatabase
    public String toJSONString(QueryInterceptorDatabase$$ExternalSyntheticLambda0 queryInterceptorDatabase$$ExternalSyntheticLambda0) {
        return toJSONString(this, queryInterceptorDatabase$$ExternalSyntheticLambda0);
    }

    public String toString(QueryInterceptorDatabase$$ExternalSyntheticLambda0 queryInterceptorDatabase$$ExternalSyntheticLambda0) {
        return toJSONString(this, queryInterceptorDatabase$$ExternalSyntheticLambda0);
    }

    @Override // java.util.AbstractMap
    public String toString() {
        return toJSONString(this, lambda$setTransactionSuccessful$5$androidxroomQueryInterceptorDatabase.toString);
    }
}
