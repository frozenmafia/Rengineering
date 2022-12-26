package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.excludeId;
import o.isValidMatch;
/* loaded from: classes6.dex */
public final class PartialsKt$partially6$1 extends Lambda implements excludeId<P1, P2, P3, P4, P5, R> {
    final /* synthetic */ Object $p6;
    final /* synthetic */ isValidMatch $this_partially6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PartialsKt$partially6$1(isValidMatch isvalidmatch, Object obj) {
        super(5);
        this.$this_partially6 = isvalidmatch;
        this.$p6 = obj;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [R, java.lang.Object] */
    @Override // o.excludeId
    public final R invoke(P1 p1, P2 p2, P3 p3, P4 p4, P5 p5) {
        return this.$this_partially6.invoke(p1, p2, p3, p4, p5, this.$p6);
    }
}
