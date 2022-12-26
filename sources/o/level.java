package o;

import com.app.dream11.localeManager.D11Locale;
import com.app.dream11.ui.databinding.RxObservableField;
/* loaded from: classes.dex */
public final class level extends androidx.databinding.BaseObservable {
    private final allOf ag$a;
    private RxObservableField<String> ah$a;
    private RxObservableField<String> toString;
    private final RxObservableField<D11Locale> valueOf;
    private RxObservableField<String> values;

    public level(allOf allof) {
        runAnimators.ag$a(allof, "iLanguageSelectionHandler");
        this.ag$a = allof;
        this.toString = new RxObservableField<>("");
        this.ah$a = new RxObservableField<>("");
        this.values = new RxObservableField<>("");
        this.valueOf = new RxObservableField<>(D11Locale.ENGLISH);
    }

    public final allOf valueOf() {
        return this.ag$a;
    }

    public final RxObservableField<D11Locale> ag$a() {
        return this.valueOf;
    }
}
