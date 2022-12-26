package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.isValidMatch;
/* loaded from: classes6.dex */
public final class ReverseKt$reverse$5 extends Lambda implements isValidMatch<P6, P5, P4, P3, P2, P1, R> {
    final /* synthetic */ isValidMatch $this_reverse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReverseKt$reverse$5(isValidMatch isvalidmatch) {
        super(6);
        this.$this_reverse = isvalidmatch;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [R, java.lang.Object] */
    @Override // o.isValidMatch
    public final R invoke(P6 p6, P5 p5, P4 p4, P3 p3, P2 p2, P1 p1) {
        return this.$this_reverse.invoke(p1, p2, p3, p4, p5, p6);
    }
}
