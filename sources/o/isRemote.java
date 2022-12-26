package o;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JWEAlgorithm;
import java.util.Collections;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public abstract class isRemote implements notifyObserversByTableNames {
    private final lambda$beginTransactionNonExclusive$1$androidxroomQueryInterceptorDatabase toString = new lambda$beginTransactionNonExclusive$1$androidxroomQueryInterceptorDatabase();
    private final Set<EncryptionMethod> valueOf;
    private final Set<JWEAlgorithm> values;

    public isRemote(Set<JWEAlgorithm> set, Set<EncryptionMethod> set2) {
        if (set == null) {
            throw new IllegalArgumentException("The supported JWE algorithm set must not be null");
        }
        this.values = Collections.unmodifiableSet(set);
        if (set2 == null) {
            throw new IllegalArgumentException("The supported encryption methods must not be null");
        }
        this.valueOf = set2;
    }

    @Override // o.notifyObserversByTableNames
    public Set<JWEAlgorithm> values() {
        return this.values;
    }

    @Override // o.notifyObserversByTableNames
    public Set<EncryptionMethod> ah$a() {
        return this.valueOf;
    }

    public lambda$beginTransactionNonExclusive$1$androidxroomQueryInterceptorDatabase valueOf() {
        return this.toString;
    }
}
