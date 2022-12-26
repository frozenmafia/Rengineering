package o;
/* loaded from: classes3.dex */
public final class Reference implements convertDimension {
    private final androidx.databinding.ObservableField<String> ag$a;
    private final androidx.databinding.ObservableField<String> ah$a;
    private final androidx.databinding.ObservableBoolean toString;
    private final String valueOf;
    private final boolean values;

    public Reference(String str, boolean z, Integer num, enableHomeButtonByDefault enablehomebuttonbydefault) {
        runAnimators.ag$a(enablehomebuttonbydefault, "resourceProvider");
        this.valueOf = str;
        this.values = z;
        androidx.databinding.ObservableBoolean observableBoolean = new androidx.databinding.ObservableBoolean(false);
        this.toString = observableBoolean;
        androidx.databinding.ObservableField<String> observableField = new androidx.databinding.ObservableField<>("");
        this.ah$a = observableField;
        androidx.databinding.ObservableField<String> observableField2 = new androidx.databinding.ObservableField<>("");
        this.ag$a = observableField2;
        observableBoolean.set(num != null && num.intValue() == 0);
        if (z) {
            observableField.set(enablehomebuttonbydefault.valueOf(com.app.dream11Pro.R.string.res_0x7f120a33, new Object[0]));
        } else {
            Object[] objArr = new Object[1];
            objArr[0] = str == null ? "" : str;
            observableField.set(enablehomebuttonbydefault.valueOf(com.app.dream11Pro.R.string.res_0x7f120a32, objArr));
        }
        observableField2.set(enablehomebuttonbydefault.ah$a(com.app.dream11Pro.R.plurals.res_0x7f100000, values(num), new Object[0]));
    }

    public final androidx.databinding.ObservableBoolean ag$a() {
        return this.toString;
    }

    public final androidx.databinding.ObservableField<String> valueOf() {
        return this.ah$a;
    }

    public final androidx.databinding.ObservableField<String> values() {
        return this.ag$a;
    }

    private final int values(Integer num) {
        if (num != null && num.intValue() == 0) {
            return 1;
        }
        if ((num != null && num.intValue() == 1) || num == null) {
            return 1;
        }
        return num.intValue();
    }
}
