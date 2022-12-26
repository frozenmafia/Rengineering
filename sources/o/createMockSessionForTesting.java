package o;

import android.content.Context;
import com.app.dream11.di.module.NetworkModule;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class createMockSessionForTesting implements MasterKey<Context> {
    private final NetworkModule values;

    public createMockSessionForTesting(NetworkModule networkModule) {
        this.values = networkModule;
    }

    @Override // javax.inject.Provider
    /* renamed from: valueOf */
    public Context ah$a() {
        return valueOf(this.values);
    }

    public static createMockSessionForTesting values(NetworkModule networkModule) {
        return new createMockSessionForTesting(networkModule);
    }

    public static Context valueOf(NetworkModule networkModule) {
        return (Context) Objects.requireNonNull(networkModule.ah$a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
