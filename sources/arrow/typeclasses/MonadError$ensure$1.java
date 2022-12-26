package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.IMediaControllerCallback;
import o.Styleable;
/* loaded from: classes6.dex */
public final class MonadError$ensure$1 extends Lambda implements Styleable.ChangeBounds<A, ICustomTabsCallback.Default<? extends F, ? extends A>> {
    final /* synthetic */ Styleable.ArcMotion $error;
    final /* synthetic */ Styleable.ChangeBounds $predicate;
    final /* synthetic */ IMediaControllerCallback.Default this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MonadError$ensure$1(IMediaControllerCallback.Default r1, Styleable.ChangeBounds changeBounds, Styleable.ArcMotion arcMotion) {
        super(1);
        this.this$0 = r1;
        this.$predicate = changeBounds;
        this.$error = arcMotion;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((MonadError$ensure$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final ICustomTabsCallback.Default<F, A> invoke(A a) {
        return ((Boolean) this.$predicate.invoke(a)).booleanValue() ? this.this$0.values(a) : this.this$0.toString(this.$error.invoke());
    }
}
