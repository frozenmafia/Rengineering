package o;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
/* loaded from: classes2.dex */
public class parseMenu {
    public static String valueOf(int i, int i2) {
        if (i == 1) {
            return "WIFI";
        }
        if (i == 0) {
            switch (i2) {
                case 1:
                    return "GPRS";
                case 2:
                    return "EDGE";
                case 3:
                    return "UMTS";
                case 4:
                    return "CDMA";
                case 5:
                    return "EVDO_0";
                case 6:
                    return "EVDO_A";
                case 7:
                    return "1xRTT";
                case 8:
                    return "HSDPA";
                case 9:
                    return "HSUPA";
                case 10:
                    return "HSPA";
                case 11:
                    return "IDEN";
                case 12:
                    return "EVDO_B";
                case 13:
                    return com.apxor.androidsdk.core.ce.Constants.LTE;
                case 14:
                    return "EHRPD";
                case 15:
                    return "HSPAP";
                default:
                    return "";
            }
        }
        return "";
    }

    public static NetworkInfo ag$a(Context context) {
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
    }

    public static String valueOf(Context context) {
        NetworkInfo ag$a = ag$a(context);
        return ag$a != null ? valueOf(ag$a.getType(), ag$a.getSubtype()) : "";
    }
}
