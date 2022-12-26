package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.ITrustedWebActivityCallback;
import o.Styleable;
import o.Transition;
import o.cancel;
/* loaded from: classes6.dex */
public final class SortedMapK$map2$$inlined$flatMap$lambda$1 extends Lambda implements Styleable.ChangeBounds<C, cancel<? extends A, ? extends Z>> {
    final /* synthetic */ Comparable $a;
    final /* synthetic */ Object $b;
    final /* synthetic */ Transition $f$inlined;
    final /* synthetic */ ITrustedWebActivityCallback.Default $fc$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SortedMapK$map2$$inlined$flatMap$lambda$1(Comparable comparable, Object obj, ITrustedWebActivityCallback.Default r3, Transition transition) {
        super(1);
        this.$a = comparable;
        this.$b = obj;
        this.$fc$inlined = r3;
        this.$f$inlined = transition;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((SortedMapK$map2$$inlined$flatMap$lambda$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final cancel<A, Z> invoke(C c) {
        return new cancel<>(this.$a, this.$f$inlined.invoke(this.$b, c));
    }
}
