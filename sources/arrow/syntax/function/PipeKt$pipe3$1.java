package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.excludeObject;
/* loaded from: classes6.dex */
public final class PipeKt$pipe3$1 extends Lambda implements Transition<P2, P3, R> {
    final /* synthetic */ excludeObject $t;
    final /* synthetic */ Object $this_pipe3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PipeKt$pipe3$1(Object obj, excludeObject excludeobject) {
        super(2);
        this.$this_pipe3 = obj;
        this.$t = excludeobject;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [R, java.lang.Object] */
    @Override // o.Transition
    public final R invoke(P2 p2, P3 p3) {
        return this.$t.invoke(this.$this_pipe3, p2, p3);
    }
}
