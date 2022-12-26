package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Function0$ap$1 extends Lambda implements Styleable.ChangeBounds<Styleable.ChangeBounds<? super A, ? extends B>, ICustomTabsCallback.Stub.Proxy<? extends B>> {
    final /* synthetic */ ICustomTabsCallback.Stub.Proxy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Function0$ap$1(ICustomTabsCallback.Stub.Proxy proxy) {
        super(1);
        this.this$0 = proxy;
    }

    @Override // o.Styleable.ChangeBounds
    public final ICustomTabsCallback.Stub.Proxy<B> invoke(Styleable.ChangeBounds<? super A, ? extends B> changeBounds) {
        runAnimators.valueOf(changeBounds, "f");
        return this.this$0.ah$a(changeBounds);
    }
}
