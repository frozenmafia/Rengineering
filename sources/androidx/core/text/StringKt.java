package androidx.core.text;

import android.text.TextUtils;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class StringKt {
    public static final String htmlEncode(String str) {
        runAnimators.ag$a(str, "<this>");
        String htmlEncode = TextUtils.htmlEncode(str);
        runAnimators.ah$a(htmlEncode, "htmlEncode(this)");
        return htmlEncode;
    }
}
