package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.IMediaControllerCallback;
import o.Styleable;
/* loaded from: classes6.dex */
public final class Monad$map$1 extends Lambda implements Styleable.ChangeBounds<A, ICustomTabsCallback.Default<? extends F, ? extends B>> {
    final /* synthetic */ Styleable.ChangeBounds $f;
    final /* synthetic */ IMediaControllerCallback.Stub.Proxy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Monad$map$1(IMediaControllerCallback.Stub.Proxy proxy, Styleable.ChangeBounds changeBounds) {
        super(1);
        this.this$0 = proxy;
        this.$f = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Monad$map$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final ICustomTabsCallback.Default<F, B> invoke(A a) {
        return this.this$0.values(this.$f.invoke(a));
    }
}
