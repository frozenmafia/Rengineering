package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.excludeObject;
/* loaded from: classes6.dex */
public final class PartialsKt$partially1$3 extends Lambda implements Transition<P2, P3, R> {
    final /* synthetic */ Object $p1;
    final /* synthetic */ excludeObject $this_partially1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PartialsKt$partially1$3(excludeObject excludeobject, Object obj) {
        super(2);
        this.$this_partially1 = excludeobject;
        this.$p1 = obj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [R, java.lang.Object] */
    @Override // o.Transition
    public final R invoke(P2 p2, P3 p3) {
        return this.$this_partially1.invoke(this.$p1, p2, p3);
    }
}
