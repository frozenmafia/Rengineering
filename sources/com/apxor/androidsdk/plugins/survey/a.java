package com.apxor.androidsdk.plugins.survey;

import com.apxor.androidsdk.plugins.survey.e.e;
import com.apxor.androidsdk.plugins.survey.e.f;
import com.apxor.androidsdk.plugins.survey.e.g;
import com.apxor.androidsdk.plugins.survey.e.h;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class a extends JSONObject {
    private String a;

    /* renamed from: b  reason: collision with root package name */
    private String f374b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.apxor.androidsdk.plugins.survey.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C0278a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.apxor.androidsdk.plugins.survey.e.a.values().length];
            a = iArr;
            try {
                iArr[com.apxor.androidsdk.plugins.survey.e.a.single_choice.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[com.apxor.androidsdk.plugins.survey.e.a.multi_choice.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[com.apxor.androidsdk.plugins.survey.e.a.rating.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[com.apxor.androidsdk.plugins.survey.e.a.text.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[com.apxor.androidsdk.plugins.survey.e.a.yes_or_no.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[com.apxor.androidsdk.plugins.survey.e.a.unknown.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public a(String str, String str2, String str3) {
        super(str);
        this.a = str2;
        this.f374b = str3;
    }

    public boolean a() {
        return optBoolean("enable_dim_bg", true);
    }

    public boolean b() {
        return optBoolean("enable_full_screen", false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long c() {
        return optLong("delay", 500L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JSONObject d() {
        return optJSONObject("dialog_config");
    }

    public String e() {
        return optString("layout_type", "full_scr");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return optInt("min_version", -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String g() {
        return this.f374b;
    }

    public List<com.apxor.androidsdk.plugins.survey.e.d> h() {
        com.apxor.androidsdk.plugins.survey.e.d fVar;
        JSONArray jSONArray = getJSONArray("questions");
        int length = jSONArray.length();
        if (length >= 1) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                int i2 = C0278a.a[com.apxor.androidsdk.plugins.survey.e.a.a(jSONObject.getString("answer_mode")).ordinal()];
                if (i2 == 1) {
                    fVar = new f(jSONObject.toString());
                    fVar.a(k());
                } else if (i2 == 2) {
                    fVar = new com.apxor.androidsdk.plugins.survey.e.c(jSONObject.toString());
                } else if (i2 == 3) {
                    fVar = new e(jSONObject.toString());
                } else if (i2 == 4) {
                    fVar = new g(jSONObject.toString());
                } else if (i2 == 5) {
                    fVar = new h(jSONObject.toString());
                }
                if (fVar.f()) {
                    arrayList.add(fVar);
                }
            }
            return arrayList;
        }
        throw new JSONException("At least 1 question is required");
    }

    public String i() {
        return optString("success_message", "Survey completed.");
    }

    public String j() {
        return this.a;
    }

    public boolean k() {
        return optBoolean("is_response_based_survey", false);
    }

    public boolean l() {
        return optBoolean("show_success_message", false);
    }
}
