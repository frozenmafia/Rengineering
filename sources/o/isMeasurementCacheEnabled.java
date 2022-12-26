package o;

import android.util.Base64;
import com.google.firebase.database.tubesock.WebSocketException;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.http.HttpHeaders;
/* loaded from: classes7.dex */
public class isMeasurementCacheEnabled {
    private Map<String, String> ag$a;
    private String ah$a;
    private String toString;
    private URI values;

    public isMeasurementCacheEnabled(URI uri, String str, Map<String, String> map) {
        this.values = null;
        this.ah$a = null;
        this.toString = null;
        this.ag$a = null;
        this.values = uri;
        this.ah$a = str;
        this.ag$a = map;
        this.toString = valueOf();
    }

    public byte[] values() {
        String path = this.values.getPath();
        String query = this.values.getQuery();
        StringBuilder sb = new StringBuilder();
        sb.append(path);
        sb.append(query == null ? "" : "?" + query);
        String sb2 = sb.toString();
        String host = this.values.getHost();
        if (this.values.getPort() != -1) {
            host = host + ":" + this.values.getPort();
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Host", host);
        linkedHashMap.put(HttpHeaders.UPGRADE, "websocket");
        linkedHashMap.put("Connection", HttpHeaders.UPGRADE);
        linkedHashMap.put("Sec-WebSocket-Version", "13");
        linkedHashMap.put("Sec-WebSocket-Key", this.toString);
        String str = this.ah$a;
        if (str != null) {
            linkedHashMap.put("Sec-WebSocket-Protocol", str);
        }
        Map<String, String> map = this.ag$a;
        if (map != null) {
            for (String str2 : map.keySet()) {
                if (!linkedHashMap.containsKey(str2)) {
                    linkedHashMap.put(str2, this.ag$a.get(str2));
                }
            }
        }
        byte[] bytes = ((("GET " + sb2 + " HTTP/1.1\r\n") + ag$a(linkedHashMap)) + "\r\n").getBytes(Charset.defaultCharset());
        byte[] bArr = new byte[bytes.length];
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        return bArr;
    }

    private String ag$a(LinkedHashMap<String, String> linkedHashMap) {
        String str = new String();
        for (String str2 : linkedHashMap.keySet()) {
            str = str + str2 + ": " + linkedHashMap.get(str2) + "\r\n";
        }
        return str;
    }

    private String valueOf() {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 16; i++) {
            bArr[i] = (byte) ag$a(0, 255);
        }
        return Base64.encodeToString(bArr, 2);
    }

    public void toString(String str) {
        int parseInt = Integer.parseInt(str.substring(9, 12));
        if (parseInt == 407) {
            throw new WebSocketException("connection failed: proxy authentication not supported");
        }
        if (parseInt == 404) {
            throw new WebSocketException("connection failed: 404 not found");
        }
        if (parseInt == 101) {
            return;
        }
        throw new WebSocketException("connection failed: unknown status code " + parseInt);
    }

    public void toString(HashMap<String, String> hashMap) {
        if (!"websocket".equals(hashMap.get("upgrade"))) {
            throw new WebSocketException("connection failed: missing header field in server handshake: Upgrade");
        }
        if (!"upgrade".equals(hashMap.get("connection"))) {
            throw new WebSocketException("connection failed: missing header field in server handshake: Connection");
        }
    }

    private int ag$a(int i, int i2) {
        return (int) ((Math.random() * i2) + i);
    }
}
