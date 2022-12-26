package arrow.core;

import java.util.Map;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class MapKKt$foldRight$1 extends Lambda implements Transition<Map<K, ? extends B>, Map.Entry<? extends K, ? extends A>, Map<K, ? extends B>> {
    final /* synthetic */ Transition $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapKKt$foldRight$1(Transition transition) {
        super(2);
        this.$f = transition;
    }

    @Override // o.Transition
    public final Map<K, B> invoke(Map<K, ? extends B> map, Map.Entry<? extends K, ? extends A> entry) {
        runAnimators.valueOf(map, "x");
        runAnimators.valueOf(entry, "y");
        return (Map) this.$f.invoke(entry, map);
    }
}
