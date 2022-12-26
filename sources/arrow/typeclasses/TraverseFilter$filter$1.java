package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.onTransact;
/* loaded from: classes6.dex */
public final class TraverseFilter$filter$1 extends Lambda implements Styleable.ChangeBounds<A, onTransact<? extends Boolean>> {
    final /* synthetic */ Styleable.ChangeBounds $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TraverseFilter$filter$1(Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$f = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ onTransact<? extends Boolean> invoke(Object obj) {
        return invoke2((TraverseFilter$filter$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final onTransact<? extends Boolean> invoke2(A a) {
        return new onTransact<>(this.$f.invoke(a));
    }
}
