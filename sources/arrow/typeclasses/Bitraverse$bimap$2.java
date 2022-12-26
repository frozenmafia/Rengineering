package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.onTransact;
/* loaded from: classes6.dex */
public final class Bitraverse$bimap$2 extends Lambda implements Styleable.ChangeBounds<B, onTransact<? extends D>> {
    final /* synthetic */ Styleable.ChangeBounds $g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Bitraverse$bimap$2(Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$g = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Bitraverse$bimap$2) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final onTransact<D> invoke(B b2) {
        return new onTransact<>(this.$g.invoke(b2));
    }
}
