package o;

import android.content.Context;
import android.os.Build;
import android.text.Html;
import com.clevertap.android.pushtemplates.TemplateRenderer;
import o.getContentChangeTypes;
/* loaded from: classes3.dex */
public final class addSpanLocationToExtras extends getEnabledAccessibilityServiceList {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public addSpanLocationToExtras(Context context, TemplateRenderer templateRenderer) {
        super(context, getContentChangeTypes$ah$a.zero_bezel, templateRenderer);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(templateRenderer, "renderer");
        values();
        HaptikSDK$a(templateRenderer.ICustomTabsCallback$Stub$Proxy());
        ag$a(templateRenderer.ICustomTabsCallback());
        ah$b(templateRenderer.ICustomTabsCallback$Default());
        HaptikSDK$c(templateRenderer.extraCommand());
        ah$a(templateRenderer.getSignupData());
        valueOf(templateRenderer.extraCallbackWithResult());
        invoke(templateRenderer.HaptikSDK$d());
        invoke();
    }

    private final void ah$b(String str) {
        if (str != null) {
            if (str.length() > 0) {
                if (Build.VERSION.SDK_INT >= 24) {
                    ag$a().setTextViewText(getContentChangeTypes.values.msg, Html.fromHtml(str, 0));
                } else {
                    ag$a().setTextViewText(getContentChangeTypes.values.msg, Html.fromHtml(str));
                }
            }
        }
    }

    private final void invoke(String str) {
        if (str != null) {
            if (str.length() > 0) {
                getRecordCount.toString(getContentChangeTypes.values.big_image, str, ag$a());
                if (getRecordCount.values()) {
                    ag$a().setViewVisibility(getContentChangeTypes.values.big_image, 8);
                    return;
                }
                return;
            }
        }
        ag$a().setViewVisibility(getContentChangeTypes.values.big_image, 8);
    }
}
