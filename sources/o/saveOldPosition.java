package o;

import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;
import java.util.Objects;
/* loaded from: classes7.dex */
public final class saveOldPosition implements MasterKey<quickRecycleScrapView<createOrientationHelpers>> {
    private final FirebasePerformanceModule valueOf;

    public saveOldPosition(FirebasePerformanceModule firebasePerformanceModule) {
        this.valueOf = firebasePerformanceModule;
    }

    @Override // javax.inject.Provider
    /* renamed from: valueOf */
    public quickRecycleScrapView<createOrientationHelpers> ah$a() {
        return ag$a(this.valueOf);
    }

    public static saveOldPosition ah$a(FirebasePerformanceModule firebasePerformanceModule) {
        return new saveOldPosition(firebasePerformanceModule);
    }

    public static quickRecycleScrapView<createOrientationHelpers> ag$a(FirebasePerformanceModule firebasePerformanceModule) {
        return (quickRecycleScrapView) Objects.requireNonNull(firebasePerformanceModule.HaptikSDK$a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
