package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.captureHierarchy;
import o.excludeId;
/* loaded from: classes6.dex */
public final class PipeKt$pipe5$1 extends Lambda implements captureHierarchy<P2, P3, P4, P5, R> {
    final /* synthetic */ excludeId $t;
    final /* synthetic */ Object $this_pipe5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PipeKt$pipe5$1(Object obj, excludeId excludeid) {
        super(4);
        this.$this_pipe5 = obj;
        this.$t = excludeid;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [R, java.lang.Object] */
    @Override // o.captureHierarchy
    public final R invoke(P2 p2, P3 p3, P4 p4, P5 p5) {
        return this.$t.invoke(this.$this_pipe5, p2, p3, p4, p5);
    }
}
