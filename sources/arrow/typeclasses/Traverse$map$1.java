package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.onTransact;
/* loaded from: classes6.dex */
public final class Traverse$map$1 extends Lambda implements Styleable.ChangeBounds<A, onTransact<? extends B>> {
    final /* synthetic */ Styleable.ChangeBounds $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Traverse$map$1(Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$f = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Traverse$map$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final onTransact<B> invoke(A a) {
        return new onTransact<>(this.$f.invoke(a));
    }
}
