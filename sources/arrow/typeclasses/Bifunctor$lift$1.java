package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.RatingCompat;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Bifunctor$lift$1 extends Lambda implements Styleable.ChangeBounds<ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends F, ? extends A>, ? extends B>, ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends F, ? extends C>, ? extends D>> {
    final /* synthetic */ Styleable.ChangeBounds $fl;
    final /* synthetic */ Styleable.ChangeBounds $fr;
    final /* synthetic */ RatingCompat.AnonymousClass1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Bifunctor$lift$1(RatingCompat.AnonymousClass1 anonymousClass1, Styleable.ChangeBounds changeBounds, Styleable.ChangeBounds changeBounds2) {
        super(1);
        this.this$0 = anonymousClass1;
        this.$fl = changeBounds;
        this.$fr = changeBounds2;
    }

    @Override // o.Styleable.ChangeBounds
    public final ICustomTabsCallback.Default<ICustomTabsCallback.Default<F, C>, D> invoke(ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends F, ? extends A>, ? extends B> r4) {
        runAnimators.valueOf(r4, "kind2");
        return this.this$0.valueOf(r4, this.$fl, this.$fr);
    }
}
