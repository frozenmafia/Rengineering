package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.cancel;
/* loaded from: classes6.dex */
public final class Functor$tupleRight$1 extends Lambda implements Styleable.ChangeBounds<A, cancel<? extends A, ? extends B>> {
    final /* synthetic */ Object $b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Functor$tupleRight$1(Object obj) {
        super(1);
        this.$b = obj;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Functor$tupleRight$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final cancel<A, B> invoke(A a) {
        return new cancel<>(a, this.$b);
    }
}
