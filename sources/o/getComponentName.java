package o;

import com.app.dream11.di.module.NetworkModule;
import com.app.dream11.model.IEventDataProvider;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class getComponentName implements MasterKey<IEventDataProvider> {
    private final NetworkModule ag$a;

    public getComponentName(NetworkModule networkModule) {
        this.ag$a = networkModule;
    }

    @Override // javax.inject.Provider
    /* renamed from: ag$a */
    public IEventDataProvider ah$a() {
        return ah$a(this.ag$a);
    }

    public static getComponentName ag$a(NetworkModule networkModule) {
        return new getComponentName(networkModule);
    }

    public static IEventDataProvider ah$a(NetworkModule networkModule) {
        return (IEventDataProvider) Objects.requireNonNull(networkModule.values(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
