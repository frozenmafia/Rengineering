package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.Styleable;
/* loaded from: classes6.dex */
public final class Monad$followedBy$1 extends Lambda implements Styleable.ChangeBounds<A, ICustomTabsCallback.Default<? extends F, ? extends B>> {
    final /* synthetic */ ICustomTabsCallback.Default $fb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Monad$followedBy$1(ICustomTabsCallback.Default r1) {
        super(1);
        this.$fb = r1;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Monad$followedBy$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final ICustomTabsCallback.Default<F, B> invoke(A a) {
        return this.$fb;
    }
}
