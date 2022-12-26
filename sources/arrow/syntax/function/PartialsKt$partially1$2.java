package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.Transition;
/* loaded from: classes6.dex */
public final class PartialsKt$partially1$2 extends Lambda implements Styleable.ChangeBounds<P2, R> {
    final /* synthetic */ Object $p1;
    final /* synthetic */ Transition $this_partially1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PartialsKt$partially1$2(Transition transition, Object obj) {
        super(1);
        this.$this_partially1 = transition;
        this.$p1 = obj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [R, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final R invoke(P2 p2) {
        return this.$this_partially1.invoke(this.$p1, p2);
    }
}
