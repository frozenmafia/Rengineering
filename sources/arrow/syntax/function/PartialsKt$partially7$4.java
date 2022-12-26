package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.matchInstances;
/* loaded from: classes6.dex */
public final class PartialsKt$partially7$4 extends Lambda implements matchInstances<P1, P2, P3, P4, P5, P6, P8, P9, P10, R> {
    final /* synthetic */ Object $p7;
    final /* synthetic */ Styleable.PatternPathMotion $this_partially7;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PartialsKt$partially7$4(Styleable.PatternPathMotion patternPathMotion, Object obj) {
        super(9);
        this.$this_partially7 = patternPathMotion;
        this.$p7 = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [R, java.lang.Object] */
    @Override // o.matchInstances
    public final R invoke(P1 p1, P2 p2, P3 p3, P4 p4, P5 p5, P6 p6, P8 p8, P9 p9, P10 p10) {
        return this.$this_partially7.invoke(p1, p2, p3, p4, p5, p6, this.$p7, p8, p9, p10);
    }
}
