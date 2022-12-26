package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.getRatingType;
/* loaded from: classes6.dex */
public final class Foldable$fold$1$1 extends Lambda implements Transition<A, A, A> {
    final /* synthetic */ getRatingType $this_run;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Foldable$fold$1$1(getRatingType getratingtype) {
        super(2);
        this.$this_run = getratingtype;
    }

    @Override // o.Transition
    public final A invoke(A a, A a2) {
        return this.$this_run.ah$a(a, a2);
    }
}
