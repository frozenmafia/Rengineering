package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.Styleable;
import o.cancel;
/* loaded from: classes6.dex */
public final class Tuple2Monad$flatMap$1 extends Lambda implements Styleable.ChangeBounds<A, cancel<? extends F, ? extends B>> {
    final /* synthetic */ Styleable.ChangeBounds $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Tuple2Monad$flatMap$1(Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$f = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Tuple2Monad$flatMap$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final cancel<F, B> invoke(A a) {
        return (cancel) ((ICustomTabsCallback.Default) this.$f.invoke(a));
    }
}
