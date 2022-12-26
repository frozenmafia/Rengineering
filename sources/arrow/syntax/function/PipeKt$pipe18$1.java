package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.addViewValues;
/* loaded from: classes6.dex */
public final class PipeKt$pipe18$1 extends Lambda implements addViewValues<P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> {
    final /* synthetic */ Styleable.VisibilityTransition $t;
    final /* synthetic */ Object $this_pipe18;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PipeKt$pipe18$1(Object obj, Styleable.VisibilityTransition visibilityTransition) {
        super(17);
        this.$this_pipe18 = obj;
        this.$t = visibilityTransition;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [R, java.lang.Object] */
    @Override // o.addViewValues
    public final R invoke(P2 p2, P3 p3, P4 p4, P5 p5, P6 p6, P7 p7, P8 p8, P9 p9, P10 p10, P11 p11, P12 p12, P13 p13, P14 p14, P15 p15, P16 p16, P17 p17, P18 p18) {
        return this.$t.invoke(this.$this_pipe18, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18);
    }
}
