package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.Transition;
import o.asBinder;
import o.runAnimators;
/* loaded from: classes.dex */
public final class Foldable$exists$1 extends Lambda implements Transition<A, asBinder<? extends Boolean>, asBinder<? extends Boolean>> {
    final /* synthetic */ Styleable.ChangeBounds $p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Foldable$exists$1(Styleable.ChangeBounds changeBounds) {
        super(2);
        this.$p = changeBounds;
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ asBinder<? extends Boolean> invoke(Object obj, asBinder<? extends Boolean> asbinder) {
        return invoke2((Foldable$exists$1) obj, (asBinder<Boolean>) asbinder);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final asBinder<Boolean> invoke2(A a, asBinder<Boolean> asbinder) {
        runAnimators.valueOf(asbinder, "lb");
        return ((Boolean) this.$p.invoke(a)).booleanValue() ? asBinder.ah$a.valueOf() : asbinder;
    }
}
