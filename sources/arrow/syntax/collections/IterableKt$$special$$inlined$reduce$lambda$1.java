package arrow.syntax.collections;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import o.ICustomTabsService;
import o.IPostMessageService;
import o.ITrustedWebActivityCallback;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class IterableKt$$special$$inlined$reduce$lambda$1 extends Lambda implements Styleable.ChangeBounds<ICustomTabsService.Stub.Proxy<? extends B>, ICustomTabsService.Stub.Proxy<? extends B>> {
    final /* synthetic */ Styleable.ChangeBounds $g;
    final /* synthetic */ Object $value$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IterableKt$$special$$inlined$reduce$lambda$1(Styleable.ChangeBounds changeBounds, Object obj) {
        super(1);
        this.$g = changeBounds;
        this.$value$inlined = obj;
    }

    @Override // o.Styleable.ChangeBounds
    public final ICustomTabsService.Stub.Proxy<B> invoke(ICustomTabsService.Stub.Proxy<? extends B> proxy) {
        ICustomTabsService.Stub.Proxy iTrustedWebActivityCallback;
        runAnimators.valueOf(proxy, "it");
        if (proxy instanceof IPostMessageService.Default) {
            iTrustedWebActivityCallback = (ICustomTabsService.Stub.Proxy) this.$g.invoke(this.$value$inlined);
        } else if (proxy instanceof ITrustedWebActivityCallback) {
            iTrustedWebActivityCallback = new ITrustedWebActivityCallback(((ITrustedWebActivityCallback) proxy).ag$a());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return iTrustedWebActivityCallback;
    }
}
