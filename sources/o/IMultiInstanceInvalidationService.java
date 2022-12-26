package o;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.microsoft.fraudprotection.androidsdk.HttpRequestType;
/* loaded from: classes5.dex */
class IMultiInstanceInvalidationService {
    private final HttpRequestType ag$a;
    private final String ah$a;
    private final InvalidationTracker toString;
    private final String values;

    /* loaded from: classes5.dex */
    public class Default {
        Default() {
        }

        public static void valueOf(String str) {
            toString(str, false);
        }

        public static void toString(String str, boolean z) {
            if (z) {
                Log.d("FraudProtection", str);
            }
        }

        public static void ag$a(String str, Exception exc, boolean z) {
            if (z) {
                if (exc != null) {
                    Log.e("FraudProtection", str + exc.getMessage());
                    return;
                }
                Log.e("FraudProtection", str);
            }
        }

        public static void toString(String str, Exception exc) {
            ag$a(str, exc, false);
        }

        public static void values(String str) {
            ag$a(str, null, true);
        }
    }

    /* loaded from: classes5.dex */
    public interface Stub {
        void toString(String str);

        /* loaded from: classes5.dex */
        class Proxy {
            Proxy() {
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public static boolean ag$a(Context context) {
                return Build.VERSION.SDK_INT < 23 || androidx.core.content.ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public static boolean valueOf(Context context, String str) {
                return Build.VERSION.SDK_INT < 23 || androidx.core.content.ContextCompat.checkSelfPermission(context, str) == 0;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IMultiInstanceInvalidationService(HttpRequestType httpRequestType, String str, String str2, InvalidationTracker invalidationTracker) {
        this.ag$a = httpRequestType;
        this.values = str;
        this.ah$a = str2;
        this.toString = invalidationTracker;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HttpRequestType ah$a() {
        return this.ag$a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String ag$a() {
        return this.values;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String valueOf() {
        return this.ah$a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InvalidationTracker values() {
        return this.toString;
    }
}
