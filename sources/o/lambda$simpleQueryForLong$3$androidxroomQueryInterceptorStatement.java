package o;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
/* renamed from: o.lambda$simpleQueryForLong$3$androidx-room-QueryInterceptorStatement  reason: invalid class name */
/* loaded from: classes7.dex */
public class lambda$simpleQueryForLong$3$androidxroomQueryInterceptorStatement extends saveArgsToCache {
    private Proxy ag$a;
    private final SSLSocketFactory toString;
    private boolean values;

    public lambda$simpleQueryForLong$3$androidxroomQueryInterceptorStatement() {
        this(0, 0);
    }

    public lambda$simpleQueryForLong$3$androidxroomQueryInterceptorStatement(int i, int i2) {
        this(i, i2, 0);
    }

    public lambda$simpleQueryForLong$3$androidxroomQueryInterceptorStatement(int i, int i2, int i3) {
        this(i, i2, i3, true);
    }

    public lambda$simpleQueryForLong$3$androidxroomQueryInterceptorStatement(int i, int i2, int i3, boolean z) {
        this(i, i2, i3, z, null);
    }

    public lambda$simpleQueryForLong$3$androidxroomQueryInterceptorStatement(int i, int i2, int i3, boolean z, SSLSocketFactory sSLSocketFactory) {
        super(i, i2, i3);
        this.values = z;
        this.toString = sSLSocketFactory;
    }

    public void valueOf(Proxy proxy) {
        this.ag$a = proxy;
    }

    public observedEntities valueOf(URL url) throws IOException {
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                HttpURLConnection values = values(url);
                values.setConnectTimeout(ag$a());
                values.setReadTimeout(valueOf());
                SSLSocketFactory sSLSocketFactory = this.toString;
                if (sSLSocketFactory != null && (values instanceof HttpsURLConnection)) {
                    ((HttpsURLConnection) values).setSSLSocketFactory(sSLSocketFactory);
                }
                if (values() != null && !values().isEmpty()) {
                    for (Map.Entry<String, List<String>> entry : values().entrySet()) {
                        for (String str : entry.getValue()) {
                            values.addRequestProperty(entry.getKey(), str);
                        }
                    }
                }
                InputStream lambda_simplequeryforlong_3_androidxroomqueryinterceptorstatement = toString(values, ah$a());
                try {
                    String queryInterceptorStatement$$ExternalSyntheticLambda1 = QueryInterceptorStatement$$ExternalSyntheticLambda1.toString(lambda_simplequeryforlong_3_androidxroomqueryinterceptorstatement, StandardCharsets.UTF_8);
                    if (lambda_simplequeryforlong_3_androidxroomqueryinterceptorstatement != null) {
                        lambda_simplequeryforlong_3_androidxroomqueryinterceptorstatement.close();
                    }
                    int responseCode = values.getResponseCode();
                    String responseMessage = values.getResponseMessage();
                    if (responseCode > 299 || responseCode < 200) {
                        throw new IOException("HTTP " + responseCode + ": " + responseMessage);
                    }
                    observedEntities observedentities = new observedEntities(queryInterceptorStatement$$ExternalSyntheticLambda1, values.getContentType());
                    if (this.values && values != null) {
                        values.disconnect();
                    }
                    return observedentities;
                } finally {
                }
            } catch (ClassCastException e) {
                throw new IOException("Couldn't open HTTP(S) connection: " + e.getMessage(), e);
            }
        } catch (Throwable th) {
            if (this.values && 0 != 0) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    protected HttpURLConnection values(URL url) throws IOException {
        Proxy proxy = this.ag$a;
        if (proxy != null) {
            return (HttpURLConnection) url.openConnection(proxy);
        }
        return (HttpURLConnection) url.openConnection();
    }

    private InputStream toString(HttpURLConnection httpURLConnection, int i) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        return i > 0 ? new QueryInterceptorOpenHelper(inputStream, ah$a()) : inputStream;
    }
}
