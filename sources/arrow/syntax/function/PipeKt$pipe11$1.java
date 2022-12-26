package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes6.dex */
public final class PipeKt$pipe11$1 extends Lambda implements Styleable.PatternPathMotion<P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R> {
    final /* synthetic */ Styleable.Fade $t;
    final /* synthetic */ Object $this_pipe11;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PipeKt$pipe11$1(Object obj, Styleable.Fade fade) {
        super(10);
        this.$this_pipe11 = obj;
        this.$t = fade;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [R, java.lang.Object] */
    @Override // o.Styleable.PatternPathMotion
    public final R invoke(P2 p2, P3 p3, P4 p4, P5 p5, P6 p6, P7 p7, P8 p8, P9 p9, P10 p10, P11 p11) {
        return this.$t.invoke(this.$this_pipe11, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
    }
}
