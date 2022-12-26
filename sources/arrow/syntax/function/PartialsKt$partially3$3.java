package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.captureHierarchy;
import o.excludeId;
/* loaded from: classes6.dex */
public final class PartialsKt$partially3$3 extends Lambda implements captureHierarchy<P1, P2, P4, P5, R> {
    final /* synthetic */ Object $p3;
    final /* synthetic */ excludeId $this_partially3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PartialsKt$partially3$3(excludeId excludeid, Object obj) {
        super(4);
        this.$this_partially3 = excludeid;
        this.$p3 = obj;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [R, java.lang.Object] */
    @Override // o.captureHierarchy
    public final R invoke(P1 p1, P2 p2, P4 p4, P5 p5) {
        return this.$this_partially3.invoke(p1, p2, this.$p3, p4, p5);
    }
}
