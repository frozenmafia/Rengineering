package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.addViewValues;
/* loaded from: classes6.dex */
public final class PartialsKt$partially15$3 extends Lambda implements Styleable.TransitionManager<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P16, P17, R> {
    final /* synthetic */ Object $p15;
    final /* synthetic */ addViewValues $this_partially15;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PartialsKt$partially15$3(addViewValues addviewvalues, Object obj) {
        super(16);
        this.$this_partially15 = addviewvalues;
        this.$p15 = obj;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [R, java.lang.Object] */
    @Override // o.Styleable.TransitionManager
    public final R invoke(P1 p1, P2 p2, P3 p3, P4 p4, P5 p5, P6 p6, P7 p7, P8 p8, P9 p9, P10 p10, P11 p11, P12 p12, P13 p13, P14 p14, P16 p16, P17 p17) {
        return this.$this_partially15.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, this.$p15, p16, p17);
    }
}
