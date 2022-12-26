package o;

import com.app.dream11.newhome.navigation.NavItem;
/* loaded from: classes3.dex */
public final class applyConstraints extends createObjectVariables {
    private final androidx.databinding.ObservableField<String> ag$a;
    private final androidx.databinding.ObservableField<String> ah$a;
    private final enableHomeButtonByDefault ah$b;
    private final androidx.databinding.ObservableField<Boolean> toString;
    private final androidx.databinding.ObservableField<Boolean> valueOf;
    private final androidx.databinding.ObservableField<Float> values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public applyConstraints(enableHomeButtonByDefault enablehomebuttonbydefault, int i, int i2, isChainHead ischainhead, NavItem navItem) {
        super(i, i2, ischainhead, navItem);
        runAnimators.ag$a(enablehomebuttonbydefault, "resourceProvider");
        runAnimators.ag$a(ischainhead, "handler");
        runAnimators.ag$a(navItem, "navItem");
        this.ah$b = enablehomebuttonbydefault;
        this.ah$a = new androidx.databinding.ObservableField<>("");
        this.valueOf = new androidx.databinding.ObservableField<>(true);
        this.ag$a = new androidx.databinding.ObservableField<>("");
        this.toString = new androidx.databinding.ObservableField<>(true);
        this.values = new androidx.databinding.ObservableField<>(Float.valueOf(enablehomebuttonbydefault.toString(com.app.dream11Pro.R.dimen.d11_space_03)));
    }

    public final androidx.databinding.ObservableField<Boolean> ah$a() {
        return this.valueOf;
    }

    public final androidx.databinding.ObservableField<Boolean> invoke() {
        return this.toString;
    }

    public final androidx.databinding.ObservableField<Float> ag$a() {
        return this.values;
    }
}
