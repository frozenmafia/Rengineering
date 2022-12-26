package kotlin.sequences;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.invalidateChildInParent;
/* loaded from: classes7.dex */
public final class SequencesKt___SequencesKt$requireNoNulls$1 extends Lambda implements Styleable.ChangeBounds<T, T> {
    final /* synthetic */ invalidateChildInParent<T> $this_requireNoNulls;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SequencesKt___SequencesKt$requireNoNulls$1(invalidateChildInParent<? extends T> invalidatechildinparent) {
        super(1);
        this.$this_requireNoNulls = invalidatechildinparent;
    }

    @Override // o.Styleable.ChangeBounds
    public final T invoke(T t) {
        if (t != 0) {
            return t;
        }
        throw new IllegalArgumentException("null element found in " + this.$this_requireNoNulls + '.');
    }
}
