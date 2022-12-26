package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setDefaultImpl;
import o.setDefaultImpl$ah$a;
/* loaded from: classes6.dex */
public final class EitherKt$filterOrOther$1 extends Lambda implements Styleable.ChangeBounds<B, setDefaultImpl<? extends A, ? extends B>> {
    final /* synthetic */ Styleable.ChangeBounds $default;
    final /* synthetic */ Styleable.ChangeBounds $predicate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EitherKt$filterOrOther$1(Styleable.ChangeBounds changeBounds, Styleable.ChangeBounds changeBounds2) {
        super(1);
        this.$predicate = changeBounds;
        this.$default = changeBounds2;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((EitherKt$filterOrOther$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final setDefaultImpl<A, B> invoke(B b2) {
        return ((Boolean) this.$predicate.invoke(b2)).booleanValue() ? new setDefaultImpl.values(b2) : new setDefaultImpl$ah$a(this.$default.invoke(b2));
    }
}
