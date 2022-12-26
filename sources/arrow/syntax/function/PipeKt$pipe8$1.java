package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.isValueChanged;
import o.matchIds;
/* loaded from: classes6.dex */
public final class PipeKt$pipe8$1 extends Lambda implements matchIds<P2, P3, P4, P5, P6, P7, P8, R> {
    final /* synthetic */ isValueChanged $t;
    final /* synthetic */ Object $this_pipe8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PipeKt$pipe8$1(Object obj, isValueChanged isvaluechanged) {
        super(7);
        this.$this_pipe8 = obj;
        this.$t = isvaluechanged;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [R, java.lang.Object] */
    @Override // o.matchIds
    public final R invoke(P2 p2, P3 p3, P4 p4, P5 p5, P6 p6, P7 p7, P8 p8) {
        return this.$t.invoke(this.$this_pipe8, p2, p3, p4, p5, p6, p7, p8);
    }
}
