package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.excludeId;
/* loaded from: classes6.dex */
public final class ReverseKt$reverse$4 extends Lambda implements excludeId<P5, P4, P3, P2, P1, R> {
    final /* synthetic */ excludeId $this_reverse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReverseKt$reverse$4(excludeId excludeid) {
        super(5);
        this.$this_reverse = excludeid;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [R, java.lang.Object] */
    @Override // o.excludeId
    public final R invoke(P5 p5, P4 p4, P3 p3, P2 p2, P1 p1) {
        return this.$this_reverse.invoke(p1, p2, p3, p4, p5);
    }
}
