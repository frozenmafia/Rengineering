package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.cancel;
/* loaded from: classes6.dex */
public final class SortedMapK$ap2$1$2 extends Lambda implements Styleable.ChangeBounds<Z, cancel<? extends A, ? extends Z>> {
    final /* synthetic */ Comparable $k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SortedMapK$ap2$1$2(Comparable comparable) {
        super(1);
        this.$k = comparable;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((SortedMapK$ap2$1$2) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final cancel<A, Z> invoke(Z z) {
        return new cancel<>(this.$k, z);
    }
}
