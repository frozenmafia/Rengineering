package kotlin.sequences;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes7.dex */
public final class SequencesKt___SequencesKt$onEach$1 extends Lambda implements Styleable.ChangeBounds<T, T> {
    final /* synthetic */ Styleable.ChangeBounds<T, setAnimationMatrix> $action;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SequencesKt___SequencesKt$onEach$1(Styleable.ChangeBounds<? super T, setAnimationMatrix> changeBounds) {
        super(1);
        this.$action = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public final T invoke(T t) {
        this.$action.invoke(t);
        return t;
    }
}
