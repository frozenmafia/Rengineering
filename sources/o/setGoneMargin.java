package o;

import com.app.dream11.newhome.navigation.NavItem;
/* loaded from: classes3.dex */
public class setGoneMargin {
    private final int bindingVar;
    private final isChainHead handler;
    private final int layoutId;
    private final NavItem navItem;

    public setGoneMargin(int i, int i2, isChainHead ischainhead, NavItem navItem) {
        runAnimators.ag$a(ischainhead, "handler");
        runAnimators.ag$a(navItem, "navItem");
        this.bindingVar = i;
        this.layoutId = i2;
        this.handler = ischainhead;
        this.navItem = navItem;
    }

    public final int getBindingVar() {
        return this.bindingVar;
    }

    public final isChainHead getHandler() {
        return this.handler;
    }

    public final int getLayoutId() {
        return this.layoutId;
    }

    public final NavItem getNavItem() {
        return this.navItem;
    }
}
