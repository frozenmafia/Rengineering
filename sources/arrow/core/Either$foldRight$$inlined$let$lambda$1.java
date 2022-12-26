package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.Transition;
import o.asBinder;
import o.setDefaultImpl;
/* loaded from: classes6.dex */
public final class Either$foldRight$$inlined$let$lambda$1 extends Lambda implements Styleable.ArcMotion<asBinder<? extends C>> {
    final /* synthetic */ setDefaultImpl $either;
    final /* synthetic */ asBinder $initial$inlined;
    final /* synthetic */ Transition $rightOperation$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Either$foldRight$$inlined$let$lambda$1(setDefaultImpl setdefaultimpl, Transition transition, asBinder asbinder) {
        super(0);
        this.$either = setdefaultimpl;
        this.$rightOperation$inlined = transition;
        this.$initial$inlined = asbinder;
    }

    @Override // o.Styleable.ArcMotion
    public final asBinder<C> invoke() {
        return (asBinder) this.$rightOperation$inlined.invoke(((setDefaultImpl.values) this.$either).ag$a(), this.$initial$inlined);
    }
}
