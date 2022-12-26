package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.excludeObject;
/* loaded from: classes6.dex */
public final class PartialsKt$partially2$2 extends Lambda implements Transition<P1, P3, R> {
    final /* synthetic */ Object $p2;
    final /* synthetic */ excludeObject $this_partially2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PartialsKt$partially2$2(excludeObject excludeobject, Object obj) {
        super(2);
        this.$this_partially2 = excludeobject;
        this.$p2 = obj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [R, java.lang.Object] */
    @Override // o.Transition
    public final R invoke(P1 p1, P3 p3) {
        return this.$this_partially2.invoke(p1, this.$p2, p3);
    }
}
