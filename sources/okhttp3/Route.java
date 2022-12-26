package okhttp3;

import androidx.databinding.library.baseAdapters.BR;
import java.net.InetSocketAddress;
import java.net.Proxy;
import o.runAnimators;
/* loaded from: classes5.dex */
public final class Route {
    private final Address address;
    private final Proxy proxy;
    private final InetSocketAddress socketAddress;

    public Route(Address address, Proxy proxy, InetSocketAddress inetSocketAddress) {
        runAnimators.ag$a(address, "address");
        runAnimators.ag$a(proxy, "proxy");
        runAnimators.ag$a(inetSocketAddress, "socketAddress");
        this.address = address;
        this.proxy = proxy;
        this.socketAddress = inetSocketAddress;
    }

    public final Address address() {
        return this.address;
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final InetSocketAddress socketAddress() {
        return this.socketAddress;
    }

    /* renamed from: -deprecated_address  reason: not valid java name */
    public final Address m1388deprecated_address() {
        return this.address;
    }

    /* renamed from: -deprecated_proxy  reason: not valid java name */
    public final Proxy m1389deprecated_proxy() {
        return this.proxy;
    }

    /* renamed from: -deprecated_socketAddress  reason: not valid java name */
    public final InetSocketAddress m1390deprecated_socketAddress() {
        return this.socketAddress;
    }

    public final boolean requiresTunnel() {
        return this.address.sslSocketFactory() != null && this.proxy.type() == Proxy.Type.HTTP;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Route) {
            Route route = (Route) obj;
            if (runAnimators.values(route.address, this.address) && runAnimators.values(route.proxy, this.proxy) && runAnimators.values(route.socketAddress, this.socketAddress)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.address.hashCode();
        return ((((hashCode + BR.userTeamVM) * 31) + this.proxy.hashCode()) * 31) + this.socketAddress.hashCode();
    }

    public String toString() {
        return "Route{" + this.socketAddress + '}';
    }
}
