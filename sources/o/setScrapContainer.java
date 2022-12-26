package o;

import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;
import java.util.Objects;
/* loaded from: classes7.dex */
public final class setScrapContainer implements MasterKey<quickRecycleScrapView<shouldHandleMeasuredHeightTooSmall>> {
    private final FirebasePerformanceModule valueOf;

    public setScrapContainer(FirebasePerformanceModule firebasePerformanceModule) {
        this.valueOf = firebasePerformanceModule;
    }

    @Override // javax.inject.Provider
    /* renamed from: ag$a */
    public quickRecycleScrapView<shouldHandleMeasuredHeightTooSmall> ah$a() {
        return valueOf(this.valueOf);
    }

    public static setScrapContainer values(FirebasePerformanceModule firebasePerformanceModule) {
        return new setScrapContainer(firebasePerformanceModule);
    }

    public static quickRecycleScrapView<shouldHandleMeasuredHeightTooSmall> valueOf(FirebasePerformanceModule firebasePerformanceModule) {
        return (quickRecycleScrapView) Objects.requireNonNull(firebasePerformanceModule.invoke(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
