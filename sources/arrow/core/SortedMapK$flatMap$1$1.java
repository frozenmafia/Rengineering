package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.cancel;
/* loaded from: classes6.dex */
public final class SortedMapK$flatMap$1$1 extends Lambda implements Styleable.ChangeBounds<C, cancel<? extends A, ? extends C>> {
    final /* synthetic */ Comparable $k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SortedMapK$flatMap$1$1(Comparable comparable) {
        super(1);
        this.$k = comparable;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((SortedMapK$flatMap$1$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final cancel<A, C> invoke(C c) {
        return new cancel<>(this.$k, c);
    }
}
