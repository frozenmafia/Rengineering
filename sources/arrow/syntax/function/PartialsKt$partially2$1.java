package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.Transition;
/* loaded from: classes6.dex */
public final class PartialsKt$partially2$1 extends Lambda implements Styleable.ChangeBounds<P1, R> {
    final /* synthetic */ Object $p2;
    final /* synthetic */ Transition $this_partially2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PartialsKt$partially2$1(Transition transition, Object obj) {
        super(1);
        this.$this_partially2 = transition;
        this.$p2 = obj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [R, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final R invoke(P1 p1) {
        return this.$this_partially2.invoke(p1, this.$p2);
    }
}
