package o;

import com.app.dream11.newhome.navigation.NavItem;
/* loaded from: classes3.dex */
public class createObjectVariables extends setGoneMargin {
    private final androidx.databinding.ObservableField<String> ag$a;
    private final androidx.databinding.ObservableField<Integer> valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public createObjectVariables(int i, int i2, isChainHead ischainhead, NavItem navItem) {
        super(i, i2, ischainhead, navItem);
        runAnimators.ag$a(ischainhead, "handler");
        runAnimators.ag$a(navItem, "navItem");
        this.valueOf = new androidx.databinding.ObservableField<>();
        this.ag$a = new androidx.databinding.ObservableField<>("");
    }

    public final androidx.databinding.ObservableField<Integer> values() {
        return this.valueOf;
    }

    public final androidx.databinding.ObservableField<String> valueOf() {
        return this.ag$a;
    }
}
