package o;

import com.google.firebase.FirebaseApp;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;
import java.util.Objects;
/* loaded from: classes7.dex */
public final class needsUpdate implements MasterKey<FirebaseApp> {
    private final FirebasePerformanceModule toString;

    public needsUpdate(FirebasePerformanceModule firebasePerformanceModule) {
        this.toString = firebasePerformanceModule;
    }

    @Override // javax.inject.Provider
    /* renamed from: ag$a */
    public FirebaseApp ah$a() {
        return values(this.toString);
    }

    public static needsUpdate ag$a(FirebasePerformanceModule firebasePerformanceModule) {
        return new needsUpdate(firebasePerformanceModule);
    }

    public static FirebaseApp values(FirebasePerformanceModule firebasePerformanceModule) {
        return (FirebaseApp) Objects.requireNonNull(firebasePerformanceModule.ah$a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
