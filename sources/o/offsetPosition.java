package o;

import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;
import java.util.Objects;
/* loaded from: classes7.dex */
public final class offsetPosition implements MasterKey<dispatchRemoveStarting> {
    private final FirebasePerformanceModule valueOf;

    public offsetPosition(FirebasePerformanceModule firebasePerformanceModule) {
        this.valueOf = firebasePerformanceModule;
    }

    @Override // javax.inject.Provider
    /* renamed from: valueOf */
    public dispatchRemoveStarting ah$a() {
        return ah$a(this.valueOf);
    }

    public static offsetPosition values(FirebasePerformanceModule firebasePerformanceModule) {
        return new offsetPosition(firebasePerformanceModule);
    }

    public static dispatchRemoveStarting ah$a(FirebasePerformanceModule firebasePerformanceModule) {
        return (dispatchRemoveStarting) Objects.requireNonNull(firebasePerformanceModule.values(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
