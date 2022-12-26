package kotlin.sequences;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes7.dex */
public final class SequencesKt__SequencesKt$generateSequence$1 extends Lambda implements Styleable.ChangeBounds<T, T> {
    final /* synthetic */ Styleable.ArcMotion<T> $nextFunction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SequencesKt__SequencesKt$generateSequence$1(Styleable.ArcMotion<? extends T> arcMotion) {
        super(1);
        this.$nextFunction = arcMotion;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final T invoke(T t) {
        runAnimators.ag$a(t, "it");
        return this.$nextFunction.invoke();
    }
}
