package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.RatingCompat;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Apply$apEval$1 extends Lambda implements Styleable.ChangeBounds<ICustomTabsCallback.Default<? extends F, ? extends Styleable.ChangeBounds<? super A, ? extends B>>, ICustomTabsCallback.Default<? extends F, ? extends B>> {
    final /* synthetic */ ICustomTabsCallback.Default $this_apEval;
    final /* synthetic */ RatingCompat.Api19Impl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Apply$apEval$1(RatingCompat.Api19Impl api19Impl, ICustomTabsCallback.Default r2) {
        super(1);
        this.this$0 = api19Impl;
        this.$this_apEval = r2;
    }

    @Override // o.Styleable.ChangeBounds
    public final ICustomTabsCallback.Default<F, B> invoke(ICustomTabsCallback.Default<? extends F, ? extends Styleable.ChangeBounds<? super A, ? extends B>> r3) {
        runAnimators.valueOf(r3, "it");
        return this.this$0.ah$a(this.$this_apEval, r3);
    }
}
