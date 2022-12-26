package o;

import okhttp3.HttpUrl;
import okhttp3.Request;
/* loaded from: classes2.dex */
public class setActionViewExpanded {
    public static String toString(Request request) {
        try {
            Request build = request.newBuilder().build();
            getMinSmallestWidth getminsmallestwidth = new getMinSmallestWidth();
            build.body().writeTo(getminsmallestwidth);
            return getminsmallestwidth.onMessageChannelReady();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String valueOf(Request request) {
        String setactionviewexpanded = toString(request);
        if (setactionviewexpanded != null) {
            return Integer.toString(setactionviewexpanded.length()) + "**" + Integer.toString(setactionviewexpanded.hashCode());
        }
        return null;
    }

    public static HttpUrl ah$a(Request request) {
        String valueOf;
        HttpUrl.Builder newBuilder = request.url().newBuilder();
        if ("POST".equalsIgnoreCase(request.method()) && (valueOf = valueOf(request)) != null) {
            newBuilder.addQueryParameter("dream11CacheIdentifier", valueOf);
        }
        return newBuilder.build();
    }
}
