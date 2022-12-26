package arrow.typeclasses;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import o.ICustomTabsService;
import o.IPostMessageService;
import o.ITrustedWebActivityCallback;
import o.Styleable;
import o.Transition;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Foldable$reduceLeftToOption$1 extends Lambda implements Transition<ICustomTabsService.Stub.Proxy<? extends B>, A, ICustomTabsService.Stub.Proxy<? extends B>> {
    final /* synthetic */ Styleable.ChangeBounds $f;
    final /* synthetic */ Transition $g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Foldable$reduceLeftToOption$1(Transition transition, Styleable.ChangeBounds changeBounds) {
        super(2);
        this.$g = transition;
        this.$f = changeBounds;
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((ICustomTabsService.Stub.Proxy) obj, (ICustomTabsService.Stub.Proxy) obj2);
    }

    public final ICustomTabsService.Stub.Proxy<B> invoke(ICustomTabsService.Stub.Proxy<? extends B> proxy, A a) {
        runAnimators.valueOf(proxy, "option");
        if (proxy instanceof ITrustedWebActivityCallback) {
            return new ITrustedWebActivityCallback(this.$g.invoke(((ITrustedWebActivityCallback) proxy).ag$a(), a));
        }
        if (proxy instanceof IPostMessageService.Default) {
            return new ITrustedWebActivityCallback(this.$f.invoke(a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
