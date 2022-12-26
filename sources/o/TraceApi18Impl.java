package o;

import android.net.Uri;
import android.os.Build;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.phonepe.intent.sdk.api.PhonePe;
import com.phonepe.intent.sdk.api.PhonePeInitException;
import irjuc.irjuc.cqqlq.irjuc.jmjou.jmjou;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.protocol.HTTP;
/* loaded from: classes5.dex */
public class TraceApi18Impl extends WebViewClient {
    public static List<String> cqqlq;

    /* renamed from: irjuc  reason: collision with root package name */
    public static boolean f1428irjuc;

    public void irjuc(List<String> list) {
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String format;
        if (Build.VERSION.SDK_INT >= 21) {
            if (f1428irjuc) {
                Uri url = webResourceRequest.getUrl();
                try {
                    jmjou objectFactory = PhonePe.getObjectFactory();
                    if (webView == null || !beginAsyncSectionFallback.values(objectFactory) || url == null || webResourceRequest.getMethod().matches("POST")) {
                        format = String.format("request check 1 = {url:%s, method:%s} is not a valid candidate for interception", url, webResourceRequest.getMethod());
                    } else {
                        String path = url.getPath();
                        boolean z = false;
                        for (int i = 0; i < cqqlq.size(); i++) {
                            if (path.endsWith(cqqlq.get(i))) {
                                z = true;
                            }
                        }
                        if (z) {
                            try {
                                URL url2 = new URL(url.toString());
                                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url2.openConnection();
                                httpsURLConnection.setSSLSocketFactory(new SSLSocketFactory() { // from class: o.ChangeBounds.9
                                    public SSLSocketFactory valueOf;

                                    {
                                        SSLContext sSLContext = SSLContext.getInstance("TLS");
                                        sSLContext.init(null, null, null);
                                        this.valueOf = sSLContext.getSocketFactory();
                                    }

                                    @Override // javax.net.SocketFactory
                                    public Socket createSocket() throws IOException {
                                        return toString(this.valueOf.createSocket());
                                    }

                                    @Override // javax.net.SocketFactory
                                    public Socket createSocket(String str, int i2) throws IOException, UnknownHostException {
                                        return toString(this.valueOf.createSocket(str, i2));
                                    }

                                    @Override // javax.net.SocketFactory
                                    public Socket createSocket(String str, int i2, InetAddress inetAddress, int i3) throws IOException, UnknownHostException {
                                        return toString(this.valueOf.createSocket(str, i2, inetAddress, i3));
                                    }

                                    @Override // javax.net.SocketFactory
                                    public Socket createSocket(InetAddress inetAddress, int i2) throws IOException {
                                        return toString(this.valueOf.createSocket(inetAddress, i2));
                                    }

                                    @Override // javax.net.SocketFactory
                                    public Socket createSocket(InetAddress inetAddress, int i2, InetAddress inetAddress2, int i3) throws IOException {
                                        return toString(this.valueOf.createSocket(inetAddress, i2, inetAddress2, i3));
                                    }

                                    @Override // javax.net.ssl.SSLSocketFactory
                                    public Socket createSocket(Socket socket, String str, int i2, boolean z2) throws IOException {
                                        return toString(this.valueOf.createSocket(socket, str, i2, z2));
                                    }

                                    @Override // javax.net.ssl.SSLSocketFactory
                                    public String[] getDefaultCipherSuites() {
                                        return this.valueOf.getDefaultCipherSuites();
                                    }

                                    @Override // javax.net.ssl.SSLSocketFactory
                                    public String[] getSupportedCipherSuites() {
                                        return this.valueOf.getSupportedCipherSuites();
                                    }

                                    public final Socket toString(Socket socket) {
                                        if (socket != null && (socket instanceof SSLSocket)) {
                                            ((SSLSocket) socket).setEnabledProtocols(new String[]{"TLSv1.2"});
                                        }
                                        return socket;
                                    }
                                });
                                httpsURLConnection.setRequestMethod(webResourceRequest.getMethod());
                                httpsURLConnection.setUseCaches(true);
                                httpsURLConnection.connect();
                                int responseCode = httpsURLConnection.getResponseCode();
                                if (responseCode >= 200 && responseCode < 400) {
                                    String contentType = httpsURLConnection.getContentType();
                                    if (contentType != null) {
                                        int indexOf = contentType.indexOf(HTTP.CHARSET_PARAM);
                                        String substring = indexOf >= 0 ? contentType.substring(0, indexOf) : contentType;
                                        String substring2 = indexOf >= 0 ? contentType.substring(indexOf + 10) : "UTF-8";
                                        beginAsyncSectionFallback.ag$a("WEB_VIEW_CLIENT", url2.toString());
                                        return new WebResourceResponse(substring, substring2, httpsURLConnection.getInputStream());
                                    }
                                    beginAsyncSectionFallback.ah$a("WEB_VIEW_CLIENT", String.format("failed to intercept request because of either content_type is null or invalid. content_type = {%s}", contentType));
                                }
                                return super.shouldInterceptRequest(webView, webResourceRequest);
                            } catch (Throwable th) {
                                beginAsyncSectionFallback.ah$a("WEB_VIEW_CLIENT", String.format("failed to intercept the request, because of throwable = {%s}", th.getMessage()));
                            }
                        } else {
                            format = String.format("request check 2 = {url:%s, method:%s} is not a valid candidate for interception", url, webResourceRequest.getMethod());
                        }
                    }
                } catch (PhonePeInitException e) {
                    beginAsyncSectionFallback.valueOf("WEB_VIEW_CLIENT", e.getMessage(), e);
                }
            } else {
                beginAsyncSectionFallback.valueOf("WEB_VIEW_CLIENT", "Precache has been disabled either by merchant or config");
            }
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        format = "request can not be intercepted, function itself added in LOLLIPOP. Callback not expected here. calling super..";
        beginAsyncSectionFallback.ag$a("WEB_VIEW_CLIENT", format);
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }
}
