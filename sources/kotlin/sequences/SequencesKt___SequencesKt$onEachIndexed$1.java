package kotlin.sequences;

import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.setAnimationMatrix;
/* loaded from: classes7.dex */
public final class SequencesKt___SequencesKt$onEachIndexed$1 extends Lambda implements Transition<Integer, T, T> {
    final /* synthetic */ Transition<Integer, T, setAnimationMatrix> $action;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SequencesKt___SequencesKt$onEachIndexed$1(Transition<? super Integer, ? super T, setAnimationMatrix> transition) {
        super(2);
        this.$action = transition;
    }

    @Override // o.Transition
    public /* synthetic */ Object invoke(Integer num, Object obj) {
        return invoke(num.intValue(), (int) obj);
    }

    public final T invoke(int i, T t) {
        this.$action.invoke(Integer.valueOf(i), t);
        return t;
    }
}
