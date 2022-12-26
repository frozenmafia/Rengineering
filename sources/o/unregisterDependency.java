package o;

import java.util.concurrent.Executor;
import javax.inject.Provider;
/* loaded from: classes7.dex */
public final class unregisterDependency implements needInputMethod<unregisterDependent> {
    private final Provider<Executor> ag$a;
    private final Provider<setOnPreferenceChangeListener> ah$a;
    private final Provider<callChangeListener> toString;
    private final Provider<getDependency> values;

    public unregisterDependency(Provider<Executor> provider, Provider<getDependency> provider2, Provider<callChangeListener> provider3, Provider<setOnPreferenceChangeListener> provider4) {
        this.ag$a = provider;
        this.values = provider2;
        this.toString = provider3;
        this.ah$a = provider4;
    }

    @Override // javax.inject.Provider
    /* renamed from: valueOf */
    public unregisterDependent ah$a() {
        return valueOf(this.ag$a.ah$a(), this.values.ah$a(), this.toString.ah$a(), this.ah$a.ah$a());
    }

    public static unregisterDependency toString(Provider<Executor> provider, Provider<getDependency> provider2, Provider<callChangeListener> provider3, Provider<setOnPreferenceChangeListener> provider4) {
        return new unregisterDependency(provider, provider2, provider3, provider4);
    }

    public static unregisterDependent valueOf(Executor executor, getDependency getdependency, callChangeListener callchangelistener, setOnPreferenceChangeListener setonpreferencechangelistener) {
        return new unregisterDependent(executor, getdependency, callchangelistener, setonpreferencechangelistener);
    }
}
