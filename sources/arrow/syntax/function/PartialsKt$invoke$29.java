package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.isValueChanged;
import o.matchIds;
/* loaded from: classes6.dex */
public final class PartialsKt$invoke$29 extends Lambda implements matchIds<P1, P3, P4, P5, P6, P7, P8, R> {
    final /* synthetic */ Object $p2;
    final /* synthetic */ isValueChanged $this_invoke;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PartialsKt$invoke$29(isValueChanged isvaluechanged, Object obj) {
        super(7);
        this.$this_invoke = isvaluechanged;
        this.$p2 = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [R, java.lang.Object] */
    @Override // o.matchIds
    public final R invoke(P1 p1, P3 p3, P4 p4, P5 p5, P6 p6, P7 p7, P8 p8) {
        return this.$this_invoke.invoke(p1, this.$p2, p3, p4, p5, p6, p7, p8);
    }
}
