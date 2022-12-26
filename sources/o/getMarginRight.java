package o;

import android.net.Uri;
/* loaded from: classes3.dex */
public final class getMarginRight {
    public static boolean valueOf(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    public static boolean toString(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    private static boolean ag$a(Uri uri) {
        return uri.getPathSegments().contains("video");
    }

    public static boolean values(Uri uri) {
        return toString(uri) && ag$a(uri);
    }

    public static boolean valueOf(Uri uri) {
        return toString(uri) && !ag$a(uri);
    }
}
