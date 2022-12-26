package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes6.dex */
public final class PartialsKt$partially15$1 extends Lambda implements Styleable.TransitionTarget<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R> {
    final /* synthetic */ Object $p15;
    final /* synthetic */ Styleable.TransitionSet $this_partially15;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PartialsKt$partially15$1(Styleable.TransitionSet transitionSet, Object obj) {
        super(14);
        this.$this_partially15 = transitionSet;
        this.$p15 = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [R, java.lang.Object] */
    @Override // o.Styleable.TransitionTarget
    public final R invoke(P1 p1, P2 p2, P3 p3, P4 p4, P5 p5, P6 p6, P7 p7, P8 p8, P9 p9, P10 p10, P11 p11, P12 p12, P13 p13, P14 p14) {
        return this.$this_partially15.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, this.$p15);
    }
}
