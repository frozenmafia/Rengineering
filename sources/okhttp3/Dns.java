package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import o.getStartAlpha;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes5.dex */
public interface Dns {
    public static final Companion Companion = new Companion(null);
    public static final Dns SYSTEM = new Companion.DnsSystem();

    List<InetAddress> lookup(String str) throws UnknownHostException;

    /* loaded from: classes5.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;

        private Companion() {
        }

        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        /* loaded from: classes5.dex */
        static final class DnsSystem implements Dns {
            @Override // okhttp3.Dns
            public List<InetAddress> lookup(String str) {
                runAnimators.ag$a(str, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    runAnimators.ah$a(allByName, "InetAddress.getAllByName(hostname)");
                    return getStartAlpha.HaptikSDK$d(allByName);
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + str);
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            }
        }
    }
}
