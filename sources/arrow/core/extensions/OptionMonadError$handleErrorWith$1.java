package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.ICustomTabsService;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class OptionMonadError$handleErrorWith$1 extends Lambda implements Styleable.ArcMotion<ICustomTabsService.Stub.Proxy<? extends A>> {
    final /* synthetic */ Styleable.ChangeBounds $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionMonadError$handleErrorWith$1(Styleable.ChangeBounds changeBounds) {
        super(0);
        this.$f = changeBounds;
    }

    @Override // o.Styleable.ArcMotion
    public final ICustomTabsService.Stub.Proxy<A> invoke() {
        return (ICustomTabsService.Stub.Proxy) ((ICustomTabsCallback.Default) this.$f.invoke(setAnimationMatrix.ag$a));
    }
}
