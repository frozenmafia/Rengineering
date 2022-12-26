package org.jsoup;

import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import o.isEqualSidecarWindowLayoutInfo;
import org.jsoup.nodes.Document;
/* loaded from: classes5.dex */
public interface Connection {

    /* loaded from: classes5.dex */
    public interface toString {
        String ag$a();

        InputStream ah$a();

        String ah$b();

        boolean valueOf();

        String values();
    }

    /* loaded from: classes5.dex */
    public interface valueOf<T extends valueOf> {
        URL ag$a();

        T ag$a(String str);

        Method ah$a();

        T toString(URL url);

        T toString(Method method);

        Map<String, List<String>> valueOf();

        T valueOf(String str, String str2);

        Map<String, String> values();

        T values(String str, String str2);

        boolean values(String str);
    }

    /* loaded from: classes5.dex */
    public interface values extends valueOf<values> {
        boolean HaptikSDK$a();

        boolean HaptikSDK$b();

        boolean HaptikSDK$c();

        String HaptikSDK$d();

        isEqualSidecarWindowLayoutInfo HaptikSDK$e();

        String HaptikWebView();

        Collection<toString> ah$b();

        Proxy getInitSettings();

        int getSignupData();

        int invoke();

        boolean isLogoutPending();

        values valueOf(String str);

        values valueOf(isEqualSidecarWindowLayoutInfo isequalsidecarwindowlayoutinfo);
    }

    Connection ag$a(String str);

    Document values() throws IOException;

    /* loaded from: classes5.dex */
    public enum Method {
        GET(false),
        POST(true),
        PUT(true),
        DELETE(false),
        PATCH(true),
        HEAD(false),
        OPTIONS(false),
        TRACE(false);
        
        private final boolean hasBody;

        Method(boolean z) {
            this.hasBody = z;
        }

        public final boolean hasBody() {
            return this.hasBody;
        }
    }
}
