package o;

import android.content.Context;
import android.os.Build;
import android.text.Html;
import android.widget.RemoteViews;
import com.clevertap.android.pushtemplates.TemplateRenderer;
import o.getContentChangeTypes;
/* loaded from: classes3.dex */
public class getEnabledAccessibilityServiceList {
    private TemplateRenderer ag$a;
    private RemoteViews toString;
    private Context valueOf;

    public getEnabledAccessibilityServiceList(Context context, int i, TemplateRenderer templateRenderer) {
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(templateRenderer, "renderer");
        this.valueOf = context;
        this.ag$a = templateRenderer;
        this.toString = new RemoteViews(this.valueOf.getPackageName(), i);
    }

    public final Context valueOf() {
        return this.valueOf;
    }

    public final TemplateRenderer ah$a() {
        return this.ag$a;
    }

    public final RemoteViews ag$a() {
        return this.toString;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void values() {
        /*
            r5 = this;
            android.widget.RemoteViews r0 = r5.toString
            int r1 = o.getContentChangeTypes.values.app_name
            android.content.Context r2 = r5.valueOf
            java.lang.String r2 = o.getRecordCount.valueOf(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setTextViewText(r1, r2)
            android.widget.RemoteViews r0 = r5.toString
            int r1 = o.getContentChangeTypes.values.timestamp
            android.content.Context r2 = r5.valueOf
            java.lang.String r2 = o.getRecordCount.HaptikSDK$b(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setTextViewText(r1, r2)
            com.clevertap.android.pushtemplates.TemplateRenderer r0 = r5.ag$a
            java.lang.String r0 = r0.ICustomTabsCallback$Stub()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L6c
            com.clevertap.android.pushtemplates.TemplateRenderer r0 = r5.ag$a
            java.lang.String r0 = r0.ICustomTabsCallback$Stub()
            o.runAnimators.toString(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L3b
            r0 = 1
            goto L3c
        L3b:
            r0 = 0
        L3c:
            if (r0 == 0) goto L6c
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r0 < r3) goto L58
            android.widget.RemoteViews r0 = r5.toString
            int r3 = o.getContentChangeTypes.values.subtitle
            com.clevertap.android.pushtemplates.TemplateRenderer r4 = r5.ag$a
            java.lang.String r4 = r4.ICustomTabsCallback$Stub()
            android.text.Spanned r4 = android.text.Html.fromHtml(r4, r2)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r0.setTextViewText(r3, r4)
            goto L7c
        L58:
            android.widget.RemoteViews r0 = r5.toString
            int r3 = o.getContentChangeTypes.values.subtitle
            com.clevertap.android.pushtemplates.TemplateRenderer r4 = r5.ag$a
            java.lang.String r4 = r4.ICustomTabsCallback$Stub()
            android.text.Spanned r4 = android.text.Html.fromHtml(r4)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r0.setTextViewText(r3, r4)
            goto L7c
        L6c:
            android.widget.RemoteViews r0 = r5.toString
            int r3 = o.getContentChangeTypes.values.subtitle
            r4 = 8
            r0.setViewVisibility(r3, r4)
            android.widget.RemoteViews r0 = r5.toString
            int r3 = o.getContentChangeTypes.values.sep_subtitle
            r0.setViewVisibility(r3, r4)
        L7c:
            com.clevertap.android.pushtemplates.TemplateRenderer r0 = r5.ag$a
            java.lang.String r0 = r0.ak$b()
            if (r0 == 0) goto Ld1
            com.clevertap.android.pushtemplates.TemplateRenderer r0 = r5.ag$a
            java.lang.String r0 = r0.ak$b()
            o.runAnimators.toString(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L96
            goto L97
        L96:
            r1 = 0
        L97:
            if (r1 == 0) goto Ld1
            android.widget.RemoteViews r0 = r5.toString
            int r1 = o.getContentChangeTypes.values.app_name
            com.clevertap.android.pushtemplates.TemplateRenderer r2 = r5.ag$a
            java.lang.String r2 = r2.ak$b()
            java.lang.String r3 = "#A6A6A6"
            int r2 = o.getRecordCount.ag$a(r2, r3)
            r0.setTextColor(r1, r2)
            android.widget.RemoteViews r0 = r5.toString
            int r1 = o.getContentChangeTypes.values.timestamp
            com.clevertap.android.pushtemplates.TemplateRenderer r2 = r5.ag$a
            java.lang.String r2 = r2.ak$b()
            int r2 = o.getRecordCount.ag$a(r2, r3)
            r0.setTextColor(r1, r2)
            android.widget.RemoteViews r0 = r5.toString
            int r1 = o.getContentChangeTypes.values.subtitle
            com.clevertap.android.pushtemplates.TemplateRenderer r2 = r5.ag$a
            java.lang.String r2 = r2.ak$b()
            int r2 = o.getRecordCount.ag$a(r2, r3)
            r0.setTextColor(r1, r2)
            r5.HaptikSDK$a()
        Ld1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getEnabledAccessibilityServiceList.values():void");
    }

    private final void HaptikSDK$a() {
        try {
            this.ag$a.values(this.valueOf.getResources().getIdentifier("pt_dot_sep", "drawable", this.valueOf.getPackageName()));
            TemplateRenderer templateRenderer = this.ag$a;
            templateRenderer.valueOf(getRecordCount.values(this.valueOf, templateRenderer.aj$a(), this.ag$a.ak$b()));
        } catch (NullPointerException unused) {
            asRecord.toString("NPE while setting dot sep color");
        }
    }

    public final void HaptikSDK$a(String str) {
        if (str != null) {
            if (str.length() > 0) {
                if (Build.VERSION.SDK_INT >= 24) {
                    this.toString.setTextViewText(getContentChangeTypes.values.title, Html.fromHtml(str, 0));
                } else {
                    this.toString.setTextViewText(getContentChangeTypes.values.title, Html.fromHtml(str));
                }
            }
        }
    }

    public final void ag$a(String str) {
        if (str != null) {
            if (str.length() > 0) {
                if (Build.VERSION.SDK_INT >= 24) {
                    this.toString.setTextViewText(getContentChangeTypes.values.msg, Html.fromHtml(str, 0));
                } else {
                    this.toString.setTextViewText(getContentChangeTypes.values.msg, Html.fromHtml(str));
                }
            }
        }
    }

    public final void toString(String str) {
        if (str != null) {
            if (str.length() > 0) {
                this.toString.setInt(getContentChangeTypes.values.content_view_small, "setBackgroundColor", getRecordCount.ag$a(str, "#FFFFFF"));
            }
        }
    }

    public final void HaptikSDK$c(String str) {
        if (str != null) {
            if (str.length() > 0) {
                this.toString.setTextColor(getContentChangeTypes.values.title, getRecordCount.ag$a(str, "#000000"));
            }
        }
    }

    public final void valueOf(String str) {
        if (str != null) {
            if (str.length() > 0) {
                this.toString.setTextColor(getContentChangeTypes.values.msg, getRecordCount.ag$a(str, "#000000"));
            }
        }
    }

    public final void invoke() {
        if (this.ag$a.asInterface() != null) {
            getRecordCount.ah$a(getContentChangeTypes.values.small_icon, this.ag$a.asInterface(), this.toString);
        } else {
            getRecordCount.values(getContentChangeTypes.values.small_icon, this.ag$a.getInterfaceDescriptor(), this.toString);
        }
    }

    public final void values(String str) {
        if (str != null) {
            if (str.length() > 0) {
                getRecordCount.toString(getContentChangeTypes.values.large_icon, str, this.toString);
                return;
            }
        }
        this.toString.setViewVisibility(getContentChangeTypes.values.large_icon, 8);
    }

    public final void ah$a(String str) {
        if (str != null) {
            if (str.length() > 0) {
                this.toString.setInt(getContentChangeTypes.values.content_view_big, "setBackgroundColor", getRecordCount.ag$a(str, "#FFFFFF"));
            }
        }
    }
}
