package o;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextUtils;
import com.app.dream11.dream11.DreamApplication;
import com.app.dream11.ui.CustomTypefaceSpan;
import com.sendbird.android.constant.StringSet;
import o.Styleable;
/* loaded from: classes3.dex */
public final class getBStar {
    public static final SpannableString values(Styleable.ArcMotion<? extends SpannableString> arcMotion) {
        runAnimators.ag$a(arcMotion, "func");
        return arcMotion.invoke();
    }

    private static final SpannableString values(CharSequence charSequence, Object obj) {
        SpannableString spannableString;
        if (charSequence instanceof String) {
            spannableString = new SpannableString(charSequence);
        } else {
            spannableString = charSequence instanceof SpannableString ? (SpannableString) charSequence : null;
            if (spannableString == null) {
                spannableString = new SpannableString("");
            }
        }
        spannableString.setSpan(obj, 0, spannableString.length(), 33);
        return spannableString;
    }

    public static final SpannableString toString(SpannableString spannableString, SpannableString spannableString2) {
        runAnimators.ag$a(spannableString, "<this>");
        runAnimators.ag$a(spannableString2, StringSet.s);
        return new SpannableString(TextUtils.concat(spannableString, spannableString2));
    }

    public static final SpannableString ah$a(Context context, CharSequence charSequence) {
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(charSequence, StringSet.s);
        Typeface getm = getM.toString(context, context.getString(com.app.dream11Pro.R.string.res_0x7f12000d));
        runAnimators.ah$a(getm, "get(context, context.get…R.string.D11Font_Medium))");
        return values(charSequence, getm);
    }

    public static final SpannableString ag$a(Context context, CharSequence charSequence) {
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(charSequence, StringSet.s);
        Typeface getm = getM.toString(context, context.getString(com.app.dream11Pro.R.string.res_0x7f12000e));
        runAnimators.ah$a(getm, "get(context, context.get….string.D11Font_Regular))");
        return values(charSequence, getm);
    }

    public static final SpannableString values(CharSequence charSequence, int i) {
        Context valueOf;
        Context valueOf2;
        runAnimators.ag$a(charSequence, StringSet.s);
        valueOf = DreamApplication.valueOf();
        valueOf2 = DreamApplication.valueOf();
        return values(charSequence, new CustomTypefaceSpan("", getM.toString(valueOf, valueOf2.getString(i))));
    }
}
