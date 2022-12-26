package o;

import com.app.dream11.model.viewmodel.BasePageVM;
/* loaded from: classes3.dex */
public final class recomputeDimensions extends BasePageVM {
    private String ag$a;
    private final setLastVerticalBias ah$a;
    private final androidx.databinding.ObservableField<String> valueOf;
    private final boolean values;

    public recomputeDimensions(setLastVerticalBias setlastverticalbias, boolean z) {
        runAnimators.ag$a(setlastverticalbias, "handler");
        this.ah$a = setlastverticalbias;
        this.values = z;
        this.valueOf = new androidx.databinding.ObservableField<>();
    }

    public final setLastVerticalBias values() {
        return this.ah$a;
    }

    public final androidx.databinding.ObservableField<String> ah$a() {
        return this.valueOf;
    }

    public final void toString(String str) {
        runAnimators.ag$a(str, androidx.core.app.NotificationCompat.CATEGORY_MESSAGE);
        this.valueOf.set(str);
    }

    public final int HaptikSDK$a() {
        return this.ah$a.ag$a();
    }

    @androidx.databinding.Bindable
    public final String ag$a() {
        return this.ag$a;
    }

    public final void ag$a(String str) {
        if (runAnimators.values((Object) this.ag$a, (Object) str)) {
            return;
        }
        this.ag$a = str;
        notifyPropertyChanged(androidx.databinding.library.baseAdapters.BR.teamName);
        notifyPropertyChanged(androidx.databinding.library.baseAdapters.BR.saveButtonEnabled);
    }

    @androidx.databinding.Bindable
    public final boolean valueOf() {
        String str = this.ag$a;
        return !(str == null || str.length() == 0);
    }

    @androidx.databinding.Bindable
    public final boolean HaptikSDK$b() {
        return this.values;
    }
}
