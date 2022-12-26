package okhttp3;

import java.util.List;
import o.getTargetTypes;
import o.reserveEndViewTransition;
import o.runAnimators;
/* loaded from: classes5.dex */
public interface CookieJar {
    public static final Companion Companion = new Companion(null);
    public static final CookieJar NO_COOKIES = new Companion.NoCookies();

    List<Cookie> loadForRequest(HttpUrl httpUrl);

    void saveFromResponse(HttpUrl httpUrl, List<Cookie> list);

    /* loaded from: classes5.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;

        private Companion() {
        }

        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        /* loaded from: classes5.dex */
        static final class NoCookies implements CookieJar {
            @Override // okhttp3.CookieJar
            public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
                runAnimators.ag$a(httpUrl, "url");
                runAnimators.ag$a(list, "cookies");
            }

            @Override // okhttp3.CookieJar
            public List<Cookie> loadForRequest(HttpUrl httpUrl) {
                runAnimators.ag$a(httpUrl, "url");
                return reserveEndViewTransition.valueOf();
            }
        }
    }
}
