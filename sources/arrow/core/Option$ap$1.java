package arrow.core;

import kotlin.TypeCastException;
import kotlin.jvm.internal.Lambda;
import o.ICustomTabsService;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Option$ap$1 extends Lambda implements Styleable.ChangeBounds<Styleable.ChangeBounds<? super A, ? extends B>, ICustomTabsService.Stub.Proxy<? extends B>> {
    final /* synthetic */ ICustomTabsService.Stub.Proxy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Option$ap$1(ICustomTabsService.Stub.Proxy proxy) {
        super(1);
        this.this$0 = proxy;
    }

    @Override // o.Styleable.ChangeBounds
    public final ICustomTabsService.Stub.Proxy<B> invoke(Styleable.ChangeBounds<? super A, ? extends B> changeBounds) {
        runAnimators.valueOf(changeBounds, "it");
        ICustomTabsService.Stub.Proxy proxy = this.this$0;
        if (proxy != null) {
            return proxy.ag$a(changeBounds);
        }
        throw new TypeCastException("null cannot be cast to non-null type arrow.core.Option<A>");
    }
}
