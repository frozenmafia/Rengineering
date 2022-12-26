package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.excludeObject;
/* loaded from: classes6.dex */
public final class ReverseKt$reverse$2 extends Lambda implements excludeObject<P3, P2, P1, R> {
    final /* synthetic */ excludeObject $this_reverse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReverseKt$reverse$2(excludeObject excludeobject) {
        super(3);
        this.$this_reverse = excludeobject;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [R, java.lang.Object] */
    @Override // o.excludeObject
    public final R invoke(P3 p3, P2 p2, P1 p1) {
        return this.$this_reverse.invoke(p1, p2, p3);
    }
}
