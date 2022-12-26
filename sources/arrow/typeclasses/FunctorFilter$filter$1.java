package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsService;
import o.IPostMessageService;
import o.ITrustedWebActivityCallback;
import o.Styleable;
/* loaded from: classes.dex */
public final class FunctorFilter$filter$1 extends Lambda implements Styleable.ChangeBounds<A, ICustomTabsService.Stub.Proxy<? extends A>> {
    final /* synthetic */ Styleable.ChangeBounds $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FunctorFilter$filter$1(Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$f = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((FunctorFilter$filter$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final ICustomTabsService.Stub.Proxy<A> invoke(A a) {
        return ((Boolean) this.$f.invoke(a)).booleanValue() ? new ITrustedWebActivityCallback(a) : IPostMessageService.Default.valueOf;
    }
}
