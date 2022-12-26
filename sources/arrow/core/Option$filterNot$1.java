package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsService;
import o.IPostMessageService;
import o.ITrustedWebActivityCallback;
import o.Styleable;
/* loaded from: classes6.dex */
public final class Option$filterNot$1 extends Lambda implements Styleable.ChangeBounds<A, ICustomTabsService.Stub.Proxy<? extends A>> {
    final /* synthetic */ Styleable.ChangeBounds $predicate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Option$filterNot$1(Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$predicate = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Option$filterNot$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final ICustomTabsService.Stub.Proxy<A> invoke(A a) {
        return !((Boolean) this.$predicate.invoke(a)).booleanValue() ? new ITrustedWebActivityCallback(a) : IPostMessageService.Default.valueOf;
    }
}
