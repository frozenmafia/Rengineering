package o;

import java.util.Locale;
/* loaded from: classes5.dex */
public final class clearAnimationCallbacks {
    public static final String ah$a(char c) {
        String valueOf = String.valueOf(c);
        runAnimators.values((Object) valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(Locale.ROOT);
        runAnimators.ah$a(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (upperCase.length() > 1) {
            if (c == 329) {
                return upperCase;
            }
            char charAt = upperCase.charAt(0);
            runAnimators.values((Object) upperCase, "null cannot be cast to non-null type java.lang.String");
            String substring = upperCase.substring(1);
            runAnimators.ah$a(substring, "this as java.lang.String).substring(startIndex)");
            runAnimators.values((Object) substring, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = substring.toLowerCase(Locale.ROOT);
            runAnimators.ah$a(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return charAt + lowerCase;
        }
        return String.valueOf(Character.toTitleCase(c));
    }
}
