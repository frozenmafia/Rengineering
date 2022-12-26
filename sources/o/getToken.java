package o;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
/* loaded from: classes.dex */
public class getToken implements hashCode {
    @Override // o.hashCode
    public setExtraBinder values(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new setSession2Token(httpURLConnection);
    }
}
