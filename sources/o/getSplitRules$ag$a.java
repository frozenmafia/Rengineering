package o;

import java.net.InetAddress;
import java.net.InetSocketAddress;
/* loaded from: classes5.dex */
public final class getSplitRules$ag$a {
    private getSplitRules$ag$a() {
    }

    public /* synthetic */ getSplitRules$ag$a(getTargetTypes gettargettypes) {
        this();
    }

    public final String valueOf(InetSocketAddress inetSocketAddress) {
        runAnimators.ag$a(inetSocketAddress, "$this$socketHost");
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            String hostName = inetSocketAddress.getHostName();
            runAnimators.ah$a(hostName, "hostName");
            return hostName;
        }
        String hostAddress = address.getHostAddress();
        runAnimators.ah$a(hostAddress, "address.hostAddress");
        return hostAddress;
    }
}
