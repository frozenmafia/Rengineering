package o;

import com.app.dream11.di.services.ServiceModule;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class isBoundToService implements MasterKey<colPut> {
    private final ServiceModule toString;

    public isBoundToService(ServiceModule serviceModule) {
        this.toString = serviceModule;
    }

    @Override // javax.inject.Provider
    /* renamed from: ag$a */
    public colPut ah$a() {
        return valueOf(this.toString);
    }

    public static isBoundToService toString(ServiceModule serviceModule) {
        return new isBoundToService(serviceModule);
    }

    public static colPut valueOf(ServiceModule serviceModule) {
        return (colPut) Objects.requireNonNull(serviceModule.valueOf(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
