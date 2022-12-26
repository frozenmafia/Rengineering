package o;

import arrow.core.Eval$Memoize$value$1;
import o.ICustomTabsService;
/* loaded from: classes.dex */
public final class asBinder$ah$a<A> extends asBinder<A> {
    private final asBinder<A> ag$a;
    private ICustomTabsService.Stub.Proxy<? extends A> toString;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof asBinder$ah$a) && runAnimators.values(this.ag$a, ((asBinder$ah$a) obj).ag$a);
        }
        return true;
    }

    public int hashCode() {
        asBinder<A> asbinder = this.ag$a;
        if (asbinder != null) {
            return asbinder.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "Memoize(eval=" + this.ag$a + ")";
    }

    public final asBinder<A> ag$a() {
        return this.ag$a;
    }

    public final void ag$a(ICustomTabsService.Stub.Proxy<? extends A> proxy) {
        runAnimators.valueOf(proxy, "<set-?>");
        this.toString = proxy;
    }

    public final ICustomTabsService.Stub.Proxy<A> ah$b() {
        return (ICustomTabsService.Stub.Proxy<? extends A>) this.toString;
    }

    @Override // o.asBinder
    public A ah$a() {
        return (A) ICustomTabsService.Default.valueOf(this.toString, new Eval$Memoize$value$1(this));
    }
}
