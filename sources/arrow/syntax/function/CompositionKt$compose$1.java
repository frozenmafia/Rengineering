package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes6.dex */
public final class CompositionKt$compose$1 extends Lambda implements Styleable.ChangeBounds<P1, R> {
    final /* synthetic */ Styleable.ChangeBounds $f;
    final /* synthetic */ Styleable.ChangeBounds $this_compose;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompositionKt$compose$1(Styleable.ChangeBounds changeBounds, Styleable.ChangeBounds changeBounds2) {
        super(1);
        this.$this_compose = changeBounds;
        this.$f = changeBounds2;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [R, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final R invoke(P1 p1) {
        return this.$this_compose.invoke(this.$f.invoke(p1));
    }
}
