package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.Styleable;
import o.Transition;
import o.asBinder;
import o.cancel;
import o.getSessionInfo;
/* loaded from: classes6.dex */
public final class NonEmptyReducible$foldRight$$inlined$run$lambda$1 extends Lambda implements Styleable.ArcMotion<cancel<? extends A, ? extends ICustomTabsCallback.Default<? extends G, ? extends A>>> {
    final /* synthetic */ Transition $f$inlined;
    final /* synthetic */ asBinder $lb$inlined;
    final /* synthetic */ ICustomTabsCallback.Default $this_foldRight$inlined;
    final /* synthetic */ getSessionInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NonEmptyReducible$foldRight$$inlined$run$lambda$1(getSessionInfo getsessioninfo, ICustomTabsCallback.Default r2, Transition transition, asBinder asbinder) {
        super(0);
        this.this$0 = getsessioninfo;
        this.$this_foldRight$inlined = r2;
        this.$f$inlined = transition;
        this.$lb$inlined = asbinder;
    }

    @Override // o.Styleable.ArcMotion
    public final cancel<A, ICustomTabsCallback.Default<G, A>> invoke() {
        return this.this$0.valueOf(this.$this_foldRight$inlined);
    }
}
