package o;

import com.app.dream11.newhome.navigation.NavItem;
/* loaded from: classes3.dex */
public final class ensureMeasureRequested extends setGoneMargin {
    private final androidx.databinding.ObservableBoolean ag$a;
    private final androidx.databinding.ObservableField<String> toString;
    private final androidx.databinding.ObservableField<String> valueOf;
    private final androidx.databinding.ObservableBoolean values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ensureMeasureRequested(int i, int i2, isChainHead ischainhead, NavItem navItem) {
        super(i, i2, ischainhead, navItem);
        runAnimators.ag$a(ischainhead, "handler");
        runAnimators.ag$a(navItem, "navItem");
        this.values = new androidx.databinding.ObservableBoolean(false);
        this.toString = new androidx.databinding.ObservableField<>("");
        this.ag$a = new androidx.databinding.ObservableBoolean(false);
        this.valueOf = new androidx.databinding.ObservableField<>("");
    }

    public final androidx.databinding.ObservableBoolean ag$a() {
        return this.values;
    }

    public final androidx.databinding.ObservableField<String> values() {
        return this.toString;
    }

    public final androidx.databinding.ObservableBoolean ah$a() {
        return this.ag$a;
    }

    public final androidx.databinding.ObservableField<String> valueOf() {
        return this.valueOf;
    }
}
