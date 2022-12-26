package o;

import java.util.concurrent.Executor;
/* loaded from: classes7.dex */
public final class setPositiveButtonText implements needInputMethod<Executor> {
    @Override // javax.inject.Provider
    /* renamed from: ag$a */
    public Executor ah$a() {
        return valueOf();
    }

    public static setPositiveButtonText values() {
        return valueOf.toString;
    }

    public static Executor valueOf() {
        return (Executor) setPendingShowSoftInputRequest.values(setNegativeButtonText.values(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* loaded from: classes7.dex */
    static final class valueOf {
        private static final setPositiveButtonText toString = new setPositiveButtonText();
    }
}
