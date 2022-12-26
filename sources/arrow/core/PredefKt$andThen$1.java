package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes6.dex */
public final class PredefKt$andThen$1 extends Lambda implements Styleable.ChangeBounds<A, C> {
    final /* synthetic */ Styleable.ChangeBounds $g;
    final /* synthetic */ Styleable.ChangeBounds $this_andThen;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PredefKt$andThen$1(Styleable.ChangeBounds changeBounds, Styleable.ChangeBounds changeBounds2) {
        super(1);
        this.$this_andThen = changeBounds;
        this.$g = changeBounds2;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [C, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final C invoke(A a) {
        return this.$g.invoke(this.$this_andThen.invoke(a));
    }
}
