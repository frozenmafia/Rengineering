package okhttp3;

import java.io.IOException;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes5.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    
    public static final Companion Companion = new Companion(null);
    private final String protocol;

    public static final Protocol get(String str) throws IOException {
        return Companion.get(str);
    }

    Protocol(String str) {
        this.protocol = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        public final Protocol get(String str) throws IOException {
            runAnimators.ag$a(str, "protocol");
            if (runAnimators.values((Object) str, (Object) Protocol.HTTP_1_0.protocol)) {
                return Protocol.HTTP_1_0;
            }
            if (runAnimators.values((Object) str, (Object) Protocol.HTTP_1_1.protocol)) {
                return Protocol.HTTP_1_1;
            }
            if (runAnimators.values((Object) str, (Object) Protocol.H2_PRIOR_KNOWLEDGE.protocol)) {
                return Protocol.H2_PRIOR_KNOWLEDGE;
            }
            if (runAnimators.values((Object) str, (Object) Protocol.HTTP_2.protocol)) {
                return Protocol.HTTP_2;
            }
            if (runAnimators.values((Object) str, (Object) Protocol.SPDY_3.protocol)) {
                return Protocol.SPDY_3;
            }
            if (runAnimators.values((Object) str, (Object) Protocol.QUIC.protocol)) {
                return Protocol.QUIC;
            }
            throw new IOException("Unexpected protocol: " + str);
        }
    }
}
