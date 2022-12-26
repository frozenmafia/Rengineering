package arrow.core;

import java.util.Map;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.cancel;
import o.requestPostMessageChannelWithExtras;
import o.runAnimators;
import o.updateVisuals;
/* loaded from: classes6.dex */
public final class MapK$foldLeft$1 extends Lambda implements Transition<Map<K, ? extends B>, Map.Entry<? extends K, ? extends A>, requestPostMessageChannelWithExtras<K, ? extends B>> {
    final /* synthetic */ Transition $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapK$foldLeft$1(Transition transition) {
        super(2);
        this.$f = transition;
    }

    @Override // o.Transition
    public final requestPostMessageChannelWithExtras<K, B> invoke(Map<K, ? extends B> map, Map.Entry<? extends K, ? extends A> entry) {
        runAnimators.valueOf(map, "m");
        runAnimators.valueOf(entry, "<name for destructuring parameter 1>");
        return (requestPostMessageChannelWithExtras) this.$f.invoke(updateVisuals.values(map), new cancel(entry.getKey(), entry.getValue()));
    }
}
