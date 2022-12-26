package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.excludeId;
import o.isValidMatch;
/* loaded from: classes6.dex */
public final class PipeKt$pipe6$1 extends Lambda implements excludeId<P2, P3, P4, P5, P6, R> {
    final /* synthetic */ isValidMatch $t;
    final /* synthetic */ Object $this_pipe6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PipeKt$pipe6$1(Object obj, isValidMatch isvalidmatch) {
        super(5);
        this.$this_pipe6 = obj;
        this.$t = isvalidmatch;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [R, java.lang.Object] */
    @Override // o.excludeId
    public final R invoke(P2 p2, P3 p3, P4 p4, P5 p5, P6 p6) {
        return this.$t.invoke(this.$this_pipe6, p2, p3, p4, p5, p6);
    }
}
