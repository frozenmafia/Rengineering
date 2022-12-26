package o;

import com.app.dream11.di.CoreModule;
import java.util.Objects;
/* loaded from: classes.dex */
public final class addToolbarItem implements MasterKey<enableHomeButtonByDefault> {
    private final CoreModule valueOf;

    public addToolbarItem(CoreModule coreModule) {
        this.valueOf = coreModule;
    }

    @Override // javax.inject.Provider
    /* renamed from: valueOf */
    public enableHomeButtonByDefault ah$a() {
        return toString(this.valueOf);
    }

    public static addToolbarItem ag$a(CoreModule coreModule) {
        return new addToolbarItem(coreModule);
    }

    public static enableHomeButtonByDefault toString(CoreModule coreModule) {
        return (enableHomeButtonByDefault) Objects.requireNonNull(coreModule.HaptikSDK$a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
