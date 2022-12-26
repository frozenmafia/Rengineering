package o;

import com.app.dream11.di.CoreModule;
import java.util.Objects;
/* loaded from: classes.dex */
public final class shouldAlwaysUseBrowserUI implements MasterKey<updateChildrenFromSolver> {
    private final CoreModule ah$a;

    public shouldAlwaysUseBrowserUI(CoreModule coreModule) {
        this.ah$a = coreModule;
    }

    @Override // javax.inject.Provider
    /* renamed from: values */
    public updateChildrenFromSolver ah$a() {
        return valueOf(this.ah$a);
    }

    public static shouldAlwaysUseBrowserUI ag$a(CoreModule coreModule) {
        return new shouldAlwaysUseBrowserUI(coreModule);
    }

    public static updateChildrenFromSolver valueOf(CoreModule coreModule) {
        return (updateChildrenFromSolver) Objects.requireNonNull(coreModule.values(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
