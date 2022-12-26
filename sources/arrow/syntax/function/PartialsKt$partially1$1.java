package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes6.dex */
public final class PartialsKt$partially1$1 extends Lambda implements Styleable.ArcMotion<R> {
    final /* synthetic */ Object $p1;
    final /* synthetic */ Styleable.ChangeBounds $this_partially1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PartialsKt$partially1$1(Styleable.ChangeBounds changeBounds, Object obj) {
        super(0);
        this.$this_partially1 = changeBounds;
        this.$p1 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [R, java.lang.Object] */
    @Override // o.Styleable.ArcMotion
    public final R invoke() {
        return this.$this_partially1.invoke(this.$p1);
    }
}
