package arrow.core;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import o.ICustomTabsService;
import o.IPostMessageService;
import o.ITrustedWebActivityCallback;
import o.Styleable;
/* loaded from: classes6.dex */
public final class Option$filterMap$1 extends Lambda implements Styleable.ChangeBounds<A, ICustomTabsService.Stub.Proxy<? extends B>> {
    final /* synthetic */ Styleable.ChangeBounds $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Option$filterMap$1(Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$f = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Option$filterMap$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final ICustomTabsService.Stub.Proxy<B> invoke(A a) {
        ICustomTabsService.Stub.Proxy proxy = (ICustomTabsService.Stub.Proxy) this.$f.invoke(a);
        if (proxy instanceof IPostMessageService.Default) {
            return ICustomTabsService.Stub.Proxy.toString.ag$a();
        }
        if (proxy instanceof ITrustedWebActivityCallback) {
            return ICustomTabsService.Stub.Proxy.toString.ah$a(((ITrustedWebActivityCallback) proxy).ag$a());
        }
        throw new NoWhenBranchMatchedException();
    }
}
