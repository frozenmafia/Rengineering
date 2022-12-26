package arrow.typeclasses;

import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.Transition;
import o.asBinder;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Foldable$Companion$iterateRight$1 extends Lambda implements Styleable.ChangeBounds<Transition<? super A, ? super asBinder<? extends B>, ? extends asBinder<? extends B>>, asBinder<? extends B>> {
    final /* synthetic */ Iterator $it;
    final /* synthetic */ asBinder $lb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Foldable$Companion$iterateRight$1(Iterator it, asBinder asbinder) {
        super(1);
        this.$it = it;
        this.$lb = asbinder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: arrow.typeclasses.Foldable$Companion$iterateRight$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ArcMotion<asBinder<? extends B>> {
        final /* synthetic */ Transition $f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Transition transition) {
            super(0);
            this.$f = transition;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: arrow.typeclasses.Foldable$Companion$iterateRight$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C02271 extends Lambda implements Styleable.ArcMotion<asBinder<? extends B>> {
            C02271() {
                super(0);
            }

            @Override // o.Styleable.ArcMotion
            public final asBinder<B> invoke() {
                return Foldable$Companion$iterateRight$1.this.$it.hasNext() ? (asBinder) AnonymousClass1.this.$f.invoke(Foldable$Companion$iterateRight$1.this.$it.next(), AnonymousClass1.this.invoke()) : Foldable$Companion$iterateRight$1.this.$lb;
            }
        }

        @Override // o.Styleable.ArcMotion
        public final asBinder<B> invoke() {
            return asBinder.ah$a.valueOf(new C02271());
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final asBinder<B> invoke(Transition<? super A, ? super asBinder<? extends B>, ? extends asBinder<? extends B>> transition) {
        runAnimators.valueOf(transition, "f");
        return new AnonymousClass1(transition).invoke();
    }
}
