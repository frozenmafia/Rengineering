package kotlin.sequences;

import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.getReparent;
/* loaded from: classes7.dex */
public final class SequencesKt___SequencesKt$zip$1 extends Lambda implements Transition<T, R, Pair<? extends T, ? extends R>> {
    public static final SequencesKt___SequencesKt$zip$1 INSTANCE = new SequencesKt___SequencesKt$zip$1();

    SequencesKt___SequencesKt$zip$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((SequencesKt___SequencesKt$zip$1) obj, obj2);
    }

    @Override // o.Transition
    public final Pair<T, R> invoke(T t, R r) {
        return getReparent.toString(t, r);
    }
}
