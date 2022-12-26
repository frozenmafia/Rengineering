package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.matchInstances;
/* loaded from: classes6.dex */
public final class PartialsKt$partially9$2 extends Lambda implements matchInstances<P1, P2, P3, P4, P5, P6, P7, P8, P10, R> {
    final /* synthetic */ Object $p9;
    final /* synthetic */ Styleable.PatternPathMotion $this_partially9;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PartialsKt$partially9$2(Styleable.PatternPathMotion patternPathMotion, Object obj) {
        super(9);
        this.$this_partially9 = patternPathMotion;
        this.$p9 = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [R, java.lang.Object] */
    @Override // o.matchInstances
    public final R invoke(P1 p1, P2 p2, P3 p3, P4 p4, P5 p5, P6 p6, P7 p7, P8 p8, P10 p10) {
        return this.$this_partially9.invoke(p1, p2, p3, p4, p5, p6, p7, p8, this.$p9, p10);
    }
}
