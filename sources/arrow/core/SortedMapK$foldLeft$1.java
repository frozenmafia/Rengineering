package arrow.core;

import java.util.Map;
import java.util.SortedMap;
import kotlin.jvm.internal.Lambda;
import o.ITrustedWebActivityCallback;
import o.Transition;
import o.areNotificationsEnabled;
import o.cancel;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class SortedMapK$foldLeft$1 extends Lambda implements Transition<SortedMap<A, C>, Map.Entry<? extends A, ? extends B>, ITrustedWebActivityCallback.Default<A, C>> {
    final /* synthetic */ Transition $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SortedMapK$foldLeft$1(Transition transition) {
        super(2);
        this.$f = transition;
    }

    @Override // o.Transition
    public final ITrustedWebActivityCallback.Default<A, C> invoke(SortedMap<A, C> sortedMap, Map.Entry<? extends A, ? extends B> entry) {
        runAnimators.valueOf(sortedMap, "m");
        runAnimators.valueOf(entry, "<name for destructuring parameter 1>");
        return (ITrustedWebActivityCallback.Default) this.$f.invoke(areNotificationsEnabled.ah$a(sortedMap), new cancel((Comparable) entry.getKey(), entry.getValue()));
    }
}
