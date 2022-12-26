package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.Transition;
import o.asBinder;
/* loaded from: classes6.dex */
public final class Try$foldRight$$inlined$fold$lambda$1 extends Lambda implements Styleable.ArcMotion<asBinder<? extends B>> {
    final /* synthetic */ asBinder $initial$inlined;
    final /* synthetic */ Object $it;
    final /* synthetic */ Transition $operation$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Try$foldRight$$inlined$fold$lambda$1(Object obj, Transition transition, asBinder asbinder) {
        super(0);
        this.$it = obj;
        this.$operation$inlined = transition;
        this.$initial$inlined = asbinder;
    }

    @Override // o.Styleable.ArcMotion
    public final asBinder<B> invoke() {
        return (asBinder) this.$operation$inlined.invoke(this.$it, this.$initial$inlined);
    }
}
