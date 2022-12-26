package kotlin.sequences;

import kotlin.jvm.internal.Lambda;
import o.GhostViewPort;
import o.Styleable;
import o.Transition;
import o.runAnimators;
/* loaded from: classes7.dex */
public final class SequencesKt___SequencesKt$filterIndexed$1 extends Lambda implements Styleable.ChangeBounds<GhostViewPort<? extends T>, Boolean> {
    final /* synthetic */ Transition<Integer, T, Boolean> $predicate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SequencesKt___SequencesKt$filterIndexed$1(Transition<? super Integer, ? super T, Boolean> transition) {
        super(1);
        this.$predicate = transition;
    }

    @Override // o.Styleable.ChangeBounds
    public final Boolean invoke(GhostViewPort<? extends T> ghostViewPort) {
        runAnimators.ag$a(ghostViewPort, "it");
        return this.$predicate.invoke(Integer.valueOf(ghostViewPort.ag$a()), ghostViewPort.values());
    }
}
