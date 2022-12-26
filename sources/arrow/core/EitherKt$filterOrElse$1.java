package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setDefaultImpl;
import o.setDefaultImpl$ah$a;
/* loaded from: classes6.dex */
public final class EitherKt$filterOrElse$1 extends Lambda implements Styleable.ChangeBounds<B, setDefaultImpl<? extends A, ? extends B>> {
    final /* synthetic */ Styleable.ArcMotion $default;
    final /* synthetic */ Styleable.ChangeBounds $predicate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EitherKt$filterOrElse$1(Styleable.ChangeBounds changeBounds, Styleable.ArcMotion arcMotion) {
        super(1);
        this.$predicate = changeBounds;
        this.$default = arcMotion;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((EitherKt$filterOrElse$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final setDefaultImpl<A, B> invoke(B b2) {
        return ((Boolean) this.$predicate.invoke(b2)).booleanValue() ? new setDefaultImpl.values(b2) : new setDefaultImpl$ah$a(this.$default.invoke());
    }
}
