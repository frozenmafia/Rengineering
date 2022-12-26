package o;
/* loaded from: classes7.dex */
public final class getPersistedInt implements needInputMethod<getOnPreferenceClickListener> {
    @Override // javax.inject.Provider
    /* renamed from: values */
    public getOnPreferenceClickListener ah$a() {
        return ag$a();
    }

    public static getPersistedInt valueOf() {
        return values.ag$a;
    }

    public static getOnPreferenceClickListener ag$a() {
        getOnPreferenceClickListener getonpreferenceclicklistener;
        getonpreferenceclicklistener = getOnPreferenceClickListener.ah$a;
        return (getOnPreferenceClickListener) setPendingShowSoftInputRequest.values(getonpreferenceclicklistener, "Cannot return null from a non-@Nullable @Provides method");
    }

    /* loaded from: classes7.dex */
    static final class values {
        private static final getPersistedInt ag$a = new getPersistedInt();
    }
}
