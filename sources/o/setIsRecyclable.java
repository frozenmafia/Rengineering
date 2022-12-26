package o;

import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;
import java.util.Objects;
/* loaded from: classes7.dex */
public final class setIsRecyclable implements MasterKey<isAttachedToTransitionOverlay> {
    private final FirebasePerformanceModule toString;

    public setIsRecyclable(FirebasePerformanceModule firebasePerformanceModule) {
        this.toString = firebasePerformanceModule;
    }

    @Override // javax.inject.Provider
    /* renamed from: values */
    public isAttachedToTransitionOverlay ah$a() {
        return values(this.toString);
    }

    public static setIsRecyclable ag$a(FirebasePerformanceModule firebasePerformanceModule) {
        return new setIsRecyclable(firebasePerformanceModule);
    }

    public static isAttachedToTransitionOverlay values(FirebasePerformanceModule firebasePerformanceModule) {
        return (isAttachedToTransitionOverlay) Objects.requireNonNull(firebasePerformanceModule.valueOf(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
