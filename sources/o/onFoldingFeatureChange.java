package o;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class onFoldingFeatureChange {
    private static int ag$a = 0;
    private static long ah$a = -5098561223359723497L;
    private static int toString = 1;
    private static char[] values = {'h', 2147, 4186, 6197, 8239};

    public static Message ag$a(String str, String str2, Map<String, String> map) {
        WindowMetricsCalculatorDecorator.valueOf.valueOf("HttpsClient:post url: %s", str);
        WindowMetricsCalculatorDecorator.valueOf.valueOf("HttpsClient:post payload: %s", str2);
        Bundle bundle = new Bundle();
        try {
            HttpsURLConnection values2 = values(str, "POST", map);
            values2.setRequestProperty("Content-Length", Integer.toString(str2.getBytes().length));
            DataOutputStream dataOutputStream = new DataOutputStream(values2.getOutputStream());
            dataOutputStream.write(str2.getBytes());
            dataOutputStream.flush();
            dataOutputStream.close();
            bundle.putInt("responseCode", values2.getResponseCode());
            WindowMetricsCalculatorDecorator.valueOf.valueOf("HttpsClient:post response: %s", Integer.valueOf(values2.getResponseCode()));
        } catch (IOException e) {
            WindowMetricsCalculatorDecorator.toString(e, "IOException occurred while calling HttpsClient:post method", new Object[0]);
            bundle.putInt("responseCode", 500);
        }
        Message message = new Message();
        try {
            message.setData(bundle);
            int i = toString + 1;
            ag$a = i % 128;
            int i2 = i % 2;
            return message;
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
        if ((r4 != null) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0029, code lost:
        if ((r4 != null ? '7' : 20) == '7') goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002f, code lost:
        if (r4.length() == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0031, code lost:
        r4 = o.onFoldingFeatureChange.toString + 43;
        o.onFoldingFeatureChange.ag$a = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003b, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004b, code lost:
        throw new java.lang.IllegalArgumentException(java.lang.String.format("%s cannot be null or empty", r5));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void toString(java.lang.String r4, java.lang.String r5) throws java.lang.IllegalArgumentException {
        /*
            int r0 = o.onFoldingFeatureChange.toString     // Catch: java.lang.Exception -> L4e
            int r0 = r0 + 71
            int r1 = r0 % 128
            o.onFoldingFeatureChange.ag$a = r1     // Catch: java.lang.Exception -> L4c
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L10
            r0 = 0
            goto L11
        L10:
            r0 = 1
        L11:
            if (r0 == r2) goto L20
            r0 = 47
            int r0 = r0 / r1
            if (r4 == 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            if (r0 == 0) goto L3c
            goto L2b
        L1e:
            r4 = move-exception
            throw r4
        L20:
            r0 = 55
            if (r4 == 0) goto L27
            r3 = 55
            goto L29
        L27:
            r3 = 20
        L29:
            if (r3 != r0) goto L3c
        L2b:
            int r4 = r4.length()     // Catch: java.lang.Exception -> L4c
            if (r4 == 0) goto L3c
            int r4 = o.onFoldingFeatureChange.toString     // Catch: java.lang.Exception -> L4c
            int r4 = r4 + 43
            int r5 = r4 % 128
            o.onFoldingFeatureChange.ag$a = r5     // Catch: java.lang.Exception -> L4c
            int r4 = r4 % 2
            return
        L3c:
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r1] = r5
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "%s cannot be null or empty"
            java.lang.String r4 = java.lang.String.format(r0, r4)
            r5.<init>(r4)
            throw r5
        L4c:
            r4 = move-exception
            throw r4
        L4e:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onFoldingFeatureChange.toString(java.lang.String, java.lang.String):void");
    }

    public static String ah$a(Map<String, ?> map) {
        try {
            int i = toString + 43;
            ag$a = i % 128;
            int i2 = i % 2;
            if ((map != null ? '(' : (char) 15) != '(') {
                return "";
            }
            int i3 = toString + 67;
            ag$a = i3 % 128;
            int i4 = i3 % 2;
            if (map.isEmpty()) {
                return "";
            }
            Iterator it = new TreeMap(map).entrySet().iterator();
            StringBuilder sb = new StringBuilder();
            while (true) {
                try {
                    if ((it.hasNext() ? ';' : (char) 4) == ';') {
                        Map.Entry entry = (Map.Entry) it.next();
                        Object value = entry.getValue();
                        sb.append((String) entry.getKey());
                        sb.append("=");
                        String valueOf = String.valueOf(value);
                        try {
                            sb.append(URLEncoder.encode(valueOf, "UTF-8").replace("+", "%20").replace("*", "%2A").replace("%7E", "~"));
                            if (it.hasNext()) {
                                int i5 = ag$a + 17;
                                toString = i5 % 128;
                                int i6 = i5 % 2;
                                sb.append("&");
                            }
                        } catch (UnsupportedEncodingException unused) {
                            throw new IllegalArgumentException("Unable to URL encode:" + valueOf);
                        }
                    } else {
                        return sb.toString();
                    }
                } catch (Exception e) {
                    throw e;
                }
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
        if ((r5 != null ? '9' : '#') == '9') goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
        r6 = o.onFoldingFeatureChange.ag$a + 25;
        o.onFoldingFeatureChange.toString = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
        if ((r6 % 2) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
        r6 = r2.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0037, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0047, code lost:
        throw new java.lang.IllegalArgumentException(java.lang.String.format("%s cannot be null", r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        if ((r5 == null) != true) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> T values(T r5, java.lang.String r6) throws java.lang.IllegalArgumentException {
        /*
            int r0 = o.onFoldingFeatureChange.ag$a
            int r0 = r0 + 61
            int r1 = r0 % 128
            o.onFoldingFeatureChange.toString = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L1c
            super.hashCode()     // Catch: java.lang.Throwable -> L1a
            if (r5 == 0) goto L16
            r0 = 0
            goto L17
        L16:
            r0 = 1
        L17:
            if (r0 == r3) goto L38
            goto L27
        L1a:
            r5 = move-exception
            throw r5
        L1c:
            r0 = 57
            if (r5 == 0) goto L23
            r4 = 57
            goto L25
        L23:
            r4 = 35
        L25:
            if (r4 != r0) goto L38
        L27:
            int r6 = o.onFoldingFeatureChange.ag$a
            int r6 = r6 + 25
            int r0 = r6 % 128
            o.onFoldingFeatureChange.toString = r0
            int r6 = r6 % 2
            if (r6 != 0) goto L37
            int r6 = r2.length     // Catch: java.lang.Throwable -> L35
            return r5
        L35:
            r5 = move-exception
            throw r5
        L37:
            return r5
        L38:
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r1] = r6
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "%s cannot be null"
            java.lang.String r5 = java.lang.String.format(r0, r5)
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onFoldingFeatureChange.values(java.lang.Object, java.lang.String):java.lang.Object");
    }

    public static void valueOf(Context context) throws IllegalArgumentException {
        try {
            int i = ag$a + 13;
            toString = i % 128;
            int i2 = i % 2;
            values(context, "Context");
            if (!(context instanceof Activity)) {
                throw new IllegalArgumentException("Do not pass ApplicationContext. Pass activity context instead.");
            }
            int i3 = toString + 13;
            ag$a = i3 % 128;
            if ((i3 % 2 != 0 ? '!' : '\n') != '\n') {
                Object[] objArr = null;
                int length = objArr.length;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
        if (ag$a(4 - android.view.Gravity.getAbsoluteGravity(1, 0), (android.util.TypedValue.complexToFloat(1) > 2.0f ? 1 : (android.util.TypedValue.complexToFloat(1) == 2.0f ? 0 : -1)), (char) ((-1) / (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)))).intern().equalsIgnoreCase(r2.getScheme()) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void ah$a(java.lang.String r11) {
        /*
            r0 = 1
            r1 = 0
            java.lang.String r2 = "payUrl"
            toString(r11, r2)     // Catch: java.lang.Exception -> L99
            java.net.URI r2 = new java.net.URI     // Catch: java.lang.Exception -> L99
            r2.<init>(r11)     // Catch: java.lang.Exception -> L99
            java.lang.String r3 = "amazonpay.amazon.in"
            java.lang.String r4 = r2.getHost()     // Catch: java.lang.Exception -> L99
            boolean r3 = r3.equalsIgnoreCase(r4)     // Catch: java.lang.Exception -> L99
            r4 = 99
            if (r3 == 0) goto L1d
            r3 = 96
            goto L1f
        L1d:
            r3 = 99
        L1f:
            if (r3 == r4) goto L93
            int r3 = o.onFoldingFeatureChange.toString
            int r3 = r3 + 95
            int r4 = r3 % 128
            o.onFoldingFeatureChange.ag$a = r4
            int r3 = r3 % 2
            r4 = 46
            r5 = 4
            if (r3 == 0) goto L33
            r3 = 46
            goto L34
        L33:
            r3 = 4
        L34:
            r6 = 0
            r8 = -1
            if (r3 == r4) goto L61
            int r3 = android.view.Gravity.getAbsoluteGravity(r1, r1)     // Catch: java.lang.Exception -> L99
            int r3 = r3 + 5
            float r4 = android.util.TypedValue.complexToFloat(r1)     // Catch: java.lang.Exception -> L99
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Exception -> L99
            int r5 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            int r5 = r5 + r8
            char r5 = (char) r5     // Catch: java.lang.Exception -> L99
            java.lang.String r3 = ag$a(r3, r4, r5)     // Catch: java.lang.Exception -> L99
            java.lang.String r3 = r3.intern()     // Catch: java.lang.Exception -> L99
            java.lang.String r2 = r2.getScheme()     // Catch: java.lang.Exception -> L99
            boolean r2 = r3.equalsIgnoreCase(r2)     // Catch: java.lang.Exception -> L99
            if (r2 == 0) goto L93
            goto L88
        L61:
            int r3 = android.view.Gravity.getAbsoluteGravity(r0, r1)     // Catch: java.lang.Exception -> L99
            int r5 = r5 - r3
            float r3 = android.util.TypedValue.complexToFloat(r0)     // Catch: java.lang.Exception -> L99
            r4 = 1073741824(0x40000000, float:2.0)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Exception -> L99
            int r4 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            int r8 = r8 / r4
            char r4 = (char) r8     // Catch: java.lang.Exception -> L99
            java.lang.String r3 = ag$a(r5, r3, r4)     // Catch: java.lang.Exception -> L99
            java.lang.String r3 = r3.intern()     // Catch: java.lang.Exception -> L99
            java.lang.String r2 = r2.getScheme()     // Catch: java.lang.Exception -> L99
            boolean r2 = r3.equalsIgnoreCase(r2)     // Catch: java.lang.Exception -> L99
            if (r2 == 0) goto L93
        L88:
            int r11 = o.onFoldingFeatureChange.ag$a
            int r11 = r11 + 5
            int r0 = r11 % 128
            o.onFoldingFeatureChange.toString = r0
            int r11 = r11 % 2
            return
        L93:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> L99
            r2.<init>()     // Catch: java.lang.Exception -> L99
            throw r2     // Catch: java.lang.Exception -> L99
        L99:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r0[r1] = r11
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The supplied pay url (%s) is invalid"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onFoldingFeatureChange.ah$a(java.lang.String):void");
    }

    public static HttpsURLConnection values(String str, String str2, Map<String, String> map) throws IOException {
        try {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
            httpsURLConnection.setRequestMethod(str2);
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setUseCaches(false);
            httpsURLConnection.setRequestProperty("Connection", "close");
            httpsURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            httpsURLConnection.setRequestProperty("charset", "UTF-8");
            Iterator<String> it = map.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int i = toString + 85;
                ag$a = i % 128;
                int i2 = i % 2;
                String next = it.next();
                httpsURLConnection.setRequestProperty(next, map.get(next));
            }
            int i3 = toString + 23;
            ag$a = i3 % 128;
            if ((i3 % 2 != 0 ? (char) 27 : 'X') != 27) {
                return httpsURLConnection;
            }
            Object[] objArr = null;
            int length = objArr.length;
            return httpsURLConnection;
        } catch (Exception e) {
            throw e;
        }
    }

    public static Map<String, Object> ah$a(JSONObject jSONObject) throws JSONException {
        TreeMap treeMap = new TreeMap();
        Iterator<String> keys = jSONObject.keys();
        try {
            int i = toString + 15;
            ag$a = i % 128;
            int i2 = i % 2;
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (!(obj instanceof JSONArray)) {
                    if (obj instanceof JSONObject) {
                        int i3 = toString + 111;
                        ag$a = i3 % 128;
                        if (i3 % 2 != 0) {
                            try {
                                obj = ah$a((JSONObject) obj);
                                Object[] objArr = null;
                                int length = objArr.length;
                            } catch (Exception e) {
                                throw e;
                            }
                        } else {
                            obj = ah$a((JSONObject) obj);
                        }
                    } else {
                        continue;
                    }
                } else {
                    int i4 = toString + 19;
                    ag$a = i4 % 128;
                    if (i4 % 2 != 0) {
                        obj = toString((JSONArray) obj);
                        int i5 = 81 / 0;
                    } else {
                        obj = toString((JSONArray) obj);
                    }
                }
                treeMap.put(next, obj);
            }
            return treeMap;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static List<Object> toString(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                Object obj = jSONArray.get(i);
                if (obj instanceof JSONArray) {
                    int i2 = toString + 27;
                    ag$a = i2 % 128;
                    if ((i2 % 2 != 0 ? 'U' : 'O') != 'O') {
                        try {
                            obj = toString((JSONArray) obj);
                            Object obj2 = null;
                            super.hashCode();
                        } catch (Exception e) {
                            throw e;
                        }
                    } else {
                        obj = toString((JSONArray) obj);
                    }
                } else if ((obj instanceof JSONObject ? 'W' : (char) 24) == 'W') {
                    int i3 = toString + 109;
                    ag$a = i3 % 128;
                    int i4 = i3 % 2;
                    obj = ah$a((JSONObject) obj);
                }
                arrayList.add(obj);
            } catch (Exception e2) {
                throw e2;
            }
        }
        return arrayList;
    }

    private static String ag$a(int i, int i2, char c) {
        String str;
        synchronized (move.valueOf) {
            char[] cArr = new char[i];
            move.values = 0;
            while (move.values < i) {
                cArr[move.values] = (char) ((values[move.values + i2] ^ (move.values * ah$a)) ^ c);
                move.values++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
