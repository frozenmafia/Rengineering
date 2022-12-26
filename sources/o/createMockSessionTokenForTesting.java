package o;

import com.app.dream11.di.module.NetworkModule;
import java.util.Objects;
import javax.inject.Provider;
/* loaded from: classes3.dex */
public final class createMockSessionTokenForTesting implements MasterKey<MenuDialogHelper> {
    private final Provider<MenuDialogHelper$ag$a> ah$a;
    private final NetworkModule values;

    public createMockSessionTokenForTesting(NetworkModule networkModule, Provider<MenuDialogHelper$ag$a> provider) {
        this.values = networkModule;
        this.ah$a = provider;
    }

    @Override // javax.inject.Provider
    /* renamed from: values */
    public MenuDialogHelper ah$a() {
        return ah$a(this.values, this.ah$a.ah$a());
    }

    public static createMockSessionTokenForTesting ag$a(NetworkModule networkModule, Provider<MenuDialogHelper$ag$a> provider) {
        return new createMockSessionTokenForTesting(networkModule, provider);
    }

    public static MenuDialogHelper ah$a(NetworkModule networkModule, MenuDialogHelper$ag$a menuDialogHelper$ag$a) {
        return (MenuDialogHelper) Objects.requireNonNull(networkModule.toString(menuDialogHelper$ag$a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
