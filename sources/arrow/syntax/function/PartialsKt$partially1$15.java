package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes6.dex */
public final class PartialsKt$partially1$15 extends Lambda implements Styleable.TransitionTarget<P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R> {
    final /* synthetic */ Object $p1;
    final /* synthetic */ Styleable.TransitionSet $this_partially1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PartialsKt$partially1$15(Styleable.TransitionSet transitionSet, Object obj) {
        super(14);
        this.$this_partially1 = transitionSet;
        this.$p1 = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [R, java.lang.Object] */
    @Override // o.Styleable.TransitionTarget
    public final R invoke(P2 p2, P3 p3, P4 p4, P5 p5, P6 p6, P7 p7, P8 p8, P9 p9, P10 p10, P11 p11, P12 p12, P13 p13, P14 p14, P15 p15) {
        return this.$this_partially1.invoke(this.$p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15);
    }
}
