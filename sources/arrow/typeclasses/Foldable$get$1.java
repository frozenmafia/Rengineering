package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.Transition;
import o.asInterface;
import o.runAnimators;
import o.setDefaultImpl;
/* loaded from: classes6.dex */
public final class Foldable$get$1 extends Lambda implements Transition<setDefaultImpl<? extends A, ? extends Long>, A, setDefaultImpl<? extends A, ? extends Long>> {
    final /* synthetic */ long $idx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Foldable$get$1(long j) {
        super(2);
        this.$idx = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: arrow.typeclasses.Foldable$get$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<Long, setDefaultImpl<? extends A, ? extends Long>> {
        final /* synthetic */ Object $a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Object obj) {
            super(1);
            this.$a = obj;
        }

        @Override // o.Styleable.ChangeBounds
        public /* synthetic */ Object invoke(Long l) {
            return invoke(l.longValue());
        }

        public final setDefaultImpl<A, Long> invoke(long j) {
            return j == Foldable$get$1.this.$idx ? asInterface.ah$a(this.$a) : asInterface.toString(Long.valueOf(j + 1));
        }
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((setDefaultImpl<? extends setDefaultImpl, Long>) obj, (setDefaultImpl) obj2);
    }

    public final setDefaultImpl<A, Long> invoke(setDefaultImpl<? extends A, Long> setdefaultimpl, A a) {
        runAnimators.valueOf(setdefaultimpl, "i");
        return asInterface.valueOf(setdefaultimpl, new AnonymousClass1(a));
    }
}
