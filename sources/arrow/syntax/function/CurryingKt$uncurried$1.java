package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.Transition;
/* loaded from: classes6.dex */
public final class CurryingKt$uncurried$1 extends Lambda implements Transition<P1, P2, R> {
    final /* synthetic */ Styleable.ChangeBounds $this_uncurried;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CurryingKt$uncurried$1(Styleable.ChangeBounds changeBounds) {
        super(2);
        this.$this_uncurried = changeBounds;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [R, java.lang.Object] */
    @Override // o.Transition
    public final R invoke(P1 p1, P2 p2) {
        return ((Styleable.ChangeBounds) this.$this_uncurried.invoke(p1)).invoke(p2);
    }
}
