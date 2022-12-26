package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.matchInstances;
/* loaded from: classes6.dex */
public final class PartialsKt$partially2$9 extends Lambda implements matchInstances<P1, P3, P4, P5, P6, P7, P8, P9, P10, R> {
    final /* synthetic */ Object $p2;
    final /* synthetic */ Styleable.PatternPathMotion $this_partially2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PartialsKt$partially2$9(Styleable.PatternPathMotion patternPathMotion, Object obj) {
        super(9);
        this.$this_partially2 = patternPathMotion;
        this.$p2 = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [R, java.lang.Object] */
    @Override // o.matchInstances
    public final R invoke(P1 p1, P3 p3, P4 p4, P5 p5, P6 p6, P7 p7, P8 p8, P9 p9, P10 p10) {
        return this.$this_partially2.invoke(p1, this.$p2, p3, p4, p5, p6, p7, p8, p9, p10);
    }
}
