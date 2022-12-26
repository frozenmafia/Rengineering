package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
/* loaded from: classes4.dex */
public class addOp implements FragmentTabHost {
    private CookieJar valueOf = null;

    @Override // o.FragmentTabHost
    public void toString(CookieJar cookieJar) {
        this.valueOf = cookieJar;
    }

    @Override // o.FragmentTabHost
    public void ag$a() {
        this.valueOf = null;
    }

    @Override // okhttp3.CookieJar
    public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        CookieJar cookieJar = this.valueOf;
        if (cookieJar != null) {
            cookieJar.saveFromResponse(httpUrl, list);
        }
    }

    @Override // okhttp3.CookieJar
    public List<Cookie> loadForRequest(HttpUrl httpUrl) {
        CookieJar cookieJar = this.valueOf;
        if (cookieJar != null) {
            List<Cookie> loadForRequest = cookieJar.loadForRequest(httpUrl);
            ArrayList arrayList = new ArrayList();
            for (Cookie cookie : loadForRequest) {
                try {
                    new Headers.Builder().add(cookie.name(), cookie.value());
                    arrayList.add(cookie);
                } catch (IllegalArgumentException unused) {
                }
            }
            return arrayList;
        }
        return Collections.emptyList();
    }
}
