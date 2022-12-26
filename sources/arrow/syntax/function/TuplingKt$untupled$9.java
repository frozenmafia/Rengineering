package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.ITrustedWebActivityCallback;
import o.Styleable;
/* loaded from: classes6.dex */
public final class TuplingKt$untupled$9 extends Lambda implements Styleable.PatternPathMotion<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> {
    final /* synthetic */ Styleable.ChangeBounds $this_untupled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TuplingKt$untupled$9(Styleable.ChangeBounds changeBounds) {
        super(10);
        this.$this_untupled = changeBounds;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [R, java.lang.Object] */
    @Override // o.Styleable.PatternPathMotion
    public final R invoke(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10) {
        return this.$this_untupled.invoke(new ITrustedWebActivityCallback.Stub.Proxy(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10));
    }
}
