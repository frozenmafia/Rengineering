package o;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
/* loaded from: classes7.dex */
public class getChildPosition {
    private final Map<String, String> ah$a = new HashMap();
    private final Map<String, String> toString;
    private final String values;

    public getChildPosition(String str, Map<String, String> map) {
        this.values = str;
        this.toString = map;
    }

    public getChildPosition ah$a(String str, String str2) {
        this.ah$a.put(str, str2);
        return this;
    }

    public getItemAnimator ah$a() throws IOException {
        Throwable th;
        HttpsURLConnection httpsURLConnection;
        createScroller createscroller;
        InputStream inputStream = null;
        String valueOf = null;
        inputStream = null;
        try {
            String values = values(this.values, this.toString);
            createscroller = createScroller.valueOf;
            createscroller.valueOf("GET Request URL: " + values);
            httpsURLConnection = (HttpsURLConnection) new URL(values).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry<String, String> entry : this.ah$a.entrySet()) {
                    httpsURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        valueOf = valueOf(inputStream2);
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                return new getItemAnimator(responseCode, valueOf);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            httpsURLConnection = null;
        }
    }

    private String values(String str, Map<String, String> map) throws UnsupportedEncodingException {
        String getchildposition = toString(map);
        if (getchildposition.isEmpty()) {
            return str;
        }
        if (str.contains("?")) {
            if (!str.endsWith("&")) {
                getchildposition = "&" + getchildposition;
            }
            return str + getchildposition;
        }
        return str + "?" + getchildposition;
    }

    private String toString(Map<String, String> map) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        Map.Entry<String, String> next = it.next();
        sb.append(next.getKey());
        sb.append("=");
        sb.append(next.getValue() != null ? URLEncoder.encode(next.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry<String, String> next2 = it.next();
            sb.append("&");
            sb.append(next2.getKey());
            sb.append("=");
            sb.append(next2.getValue() != null ? URLEncoder.encode(next2.getValue(), "UTF-8") : "");
        }
        return sb.toString();
    }

    private String valueOf(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        char[] cArr = new char[8192];
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read != -1) {
                sb.append(cArr, 0, read);
            } else {
                return sb.toString();
            }
        }
    }
}
