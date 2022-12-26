package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.onTransact;
/* loaded from: classes6.dex */
public final class Bitraverse$bimap$1 extends Lambda implements Styleable.ChangeBounds<A, onTransact<? extends C>> {
    final /* synthetic */ Styleable.ChangeBounds $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Bitraverse$bimap$1(Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$f = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Bitraverse$bimap$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final onTransact<C> invoke(A a) {
        return new onTransact<>(this.$f.invoke(a));
    }
}
