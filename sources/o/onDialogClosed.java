package o;

import android.content.Context;
import javax.inject.Provider;
import o.EditTextPreference;
/* loaded from: classes7.dex */
public final class onDialogClosed implements needInputMethod<onBindDialogView> {
    private final Provider<EditTextPreference.SavedState> toString;
    private final Provider<Context> valueOf;

    public onDialogClosed(Provider<Context> provider, Provider<EditTextPreference.SavedState> provider2) {
        this.valueOf = provider;
        this.toString = provider2;
    }

    @Override // javax.inject.Provider
    /* renamed from: values */
    public onBindDialogView ah$a() {
        return ag$a(this.valueOf.ah$a(), this.toString.ah$a());
    }

    public static onDialogClosed ag$a(Provider<Context> provider, Provider<EditTextPreference.SavedState> provider2) {
        return new onDialogClosed(provider, provider2);
    }

    public static onBindDialogView ag$a(Context context, Object obj) {
        return new onBindDialogView(context, (EditTextPreference.SavedState) obj);
    }
}
