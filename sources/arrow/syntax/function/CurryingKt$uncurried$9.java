package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes6.dex */
public final class CurryingKt$uncurried$9 extends Lambda implements Styleable.PatternPathMotion<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R> {
    final /* synthetic */ Styleable.ChangeBounds $this_uncurried;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CurryingKt$uncurried$9(Styleable.ChangeBounds changeBounds) {
        super(10);
        this.$this_uncurried = changeBounds;
    }

    /* JADX WARN: Type inference failed for: r2v19, types: [R, java.lang.Object] */
    @Override // o.Styleable.PatternPathMotion
    public final R invoke(P1 p1, P2 p2, P3 p3, P4 p4, P5 p5, P6 p6, P7 p7, P8 p8, P9 p9, P10 p10) {
        return ((Styleable.ChangeBounds) ((Styleable.ChangeBounds) ((Styleable.ChangeBounds) ((Styleable.ChangeBounds) ((Styleable.ChangeBounds) ((Styleable.ChangeBounds) ((Styleable.ChangeBounds) ((Styleable.ChangeBounds) ((Styleable.ChangeBounds) this.$this_uncurried.invoke(p1)).invoke(p2)).invoke(p3)).invoke(p4)).invoke(p5)).invoke(p6)).invoke(p7)).invoke(p8)).invoke(p9)).invoke(p10);
    }
}
