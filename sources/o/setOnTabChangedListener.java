package o;

import android.content.Context;
import java.io.File;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
/* loaded from: classes4.dex */
public class setOnTabChangedListener {
    private static getTabInfoForTag toString;
    private static OkHttpClient valueOf;

    public static OkHttpClient ag$a() {
        if (valueOf == null) {
            valueOf = values();
        }
        return valueOf;
    }

    public static OkHttpClient values() {
        getTabInfoForTag gettabinfofortag = toString;
        if (gettabinfofortag != null) {
            return gettabinfofortag.ag$a();
        }
        return ah$a().build();
    }

    public static OkHttpClient values(Context context) {
        getTabInfoForTag gettabinfofortag = toString;
        if (gettabinfofortag != null) {
            return gettabinfofortag.ag$a();
        }
        return toString(context).build();
    }

    public static OkHttpClient.Builder ah$a() {
        return new OkHttpClient.Builder().connectTimeout(0L, TimeUnit.MILLISECONDS).readTimeout(0L, TimeUnit.MILLISECONDS).writeTimeout(0L, TimeUnit.MILLISECONDS).cookieJar(new addOp());
    }

    public static OkHttpClient.Builder toString(Context context) {
        return valueOf(context, 10485760);
    }

    public static OkHttpClient.Builder valueOf(Context context, int i) {
        OkHttpClient.Builder ah$a = ah$a();
        return i == 0 ? ah$a : ah$a.cache(new okhttp3.Cache(new File(context.getCacheDir(), "http-cache"), i));
    }
}
