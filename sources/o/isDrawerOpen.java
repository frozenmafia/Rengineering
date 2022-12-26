package o;

import kotlin.text.Regex;
/* loaded from: classes4.dex */
public final class isDrawerOpen {
    public static final String valueOf(String str) {
        runAnimators.ag$a(str, "<this>");
        String lowerCase = new Regex("([a-z])([A-Z]+)").replace(str, "$1-$2").toLowerCase();
        runAnimators.ah$a(lowerCase, "this as java.lang.String).toLowerCase()");
        return lowerCase;
    }
}
