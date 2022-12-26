package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.captureHierarchy;
/* loaded from: classes6.dex */
public final class CurryingKt$uncurried$3 extends Lambda implements captureHierarchy<P1, P2, P3, P4, R> {
    final /* synthetic */ Styleable.ChangeBounds $this_uncurried;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CurryingKt$uncurried$3(Styleable.ChangeBounds changeBounds) {
        super(4);
        this.$this_uncurried = changeBounds;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [R, java.lang.Object] */
    @Override // o.captureHierarchy
    public final R invoke(P1 p1, P2 p2, P3 p3, P4 p4) {
        return ((Styleable.ChangeBounds) ((Styleable.ChangeBounds) ((Styleable.ChangeBounds) this.$this_uncurried.invoke(p1)).invoke(p2)).invoke(p3)).invoke(p4);
    }
}
