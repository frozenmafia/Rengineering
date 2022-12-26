package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.isCaptioningEnabled;
/* loaded from: classes6.dex */
public final class Reducible$reduce$1$1 extends Lambda implements Transition<A, A, A> {
    final /* synthetic */ isCaptioningEnabled $this_run;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Reducible$reduce$1$1(isCaptioningEnabled iscaptioningenabled) {
        super(2);
        this.$this_run = iscaptioningenabled;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [A, java.lang.Object] */
    @Override // o.Transition
    public final A invoke(A a, A a2) {
        return this.$this_run.ah$a(a, a2);
    }
}
