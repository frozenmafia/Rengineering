package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes6.dex */
public final class CompositionKt$forwardCompose$3 extends Lambda implements Styleable.ArcMotion<R> {
    final /* synthetic */ Styleable.ChangeBounds $f;
    final /* synthetic */ Styleable.ArcMotion $this_forwardCompose;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompositionKt$forwardCompose$3(Styleable.ArcMotion arcMotion, Styleable.ChangeBounds changeBounds) {
        super(0);
        this.$this_forwardCompose = arcMotion;
        this.$f = changeBounds;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [R, java.lang.Object] */
    @Override // o.Styleable.ArcMotion
    public final R invoke() {
        return this.$f.invoke(this.$this_forwardCompose.invoke());
    }
}
