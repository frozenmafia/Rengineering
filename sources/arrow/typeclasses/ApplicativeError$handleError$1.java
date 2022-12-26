package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.Styleable;
import o.newUnratedRating;
/* loaded from: classes6.dex */
public final class ApplicativeError$handleError$1 extends Lambda implements Styleable.ChangeBounds<E, ICustomTabsCallback.Default<? extends F, ? extends A>> {
    final /* synthetic */ Styleable.ChangeBounds $f;
    final /* synthetic */ newUnratedRating this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ApplicativeError$handleError$1(newUnratedRating newunratedrating, Styleable.ChangeBounds changeBounds) {
        super(1);
        this.this$0 = newunratedrating;
        this.$f = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((ApplicativeError$handleError$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final ICustomTabsCallback.Default<F, A> invoke(E e) {
        return this.this$0.values(this.$f.invoke(e));
    }
}
