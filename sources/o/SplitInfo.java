package o;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLPeerUnverifiedException;
/* loaded from: classes5.dex */
public final class SplitInfo extends SplitPairFilter {
    public static final values toString = new values(null);
    private final getSecondaryActivityStack ah$a;

    public SplitInfo(getSecondaryActivityStack getsecondaryactivitystack) {
        runAnimators.ag$a(getsecondaryactivitystack, "trustRootIndex");
        this.ah$a = getsecondaryactivitystack;
    }

    @Override // o.SplitPairFilter
    public List<Certificate> valueOf(List<? extends Certificate> list, String str) throws SSLPeerUnverifiedException {
        runAnimators.ag$a(list, "chain");
        runAnimators.ag$a(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        runAnimators.ah$a(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            Objects.requireNonNull(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate values2 = this.ah$a.values(x509Certificate);
            if (values2 != null) {
                if (arrayList.size() > 1 || (!runAnimators.values(x509Certificate, values2))) {
                    arrayList.add(values2);
                }
                if (ah$a(values2, values2)) {
                    return arrayList;
                }
                z = true;
            } else {
                Iterator it = arrayDeque.iterator();
                runAnimators.ah$a(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    Objects.requireNonNull(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (ah$a(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    private final boolean ah$a(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!runAnimators.values(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public int hashCode() {
        return this.ah$a.hashCode();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof SplitInfo) && runAnimators.values(((SplitInfo) obj).ah$a, this.ah$a));
    }

    /* loaded from: classes5.dex */
    public static final class values {
        private values() {
        }

        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }
    }
}
