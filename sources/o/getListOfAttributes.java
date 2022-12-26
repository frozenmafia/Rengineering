package o;
/* loaded from: classes3.dex */
public final class getListOfAttributes {
    private final androidx.databinding.ObservableField<Boolean> ag$a;
    private final valueOf values;

    /* loaded from: classes3.dex */
    public interface valueOf {
    }

    public getListOfAttributes(valueOf valueof) {
        runAnimators.ag$a(valueof, "handler");
        this.values = valueof;
        this.ag$a = new androidx.databinding.ObservableField<>(false);
    }

    public final androidx.databinding.ObservableField<Boolean> values() {
        return this.ag$a;
    }
}
