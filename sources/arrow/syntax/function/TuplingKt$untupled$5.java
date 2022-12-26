package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.isValidMatch;
import o.write;
/* loaded from: classes6.dex */
public final class TuplingKt$untupled$5 extends Lambda implements isValidMatch<T1, T2, T3, T4, T5, T6, R> {
    final /* synthetic */ Styleable.ChangeBounds $this_untupled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TuplingKt$untupled$5(Styleable.ChangeBounds changeBounds) {
        super(6);
        this.$this_untupled = changeBounds;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [R, java.lang.Object] */
    @Override // o.isValidMatch
    public final R invoke(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return this.$this_untupled.invoke(new write(t1, t2, t3, t4, t5, t6));
    }
}
