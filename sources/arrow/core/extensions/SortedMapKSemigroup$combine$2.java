package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.ITrustedWebActivityCallback;
import o.Transition;
import o.areNotificationsEnabled;
import o.cancel;
import o.getIconUri;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class SortedMapKSemigroup$combine$2 extends Lambda implements Transition<ITrustedWebActivityCallback.Default<A, B>, cancel<? extends A, ? extends B>, ITrustedWebActivityCallback.Default<A, B>> {
    final /* synthetic */ getIconUri this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SortedMapKSemigroup$combine$2(getIconUri geticonuri) {
        super(2);
        this.this$0 = geticonuri;
    }

    @Override // o.Transition
    public final ITrustedWebActivityCallback.Default<A, B> invoke(ITrustedWebActivityCallback.Default<A, B> r4, cancel<? extends A, ? extends B> cancelVar) {
        runAnimators.valueOf(r4, "my");
        runAnimators.valueOf(cancelVar, "<name for destructuring parameter 1>");
        Comparable comparable = (Comparable) cancelVar.valueOf();
        return areNotificationsEnabled.toString(r4, comparable, this.this$0.valueOf().values(cancelVar.values(), r4.get(comparable)));
    }
}
