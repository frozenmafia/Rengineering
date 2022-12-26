package com.apxor.androidsdk.plugins.survey;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.apxor.androidsdk.core.SDKController;
import com.apxor.androidsdk.core.ce.Constants;
import com.apxor.androidsdk.core.ce.ContextEvaluator;
import com.apxor.androidsdk.core.utils.Logger;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class d {
    private static final String c = "d";
    private static boolean d;
    private final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<String, JSONObject> f377b = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class a implements Runnable {
        final /* synthetic */ Activity a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f378b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;

        a(d dVar, Activity activity, String str, String str2, String str3) {
            this.a = activity;
            this.f378b = str;
            this.c = str2;
            this.d = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Intent intent = new Intent(this.a, SurveyActivity.class);
                intent.putExtra("uiJson", this.f378b);
                intent.putExtra(Constants.UUID, this.c);
                intent.putExtra("name", this.d);
                intent.putExtra("flags", this.a.getWindow().getDecorView().getSystemUiVisibility());
                intent.putExtra("window_flags", this.a.getWindow().getAttributes().flags);
                this.a.startActivity(intent);
            } catch (Exception e) {
                SDKController.getInstance().logException("a_base", e);
            }
        }
    }

    public static int a(double d2, double d3) {
        return (int) (d3 / (d2 / 160.0d));
    }

    public static int a(String str, int i) {
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return i;
        }
    }

    public static void a(int i, GradientDrawable gradientDrawable) {
        gradientDrawable.setColor(i);
    }

    public static void a(int i, VectorDrawable vectorDrawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            vectorDrawable.setTint(i);
        }
    }

    public static void a(int i, View view) {
        view.setBackgroundColor(i);
    }

    public static void a(int i, ImageView imageView) {
        imageView.setColorFilter(i);
    }

    public static void a(int i, TextView textView) {
        textView.setTextColor(i);
    }

    private void a(Activity activity, String str, String str2, String str3, long j) {
        SDKController.getInstance().dispatchToMainThread(new a(this, activity, str, str2, str3), j);
    }

    public static void a(Context context, TextView textView) {
        try {
            ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(textView.getWindowToken(), 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(boolean z) {
        d = z;
        ContextEvaluator.getInstance().setIsActionBeingShown(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r3 == 1) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(java.lang.String r8, org.json.JSONObject r9) {
        /*
            r7 = this;
            r0 = 0
            java.lang.String r1 = "meta"
            org.json.JSONObject r1 = r9.getJSONObject(r1)     // Catch: org.json.JSONException -> L51
            java.lang.String r2 = "name"
            java.lang.String r2 = r1.getString(r2)     // Catch: org.json.JSONException -> L51
            java.lang.String r3 = "type"
            java.lang.String r1 = r1.getString(r3)     // Catch: org.json.JSONException -> L51
            r3 = -1
            int r4 = r1.hashCode()     // Catch: org.json.JSONException -> L51
            r5 = -1837720742(0xffffffff92769b5a, float:-7.78154E-28)
            r6 = 1
            if (r4 == r5) goto L2e
            r5 = 591125381(0x233bdb85, float:1.0183775E-17)
            if (r4 == r5) goto L24
            goto L37
        L24:
            java.lang.String r4 = "FEEDBACK"
            boolean r1 = r1.equals(r4)     // Catch: org.json.JSONException -> L51
            if (r1 == 0) goto L37
            r3 = 1
            goto L37
        L2e:
            java.lang.String r4 = "SURVEY"
            boolean r1 = r1.equals(r4)     // Catch: org.json.JSONException -> L51
            if (r1 == 0) goto L37
            r3 = 0
        L37:
            if (r3 == 0) goto L3c
            if (r3 == r6) goto L3c
            goto L50
        L3c:
            java.util.HashMap<java.lang.String, org.json.JSONObject> r1 = r7.f377b     // Catch: org.json.JSONException -> L51
            com.apxor.androidsdk.plugins.survey.a r3 = new com.apxor.androidsdk.plugins.survey.a     // Catch: org.json.JSONException -> L51
            java.lang.String r4 = "ui"
            org.json.JSONObject r9 = r9.getJSONObject(r4)     // Catch: org.json.JSONException -> L51
            java.lang.String r9 = r9.toString()     // Catch: org.json.JSONException -> L51
            r3.<init>(r9, r8, r2)     // Catch: org.json.JSONException -> L51
            r1.put(r8, r3)     // Catch: org.json.JSONException -> L51
        L50:
            return r6
        L51:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.plugins.survey.d.a(java.lang.String, org.json.JSONObject):boolean");
    }

    public static int b(double d2, double d3) {
        return (int) (d3 * (d2 / 160.0d));
    }

    public static void b(Context context, TextView textView) {
        try {
            ((InputMethodManager) context.getSystemService("input_method")).showSoftInput(textView, 2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(Constants.CONFIGS);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String string = jSONObject2.getString("_id");
                if (!this.f377b.containsKey(string) && !a(string, jSONObject2)) {
                    String str = c;
                    Logger.w(str, "Failed to parseConfig config item: " + string);
                }
            }
        } catch (JSONException e) {
            SDKController.getInstance().logException("fsp_pc", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(JSONObject jSONObject) {
        if (ContextEvaluator.getInstance().isActionBeingShown() || d) {
            Logger.e(c, "An action is already being shown", null);
            return;
        }
        ContextEvaluator.getInstance().setIsActionBeingShown(true);
        synchronized (this.a) {
            String optString = jSONObject.optString(Constants.UUID, null);
            if (TextUtils.isEmpty(optString)) {
                a(false);
                return;
            }
            Activity currentActivity = ContextEvaluator.getInstance().getCurrentActivity();
            if (this.f377b.containsKey(optString) && currentActivity != null) {
                com.apxor.androidsdk.plugins.survey.a aVar = (com.apxor.androidsdk.plugins.survey.a) this.f377b.get(optString);
                int f = aVar.f();
                int c2 = b.b().c();
                if (f > 0 && c2 < f) {
                    Logger.e(c, "Minimum version check failed", null);
                    a(false);
                } else if (aVar.h().size() > 0) {
                    a(true);
                    a(currentActivity, aVar.toString(), aVar.j(), aVar.g(), aVar.c());
                }
            }
        }
    }
}
