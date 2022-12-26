package com.android.volley.toolbox;

import android.os.SystemClock;
import android.view.KeyEvent;
import com.android.volley.AuthFailureError;
import com.android.volley.Header;
import com.android.volley.Request;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import o.getShort;
/* loaded from: classes.dex */
public class HurlStack extends BaseHttpStack {
    private static final int HTTP_CONTINUE = 100;
    private static long ag$a = -7471118015992152984L;
    private static char ah$a = 0;
    private static int toString = 0;
    private static int valueOf = 1;
    private static int values;
    private final SSLSocketFactory mSslSocketFactory;
    private final UrlRewriter mUrlRewriter;

    /* loaded from: classes.dex */
    public interface UrlRewriter extends com.android.volley.toolbox.UrlRewriter {
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
        if ((100 <= r4 ? 1 : '/') != 1) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0023, code lost:
        r3 = com.android.volley.toolbox.HurlStack.valueOf + 101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
        com.android.volley.toolbox.HurlStack.toString = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
        if ((r3 % 2) == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002f, code lost:
        if (r4 < 11508) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0034, code lost:
        if (r4 < 200) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0056, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0057, code lost:
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (107 <= r4) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean hasResponseBody(int r3, int r4) {
        /*
            r0 = 4
            r1 = 0
            r2 = 1
            if (r3 == r0) goto L58
            int r3 = com.android.volley.toolbox.HurlStack.valueOf
            int r3 = r3 + 3
            int r0 = r3 % 128
            com.android.volley.toolbox.HurlStack.toString = r0
            int r3 = r3 % 2
            if (r3 == 0) goto L16
            r3 = 107(0x6b, float:1.5E-43)
            if (r3 > r4) goto L36
            goto L21
        L16:
            r3 = 100
            if (r3 > r4) goto L1c
            r3 = 1
            goto L1e
        L1c:
            r3 = 47
        L1e:
            if (r3 == r2) goto L21
            goto L36
        L21:
            int r3 = com.android.volley.toolbox.HurlStack.valueOf     // Catch: java.lang.Exception -> L56
            int r3 = r3 + 101
            int r0 = r3 % 128
            com.android.volley.toolbox.HurlStack.toString = r0     // Catch: java.lang.Exception -> L56
            int r3 = r3 % 2
            if (r3 == 0) goto L32
            r3 = 11508(0x2cf4, float:1.6126E-41)
            if (r4 < r3) goto L58
            goto L36
        L32:
            r3 = 200(0xc8, float:2.8E-43)
            if (r4 < r3) goto L58
        L36:
            r3 = 204(0xcc, float:2.86E-43)
            if (r4 == r3) goto L3c
            r3 = 1
            goto L3d
        L3c:
            r3 = 0
        L3d:
            if (r3 == 0) goto L58
            int r3 = com.android.volley.toolbox.HurlStack.valueOf
            int r3 = r3 + 9
            int r0 = r3 % 128
            com.android.volley.toolbox.HurlStack.toString = r0
            int r3 = r3 % 2
            if (r3 == 0) goto L50
            r3 = 29583(0x738f, float:4.1455E-41)
            if (r4 == r3) goto L58
            goto L54
        L50:
            r3 = 304(0x130, float:4.26E-43)
            if (r4 == r3) goto L58
        L54:
            r1 = 1
            goto L58
        L56:
            r3 = move-exception
            throw r3
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.HurlStack.hasResponseBody(int, int):boolean");
    }

    static /* synthetic */ InputStream access$000(HttpURLConnection httpURLConnection) {
        try {
            int i = valueOf + 109;
            try {
                toString = i % 128;
                int i2 = i % 2;
                InputStream inputStreamFromConnection = inputStreamFromConnection(httpURLConnection);
                int i3 = toString + 9;
                valueOf = i3 % 128;
                int i4 = i3 % 2;
                return inputStreamFromConnection;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public HurlStack() {
        this(null);
    }

    public HurlStack(UrlRewriter urlRewriter) {
        this(urlRewriter, null);
    }

    public HurlStack(UrlRewriter urlRewriter, SSLSocketFactory sSLSocketFactory) {
        try {
            this.mUrlRewriter = urlRewriter;
            this.mSslSocketFactory = sSLSocketFactory;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.android.volley.toolbox.BaseHttpStack
    public HttpResponse executeRequest(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError {
        String url = request.getUrl();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(request.getHeaders());
        UrlRewriter urlRewriter = this.mUrlRewriter;
        if (urlRewriter != null) {
            try {
                String rewriteUrl = urlRewriter.rewriteUrl(url);
                if (rewriteUrl == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("URL blocked by rewriter: ");
                    sb.append(url);
                    throw new IOException(sb.toString());
                }
                url = rewriteUrl;
            } catch (Exception e) {
                throw e;
            }
        }
        HttpURLConnection openConnection = openConnection(new URL(url), request);
        boolean z = true;
        try {
            Iterator it = hashMap.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int i = toString + 125;
                valueOf = i % 128;
                if (i % 2 != 0) {
                    String str = (String) it.next();
                    openConnection.setRequestProperty(str, (String) hashMap.get(str));
                } else {
                    String str2 = (String) it.next();
                    openConnection.setRequestProperty(str2, (String) hashMap.get(str2));
                    Object[] objArr = null;
                    int length = objArr.length;
                }
            }
            setConnectionParametersForRequest(openConnection, request);
            int responseCode = openConnection.getResponseCode();
            if ((responseCode != -1 ? (char) 3 : '!') == 3) {
                int i2 = valueOf + 3;
                toString = i2 % 128;
                int i3 = i2 % 2;
                if (!hasResponseBody(request.getMethod(), responseCode)) {
                    HttpResponse httpResponse = new HttpResponse(responseCode, convertHeaders(openConnection.getHeaderFields()));
                    openConnection.disconnect();
                    return httpResponse;
                }
                try {
                    return new HttpResponse(responseCode, convertHeaders(openConnection.getHeaderFields()), openConnection.getContentLength(), createInputStream(request, openConnection));
                } catch (Throwable th) {
                    th = th;
                    if (!z) {
                        openConnection.disconnect();
                    }
                    throw th;
                }
            }
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
    }

    static List<Header> convertHeaders(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            try {
                int i = toString + 57;
                valueOf = i % 128;
                int i2 = i % 2;
                if (entry.getKey() != null) {
                    int i3 = toString + 63;
                    valueOf = i3 % 128;
                    int i4 = i3 % 2;
                    for (String str : entry.getValue()) {
                        arrayList.add(new Header(entry.getKey(), str));
                        int i5 = toString + 45;
                        valueOf = i5 % 128;
                        int i6 = i5 % 2;
                    }
                }
            } catch (Exception e) {
                throw e;
            }
        }
        int i7 = toString + 53;
        valueOf = i7 % 128;
        if (i7 % 2 != 0) {
            return arrayList;
        }
        Object obj = null;
        super.hashCode();
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class UrlConnectionInputStream extends FilterInputStream {
        private final HttpURLConnection mConnection;

        UrlConnectionInputStream(HttpURLConnection httpURLConnection) {
            super(HurlStack.access$000(httpURLConnection));
            this.mConnection = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            this.mConnection.disconnect();
        }
    }

    protected InputStream createInputStream(Request<?> request, HttpURLConnection httpURLConnection) {
        UrlConnectionInputStream urlConnectionInputStream = new UrlConnectionInputStream(httpURLConnection);
        int i = valueOf + 29;
        toString = i % 128;
        int i2 = i % 2;
        return urlConnectionInputStream;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    private static InputStream inputStreamFromConnection(HttpURLConnection httpURLConnection) {
        int i = toString + 29;
        valueOf = i % 128;
        try {
            if (!(i % 2 == 0)) {
                httpURLConnection = httpURLConnection.getInputStream();
            } else {
                InputStream inputStream = httpURLConnection.getInputStream();
                ?? r0 = 0;
                int length = r0.length;
                httpURLConnection = inputStream;
            }
            return httpURLConnection;
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    protected HttpURLConnection createConnection(URL url) throws IOException {
        try {
            int i = valueOf + 103;
            try {
                toString = i % 128;
                int i2 = i % 2;
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
                int i3 = toString + 75;
                valueOf = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 41 / 0;
                    return httpURLConnection;
                }
                return httpURLConnection;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private HttpURLConnection openConnection(URL url, Request<?> request) throws IOException {
        int i = toString + 35;
        valueOf = i % 128;
        int i2 = i % 2;
        HttpURLConnection createConnection = createConnection(url);
        int timeoutMs = request.getTimeoutMs();
        createConnection.setConnectTimeout(timeoutMs);
        createConnection.setReadTimeout(timeoutMs);
        createConnection.setUseCaches(false);
        createConnection.setDoInput(true);
        if (!(values((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + (-1936069573), new char[]{15462, 39404, 11660, 51224}, new char[]{15464, 34244, 16831, 38993}, (char) (KeyEvent.normalizeMetaState(0) + 6189), new char[]{38259, 40121, 32671, 13539, 47789}).intern().equals(url.getProtocol()) ? false : true)) {
            SSLSocketFactory sSLSocketFactory = this.mSslSocketFactory;
            if ((sSLSocketFactory != null ? 'K' : '<') == 'K') {
                int i3 = valueOf + 55;
                toString = i3 % 128;
                int i4 = i3 % 2;
                ((HttpsURLConnection) createConnection).setSSLSocketFactory(sSLSocketFactory);
            }
        }
        return createConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void setConnectionParametersForRequest(java.net.HttpURLConnection r5, com.android.volley.Request<?> r6) throws java.io.IOException, com.android.volley.AuthFailureError {
        /*
            r4 = this;
            int r0 = com.android.volley.toolbox.HurlStack.toString
            int r0 = r0 + 99
            int r1 = r0 % 128
            com.android.volley.toolbox.HurlStack.valueOf = r1
            int r0 = r0 % 2
            int r0 = r6.getMethod()
            java.lang.String r1 = "POST"
            switch(r0) {
                case -1: goto L5c;
                case 0: goto L56;
                case 1: goto L4f;
                case 2: goto L46;
                case 3: goto L40;
                case 4: goto L3a;
                case 5: goto L34;
                case 6: goto L2e;
                case 7: goto L1b;
                default: goto L13;
            }
        L13:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Unknown method type."
            r5.<init>(r6)
            throw r5
        L1b:
            java.lang.String r0 = "PATCH"
            r5.setRequestMethod(r0)
            r4.addBodyIfExists(r5, r6)
            int r5 = com.android.volley.toolbox.HurlStack.toString
            int r5 = r5 + 93
            int r6 = r5 % 128
            com.android.volley.toolbox.HurlStack.valueOf = r6
            int r5 = r5 % 2
            goto L6f
        L2e:
            java.lang.String r6 = "TRACE"
            r5.setRequestMethod(r6)
            goto L6f
        L34:
            java.lang.String r6 = "OPTIONS"
            r5.setRequestMethod(r6)
            goto L6f
        L3a:
            java.lang.String r6 = "HEAD"
            r5.setRequestMethod(r6)
            goto L6f
        L40:
            java.lang.String r6 = "DELETE"
            r5.setRequestMethod(r6)
            goto L6f
        L46:
            java.lang.String r0 = "PUT"
            r5.setRequestMethod(r0)
            r4.addBodyIfExists(r5, r6)
            goto L6f
        L4f:
            r5.setRequestMethod(r1)
            r4.addBodyIfExists(r5, r6)
            goto L6f
        L56:
            java.lang.String r6 = "GET"
            r5.setRequestMethod(r6)
            goto L6f
        L5c:
            byte[] r0 = r6.getPostBody()     // Catch: java.lang.Exception -> L8c
            r2 = 4
            if (r0 == 0) goto L66
            r3 = 26
            goto L67
        L66:
            r3 = 4
        L67:
            if (r3 == r2) goto L6f
            r5.setRequestMethod(r1)
            r4.addBody(r5, r6, r0)
        L6f:
            int r5 = com.android.volley.toolbox.HurlStack.toString     // Catch: java.lang.Exception -> L8c
            int r5 = r5 + 103
            int r6 = r5 % 128
            com.android.volley.toolbox.HurlStack.valueOf = r6     // Catch: java.lang.Exception -> L8c
            int r5 = r5 % 2
            r6 = 28
            if (r5 != 0) goto L80
            r5 = 28
            goto L82
        L80:
            r5 = 39
        L82:
            if (r5 == r6) goto L85
            return
        L85:
            r5 = 90
            int r5 = r5 / 0
            return
        L8a:
            r5 = move-exception
            throw r5
        L8c:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.HurlStack.setConnectionParametersForRequest(java.net.HttpURLConnection, com.android.volley.Request):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (r0 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
        addBody(r4, r5, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (r0 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void addBodyIfExists(java.net.HttpURLConnection r4, com.android.volley.Request<?> r5) throws java.io.IOException, com.android.volley.AuthFailureError {
        /*
            r3 = this;
            int r0 = com.android.volley.toolbox.HurlStack.valueOf
            int r0 = r0 + 101
            int r1 = r0 % 128
            com.android.volley.toolbox.HurlStack.toString = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 == r1) goto L1a
            byte[] r0 = r5.getBody()
            if (r0 == 0) goto L27
            goto L24
        L1a:
            byte[] r0 = r5.getBody()
            r1 = 0
            super.hashCode()     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L27
        L24:
            r3.addBody(r4, r5, r0)
        L27:
            int r4 = com.android.volley.toolbox.HurlStack.valueOf
            int r4 = r4 + 93
            int r5 = r4 % 128
            com.android.volley.toolbox.HurlStack.toString = r5
            int r4 = r4 % 2
            r5 = 18
            if (r4 == 0) goto L38
            r4 = 18
            goto L3a
        L38:
            r4 = 25
        L3a:
            if (r4 == r5) goto L3d
            return
        L3d:
            r4 = 86
            int r4 = r4 / r2
            return
        L41:
            r4 = move-exception
            throw r4
        L43:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.HurlStack.addBodyIfExists(java.net.HttpURLConnection, com.android.volley.Request):void");
    }

    private void addBody(HttpURLConnection httpURLConnection, Request<?> request, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        Object obj = null;
        if (!(httpURLConnection.getRequestProperties().containsKey("Content-Type"))) {
            int i = toString + 93;
            valueOf = i % 128;
            if (i % 2 == 0) {
                try {
                    httpURLConnection.setRequestProperty("Content-Type", request.getBodyContentType());
                    super.hashCode();
                } catch (Exception e) {
                    throw e;
                }
            } else {
                httpURLConnection.setRequestProperty("Content-Type", request.getBodyContentType());
            }
        }
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(createOutputStream(request, httpURLConnection, bArr.length));
            dataOutputStream.write(bArr);
            dataOutputStream.close();
            int i2 = toString + 79;
            valueOf = i2 % 128;
            if ((i2 % 2 == 0 ? '`' : (char) 19) != 19) {
                super.hashCode();
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    protected OutputStream createOutputStream(Request<?> request, HttpURLConnection httpURLConnection, int i) throws IOException {
        int i2 = toString + 73;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        OutputStream outputStream = httpURLConnection.getOutputStream();
        try {
            int i4 = valueOf + 77;
            toString = i4 % 128;
            if ((i4 % 2 != 0 ? 'R' : (char) 6) != 'R') {
                return outputStream;
            }
            Object[] objArr = null;
            int length = objArr.length;
            return outputStream;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String values(int i, char[] cArr, char[] cArr2, char c, char[] cArr3) {
        String str;
        synchronized (getShort.toString) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr2.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            getShort.valueOf = 0;
            while (getShort.valueOf < length) {
                int i2 = (getShort.valueOf + 2) % 4;
                int i3 = (getShort.valueOf + 3) % 4;
                getShort.values = (char) (((cArr4[getShort.valueOf % 4] * 32718) + cArr5[i2]) % 65535);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                cArr4[i3] = getShort.values;
                cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr3[getShort.valueOf]) ^ ag$a) ^ values) ^ ah$a);
                getShort.valueOf++;
            }
            str = new String(cArr6);
        }
        return str;
    }
}
