package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.excludeId;
import o.isValidMatch;
/* loaded from: classes6.dex */
public final class PartialsKt$partially1$6 extends Lambda implements excludeId<P2, P3, P4, P5, P6, R> {
    final /* synthetic */ Object $p1;
    final /* synthetic */ isValidMatch $this_partially1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PartialsKt$partially1$6(isValidMatch isvalidmatch, Object obj) {
        super(5);
        this.$this_partially1 = isvalidmatch;
        this.$p1 = obj;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [R, java.lang.Object] */
    @Override // o.excludeId
    public final R invoke(P2 p2, P3 p3, P4 p4, P5 p5, P6 p6) {
        return this.$this_partially1.invoke(this.$p1, p2, p3, p4, p5, p6);
    }
}
