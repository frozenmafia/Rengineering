package kotlin.sequences;

import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.getReparent;
/* loaded from: classes7.dex */
public final class SequencesKt___SequencesKt$zipWithNext$1 extends Lambda implements Transition<T, T, Pair<? extends T, ? extends T>> {
    public static final SequencesKt___SequencesKt$zipWithNext$1 INSTANCE = new SequencesKt___SequencesKt$zipWithNext$1();

    SequencesKt___SequencesKt$zipWithNext$1() {
        super(2);
    }

    @Override // o.Transition
    public final Pair<T, T> invoke(T t, T t2) {
        return getReparent.toString(t, t2);
    }
}
