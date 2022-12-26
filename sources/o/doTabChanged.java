package o;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactContext;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.apache.http.cookie.SM;
/* loaded from: classes4.dex */
public class doTabChanged extends CookieHandler {
    private CookieManager ah$a;
    private final ReactContext valueOf;
    private final values values = new values();

    private static void ah$a(Context context) {
    }

    public void valueOf() {
    }

    public doTabChanged(ReactContext reactContext) {
        this.valueOf = reactContext;
    }

    @Override // java.net.CookieHandler
    public Map<String, List<String>> get(URI uri, Map<String, List<String>> map) throws IOException {
        CookieManager ag$a = ag$a();
        if (ag$a == null) {
            return Collections.emptyMap();
        }
        String cookie = ag$a.getCookie(uri.toString());
        if (TextUtils.isEmpty(cookie)) {
            return Collections.emptyMap();
        }
        return Collections.singletonMap(SM.COOKIE, Collections.singletonList(cookie));
    }

    @Override // java.net.CookieHandler
    public void put(URI uri, Map<String, List<String>> map) throws IOException {
        String uri2 = uri.toString();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null && values(key)) {
                ah$a(uri2, entry.getValue());
            }
        }
    }

    public void valueOf(Callback callback) {
        ag$a(callback);
    }

    private void ag$a(final Callback callback) {
        CookieManager ag$a = ag$a();
        if (ag$a != null) {
            ag$a.removeAllCookies(new ValueCallback<Boolean>() { // from class: o.doTabChanged.2
                @Override // android.webkit.ValueCallback
                /* renamed from: valueOf */
                public void onReceiveValue(Boolean bool) {
                    doTabChanged.this.values.ag$a();
                    callback.invoke(bool);
                }
            });
        }
    }

    public void ah$a(String str, List<String> list) {
        CookieManager ag$a = ag$a();
        if (ag$a == null) {
            return;
        }
        for (String str2 : list) {
            values(str, str2);
        }
        ag$a.flush();
        this.values.ag$a();
    }

    private void values(String str, String str2) {
        CookieManager ag$a = ag$a();
        if (ag$a != null) {
            ag$a.setCookie(str, str2, null);
        }
    }

    private static boolean values(String str) {
        return str.equalsIgnoreCase("Set-cookie") || str.equalsIgnoreCase("Set-cookie2");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [o.doTabChanged$1] */
    public void values(final Runnable runnable) {
        new GuardedAsyncTask<Void, Void>(this.valueOf) { // from class: o.doTabChanged.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.react.bridge.GuardedAsyncTask
            /* renamed from: toString */
            public void doInBackgroundGuarded(Void... voidArr) {
                runnable.run();
            }
        }.execute(new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CookieManager ag$a() {
        if (this.ah$a == null) {
            ah$a(this.valueOf);
            try {
                this.ah$a = CookieManager.getInstance();
            } catch (IllegalArgumentException unused) {
                return null;
            } catch (Exception e) {
                String message = e.getMessage();
                if (e.getClass().getCanonicalName().contains("MissingWebViewPackageException")) {
                    return null;
                }
                if (message == null || !(message.contains("WebView provider") || message.contains("No WebView installed"))) {
                    throw e;
                }
                return null;
            }
        }
        return this.ah$a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class values {
        private final Handler ag$a;

        public void ag$a() {
        }

        public values() {
            this.ag$a = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: o.doTabChanged.values.2
                @Override // android.os.Handler.Callback
                public boolean handleMessage(Message message) {
                    if (message.what == 1) {
                        values.this.valueOf();
                        return true;
                    }
                    return false;
                }
            });
        }

        public void valueOf() {
            this.ag$a.removeMessages(1);
            doTabChanged.this.values(new Runnable() { // from class: o.doTabChanged.values.3
                @Override // java.lang.Runnable
                public void run() {
                    values.this.ah$a();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ah$a() {
            CookieManager ag$a = doTabChanged.this.ag$a();
            if (ag$a != null) {
                ag$a.flush();
            }
        }
    }
}
