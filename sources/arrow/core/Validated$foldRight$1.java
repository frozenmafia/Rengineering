package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.Transition;
import o.asBinder;
import o.disconnect;
/* loaded from: classes6.dex */
public final class Validated$foldRight$1 extends Lambda implements Styleable.ArcMotion<asBinder<? extends B>> {
    final /* synthetic */ Transition $f;
    final /* synthetic */ asBinder $lb;
    final /* synthetic */ disconnect this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Validated$foldRight$1(disconnect disconnectVar, Transition transition, asBinder asbinder) {
        super(0);
        this.this$0 = disconnectVar;
        this.$f = transition;
        this.$lb = asbinder;
    }

    @Override // o.Styleable.ArcMotion
    public final asBinder<B> invoke() {
        return (asBinder) this.$f.invoke(((disconnect.valueOf) this.this$0).valueOf(), this.$lb);
    }
}
