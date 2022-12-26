package androidx.core.text;

import android.text.TextUtils;
import java.util.Locale;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class LocaleKt {
    public static final int getLayoutDirection(Locale locale) {
        runAnimators.ag$a(locale, "<this>");
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
