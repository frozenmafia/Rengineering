package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes6.dex */
public final class PartialsKt$partially9$3 extends Lambda implements Styleable.PatternPathMotion<P1, P2, P3, P4, P5, P6, P7, P8, P10, P11, R> {
    final /* synthetic */ Object $p9;
    final /* synthetic */ Styleable.Fade $this_partially9;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PartialsKt$partially9$3(Styleable.Fade fade, Object obj) {
        super(10);
        this.$this_partially9 = fade;
        this.$p9 = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [R, java.lang.Object] */
    @Override // o.Styleable.PatternPathMotion
    public final R invoke(P1 p1, P2 p2, P3 p3, P4 p4, P5 p5, P6 p6, P7 p7, P8 p8, P10 p10, P11 p11) {
        return this.$this_partially9.invoke(p1, p2, p3, p4, p5, p6, p7, p8, this.$p9, p10, p11);
    }
}
