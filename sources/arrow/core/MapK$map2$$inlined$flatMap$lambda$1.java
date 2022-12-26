package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.Transition;
import o.cancel;
import o.requestPostMessageChannelWithExtras;
/* loaded from: classes6.dex */
public final class MapK$map2$$inlined$flatMap$lambda$1 extends Lambda implements Styleable.ChangeBounds<B, cancel<? extends K, ? extends Z>> {
    final /* synthetic */ Object $a;
    final /* synthetic */ Transition $f$inlined;
    final /* synthetic */ requestPostMessageChannelWithExtras $fb$inlined;
    final /* synthetic */ Object $k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapK$map2$$inlined$flatMap$lambda$1(Object obj, Object obj2, requestPostMessageChannelWithExtras requestpostmessagechannelwithextras, Transition transition) {
        super(1);
        this.$k = obj;
        this.$a = obj2;
        this.$fb$inlined = requestpostmessagechannelwithextras;
        this.$f$inlined = transition;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((MapK$map2$$inlined$flatMap$lambda$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final cancel<K, Z> invoke(B b2) {
        return new cancel<>(this.$k, this.$f$inlined.invoke(this.$a, b2));
    }
}
