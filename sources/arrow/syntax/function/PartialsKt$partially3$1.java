package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.excludeObject;
/* loaded from: classes6.dex */
public final class PartialsKt$partially3$1 extends Lambda implements Transition<P1, P2, R> {
    final /* synthetic */ Object $p3;
    final /* synthetic */ excludeObject $this_partially3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PartialsKt$partially3$1(excludeObject excludeobject, Object obj) {
        super(2);
        this.$this_partially3 = excludeobject;
        this.$p3 = obj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [R, java.lang.Object] */
    @Override // o.Transition
    public final R invoke(P1 p1, P2 p2) {
        return this.$this_partially3.invoke(p1, p2, this.$p3);
    }
}
