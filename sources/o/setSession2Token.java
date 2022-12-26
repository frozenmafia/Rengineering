package o;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
/* loaded from: classes.dex */
public class setSession2Token implements setExtraBinder {
    private final HttpURLConnection ag$a;

    public setSession2Token(HttpURLConnection httpURLConnection) {
        this.ag$a = httpURLConnection;
    }

    @Override // o.setExtraBinder
    public boolean values() {
        return this.ag$a.getResponseCode() / 100 == 2;
    }

    @Override // o.setExtraBinder
    public InputStream ag$a() throws IOException {
        return this.ag$a.getInputStream();
    }

    @Override // o.setExtraBinder
    public String valueOf() {
        return this.ag$a.getContentType();
    }

    @Override // o.setExtraBinder
    public String ah$a() {
        try {
            if (values()) {
                return null;
            }
            return "Unable to fetch " + this.ag$a.getURL() + ". Failed with " + this.ag$a.getResponseCode() + "\n" + ah$a(this.ag$a);
        } catch (IOException e) {
            ResultReceiver.values("get error failed ", e);
            return e.getMessage();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.ag$a.disconnect();
    }

    private String ah$a(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb.toString();
    }
}
