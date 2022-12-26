package o;

import com.app.dream11.di.services.ServiceModule;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class notifyMessageChannelReadyInternal implements MasterKey<performShortcut> {
    private final ServiceModule ah$a;

    public notifyMessageChannelReadyInternal(ServiceModule serviceModule) {
        this.ah$a = serviceModule;
    }

    @Override // javax.inject.Provider
    /* renamed from: ag$a */
    public performShortcut ah$a() {
        return valueOf(this.ah$a);
    }

    public static notifyMessageChannelReadyInternal ag$a(ServiceModule serviceModule) {
        return new notifyMessageChannelReadyInternal(serviceModule);
    }

    public static performShortcut valueOf(ServiceModule serviceModule) {
        return (performShortcut) Objects.requireNonNull(serviceModule.values(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
