package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes6.dex */
public final class Validated$leftMap$1 extends Lambda implements Styleable.ChangeBounds<E, EE> {
    final /* synthetic */ Styleable.ChangeBounds $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Validated$leftMap$1(Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$f = changeBounds;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [EE, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final EE invoke(E e) {
        return this.$f.invoke(e);
    }
}
