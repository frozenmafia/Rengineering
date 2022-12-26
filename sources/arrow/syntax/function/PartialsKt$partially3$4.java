package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.excludeId;
import o.isValidMatch;
/* loaded from: classes6.dex */
public final class PartialsKt$partially3$4 extends Lambda implements excludeId<P1, P2, P4, P5, P6, R> {
    final /* synthetic */ Object $p3;
    final /* synthetic */ isValidMatch $this_partially3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PartialsKt$partially3$4(isValidMatch isvalidmatch, Object obj) {
        super(5);
        this.$this_partially3 = isvalidmatch;
        this.$p3 = obj;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [R, java.lang.Object] */
    @Override // o.excludeId
    public final R invoke(P1 p1, P2 p2, P4 p4, P5 p5, P6 p6) {
        return this.$this_partially3.invoke(p1, p2, this.$p3, p4, p5, p6);
    }
}
