package o;
/* loaded from: classes3.dex */
public final class addIntAttributes extends androidx.databinding.BaseObservable {
    private androidx.databinding.ObservableField<String> HaptikSDK$a;
    private String HaptikSDK$b;
    private String HaptikSDK$c;
    private androidx.databinding.ObservableArrayList<applyToWithoutCustom> ag$a;
    private values ah$a;
    private int ah$b;
    private final enableHomeButtonByDefault invoke;
    private String toString;
    private androidx.databinding.ObservableField<Boolean> valueOf;
    private String values;

    /* loaded from: classes3.dex */
    public interface values {
        void toString(addIntAttributes addintattributes);
    }

    public addIntAttributes(values valuesVar, enableHomeButtonByDefault enablehomebuttonbydefault) {
        runAnimators.ag$a(valuesVar, "mIPaymentOffersItemVmHandler");
        runAnimators.ag$a(enablehomebuttonbydefault, "resourceProvider");
        this.ah$a = valuesVar;
        this.invoke = enablehomebuttonbydefault;
        this.HaptikSDK$b = "";
        this.toString = "";
        this.HaptikSDK$c = "";
        this.values = "";
        this.ag$a = new androidx.databinding.ObservableArrayList<>();
        this.valueOf = new androidx.databinding.ObservableField<>(false);
        this.HaptikSDK$a = new androidx.databinding.ObservableField<>(enablehomebuttonbydefault.valueOf(com.app.dream11Pro.R.string.res_0x7f120957, new Object[0]));
        this.ah$b = -1;
    }

    public final values ag$a() {
        return this.ah$a;
    }

    public final String HaptikSDK$c() {
        return this.HaptikSDK$b;
    }

    public final void ah$a(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.HaptikSDK$b = str;
    }

    public final String ah$a() {
        return this.toString;
    }

    public final void valueOf(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.toString = str;
    }

    public final void ag$a(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.HaptikSDK$c = str;
    }

    public final String invoke() {
        return this.HaptikSDK$c;
    }

    public final String values() {
        return this.values;
    }

    public final void values(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.values = str;
    }

    public final androidx.databinding.ObservableArrayList<applyToWithoutCustom> valueOf() {
        return this.ag$a;
    }

    public final androidx.databinding.ObservableField<Boolean> HaptikSDK$a() {
        return this.valueOf;
    }

    public final androidx.databinding.ObservableField<String> ah$b() {
        return this.HaptikSDK$a;
    }

    public final int HaptikSDK$b() {
        return this.ah$b;
    }

    public final void values(int i) {
        this.ah$b = i;
    }
}
