package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.Transition;
import o.asBinder;
/* loaded from: classes6.dex */
public final class Ior$foldRight$$inlined$fold$lambda$1 extends Lambda implements Styleable.ArcMotion<asBinder<? extends C>> {
    final /* synthetic */ Transition $f$inlined;
    final /* synthetic */ Object $it;
    final /* synthetic */ asBinder $lc$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Ior$foldRight$$inlined$fold$lambda$1(Object obj, Transition transition, asBinder asbinder) {
        super(0);
        this.$it = obj;
        this.$f$inlined = transition;
        this.$lc$inlined = asbinder;
    }

    @Override // o.Styleable.ArcMotion
    public final asBinder<C> invoke() {
        return (asBinder) this.$f$inlined.invoke(this.$it, this.$lc$inlined);
    }
}
