package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.isValueChanged;
import o.matchInstances;
/* loaded from: classes6.dex */
public final class PipeKt$pipe9$1 extends Lambda implements isValueChanged<P2, P3, P4, P5, P6, P7, P8, P9, R> {
    final /* synthetic */ matchInstances $t;
    final /* synthetic */ Object $this_pipe9;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PipeKt$pipe9$1(Object obj, matchInstances matchinstances) {
        super(8);
        this.$this_pipe9 = obj;
        this.$t = matchinstances;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [R, java.lang.Object] */
    @Override // o.isValueChanged
    public final R invoke(P2 p2, P3 p3, P4 p4, P5 p5, P6 p6, P7 p7, P8 p8, P9 p9) {
        return this.$t.invoke(this.$this_pipe9, p2, p3, p4, p5, p6, p7, p8, p9);
    }
}
