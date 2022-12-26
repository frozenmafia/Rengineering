package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsService;
import o.Styleable;
import o.onTransact;
/* loaded from: classes6.dex */
public final class TraverseFilter$filterMap$1 extends Lambda implements Styleable.ChangeBounds<A, onTransact<? extends ICustomTabsService.Stub.Proxy<? extends B>>> {
    final /* synthetic */ Styleable.ChangeBounds $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TraverseFilter$filterMap$1(Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$f = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((TraverseFilter$filterMap$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final onTransact<ICustomTabsService.Stub.Proxy<B>> invoke(A a) {
        return new onTransact<>(this.$f.invoke(a));
    }
}
