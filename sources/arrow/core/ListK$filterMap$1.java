package arrow.core;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import o.ICustomTabsService;
import o.IPostMessageService;
import o.ITrustedWebActivityCallback;
import o.Styleable;
import o.newSession;
/* loaded from: classes.dex */
public final class ListK$filterMap$1 extends Lambda implements Styleable.ChangeBounds<A, newSession<? extends B>> {
    final /* synthetic */ Styleable.ChangeBounds $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListK$filterMap$1(Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$f = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((ListK$filterMap$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final newSession<B> invoke(A a) {
        ICustomTabsService.Stub.Proxy proxy = (ICustomTabsService.Stub.Proxy) this.$f.invoke(a);
        if (proxy instanceof IPostMessageService.Default) {
            return newSession.values.values();
        }
        if (proxy instanceof ITrustedWebActivityCallback) {
            return newSession.values.ag$a(((ITrustedWebActivityCallback) proxy).ag$a());
        }
        throw new NoWhenBranchMatchedException();
    }
}
