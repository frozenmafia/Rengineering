package o;

import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;
import java.util.Objects;
/* loaded from: classes7.dex */
public final class unScrap implements MasterKey<isRecyclable> {
    private final FirebasePerformanceModule ag$a;

    public unScrap(FirebasePerformanceModule firebasePerformanceModule) {
        this.ag$a = firebasePerformanceModule;
    }

    @Override // javax.inject.Provider
    /* renamed from: values */
    public isRecyclable ah$a() {
        return ah$a(this.ag$a);
    }

    public static unScrap ag$a(FirebasePerformanceModule firebasePerformanceModule) {
        return new unScrap(firebasePerformanceModule);
    }

    public static isRecyclable ah$a(FirebasePerformanceModule firebasePerformanceModule) {
        return (isRecyclable) Objects.requireNonNull(firebasePerformanceModule.ah$b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
