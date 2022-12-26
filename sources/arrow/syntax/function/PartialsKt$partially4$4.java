package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.isValidMatch;
import o.matchIds;
/* loaded from: classes6.dex */
public final class PartialsKt$partially4$4 extends Lambda implements isValidMatch<P1, P2, P3, P5, P6, P7, R> {
    final /* synthetic */ Object $p4;
    final /* synthetic */ matchIds $this_partially4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PartialsKt$partially4$4(matchIds matchids, Object obj) {
        super(6);
        this.$this_partially4 = matchids;
        this.$p4 = obj;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [R, java.lang.Object] */
    @Override // o.isValidMatch
    public final R invoke(P1 p1, P2 p2, P3 p3, P5 p5, P6 p6, P7 p7) {
        return this.$this_partially4.invoke(p1, p2, p3, this.$p4, p5, p6, p7);
    }
}
