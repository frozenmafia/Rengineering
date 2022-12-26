package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.Transition;
import o.getReparent;
/* loaded from: classes6.dex */
public final class PairingKt$unpaired$1 extends Lambda implements Transition<P1, P2, R> {
    final /* synthetic */ Styleable.ChangeBounds $this_unpaired;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PairingKt$unpaired$1(Styleable.ChangeBounds changeBounds) {
        super(2);
        this.$this_unpaired = changeBounds;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [R, java.lang.Object] */
    @Override // o.Transition
    public final R invoke(P1 p1, P2 p2) {
        return this.$this_unpaired.invoke(getReparent.toString(p1, p2));
    }
}
