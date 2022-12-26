package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes6.dex */
public final class Foldable$firstOption$1 extends Lambda implements Styleable.ChangeBounds<A, Boolean> {
    final /* synthetic */ Styleable.ChangeBounds $predicate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Foldable$firstOption$1(Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$predicate = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ Boolean invoke(Object obj) {
        return Boolean.valueOf(invoke2((Foldable$firstOption$1) obj));
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Boolean, boolean] */
    @Override // o.Styleable.ChangeBounds
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Boolean invoke2(A a) {
        return ((Boolean) this.$predicate.invoke(a)).booleanValue();
    }
}
