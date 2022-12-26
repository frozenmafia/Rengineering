package com.sendbird.android.shadow.okhttp3;

import java.util.Collections;
import java.util.List;
/* loaded from: classes5.dex */
public interface CookieJar {
    public static final CookieJar NO_COOKIES = new CookieJar() { // from class: com.sendbird.android.shadow.okhttp3.CookieJar.1
        @Override // com.sendbird.android.shadow.okhttp3.CookieJar
        public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        }

        @Override // com.sendbird.android.shadow.okhttp3.CookieJar
        public List<Cookie> loadForRequest(HttpUrl httpUrl) {
            return Collections.emptyList();
        }
    };

    List<Cookie> loadForRequest(HttpUrl httpUrl);

    void saveFromResponse(HttpUrl httpUrl, List<Cookie> list);
}
