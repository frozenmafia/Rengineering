package o;

import o.ICustomTabsService;
import o.IPostMessageService;
/* loaded from: classes.dex */
public final class ICustomTabsService$Stub$Proxy$ag$a {
    private ICustomTabsService$Stub$Proxy$ag$a() {
    }

    public /* synthetic */ ICustomTabsService$Stub$Proxy$ag$a(getTargetTypes gettargettypes) {
        this();
    }

    public final <A> ICustomTabsService.Stub.Proxy<A> ah$a(A a) {
        return new ITrustedWebActivityCallback(a);
    }

    public final <A> ICustomTabsService.Stub.Proxy<A> valueOf(A a) {
        return a != null ? new ITrustedWebActivityCallback(a) : IPostMessageService.Default.valueOf;
    }

    public final <A> ICustomTabsService.Stub.Proxy<A> ag$a() {
        return IPostMessageService.Default.valueOf;
    }
}
