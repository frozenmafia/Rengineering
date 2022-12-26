package o;

import javax.inject.Provider;
/* loaded from: classes7.dex */
public final class persistString implements needInputMethod<getPreferenceDataStore> {
    private final Provider<String> ag$a;
    private final Provider<setOnPreferenceChangeInternalListener> ah$a;
    private final Provider<setOnPreferenceChangeInternalListener> toString;
    private final Provider<getOnPreferenceClickListener> valueOf;
    private final Provider<setDefaultValue> values;

    public persistString(Provider<setOnPreferenceChangeInternalListener> provider, Provider<setOnPreferenceChangeInternalListener> provider2, Provider<getOnPreferenceClickListener> provider3, Provider<setDefaultValue> provider4, Provider<String> provider5) {
        this.toString = provider;
        this.ah$a = provider2;
        this.valueOf = provider3;
        this.values = provider4;
        this.ag$a = provider5;
    }

    @Override // javax.inject.Provider
    /* renamed from: ag$a */
    public getPreferenceDataStore ah$a() {
        return ag$a(this.toString.ah$a(), this.ah$a.ah$a(), this.valueOf.ah$a(), this.values.ah$a(), this.ag$a);
    }

    public static persistString toString(Provider<setOnPreferenceChangeInternalListener> provider, Provider<setOnPreferenceChangeInternalListener> provider2, Provider<getOnPreferenceClickListener> provider3, Provider<setDefaultValue> provider4, Provider<String> provider5) {
        return new persistString(provider, provider2, provider3, provider4, provider5);
    }

    public static getPreferenceDataStore ag$a(setOnPreferenceChangeInternalListener setonpreferencechangeinternallistener, setOnPreferenceChangeInternalListener setonpreferencechangeinternallistener2, Object obj, Object obj2, Provider<String> provider) {
        return new getPreferenceDataStore(setonpreferencechangeinternallistener, setonpreferencechangeinternallistener2, (getOnPreferenceClickListener) obj, (setDefaultValue) obj2, provider);
    }
}
