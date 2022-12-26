package o;

import o.Visibility;
/* loaded from: classes.dex */
public class WindowIdApi14 extends getViewX {
    public static final Float valueOf(String str) {
        runAnimators.ag$a(str, "<this>");
        try {
            if (Visibility.AnonymousClass1.ag$a.matches(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    public static final Double values(String str) {
        runAnimators.ag$a(str, "<this>");
        try {
            if (Visibility.AnonymousClass1.ag$a.matches(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}
