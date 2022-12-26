package o;

import java.security.Provider;
import java.security.SecureRandom;
/* renamed from: o.lambda$beginTransactionWithListenerNonExclusive$3$androidx-room-QueryInterceptorDatabase  reason: invalid class name */
/* loaded from: classes7.dex */
public class lambda$beginTransactionWithListenerNonExclusive$3$androidxroomQueryInterceptorDatabase {
    private Provider ag$a;
    private SecureRandom valueOf;

    public lambda$beginTransactionWithListenerNonExclusive$3$androidxroomQueryInterceptorDatabase() {
        this(null, null);
    }

    public lambda$beginTransactionWithListenerNonExclusive$3$androidxroomQueryInterceptorDatabase(Provider provider, SecureRandom secureRandom) {
        this.ag$a = provider;
        this.valueOf = secureRandom;
    }

    public Provider ah$a() {
        return this.ag$a;
    }

    public SecureRandom values() {
        SecureRandom secureRandom = this.valueOf;
        return secureRandom != null ? secureRandom : new SecureRandom();
    }
}
