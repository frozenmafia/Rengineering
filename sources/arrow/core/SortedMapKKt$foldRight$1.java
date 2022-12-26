package arrow.core;

import java.util.Map;
import java.util.SortedMap;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class SortedMapKKt$foldRight$1 extends Lambda implements Transition<SortedMap<A, C>, Map.Entry<? extends A, ? extends B>, SortedMap<A, C>> {
    final /* synthetic */ Transition $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SortedMapKKt$foldRight$1(Transition transition) {
        super(2);
        this.$f = transition;
    }

    @Override // o.Transition
    public final SortedMap<A, C> invoke(SortedMap<A, C> sortedMap, Map.Entry<? extends A, ? extends B> entry) {
        runAnimators.valueOf(sortedMap, "x");
        runAnimators.valueOf(entry, "y");
        return (SortedMap) this.$f.invoke(entry, sortedMap);
    }
}
