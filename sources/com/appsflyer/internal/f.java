package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkListener;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public final class f {
    public static Intent AFInAppEventParameterName;
    static String[] AFInAppEventType;
    static final int AFKeystoreWrapper = (int) TimeUnit.SECONDS.toMillis(2);
    private static f getLevel;
    static String[] init;
    static volatile boolean valueOf;
    public String AFLogger$LogLevel;
    public List<List<String>> AFVersionDeclaration = new ArrayList();
    public Map<String, String> AppsFlyer2dXConversionCallback;
    public DeepLinkListener values;

    public static f values() {
        if (getLevel == null) {
            getLevel = new f();
        }
        return getLevel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean AFInAppEventParameterName(String str) {
        if (AFInAppEventType == null || str.contains("af_tranid=")) {
            return false;
        }
        StringBuilder sb = new StringBuilder("Validate if link ");
        sb.append(str);
        sb.append(" belongs to ESP domains: ");
        sb.append(Arrays.asList(AFInAppEventType));
        AFLogger.AFInAppEventType(sb.toString());
        try {
            return Arrays.asList(AFInAppEventType).contains(new URL(str).getHost());
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void values(final Context context, final Map<String, Object> map, final Uri uri) {
        if (AFInAppEventParameterName(uri.toString())) {
            valueOf = true;
            if (l.AFKeystoreWrapper == null) {
                l.AFKeystoreWrapper = new l();
            }
            l lVar = l.AFKeystoreWrapper;
            if (lVar.valueOf == null) {
                lVar.valueOf = Executors.newSingleThreadScheduledExecutor(lVar.values);
            }
            lVar.valueOf.execute(new Runnable() { // from class: com.appsflyer.internal.f.4
                @Override // java.lang.Runnable
                public final void run() {
                    long currentTimeMillis = System.currentTimeMillis();
                    String obj = uri.toString();
                    ArrayList arrayList = new ArrayList();
                    Integer num = null;
                    String str = null;
                    int i = 0;
                    while (i < 5) {
                        Map<String, Object> AFInAppEventType2 = AFInAppEventType(Uri.parse(obj));
                        String str2 = (String) AFInAppEventType2.get("res");
                        Integer num2 = (Integer) AFInAppEventType2.get("status");
                        String str3 = (String) AFInAppEventType2.get("error");
                        if (str2 == null || !f.AFInAppEventParameterName(str2)) {
                            str = str3;
                            obj = str2;
                            num = num2;
                            break;
                        }
                        if (i < 4) {
                            arrayList.add(str2);
                        }
                        i++;
                        str = str3;
                        obj = str2;
                        num = num2;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("res", obj != null ? obj : "");
                    hashMap.put("status", Integer.valueOf(num != null ? num.intValue() : -1));
                    if (str != null) {
                        hashMap.put("error", str);
                    }
                    if (!arrayList.isEmpty()) {
                        hashMap.put("redirects", arrayList);
                    }
                    hashMap.put("latency", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    synchronized (map) {
                        map.put("af_deeplink_r", hashMap);
                        map.put("af_deeplink", uri.toString());
                    }
                    ah.AFInAppEventParameterName().AFInAppEventParameterName(context, map, obj != null ? Uri.parse(obj) : uri);
                    f.valueOf = false;
                }

                private static Map<String, Object> AFInAppEventType(Uri uri2) {
                    HashMap hashMap = new HashMap();
                    try {
                        StringBuilder sb = new StringBuilder("ESP deeplink resolving is started: ");
                        sb.append(uri2.toString());
                        AFLogger.AFKeystoreWrapper(sb.toString());
                        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri2.toString()).openConnection();
                        httpURLConnection.setInstanceFollowRedirects(false);
                        httpURLConnection.setReadTimeout(f.AFKeystoreWrapper);
                        httpURLConnection.setConnectTimeout(f.AFKeystoreWrapper);
                        httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
                        httpURLConnection.setRequestProperty("af-esp", "6.2.3");
                        int responseCode = httpURLConnection.getResponseCode();
                        hashMap.put("status", Integer.valueOf(responseCode));
                        if (300 <= responseCode && responseCode <= 305) {
                            hashMap.put("res", httpURLConnection.getHeaderField("Location"));
                        }
                        httpURLConnection.disconnect();
                        AFLogger.AFKeystoreWrapper("ESP deeplink resolving is finished");
                    } catch (Throwable th) {
                        hashMap.put("error", th.getLocalizedMessage());
                        AFLogger.values(th.getMessage(), th);
                    }
                    return hashMap;
                }
            });
        } else {
            ah.AFInAppEventParameterName().AFInAppEventParameterName(context, map, uri);
        }
        AFInAppEventParameterName = null;
    }

    private Uri valueOf(Object obj, Iterator<String> it) {
        while (obj != JSONObject.NULL) {
            if (!it.hasNext()) {
                Uri parse = Uri.parse(obj.toString());
                if (parse == null || parse.getScheme() == null || parse.getHost() == null) {
                    return null;
                }
                return parse;
            }
            try {
                obj = new JSONObject(obj.toString()).get(it.next());
            } catch (JSONException unused) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Uri valueOf(Intent intent) {
        if (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) {
            return null;
        }
        return intent.getData();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:60:0x006e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AFKeystoreWrapper(android.content.Intent r9, android.content.Context r10, java.util.Map<java.lang.String, java.lang.Object> r11) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.f.AFKeystoreWrapper(android.content.Intent, android.content.Context, java.util.Map):boolean");
    }
}
