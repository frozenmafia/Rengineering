package o;

import com.app.dream11.newhome.navigation.NavItem;
/* loaded from: classes3.dex */
public final class addAnchors extends setGoneMargin {
    private final androidx.databinding.ObservableBoolean ag$a;
    private final androidx.databinding.ObservableField<String> ah$a;
    private final androidx.databinding.ObservableField<Integer> ah$b;
    private final enableHomeButtonByDefault invoke;
    private final androidx.databinding.ObservableField<Integer> toString;
    private final androidx.databinding.ObservableField<String> valueOf;
    private final androidx.databinding.ObservableField<Boolean> values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public addAnchors(enableHomeButtonByDefault enablehomebuttonbydefault, int i, int i2, isChainHead ischainhead, NavItem navItem) {
        super(i, i2, ischainhead, navItem);
        runAnimators.ag$a(enablehomebuttonbydefault, "resourceProvider");
        runAnimators.ag$a(ischainhead, "handler");
        runAnimators.ag$a(navItem, "navItem");
        this.invoke = enablehomebuttonbydefault;
        this.valueOf = new androidx.databinding.ObservableField<>("");
        this.ah$b = new androidx.databinding.ObservableField<>(Integer.valueOf(enablehomebuttonbydefault.ag$a(com.app.dream11Pro.R.color.d11_color_neutral__60)));
        this.ah$a = new androidx.databinding.ObservableField<>("");
        this.ag$a = new androidx.databinding.ObservableBoolean(false);
        this.toString = new androidx.databinding.ObservableField<>(Integer.valueOf(enablehomebuttonbydefault.ag$a(com.app.dream11Pro.R.color.d11_color_neutral__100)));
        this.values = new androidx.databinding.ObservableField<>(false);
    }

    public final androidx.databinding.ObservableField<String> ah$a() {
        return this.valueOf;
    }

    public final androidx.databinding.ObservableField<Integer> ah$b() {
        return this.ah$b;
    }

    public final androidx.databinding.ObservableBoolean ag$a() {
        return this.ag$a;
    }

    public final androidx.databinding.ObservableField<Integer> values() {
        return this.toString;
    }

    public final androidx.databinding.ObservableField<Boolean> valueOf() {
        return this.values;
    }
}
