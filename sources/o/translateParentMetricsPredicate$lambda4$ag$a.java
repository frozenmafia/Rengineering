package o;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import o.Visibility;
import okhttp3.Headers;
import okhttp3.Response;
import org.apache.http.HttpHeaders;
import org.apache.http.protocol.HTTP;
/* renamed from: o.translateParentMetricsPredicate$lambda-4$ag$a  reason: invalid class name */
/* loaded from: classes5.dex */
public final class translateParentMetricsPredicate$lambda4$ag$a {
    private translateParentMetricsPredicate$lambda4$ag$a() {
    }

    public /* synthetic */ translateParentMetricsPredicate$lambda4$ag$a(getTargetTypes gettargettypes) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Response ag$a(Response response) {
        return (response != null ? response.body() : null) != null ? response.newBuilder().body(null).build() : response;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Headers ah$a(Headers headers, Headers headers2) {
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            String name = headers.name(i);
            String value = headers.value(i);
            if (!Visibility.Mode.toString(HttpHeaders.WARNING, name, true) || !Visibility.Mode.ah$a(value, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, false, 2, (Object) null)) {
                translateParentMetricsPredicate$lambda4$ag$a translateparentmetricspredicate_lambda4_ag_a = this;
                if (translateparentmetricspredicate_lambda4_ag_a.values(name) || !translateparentmetricspredicate_lambda4_ag_a.valueOf(name) || headers2.get(name) == null) {
                    builder.addLenient$okhttp(name, value);
                }
            }
        }
        int size2 = headers2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String name2 = headers2.name(i2);
            translateParentMetricsPredicate$lambda4$ag$a translateparentmetricspredicate_lambda4_ag_a2 = this;
            if (!translateparentmetricspredicate_lambda4_ag_a2.values(name2) && translateparentmetricspredicate_lambda4_ag_a2.valueOf(name2)) {
                builder.addLenient$okhttp(name2, headers2.value(i2));
            }
        }
        return builder.build();
    }

    private final boolean valueOf(String str) {
        return (Visibility.Mode.toString("Connection", str, true) || Visibility.Mode.toString(HTTP.CONN_KEEP_ALIVE, str, true) || Visibility.Mode.toString("Proxy-Authenticate", str, true) || Visibility.Mode.toString("Proxy-Authorization", str, true) || Visibility.Mode.toString(HttpHeaders.TE, str, true) || Visibility.Mode.toString("Trailers", str, true) || Visibility.Mode.toString("Transfer-Encoding", str, true) || Visibility.Mode.toString(HttpHeaders.UPGRADE, str, true)) ? false : true;
    }

    private final boolean values(String str) {
        return Visibility.Mode.toString("Content-Length", str, true) || Visibility.Mode.toString("Content-Encoding", str, true) || Visibility.Mode.toString("Content-Type", str, true);
    }
}
