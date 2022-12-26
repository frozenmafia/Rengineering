package o;

import com.app.dream11.newhome.navigation.NavItem;
/* loaded from: classes3.dex */
public final class ensureWidgetRuns extends createObjectVariables {
    private final androidx.databinding.ObservableField<Boolean> valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ensureWidgetRuns(int i, int i2, isChainHead ischainhead, NavItem navItem) {
        super(i, i2, ischainhead, navItem);
        runAnimators.ag$a(ischainhead, "handler");
        runAnimators.ag$a(navItem, "navItem");
        this.valueOf = new androidx.databinding.ObservableField<>(false);
    }

    public final androidx.databinding.ObservableField<Boolean> ah$a() {
        return this.valueOf;
    }
}
