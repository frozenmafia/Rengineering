package o;
/* loaded from: classes.dex */
public final class updateResourcesConfigurationForNightMode {
    private final androidx.databinding.ObservableField<String> ah$a;
    private final enableHomeButtonByDefault toString;
    private final toString valueOf;
    private final androidx.databinding.ObservableField<String> values;

    /* loaded from: classes.dex */
    public interface toString {
        void ah$a();
    }

    public updateResourcesConfigurationForNightMode(enableHomeButtonByDefault enablehomebuttonbydefault, toString tostring) {
        runAnimators.ag$a(enablehomebuttonbydefault, "resourceProvider");
        runAnimators.ag$a(tostring, "handler");
        this.toString = enablehomebuttonbydefault;
        this.valueOf = tostring;
        this.values = new androidx.databinding.ObservableField<>("");
        this.ah$a = new androidx.databinding.ObservableField<>("");
    }

    public final toString ah$a() {
        return this.valueOf;
    }

    public final androidx.databinding.ObservableField<String> ag$a() {
        return this.values;
    }

    public final androidx.databinding.ObservableField<String> values() {
        return this.ah$a;
    }

    public final void ah$a(double d, double d2) {
        int i;
        androidx.databinding.ObservableField<String> observableField = this.values;
        enableHomeButtonByDefault enablehomebuttonbydefault = this.toString;
        if (d > d2) {
            i = com.app.dream11Pro.R.string.res_0x7f1205c4;
        } else {
            i = (d > d2 ? 1 : (d == d2 ? 0 : -1)) == 0 ? com.app.dream11Pro.R.string.res_0x7f1205c2 : com.app.dream11Pro.R.string.res_0x7f1205c3;
        }
        observableField.set(enablehomebuttonbydefault.valueOf(i, new Object[0]));
    }
}
