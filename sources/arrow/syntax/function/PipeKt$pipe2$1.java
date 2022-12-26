package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.Transition;
/* loaded from: classes6.dex */
public final class PipeKt$pipe2$1 extends Lambda implements Styleable.ChangeBounds<P2, R> {
    final /* synthetic */ Transition $t;
    final /* synthetic */ Object $this_pipe2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PipeKt$pipe2$1(Object obj, Transition transition) {
        super(1);
        this.$this_pipe2 = obj;
        this.$t = transition;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [R, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final R invoke(P2 p2) {
        return this.$t.invoke(this.$this_pipe2, p2);
    }
}
