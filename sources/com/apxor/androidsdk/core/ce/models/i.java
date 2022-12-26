package com.apxor.androidsdk.core.ce.models;

import com.apxor.androidsdk.core.ce.ContextEvaluator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
class i {
    private boolean a = true;

    /* loaded from: classes6.dex */
    class a implements com.apxor.androidsdk.core.ce.e {
        final /* synthetic */ ContextEvaluator a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f256b;

        a(ContextEvaluator contextEvaluator, String str) {
            this.a = contextEvaluator;
            this.f256b = str;
        }

        @Override // com.apxor.androidsdk.core.ce.e
        public void a(double d, String str, String str2, JSONObject jSONObject) {
            this.a.deregisterFromEventFilter(this.f256b, this);
            i.this.a = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(JSONArray jSONArray) {
        int length;
        if (jSONArray != null && (length = jSONArray.length()) >= 1) {
            ContextEvaluator contextEvaluator = ContextEvaluator.getInstance();
            for (int i = 0; i < length; i++) {
                try {
                    String str = "app_event___" + jSONArray.getString(i);
                    contextEvaluator.registerToEventFilter(str, new a(contextEvaluator, str));
                } catch (JSONException unused) {
                    this.a = false;
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.a;
    }
}
