package o;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
/* loaded from: classes5.dex */
public final class getPrimaryActivityStack implements getSecondaryActivityStack {
    private final Map<X500Principal, Set<X509Certificate>> ag$a;

    public getPrimaryActivityStack(X509Certificate... x509CertificateArr) {
        runAnimators.ag$a(x509CertificateArr, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            runAnimators.ah$a(subjectX500Principal, "caCert.subjectX500Principal");
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = (Set) new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.ag$a = linkedHashMap;
    }

    @Override // o.getSecondaryActivityStack
    public X509Certificate values(X509Certificate x509Certificate) {
        boolean z;
        runAnimators.ag$a(x509Certificate, "cert");
        Set<X509Certificate> set = this.ag$a.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set != null) {
            Iterator<T> it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                try {
                    x509Certificate.verify(((X509Certificate) next).getPublicKey());
                    z = true;
                    continue;
                } catch (Exception unused) {
                    z = false;
                    continue;
                }
                if (z) {
                    obj = next;
                    break;
                }
            }
            return (X509Certificate) obj;
        }
        return null;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof getPrimaryActivityStack) && runAnimators.values(((getPrimaryActivityStack) obj).ag$a, this.ag$a));
    }

    public int hashCode() {
        return this.ag$a.hashCode();
    }
}
