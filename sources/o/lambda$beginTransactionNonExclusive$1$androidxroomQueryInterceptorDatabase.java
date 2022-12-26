package o;

import java.security.Provider;
import java.security.SecureRandom;
/* renamed from: o.lambda$beginTransactionNonExclusive$1$androidx-room-QueryInterceptorDatabase  reason: invalid class name */
/* loaded from: classes7.dex */
public final class lambda$beginTransactionNonExclusive$1$androidxroomQueryInterceptorDatabase extends lambda$beginTransactionWithListenerNonExclusive$3$androidxroomQueryInterceptorDatabase {
    private Provider ag$a;
    private Provider ah$a;
    private Provider valueOf;

    public lambda$beginTransactionNonExclusive$1$androidxroomQueryInterceptorDatabase() {
        this(null, null, null, null, null);
    }

    public lambda$beginTransactionNonExclusive$1$androidxroomQueryInterceptorDatabase(Provider provider, Provider provider2, Provider provider3, Provider provider4, SecureRandom secureRandom) {
        super(provider, secureRandom);
        this.ag$a = provider2;
        this.ah$a = provider3;
        this.valueOf = provider4;
    }

    public Provider ag$a() {
        Provider provider = this.ag$a;
        return provider != null ? provider : ah$a();
    }

    public Provider valueOf() {
        Provider provider = this.ah$a;
        return provider != null ? provider : ah$a();
    }

    public Provider HaptikSDK$a() {
        Provider provider = this.valueOf;
        return provider != null ? provider : ah$a();
    }
}
