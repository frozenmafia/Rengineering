package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.requestPostMessageChannelWithExtras;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class MapK$ap$1 extends Lambda implements Styleable.ChangeBounds<Styleable.ChangeBounds<? super A, ? extends B>, requestPostMessageChannelWithExtras<K, ? extends B>> {
    final /* synthetic */ requestPostMessageChannelWithExtras this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapK$ap$1(requestPostMessageChannelWithExtras requestpostmessagechannelwithextras) {
        super(1);
        this.this$0 = requestpostmessagechannelwithextras;
    }

    @Override // o.Styleable.ChangeBounds
    public final requestPostMessageChannelWithExtras<K, B> invoke(Styleable.ChangeBounds<? super A, ? extends B> changeBounds) {
        runAnimators.valueOf(changeBounds, "it");
        return this.this$0.toString(changeBounds);
    }
}
