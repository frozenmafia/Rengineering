package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.captureHierarchy;
import o.excludeObject;
/* loaded from: classes6.dex */
public final class PartialsKt$partially1$4 extends Lambda implements excludeObject<P2, P3, P4, R> {
    final /* synthetic */ Object $p1;
    final /* synthetic */ captureHierarchy $this_partially1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PartialsKt$partially1$4(captureHierarchy capturehierarchy, Object obj) {
        super(3);
        this.$this_partially1 = capturehierarchy;
        this.$p1 = obj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [R, java.lang.Object] */
    @Override // o.excludeObject
    public final R invoke(P2 p2, P3 p3, P4 p4) {
        return this.$this_partially1.invoke(this.$p1, p2, p3, p4);
    }
}
