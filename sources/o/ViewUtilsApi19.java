package o;

import o.ViewUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class ViewUtilsApi19 extends ViewUtils.AnonymousClass1 {
    public static final int values(char c) {
        int transformmatrixtolocal = transformMatrixToLocal.toString(c, 10);
        if (transformmatrixtolocal >= 0) {
            return transformmatrixtolocal;
        }
        throw new IllegalArgumentException("Char " + c + " is not a decimal digit");
    }

    public static final String valueOf(char c) {
        return clearAnimationCallbacks.ah$a(c);
    }

    public static final boolean values(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (z) {
            char upperCase = Character.toUpperCase(c);
            char upperCase2 = Character.toUpperCase(c2);
            return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
        }
        return false;
    }
}
