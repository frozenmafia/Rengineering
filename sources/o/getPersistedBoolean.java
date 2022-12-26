package o;

import android.content.Context;
import javax.inject.Provider;
/* loaded from: classes7.dex */
public final class getPersistedBoolean implements needInputMethod<String> {
    private final Provider<Context> ah$a;

    public getPersistedBoolean(Provider<Context> provider) {
        this.ah$a = provider;
    }

    @Override // javax.inject.Provider
    /* renamed from: ag$a */
    public String ah$a() {
        return valueOf(this.ah$a.ah$a());
    }

    public static getPersistedBoolean ah$a(Provider<Context> provider) {
        return new getPersistedBoolean(provider);
    }

    public static String valueOf(Context context) {
        String packageName;
        packageName = context.getPackageName();
        return (String) setPendingShowSoftInputRequest.values(packageName, "Cannot return null from a non-@Nullable @Provides method");
    }
}
