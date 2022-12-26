package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.captureHierarchy;
/* loaded from: classes6.dex */
public final class ReverseKt$reverse$3 extends Lambda implements captureHierarchy<P4, P3, P2, P1, R> {
    final /* synthetic */ captureHierarchy $this_reverse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReverseKt$reverse$3(captureHierarchy capturehierarchy) {
        super(4);
        this.$this_reverse = capturehierarchy;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [R, java.lang.Object] */
    @Override // o.captureHierarchy
    public final R invoke(P4 p4, P3 p3, P2 p2, P1 p1) {
        return this.$this_reverse.invoke(p1, p2, p3, p4);
    }
}
