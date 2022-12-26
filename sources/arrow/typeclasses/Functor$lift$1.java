package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.Styleable;
import o.onSessionReady;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Functor$lift$1 extends Lambda implements Styleable.ChangeBounds<ICustomTabsCallback.Default<? extends F, ? extends A>, ICustomTabsCallback.Default<? extends F, ? extends B>> {
    final /* synthetic */ Styleable.ChangeBounds $f;
    final /* synthetic */ onSessionReady this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Functor$lift$1(onSessionReady onsessionready, Styleable.ChangeBounds changeBounds) {
        super(1);
        this.this$0 = onsessionready;
        this.$f = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public final ICustomTabsCallback.Default<F, B> invoke(ICustomTabsCallback.Default<? extends F, ? extends A> r3) {
        runAnimators.valueOf(r3, "fa");
        return this.this$0.map(r3, this.$f);
    }
}
