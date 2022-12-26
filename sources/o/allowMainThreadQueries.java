package o;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import java.net.URLEncoder;
/* loaded from: classes5.dex */
public class allowMainThreadQueries {
    public static String values(Bundle bundle) {
        String stringBuffer;
        synchronized (allowMainThreadQueries.class) {
            try {
                valueOf("Extracting Strings from Bundle...");
                boolean z = true;
                StringBuffer stringBuffer2 = new StringBuffer();
                for (String str : bundle.keySet()) {
                    if (z) {
                        z = false;
                    } else {
                        stringBuffer2.append("&");
                    }
                    stringBuffer2.append(URLEncoder.encode(str, "UTF-8"));
                    stringBuffer2.append("=");
                    stringBuffer2.append(URLEncoder.encode(bundle.getString(str), "UTF-8"));
                }
                valueOf("URL encoded String is " + stringBuffer2.toString());
                stringBuffer = stringBuffer2.toString();
            } catch (Exception e) {
                toString(e);
                return null;
            }
        }
        return stringBuffer;
    }

    public static void valueOf(String str) {
        synchronized (allowMainThreadQueries.class) {
            RoomDatabase$$ExternalSyntheticLambda1.ag$a("PGSDK", str);
        }
    }

    public static void toString(Exception exc) {
        synchronized (allowMainThreadQueries.class) {
            exc.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean ah$a(Context context) {
        synchronized (allowMainThreadQueries.class) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return false;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            return activeNetworkInfo.isConnected();
        }
    }
}
