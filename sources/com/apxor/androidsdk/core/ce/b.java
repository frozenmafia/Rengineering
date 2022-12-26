package com.apxor.androidsdk.core.ce;

import android.content.ContentValues;
import android.os.Build;
import android.os.SystemClock;
import com.apxor.androidsdk.core.SDKController;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class b {
    private final String a = "b";

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentHashMap<String, com.apxor.androidsdk.core.ce.models.d> f224b = new ConcurrentHashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class a implements Comparator<JSONObject> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(JSONObject jSONObject, JSONObject jSONObject2) {
            return Integer.compare(jSONObject.optInt("apx_priority", jSONObject.optInt("prio", Integer.MAX_VALUE)), jSONObject2.optInt("apx_priority", jSONObject2.optInt("prio", Integer.MAX_VALUE)));
        }
    }

    private com.apxor.androidsdk.core.ce.models.d a(JSONObject jSONObject) {
        com.apxor.androidsdk.core.ce.models.d dVar = new com.apxor.androidsdk.core.ce.models.d();
        if (dVar.a(jSONObject)) {
            return dVar;
        }
        return null;
    }

    private void a(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", str4);
            contentValues.put(Constants.UUID, str);
            contentValues.put("pid", str2);
            contentValues.put(easypay.manager.Constants.EXTRA_MID, str3);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(jSONObject.toString().getBytes("UTF-16"));
            gZIPOutputStream.flush();
            gZIPOutputStream.close();
            contentValues.put(easypay.manager.Constants.EASY_PAY_CONFIG_PREF_KEY, byteArrayOutputStream.toByteArray());
            ContextEvaluator.getInstance().a(contentValues);
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        for (Map.Entry<String, com.apxor.androidsdk.core.ce.models.d> entry : this.f224b.entrySet()) {
            entry.getValue().e();
        }
        this.f224b.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        if (this.f224b.containsKey(str)) {
            com.apxor.androidsdk.core.ce.models.d dVar = this.f224b.get(str);
            dVar.b(str);
            String c = dVar.c();
            SDKController sDKController = SDKController.getInstance();
            sDKController.putLong(c + "_last_ses", sDKController.getLong(com.apxor.androidsdk.core.Constants.SESSION_ID, -1L));
            sDKController.putLong(c + "_last_ts", SystemClock.elapsedRealtime());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, int i, int i2) {
        if (this.f224b.containsKey(str)) {
            this.f224b.get(str).a(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        for (com.apxor.androidsdk.core.ce.models.d dVar : this.f224b.values()) {
            dVar.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("type", null);
            String optString2 = jSONObject.optString("at", null);
            JSONArray jSONArray = jSONObject.getJSONArray(Constants.CONFIGS);
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(jSONArray.getJSONObject(i));
            }
            if (Build.VERSION.SDK_INT >= 19) {
                Collections.sort(arrayList, new a());
            }
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObject2 = (JSONObject) arrayList.get(i2);
                String string = jSONObject2.getString("_id");
                String string2 = jSONObject2.getString("pid");
                String string3 = jSONObject2.getString(easypay.manager.Constants.EXTRA_MID);
                com.apxor.androidsdk.core.ce.models.d a2 = a(jSONObject2);
                if (a2 != null) {
                    a2.a(optString2);
                    this.f224b.put(string, a2);
                }
                if (optString != null) {
                    a(string, string2, string3, optString, jSONObject2);
                }
            }
        } catch (Exception e) {
            SDKController.getInstance().logException("p_conf", e);
        }
    }
}
