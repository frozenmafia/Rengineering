package o;

import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;
import java.util.Objects;
/* loaded from: classes7.dex */
public final class isUpdated implements MasterKey<updateViewCacheSize> {
    private final FirebasePerformanceModule valueOf;

    public isUpdated(FirebasePerformanceModule firebasePerformanceModule) {
        this.valueOf = firebasePerformanceModule;
    }

    @Override // javax.inject.Provider
    /* renamed from: ag$a */
    public updateViewCacheSize ah$a() {
        return values(this.valueOf);
    }

    public static isUpdated toString(FirebasePerformanceModule firebasePerformanceModule) {
        return new isUpdated(firebasePerformanceModule);
    }

    public static updateViewCacheSize values(FirebasePerformanceModule firebasePerformanceModule) {
        return (updateViewCacheSize) Objects.requireNonNull(firebasePerformanceModule.ag$a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
