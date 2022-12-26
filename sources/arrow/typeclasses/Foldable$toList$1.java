package arrow.typeclasses;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.Transition;
import o.asBinder;
import o.reserveEndViewTransition;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Foldable$toList$1 extends Lambda implements Transition<A, asBinder<? extends List<? extends A>>, asBinder<? extends List<? extends A>>> {
    public static final Foldable$toList$1 INSTANCE = new Foldable$toList$1();

    Foldable$toList$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((Foldable$toList$1) obj, (asBinder<? extends List<? extends Foldable$toList$1>>) obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: arrow.typeclasses.Foldable$toList$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<List<? extends A>, List<? extends A>> {
        final /* synthetic */ Object $v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Object obj) {
            super(1);
            this.$v = obj;
        }

        @Override // o.Styleable.ChangeBounds
        public final List<A> invoke(List<? extends A> list) {
            runAnimators.valueOf(list, "it");
            return reserveEndViewTransition.valueOf(reserveEndViewTransition.ag$a(this.$v), list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final asBinder<List<A>> invoke(A a, asBinder<? extends List<? extends A>> asbinder) {
        runAnimators.valueOf(asbinder, "acc");
        return asbinder.ah$a(new AnonymousClass1(a));
    }
}
