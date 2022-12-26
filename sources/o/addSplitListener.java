package o;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
/* loaded from: classes5.dex */
public final class addSplitListener extends ProxySelector {
    public static final addSplitListener ah$a = new addSplitListener();

    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    private addSplitListener() {
    }

    @Override // java.net.ProxySelector
    public List<Proxy> select(URI uri) {
        if (uri == null) {
            throw new IllegalArgumentException("uri must not be null".toString());
        }
        return reserveEndViewTransition.ag$a(Proxy.NO_PROXY);
    }
}
