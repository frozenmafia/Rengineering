package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.isValueChanged;
import o.matchInstances;
/* loaded from: classes6.dex */
public final class PartialsKt$invoke$43 extends Lambda implements isValueChanged<P1, P2, P3, P4, P5, P6, P7, P9, R> {
    final /* synthetic */ Object $p8;
    final /* synthetic */ matchInstances $this_invoke;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PartialsKt$invoke$43(matchInstances matchinstances, Object obj) {
        super(8);
        this.$this_invoke = matchinstances;
        this.$p8 = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [R, java.lang.Object] */
    @Override // o.isValueChanged
    public final R invoke(P1 p1, P2 p2, P3 p3, P4 p4, P5 p5, P6 p6, P7 p7, P9 p9) {
        return this.$this_invoke.invoke(p1, p2, p3, p4, p5, p6, p7, this.$p8, p9);
    }
}
