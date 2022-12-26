package o;

import com.nimbusds.jose.JWSAlgorithm;
import java.util.Collections;
import java.util.Set;
/* loaded from: classes7.dex */
public abstract class notifyByTableInvalidStatus implements setAutoCloser {
    private final Set<JWSAlgorithm> ah$a;
    private final lambda$beginTransactionWithListenerNonExclusive$3$androidxroomQueryInterceptorDatabase toString = new lambda$beginTransactionWithListenerNonExclusive$3$androidxroomQueryInterceptorDatabase();

    public notifyByTableInvalidStatus(Set<JWSAlgorithm> set) {
        if (set == null) {
            throw new IllegalArgumentException("The supported JWS algorithm set must not be null");
        }
        this.ah$a = Collections.unmodifiableSet(set);
    }

    @Override // o.setAutoCloser
    public Set<JWSAlgorithm> ag$a() {
        return this.ah$a;
    }

    public lambda$beginTransactionWithListenerNonExclusive$3$androidxroomQueryInterceptorDatabase values() {
        return this.toString;
    }
}
