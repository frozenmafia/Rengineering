package o;

import com.app.dream11.di.CoreModule;
import com.app.dream11.model.IAppDataProvider;
import java.util.Objects;
/* loaded from: classes.dex */
public final class addDefaultShareMenuItem implements MasterKey<IAppDataProvider> {
    private final CoreModule valueOf;

    public addDefaultShareMenuItem(CoreModule coreModule) {
        this.valueOf = coreModule;
    }

    @Override // javax.inject.Provider
    /* renamed from: valueOf */
    public IAppDataProvider ah$a() {
        return ag$a(this.valueOf);
    }

    public static addDefaultShareMenuItem values(CoreModule coreModule) {
        return new addDefaultShareMenuItem(coreModule);
    }

    public static IAppDataProvider ag$a(CoreModule coreModule) {
        return (IAppDataProvider) Objects.requireNonNull(coreModule.ag$a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
