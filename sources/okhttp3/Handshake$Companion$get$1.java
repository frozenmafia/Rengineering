package okhttp3;

import java.security.cert.Certificate;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class Handshake$Companion$get$1 extends Lambda implements Styleable.ArcMotion<List<? extends Certificate>> {
    final /* synthetic */ List $peerCertificatesCopy;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Handshake$Companion$get$1(List list) {
        super(0);
        this.$peerCertificatesCopy = list;
    }

    @Override // o.Styleable.ArcMotion
    public final List<? extends Certificate> invoke() {
        return this.$peerCertificatesCopy;
    }
}
