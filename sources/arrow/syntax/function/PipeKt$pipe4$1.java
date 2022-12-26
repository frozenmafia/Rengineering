package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.captureHierarchy;
import o.excludeObject;
/* loaded from: classes6.dex */
public final class PipeKt$pipe4$1 extends Lambda implements excludeObject<P2, P3, P4, R> {
    final /* synthetic */ captureHierarchy $t;
    final /* synthetic */ Object $this_pipe4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PipeKt$pipe4$1(Object obj, captureHierarchy capturehierarchy) {
        super(3);
        this.$this_pipe4 = obj;
        this.$t = capturehierarchy;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [R, java.lang.Object] */
    @Override // o.excludeObject
    public final R invoke(P2 p2, P3 p3, P4 p4) {
        return this.$t.invoke(this.$this_pipe4, p2, p3, p4);
    }
}
