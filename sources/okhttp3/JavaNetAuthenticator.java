package okhttp3;

import java.io.IOException;
import o.runAnimators;
/* loaded from: classes8.dex */
public final class JavaNetAuthenticator implements Authenticator {
    @Override // okhttp3.Authenticator
    public Request authenticate(Route route, Response response) throws IOException {
        runAnimators.ag$a(response, "response");
        return Authenticator.JAVA_NET_AUTHENTICATOR.authenticate(route, response);
    }
}
