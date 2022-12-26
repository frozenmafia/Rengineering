package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.cancel;
import o.isCaptioningEnabled;
import o.requestPostMessageChannelWithExtras;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class MapKSemigroup$combine$1$1 extends Lambda implements Transition<requestPostMessageChannelWithExtras<K, ? extends A>, cancel<? extends K, ? extends A>, requestPostMessageChannelWithExtras<K, ? extends A>> {
    final /* synthetic */ isCaptioningEnabled $this_with;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapKSemigroup$combine$1$1(isCaptioningEnabled iscaptioningenabled) {
        super(2);
        this.$this_with = iscaptioningenabled;
    }

    @Override // o.Transition
    public final requestPostMessageChannelWithExtras<K, A> invoke(requestPostMessageChannelWithExtras<K, ? extends A> requestpostmessagechannelwithextras, cancel<? extends K, ? extends A> cancelVar) {
        runAnimators.valueOf(requestpostmessagechannelwithextras, "my");
        runAnimators.valueOf(cancelVar, "<name for destructuring parameter 1>");
        Object valueOf = cancelVar.valueOf();
        this.$this_with.values(cancelVar.values(), requestpostmessagechannelwithextras.get(valueOf));
        return runAnimators.valueOf(requestpostmessagechannelwithextras, "$this$updated");
    }
}
