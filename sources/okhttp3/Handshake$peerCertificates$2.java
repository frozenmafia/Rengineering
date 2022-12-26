package okhttp3;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.reserveEndViewTransition;
/* loaded from: classes5.dex */
final class Handshake$peerCertificates$2 extends Lambda implements Styleable.ArcMotion<List<? extends Certificate>> {
    final /* synthetic */ Styleable.ArcMotion $peerCertificatesFn;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Handshake$peerCertificates$2(Styleable.ArcMotion arcMotion) {
        super(0);
        this.$peerCertificatesFn = arcMotion;
    }

    @Override // o.Styleable.ArcMotion
    public final List<? extends Certificate> invoke() {
        try {
            return (List) this.$peerCertificatesFn.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            return reserveEndViewTransition.valueOf();
        }
    }
}
