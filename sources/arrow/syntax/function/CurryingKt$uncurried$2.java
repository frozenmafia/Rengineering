package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.excludeObject;
/* loaded from: classes6.dex */
public final class CurryingKt$uncurried$2 extends Lambda implements excludeObject<P1, P2, P3, R> {
    final /* synthetic */ Styleable.ChangeBounds $this_uncurried;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CurryingKt$uncurried$2(Styleable.ChangeBounds changeBounds) {
        super(3);
        this.$this_uncurried = changeBounds;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [R, java.lang.Object] */
    @Override // o.excludeObject
    public final R invoke(P1 p1, P2 p2, P3 p3) {
        return ((Styleable.ChangeBounds) ((Styleable.ChangeBounds) this.$this_uncurried.invoke(p1)).invoke(p2)).invoke(p3);
    }
}
