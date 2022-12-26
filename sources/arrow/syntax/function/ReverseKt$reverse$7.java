package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.isValueChanged;
/* loaded from: classes6.dex */
public final class ReverseKt$reverse$7 extends Lambda implements isValueChanged<P8, P7, P6, P5, P4, P3, P2, P1, R> {
    final /* synthetic */ isValueChanged $this_reverse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReverseKt$reverse$7(isValueChanged isvaluechanged) {
        super(8);
        this.$this_reverse = isvaluechanged;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [R, java.lang.Object] */
    @Override // o.isValueChanged
    public final R invoke(P8 p8, P7 p7, P6 p6, P5 p5, P4 p4, P3 p3, P2 p2, P1 p1) {
        return this.$this_reverse.invoke(p1, p2, p3, p4, p5, p6, p7, p8);
    }
}
