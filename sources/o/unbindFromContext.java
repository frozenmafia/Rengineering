package o;

import com.app.dream11.di.services.ServiceModule;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class unbindFromContext implements MasterKey<dismissPopupMenus> {
    private final ServiceModule toString;

    public unbindFromContext(ServiceModule serviceModule) {
        this.toString = serviceModule;
    }

    @Override // javax.inject.Provider
    /* renamed from: values */
    public dismissPopupMenus ah$a() {
        return toString(this.toString);
    }

    public static unbindFromContext values(ServiceModule serviceModule) {
        return new unbindFromContext(serviceModule);
    }

    public static dismissPopupMenus toString(ServiceModule serviceModule) {
        return (dismissPopupMenus) Objects.requireNonNull(serviceModule.ag$a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
