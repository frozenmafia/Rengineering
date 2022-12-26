package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.isValidMatch;
import o.matchIds;
/* loaded from: classes6.dex */
public final class PartialsKt$partially6$2 extends Lambda implements isValidMatch<P1, P2, P3, P4, P5, P7, R> {
    final /* synthetic */ Object $p6;
    final /* synthetic */ matchIds $this_partially6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PartialsKt$partially6$2(matchIds matchids, Object obj) {
        super(6);
        this.$this_partially6 = matchids;
        this.$p6 = obj;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [R, java.lang.Object] */
    @Override // o.isValidMatch
    public final R invoke(P1 p1, P2 p2, P3 p3, P4 p4, P5 p5, P7 p7) {
        return this.$this_partially6.invoke(p1, p2, p3, p4, p5, this.$p6, p7);
    }
}
