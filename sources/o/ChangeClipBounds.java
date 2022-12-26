package o;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import o.MediaControllerCompat;
/* loaded from: classes5.dex */
public interface ChangeClipBounds extends IInterface {

    /* renamed from: o.ChangeClipBounds$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final class AnonymousClass1 {
        static final /* synthetic */ boolean toString = true;
        private static final String values = "j";

        private String ag$a(String str, Context context) {
            String str2 = values;
            putEncryptedObject.valueOf(str2, "Finding API Key for " + str);
            if (toString || str != null) {
                return values(context, str).ah$a();
            }
            throw new AssertionError();
        }

        private ag ah$a(String str, Context context) {
            String str2 = values;
            putEncryptedObject.valueOf(str2, "getAppInfoFromAPIKey : packageName=" + str);
            if (str == null) {
                putEncryptedObject.toString(str2, "packageName can't be null!");
                return null;
            }
            return ChangeClipBounds$1$ag$a.ah$a(str, ag$a(str, context), context);
        }

        private MediaControllerCompat.MediaControllerImplApi21.ExtraCallback values(Context context, String str) {
            return new MediaControllerCompat.MediaControllerImplApi21.ExtraCallback(context, str);
        }

        private boolean values(String str, Context context) {
            String str2 = values;
            putEncryptedObject.valueOf(str2, "isAPIKeyValid : packageName=" + str);
            if (str != null) {
                return toString(str, context) != null;
            }
            putEncryptedObject.toString(str2, "packageName can't be null!");
            return false;
        }

        public String ag$a(Context context) {
            return "amzn://" + context.getPackageName();
        }

        public ag toString(String str, Context context) {
            String str2 = values;
            putEncryptedObject.valueOf(str2, "getAppInfo : packageName=" + str);
            return ah$a(str, context);
        }

        public boolean toString(Context context) {
            if (context == null) {
                putEncryptedObject.toString(values, "context can't be null!");
                return false;
            }
            return values(context.getPackageName(), context);
        }
    }

    String toString(String str, String str2, String str3) throws RemoteException;
}
