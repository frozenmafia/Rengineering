package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.Transition;
import o.requestPostMessageChannelWithExtras;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class MapK$map2Eval$1 extends Lambda implements Styleable.ChangeBounds<requestPostMessageChannelWithExtras<K, ? extends B>, requestPostMessageChannelWithExtras<K, ? extends Z>> {
    final /* synthetic */ Transition $f;
    final /* synthetic */ requestPostMessageChannelWithExtras this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapK$map2Eval$1(requestPostMessageChannelWithExtras requestpostmessagechannelwithextras, Transition transition) {
        super(1);
        this.this$0 = requestpostmessagechannelwithextras;
        this.$f = transition;
    }

    @Override // o.Styleable.ChangeBounds
    public final requestPostMessageChannelWithExtras<K, Z> invoke(requestPostMessageChannelWithExtras<K, ? extends B> requestpostmessagechannelwithextras) {
        runAnimators.valueOf(requestpostmessagechannelwithextras, "b");
        return this.this$0.ag$a(requestpostmessagechannelwithextras, this.$f);
    }
}
