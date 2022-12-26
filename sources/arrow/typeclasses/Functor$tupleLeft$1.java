package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.cancel;
/* loaded from: classes6.dex */
public final class Functor$tupleLeft$1 extends Lambda implements Styleable.ChangeBounds<A, cancel<? extends B, ? extends A>> {
    final /* synthetic */ Object $b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Functor$tupleLeft$1(Object obj) {
        super(1);
        this.$b = obj;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Functor$tupleLeft$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final cancel<B, A> invoke(A a) {
        return new cancel<>(this.$b, a);
    }
}
