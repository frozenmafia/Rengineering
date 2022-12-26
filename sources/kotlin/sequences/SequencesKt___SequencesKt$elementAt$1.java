package kotlin.sequences;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes7.dex */
public final class SequencesKt___SequencesKt$elementAt$1 extends Lambda implements Styleable.ChangeBounds<Integer, T> {
    final /* synthetic */ int $index;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SequencesKt___SequencesKt$elementAt$1(int i) {
        super(1);
        this.$index = i;
    }

    public final T invoke(int i) {
        throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + this.$index + '.');
    }

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }
}
