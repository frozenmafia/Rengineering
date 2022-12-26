package arrow.core;

import arrow.core.TryException;
import kotlin.jvm.internal.Lambda;
import o.ITrustedWebActivityService;
import o.Styleable;
/* loaded from: classes6.dex */
public final class Try$filter$1 extends Lambda implements Styleable.ChangeBounds<A, ITrustedWebActivityService<? extends A>> {
    final /* synthetic */ Styleable.ChangeBounds $p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Try$filter$1(Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$p = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Try$filter$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final ITrustedWebActivityService<A> invoke(A a) {
        ITrustedWebActivityService valuesVar;
        if (((Boolean) this.$p.invoke(a)).booleanValue()) {
            valuesVar = new ITrustedWebActivityService.toString(a);
        } else {
            valuesVar = new ITrustedWebActivityService.values(new TryException.PredicateException("Predicate does not hold for " + a));
        }
        return valuesVar;
    }
}
