package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.isValidMatch;
import o.matchIds;
/* loaded from: classes6.dex */
public final class PartialsKt$partially7$1 extends Lambda implements isValidMatch<P1, P2, P3, P4, P5, P6, R> {
    final /* synthetic */ Object $p7;
    final /* synthetic */ matchIds $this_partially7;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PartialsKt$partially7$1(matchIds matchids, Object obj) {
        super(6);
        this.$this_partially7 = matchids;
        this.$p7 = obj;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [R, java.lang.Object] */
    @Override // o.isValidMatch
    public final R invoke(P1 p1, P2 p2, P3 p3, P4 p4, P5 p5, P6 p6) {
        return this.$this_partially7.invoke(p1, p2, p3, p4, p5, p6, this.$p7);
    }
}
