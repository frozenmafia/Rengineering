package o;

import android.text.TextUtils;
/* loaded from: classes5.dex */
public final class computeWindowBoundsQ$window_release {
    private static final String toString = "x";

    public static String[] toString(String str) {
        String str2 = toString;
        putEncryptedObject.valueOf(str2, "Extracting scope string array from " + str);
        return str.contains(com.dreampay.commons.constants.Constants.WHITE_SPACE) ? TextUtils.split(str, com.dreampay.commons.constants.Constants.WHITE_SPACE) : TextUtils.split(str, "\\+");
    }

    public static String values(String[] strArr) {
        return TextUtils.join(com.dreampay.commons.constants.Constants.WHITE_SPACE, strArr);
    }
}
