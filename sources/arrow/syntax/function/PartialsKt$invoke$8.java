package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.captureHierarchy;
import o.excludeObject;
/* loaded from: classes6.dex */
public final class PartialsKt$invoke$8 extends Lambda implements excludeObject<P1, P2, P4, R> {
    final /* synthetic */ Object $p3;
    final /* synthetic */ captureHierarchy $this_invoke;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PartialsKt$invoke$8(captureHierarchy capturehierarchy, Object obj) {
        super(3);
        this.$this_invoke = capturehierarchy;
        this.$p3 = obj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [R, java.lang.Object] */
    @Override // o.excludeObject
    public final R invoke(P1 p1, P2 p2, P4 p4) {
        return this.$this_invoke.invoke(p1, p2, this.$p3, p4);
    }
}
