package o;

import android.content.Context;
import com.app.dream11.di.module.NetworkModule;
import java.util.Objects;
import javax.inject.Provider;
/* loaded from: classes3.dex */
public final class getBinder implements MasterKey<onActionViewExpanded> {
    private final Provider<Context> ah$a;
    private final NetworkModule toString;

    public getBinder(NetworkModule networkModule, Provider<Context> provider) {
        this.toString = networkModule;
        this.ah$a = provider;
    }

    @Override // javax.inject.Provider
    /* renamed from: valueOf */
    public onActionViewExpanded ah$a() {
        return toString(this.toString, this.ah$a.ah$a());
    }

    public static getBinder toString(NetworkModule networkModule, Provider<Context> provider) {
        return new getBinder(networkModule, provider);
    }

    public static onActionViewExpanded toString(NetworkModule networkModule, Context context) {
        return (onActionViewExpanded) Objects.requireNonNull(networkModule.ah$a(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
