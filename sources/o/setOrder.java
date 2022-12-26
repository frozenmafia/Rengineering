package o;

import android.content.Context;
import javax.inject.Provider;
/* loaded from: classes7.dex */
public final class setOrder implements needInputMethod<setDefaultValue> {
    private final Provider<Context> ag$a;
    private final Provider<String> ah$a;
    private final Provider<Integer> valueOf;

    public setOrder(Provider<Context> provider, Provider<String> provider2, Provider<Integer> provider3) {
        this.ag$a = provider;
        this.ah$a = provider2;
        this.valueOf = provider3;
    }

    @Override // javax.inject.Provider
    /* renamed from: valueOf */
    public setDefaultValue ah$a() {
        return ag$a(this.ag$a.ah$a(), this.ah$a.ah$a(), this.valueOf.ah$a().intValue());
    }

    public static setOrder values(Provider<Context> provider, Provider<String> provider2, Provider<Integer> provider3) {
        return new setOrder(provider, provider2, provider3);
    }

    public static setDefaultValue ag$a(Context context, String str, int i) {
        return new setDefaultValue(context, str, i);
    }
}
