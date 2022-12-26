package o;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
/* loaded from: classes3.dex */
public final class getClipBounds {
    public static final getFallback toString(Context context, String str, float f, Float f2) {
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(str, "text");
        getFallback getfallback = new getFallback(context, context.getResources().getDisplayMetrics().widthPixels);
        SpannableString spannableString = new SpannableString(androidx.emoji.text.EmojiCompat.get().process(str));
        runAnimators.ag$a(spannableString, "spannable");
        Spannable spannable = getfallback.ag$a;
        if (spannable == null || !runAnimators.values(spannable, spannableString)) {
            getfallback.ag$a = spannableString;
            getfallback.ag$a();
            getfallback.invalidateSelf();
        }
        getfallback.ah$a.setTextSize(f);
        getfallback.ag$a();
        getfallback.invalidateSelf();
        if (f2 != null) {
            float floatValue = f2.floatValue();
            if (floatValue > -30.0f && floatValue < 30.0f) {
                getfallback.HaptikSDK$c = floatValue;
                getfallback.ag$a();
                getfallback.invalidateSelf();
            }
        }
        return getfallback;
    }
}
