package arrow.syntax.function;

import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.Transition;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class PairingKt$paired$1 extends Lambda implements Styleable.ChangeBounds<Pair<? extends P1, ? extends P2>, R> {
    final /* synthetic */ Transition $this_paired;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PairingKt$paired$1(Transition transition) {
        super(1);
        this.$this_paired = transition;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [R, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final R invoke(Pair<? extends P1, ? extends P2> pair) {
        runAnimators.valueOf(pair, "pair");
        return this.$this_paired.invoke(pair.component1(), pair.component2());
    }
}
