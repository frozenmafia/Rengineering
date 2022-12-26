package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.Styleable;
import o.Transition;
import o.cancel;
import o.getSessionInfo;
/* loaded from: classes6.dex */
public final class NonEmptyReducible$reduceRightTo$$inlined$run$lambda$1 extends Lambda implements Styleable.ArcMotion<cancel<? extends A, ? extends ICustomTabsCallback.Default<? extends G, ? extends A>>> {
    final /* synthetic */ Styleable.ChangeBounds $f$inlined;
    final /* synthetic */ Transition $g$inlined;
    final /* synthetic */ ICustomTabsCallback.Default $this_reduceRightTo$inlined;
    final /* synthetic */ getSessionInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NonEmptyReducible$reduceRightTo$$inlined$run$lambda$1(getSessionInfo getsessioninfo, ICustomTabsCallback.Default r2, Styleable.ChangeBounds changeBounds, Transition transition) {
        super(0);
        this.this$0 = getsessioninfo;
        this.$this_reduceRightTo$inlined = r2;
        this.$f$inlined = changeBounds;
        this.$g$inlined = transition;
    }

    @Override // o.Styleable.ArcMotion
    public final cancel<A, ICustomTabsCallback.Default<G, A>> invoke() {
        return this.this$0.valueOf(this.$this_reduceRightTo$inlined);
    }
}
