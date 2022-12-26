package o;
/* loaded from: classes3.dex */
public final class getRelativeEnd {
    private final androidx.databinding.ObservableField<Boolean> ag$a;
    private final enableHomeButtonByDefault ah$a;
    private final androidx.databinding.ObservableField<String> ah$b;
    private final androidx.databinding.ObservableField<String> invoke;
    private final androidx.databinding.ObservableField<String> toString;
    private final androidx.databinding.ObservableField<String> valueOf;
    private final valueOf values;

    /* loaded from: classes3.dex */
    public interface valueOf {
        void ah$a();

        void valueOf();
    }

    public getRelativeEnd(valueOf valueof, enableHomeButtonByDefault enablehomebuttonbydefault) {
        runAnimators.ag$a(valueof, "handler");
        runAnimators.ag$a(enablehomebuttonbydefault, "resourceProvider");
        this.values = valueof;
        this.ah$a = enablehomebuttonbydefault;
        this.toString = new androidx.databinding.ObservableField<>();
        this.invoke = new androidx.databinding.ObservableField<>(enablehomebuttonbydefault.valueOf(com.app.dream11Pro.R.string.res_0x7f1209d7, new Object[0]));
        this.ah$b = new androidx.databinding.ObservableField<>(enablehomebuttonbydefault.valueOf(com.app.dream11Pro.R.string.res_0x7f1209d6, new Object[0]));
        this.valueOf = new androidx.databinding.ObservableField<>();
        this.ag$a = new androidx.databinding.ObservableField<>(true);
    }

    public final valueOf values() {
        return this.values;
    }

    public final androidx.databinding.ObservableField<String> valueOf() {
        return this.toString;
    }

    public final androidx.databinding.ObservableField<String> HaptikSDK$a() {
        return this.invoke;
    }

    public final androidx.databinding.ObservableField<String> HaptikSDK$b() {
        return this.ah$b;
    }

    public final androidx.databinding.ObservableField<String> ah$a() {
        return this.valueOf;
    }

    public final androidx.databinding.ObservableField<Boolean> ag$a() {
        return this.ag$a;
    }
}
