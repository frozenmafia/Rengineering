package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsService;
import o.Styleable;
/* loaded from: classes6.dex */
public final class Option$mapNotNull$1 extends Lambda implements Styleable.ChangeBounds<A, ICustomTabsService.Stub.Proxy<? extends B>> {
    final /* synthetic */ Styleable.ChangeBounds $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Option$mapNotNull$1(Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$f = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Option$mapNotNull$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final ICustomTabsService.Stub.Proxy<B> invoke(A a) {
        return ICustomTabsService.Stub.Proxy.toString.valueOf(this.$f.invoke(a));
    }
}
