package kotlinx.coroutines.channels;

import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.getReparent;
/* loaded from: classes7.dex */
public final class ChannelsKt__DeprecatedKt$zip$1 extends Lambda implements Transition<E, R, Pair<? extends E, ? extends R>> {
    public static final ChannelsKt__DeprecatedKt$zip$1 INSTANCE = new ChannelsKt__DeprecatedKt$zip$1();

    ChannelsKt__DeprecatedKt$zip$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((ChannelsKt__DeprecatedKt$zip$1) obj, obj2);
    }

    @Override // o.Transition
    public final Pair<E, R> invoke(E e, R r) {
        return getReparent.toString(e, r);
    }
}
