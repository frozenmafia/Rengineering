package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.excludeId;
import o.isValidMatch;
/* loaded from: classes6.dex */
public final class PartialsKt$partially5$2 extends Lambda implements excludeId<P1, P2, P3, P4, P6, R> {
    final /* synthetic */ Object $p5;
    final /* synthetic */ isValidMatch $this_partially5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PartialsKt$partially5$2(isValidMatch isvalidmatch, Object obj) {
        super(5);
        this.$this_partially5 = isvalidmatch;
        this.$p5 = obj;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [R, java.lang.Object] */
    @Override // o.excludeId
    public final R invoke(P1 p1, P2 p2, P3 p3, P4 p4, P6 p6) {
        return this.$this_partially5.invoke(p1, p2, p3, p4, this.$p5, p6);
    }
}
