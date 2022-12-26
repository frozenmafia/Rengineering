package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.Transition;
/* loaded from: classes6.dex */
public final class CompositionKt$forwardCompose$1 extends Lambda implements Transition<P1, P2, R> {
    final /* synthetic */ Styleable.ChangeBounds $f;
    final /* synthetic */ Transition $this_forwardCompose;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompositionKt$forwardCompose$1(Transition transition, Styleable.ChangeBounds changeBounds) {
        super(2);
        this.$this_forwardCompose = transition;
        this.$f = changeBounds;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [R, java.lang.Object] */
    @Override // o.Transition
    public final R invoke(P1 p1, P2 p2) {
        return this.$f.invoke(this.$this_forwardCompose.invoke(p1, p2));
    }
}
