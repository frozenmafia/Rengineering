package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.excludeId;
import o.isValidMatch;
/* loaded from: classes6.dex */
public final class PartialsKt$partially2$5 extends Lambda implements excludeId<P1, P3, P4, P5, P6, R> {
    final /* synthetic */ Object $p2;
    final /* synthetic */ isValidMatch $this_partially2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PartialsKt$partially2$5(isValidMatch isvalidmatch, Object obj) {
        super(5);
        this.$this_partially2 = isvalidmatch;
        this.$p2 = obj;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [R, java.lang.Object] */
    @Override // o.excludeId
    public final R invoke(P1 p1, P3 p3, P4 p4, P5 p5, P6 p6) {
        return this.$this_partially2.invoke(p1, this.$p2, p3, p4, p5, p6);
    }
}
