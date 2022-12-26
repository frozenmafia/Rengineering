package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes6.dex */
public final class PredefKt$compose$1 extends Lambda implements Styleable.ChangeBounds<A, C> {
    final /* synthetic */ Styleable.ChangeBounds $f;
    final /* synthetic */ Styleable.ChangeBounds $this_compose;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PredefKt$compose$1(Styleable.ChangeBounds changeBounds, Styleable.ChangeBounds changeBounds2) {
        super(1);
        this.$this_compose = changeBounds;
        this.$f = changeBounds2;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [C, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final C invoke(A a) {
        return this.$this_compose.invoke(this.$f.invoke(a));
    }
}
