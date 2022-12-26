package o;
/* loaded from: classes3.dex */
public final class getFutureValue {
    private final values ag$a;
    private final androidx.databinding.ObservableBoolean toString;
    private final androidx.databinding.ObservableField<String> valueOf;
    private final boolean values;

    /* loaded from: classes3.dex */
    public interface values {
        void ag$a(int i);
    }

    public getFutureValue(values valuesVar, boolean z) {
        runAnimators.ag$a(valuesVar, "uiHandler");
        this.ag$a = valuesVar;
        this.values = z;
        this.valueOf = new androidx.databinding.ObservableField<>();
        this.toString = new androidx.databinding.ObservableBoolean(false);
    }

    public final boolean ah$a() {
        return this.values;
    }

    public final values values() {
        return this.ag$a;
    }

    public final androidx.databinding.ObservableField<String> ag$a() {
        return this.valueOf;
    }

    public final androidx.databinding.ObservableBoolean valueOf() {
        return this.toString;
    }
}
