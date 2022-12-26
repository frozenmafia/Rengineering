package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.asBinder;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Foldable$isEmpty$1 extends Lambda implements Transition<A, asBinder<? extends Boolean>, asBinder<? extends Boolean>> {
    public static final Foldable$isEmpty$1 INSTANCE = new Foldable$isEmpty$1();

    Foldable$isEmpty$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ asBinder<? extends Boolean> invoke(Object obj, asBinder<? extends Boolean> asbinder) {
        return invoke2((Foldable$isEmpty$1) obj, (asBinder<Boolean>) asbinder);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final asBinder<Boolean> invoke2(A a, asBinder<Boolean> asbinder) {
        runAnimators.valueOf(asbinder, "<anonymous parameter 1>");
        return asBinder.ah$a.ah$a();
    }
}
