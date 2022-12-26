package o;

import com.fancode.video.models.NetworkProtocol;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import o.Visibility;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import org.apache.http.message.TokenParser;
/* loaded from: classes5.dex */
public final class EmbeddingInterfaceCompat {
    public static final toString ag$a = new toString(null);
    public final String ah$a;
    public final int toString;
    public final Protocol valueOf;

    /* loaded from: classes5.dex */
    public final class EmbeddingCallbackInterface {
        public static final EmbeddingCallbackInterface ag$a = new EmbeddingCallbackInterface();

        private EmbeddingCallbackInterface() {
        }

        public final String values(Request request, Proxy.Type type) {
            runAnimators.ag$a(request, "request");
            runAnimators.ag$a(type, "proxyType");
            StringBuilder sb = new StringBuilder();
            sb.append(request.method());
            sb.append(TokenParser.SP);
            EmbeddingCallbackInterface embeddingCallbackInterface = ag$a;
            if (embeddingCallbackInterface.toString(request, type)) {
                sb.append(request.url());
            } else {
                sb.append(embeddingCallbackInterface.ag$a(request.url()));
            }
            sb.append(" HTTP/1.1");
            String sb2 = sb.toString();
            runAnimators.ah$a(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }

        private final boolean toString(Request request, Proxy.Type type) {
            return !request.isHttps() && type == Proxy.Type.HTTP;
        }

        public final String ag$a(HttpUrl httpUrl) {
            runAnimators.ag$a(httpUrl, "url");
            String encodedPath = httpUrl.encodedPath();
            String encodedQuery = httpUrl.encodedQuery();
            if (encodedQuery != null) {
                return encodedPath + '?' + encodedQuery;
            }
            return encodedPath;
        }
    }

    public EmbeddingInterfaceCompat(Protocol protocol, int i, String str) {
        runAnimators.ag$a(protocol, "protocol");
        runAnimators.ag$a(str, "message");
        this.valueOf = protocol;
        this.toString = i;
        this.ah$a = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.valueOf == Protocol.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append(NetworkProtocol.HTTP1);
        }
        sb.append(TokenParser.SP);
        sb.append(this.toString);
        sb.append(TokenParser.SP);
        sb.append(this.ah$a);
        String sb2 = sb.toString();
        runAnimators.ah$a(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* loaded from: classes5.dex */
    public static final class toString {
        private toString() {
        }

        public /* synthetic */ toString(getTargetTypes gettargettypes) {
            this();
        }

        public final EmbeddingInterfaceCompat ah$a(String str) throws IOException {
            Protocol protocol;
            String str2;
            runAnimators.ag$a(str, "statusLine");
            int i = 9;
            if (Visibility.Mode.ah$a(str, "HTTP/1.", false, 2, (Object) null)) {
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else if (charAt == 1) {
                    protocol = Protocol.HTTP_1_1;
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            } else if (Visibility.Mode.ah$a(str, "ICY ", false, 2, (Object) null)) {
                protocol = Protocol.HTTP_1_0;
                i = 4;
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int i2 = i + 3;
            if (str.length() < i2) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            try {
                String substring = str.substring(i, i2);
                runAnimators.ah$a(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                int parseInt = Integer.parseInt(substring);
                if (str.length() <= i2) {
                    str2 = "";
                } else if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                } else {
                    str2 = str.substring(i + 4);
                    runAnimators.ah$a(str2, "(this as java.lang.String).substring(startIndex)");
                }
                return new EmbeddingInterfaceCompat(protocol, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        }
    }
}
