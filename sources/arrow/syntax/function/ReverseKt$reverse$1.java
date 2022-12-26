package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Transition;
/* loaded from: classes6.dex */
public final class ReverseKt$reverse$1 extends Lambda implements Transition<P2, P1, R> {
    final /* synthetic */ Transition $this_reverse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReverseKt$reverse$1(Transition transition) {
        super(2);
        this.$this_reverse = transition;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [R, java.lang.Object] */
    @Override // o.Transition
    public final R invoke(P2 p2, P1 p1) {
        return this.$this_reverse.invoke(p1, p2);
    }
}
