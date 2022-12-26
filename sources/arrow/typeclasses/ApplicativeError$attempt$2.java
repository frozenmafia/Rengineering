package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.Styleable;
import o.asInterface;
import o.newUnratedRating;
import o.setDefaultImpl;
/* loaded from: classes6.dex */
public final class ApplicativeError$attempt$2 extends Lambda implements Styleable.ChangeBounds<E, ICustomTabsCallback.Default<? extends F, ? extends setDefaultImpl>> {
    final /* synthetic */ newUnratedRating this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ApplicativeError$attempt$2(newUnratedRating newunratedrating) {
        super(1);
        this.this$0 = newunratedrating;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((ApplicativeError$attempt$2) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final ICustomTabsCallback.Default<F, setDefaultImpl> invoke(E e) {
        return this.this$0.values(asInterface.ah$a(e));
    }
}
