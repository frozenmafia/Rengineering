package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.Transition;
import o.asBinder;
import o.onTransact;
/* loaded from: classes6.dex */
public final class Id$foldRight$1 extends Lambda implements Styleable.ArcMotion<asBinder<? extends B>> {
    final /* synthetic */ asBinder $initial;
    final /* synthetic */ Transition $operation;
    final /* synthetic */ onTransact this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Id$foldRight$1(onTransact ontransact, Transition transition, asBinder asbinder) {
        super(0);
        this.this$0 = ontransact;
        this.$operation = transition;
        this.$initial = asbinder;
    }

    @Override // o.Styleable.ArcMotion
    public final asBinder<B> invoke() {
        Object obj;
        Transition transition = this.$operation;
        obj = this.this$0.ag$a;
        return (asBinder) transition.invoke(obj, this.$initial);
    }
}
