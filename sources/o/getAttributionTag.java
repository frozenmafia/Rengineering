package o;
/* loaded from: classes3.dex */
public final class getAttributionTag extends androidx.databinding.BaseObservable {
    private androidx.databinding.ObservableField<Boolean> ag$a;
    @androidx.databinding.Bindable
    private String ah$a;
    private final enableHomeButtonByDefault valueOf;
    private boolean values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof getAttributionTag) {
            getAttributionTag getattributiontag = (getAttributionTag) obj;
            return this.values == getattributiontag.values && runAnimators.values(this.valueOf, getattributiontag.valueOf);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.values;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.valueOf.hashCode();
    }

    public String toString() {
        boolean z = this.values;
        enableHomeButtonByDefault enablehomebuttonbydefault = this.valueOf;
        return "NewFilterVM(fake=" + z + ", resourceProvider=" + enablehomebuttonbydefault + ")";
    }

    public getAttributionTag(boolean z, enableHomeButtonByDefault enablehomebuttonbydefault) {
        runAnimators.ag$a(enablehomebuttonbydefault, "resourceProvider");
        this.values = z;
        this.valueOf = enablehomebuttonbydefault;
        this.ag$a = new androidx.databinding.ObservableField<>(false);
        this.ah$a = enablehomebuttonbydefault.valueOf(com.app.dream11Pro.R.string.res_0x7f1202f2, new Object[0]);
    }

    public final androidx.databinding.ObservableField<Boolean> ah$a() {
        return this.ag$a;
    }
}
