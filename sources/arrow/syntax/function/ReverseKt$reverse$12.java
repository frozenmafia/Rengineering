package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes6.dex */
public final class ReverseKt$reverse$12 extends Lambda implements Styleable.Transition<P13, P12, P11, P10, P9, P8, P7, P6, P5, P4, P3, P2, P1, R> {
    final /* synthetic */ Styleable.Transition $this_reverse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReverseKt$reverse$12(Styleable.Transition transition) {
        super(13);
        this.$this_reverse = transition;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [R, java.lang.Object] */
    @Override // o.Styleable.Transition
    public final R invoke(P13 p13, P12 p12, P11 p11, P10 p10, P9 p9, P8 p8, P7 p7, P6 p6, P5 p5, P4 p4, P3 p3, P2 p2, P1 p1) {
        return this.$this_reverse.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13);
    }
}
