package com.apxor.androidsdk.plugins.realtimeui.i;

import android.text.TextUtils;
import com.apxor.androidsdk.core.ce.ContextEvaluator;
import com.apxor.androidsdk.core.utils.network.ApxorNetworkCallback;
import com.apxor.androidsdk.core.utils.network.NetworkResponse;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class g {
    private static final String a = "g";
    private boolean f;
    private boolean i;
    private String j;
    private int k;
    private int l;
    private int m;
    private int n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f359o;
    private JSONArray p;
    private JSONObject q;
    private String r;
    private String s;
    private JSONObject t;

    /* renamed from: b  reason: collision with root package name */
    private final Pattern f358b = Pattern.compile("(\\[([\\w._\\[\\]]+)===\\(([\\w\\s()._\\-*+$#@!/%^~]+)\\)\\])+");
    private String c = "regular";
    private int d = 16;
    private String e = TtmlNode.BOLD;
    private String g = "#000000";
    private String h = "";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class a implements ApxorNetworkCallback {
        a() {
        }

        @Override // com.apxor.androidsdk.core.utils.network.ApxorNetworkCallback
        public void onComplete(NetworkResponse networkResponse) {
            if (networkResponse.getCode() == 200) {
                try {
                    try {
                        JSONArray jSONArray = new JSONArray(networkResponse.getResponseString());
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("data", jSONArray);
                        g gVar = g.this;
                        gVar.a(jSONObject, gVar.r, false);
                        return;
                    } catch (JSONException unused) {
                        JSONObject jSONObject2 = new JSONObject(networkResponse.getResponseString());
                        g gVar2 = g.this;
                        gVar2.a(jSONObject2, gVar2.r, false);
                        return;
                    }
                } catch (JSONException unused2) {
                }
            }
            g gVar3 = g.this;
            gVar3.a(null, gVar3.r, true);
        }
    }

    private int a(String str, String str2) {
        return Integer.parseInt(str.replace(str2, "").replace("[", "").replace("]", ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject, String str, boolean z) {
        int i;
        if (jSONObject == null && !TextUtils.isEmpty(str)) {
            this.h = str;
            return;
        }
        Matcher matcher = this.f358b.matcher(this.h);
        while (matcher.find() && matcher.groupCount() == 3) {
            String group = matcher.group();
            String group2 = matcher.group(2);
            String group3 = matcher.group(3);
            String str2 = "";
            if (TextUtils.isEmpty(group3)) {
                group3 = "";
            }
            if (!z && jSONObject != null && group2 != null) {
                String trim = group2.trim();
                int length = trim.length();
                JSONObject jSONObject2 = jSONObject;
                while (str2.isEmpty()) {
                    int indexOf = trim.indexOf(".");
                    if (indexOf != -1) {
                        String substring = trim.substring(0, indexOf);
                        if (!substring.contains("[") || !substring.contains("]")) {
                            try {
                                jSONObject2 = jSONObject2.getJSONObject(substring);
                            } catch (JSONException unused) {
                                i = indexOf + 1;
                                if (i >= length) {
                                    break;
                                }
                            }
                        } else {
                            String substring2 = substring.substring(0, substring.indexOf("["));
                            try {
                                jSONObject2 = jSONObject2.getJSONArray(substring2).getJSONObject(a(substring, substring2));
                            } catch (JSONException unused2) {
                                i = indexOf + 1;
                                if (i >= length) {
                                    break;
                                }
                            }
                        }
                        i = indexOf + 1;
                        if (i >= length) {
                            break;
                        }
                        trim = trim.substring(i);
                    } else {
                        str2 = trim;
                    }
                }
                if (!TextUtils.isEmpty(str2) && str2.contains("[") && str2.contains("]")) {
                    String substring3 = str2.substring(0, str2.indexOf("["));
                    try {
                        group3 = jSONObject2.getJSONArray(substring3).optString(a(str2, substring3), group3);
                    } catch (JSONException unused3) {
                    }
                } else {
                    group3 = jSONObject2.optString(str2, group3);
                }
            }
            this.h = this.h.replace(group, group3);
        }
    }

    public String a() {
        return this.j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f8, code lost:
        if (r2.equals("a") == false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(org.json.JSONObject r7) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.plugins.realtimeui.i.g.a(org.json.JSONObject):void");
    }

    public int b() {
        return this.m;
    }

    public String c() {
        return this.g;
    }

    public int d() {
        return this.k;
    }

    public int e() {
        return this.l;
    }

    public int f() {
        return this.n;
    }

    public String g() {
        return this.s;
    }

    public String h() {
        return this.r;
    }

    public String i() {
        return this.c;
    }

    public int j() {
        return this.d;
    }

    public JSONArray k() {
        return this.p;
    }

    public JSONObject l() {
        return this.t;
    }

    public String m() {
        return this.e;
    }

    public String n() {
        return ContextEvaluator.getInstance().replaceAllMacros(this.h);
    }

    public JSONObject o() {
        return this.q;
    }

    public boolean p() {
        return this.f;
    }

    public boolean q() {
        return this.i;
    }

    public boolean r() {
        return this.f359o;
    }
}
