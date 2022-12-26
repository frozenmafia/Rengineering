package o;

import com.app.dream11.di.CoreModule;
import java.util.Objects;
import o.AbstractResolvableFuture;
/* loaded from: classes.dex */
public final class setSessionParameters implements MasterKey<AbstractResolvableFuture.AtomicHelper> {
    private final CoreModule values;

    public setSessionParameters(CoreModule coreModule) {
        this.values = coreModule;
    }

    @Override // javax.inject.Provider
    /* renamed from: ag$a */
    public AbstractResolvableFuture.AtomicHelper ah$a() {
        return valueOf(this.values);
    }

    public static setSessionParameters ah$a(CoreModule coreModule) {
        return new setSessionParameters(coreModule);
    }

    public static AbstractResolvableFuture.AtomicHelper valueOf(CoreModule coreModule) {
        return (AbstractResolvableFuture.AtomicHelper) Objects.requireNonNull(coreModule.ah$b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
