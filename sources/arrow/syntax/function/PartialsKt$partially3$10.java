package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes6.dex */
public final class PartialsKt$partially3$10 extends Lambda implements Styleable.Fade<P1, P2, P4, P5, P6, P7, P8, P9, P10, P11, P12, R> {
    final /* synthetic */ Object $p3;
    final /* synthetic */ Styleable.Slide $this_partially3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PartialsKt$partially3$10(Styleable.Slide slide, Object obj) {
        super(11);
        this.$this_partially3 = slide;
        this.$p3 = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [R, java.lang.Object] */
    @Override // o.Styleable.Fade
    public final R invoke(P1 p1, P2 p2, P4 p4, P5 p5, P6 p6, P7 p7, P8 p8, P9 p9, P10 p10, P11 p11, P12 p12) {
        return this.$this_partially3.invoke(p1, p2, this.$p3, p4, p5, p6, p7, p8, p9, p10, p11, p12);
    }
}
