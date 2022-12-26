package o;

import android.content.Context;
/* loaded from: classes5.dex */
public class RoomSQLiteQuery {
    public static void ag$a(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b2 = bArr[i];
            bArr[i] = bArr[(bArr.length - i) - 1];
            bArr[(bArr.length - i) - 1] = b2;
        }
    }

    public static boolean toString(Context context) {
        return androidx.core.content.ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_WIFI_STATE") == 0;
    }
}
