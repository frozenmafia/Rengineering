package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.captureHierarchy;
import o.excludeId;
/* loaded from: classes6.dex */
public final class PartialsKt$invoke$11 extends Lambda implements captureHierarchy<P1, P3, P4, P5, R> {
    final /* synthetic */ Object $p2;
    final /* synthetic */ excludeId $this_invoke;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PartialsKt$invoke$11(excludeId excludeid, Object obj) {
        super(4);
        this.$this_invoke = excludeid;
        this.$p2 = obj;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [R, java.lang.Object] */
    @Override // o.captureHierarchy
    public final R invoke(P1 p1, P3 p3, P4 p4, P5 p5) {
        return this.$this_invoke.invoke(p1, this.$p2, p3, p4, p5);
    }
}
