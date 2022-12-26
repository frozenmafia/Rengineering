package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes6.dex */
public final class PartialsKt$partially5$9 extends Lambda implements Styleable.Slide<P1, P2, P3, P4, P6, P7, P8, P9, P10, P11, P12, P13, R> {
    final /* synthetic */ Object $p5;
    final /* synthetic */ Styleable.Transition $this_partially5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PartialsKt$partially5$9(Styleable.Transition transition, Object obj) {
        super(12);
        this.$this_partially5 = transition;
        this.$p5 = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [R, java.lang.Object] */
    @Override // o.Styleable.Slide
    public final R invoke(P1 p1, P2 p2, P3 p3, P4 p4, P6 p6, P7 p7, P8 p8, P9 p9, P10 p10, P11 p11, P12 p12, P13 p13) {
        return this.$this_partially5.invoke(p1, p2, p3, p4, this.$p5, p6, p7, p8, p9, p10, p11, p12, p13);
    }
}
