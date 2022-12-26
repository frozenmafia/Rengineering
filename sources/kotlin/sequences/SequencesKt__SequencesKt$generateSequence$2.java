package kotlin.sequences;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes7.dex */
public final class SequencesKt__SequencesKt$generateSequence$2 extends Lambda implements Styleable.ArcMotion<T> {
    final /* synthetic */ T $seed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequencesKt__SequencesKt$generateSequence$2(T t) {
        super(0);
        this.$seed = t;
    }

    @Override // o.Styleable.ArcMotion
    public final T invoke() {
        return this.$seed;
    }
}
