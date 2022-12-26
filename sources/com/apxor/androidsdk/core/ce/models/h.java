package com.apxor.androidsdk.core.ce.models;

import com.apxor.androidsdk.core.ce.Constants;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes3.dex */
class h {
    private static final String a = "h";

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f255b;
    private JSONObject c;
    private JSONArray d;
    private boolean e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("overall_cfg");
        if (optJSONObject != null) {
            this.e = true;
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("ret_day");
            this.f255b = optJSONObject2;
            if (optJSONObject2 == null) {
                optJSONObject2 = new JSONObject();
            }
            this.f255b = optJSONObject2;
            JSONObject optJSONObject3 = optJSONObject.optJSONObject(Constants.SESSION_ATTR);
            this.c = optJSONObject3;
            if (optJSONObject3 == null) {
                optJSONObject3 = new JSONObject();
            }
            this.c = optJSONObject3;
            JSONArray optJSONArray = optJSONObject.optJSONArray(com.apxor.androidsdk.core.Constants.EVENTS_TABLE);
            this.d = optJSONArray;
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            this.d = optJSONArray;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f8, code lost:
        if (r14 <= r12) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0116 A[LOOP:0: B:28:0x0081->B:70:0x0116, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ff A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a() {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.core.ce.models.h.a():boolean");
    }
}
