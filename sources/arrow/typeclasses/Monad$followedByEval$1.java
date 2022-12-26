package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.Styleable;
import o.asBinder;
/* loaded from: classes6.dex */
public final class Monad$followedByEval$1 extends Lambda implements Styleable.ChangeBounds<A, ICustomTabsCallback.Default<? extends F, ? extends B>> {
    final /* synthetic */ asBinder $fb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Monad$followedByEval$1(asBinder asbinder) {
        super(1);
        this.$fb = asbinder;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Monad$followedByEval$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final ICustomTabsCallback.Default<F, B> invoke(A a) {
        return (ICustomTabsCallback.Default) this.$fb.ah$a();
    }
}
