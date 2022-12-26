package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.addUnmatched;
import o.excludeView;
/* loaded from: classes6.dex */
public final class PartialsKt$invoke$223 extends Lambda implements addUnmatched<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P15, P16, P17, P18, P19, P20, P21, R> {
    final /* synthetic */ Object $p14;
    final /* synthetic */ excludeView $this_invoke;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PartialsKt$invoke$223(excludeView excludeview, Object obj) {
        super(20);
        this.$this_invoke = excludeview;
        this.$p14 = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [R, java.lang.Object] */
    @Override // o.addUnmatched
    public final R invoke(P1 p1, P2 p2, P3 p3, P4 p4, P5 p5, P6 p6, P7 p7, P8 p8, P9 p9, P10 p10, P11 p11, P12 p12, P13 p13, P15 p15, P16 p16, P17 p17, P18 p18, P19 p19, P20 p20, P21 p21) {
        return this.$this_invoke.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, this.$p14, p15, p16, p17, p18, p19, p20, p21);
    }
}
