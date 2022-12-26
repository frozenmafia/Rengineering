package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.isValidMatch;
import o.matchIds;
/* loaded from: classes6.dex */
public final class PartialsKt$invoke$23 extends Lambda implements isValidMatch<P1, P2, P4, P5, P6, P7, R> {
    final /* synthetic */ Object $p3;
    final /* synthetic */ matchIds $this_invoke;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PartialsKt$invoke$23(matchIds matchids, Object obj) {
        super(6);
        this.$this_invoke = matchids;
        this.$p3 = obj;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [R, java.lang.Object] */
    @Override // o.isValidMatch
    public final R invoke(P1 p1, P2 p2, P4 p4, P5 p5, P6 p6, P7 p7) {
        return this.$this_invoke.invoke(p1, p2, this.$p3, p4, p5, p6, p7);
    }
}
