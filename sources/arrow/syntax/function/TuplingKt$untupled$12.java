package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.ITrustedWebActivityService;
import o.Styleable;
/* loaded from: classes6.dex */
public final class TuplingKt$untupled$12 extends Lambda implements Styleable.Transition<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R> {
    final /* synthetic */ Styleable.ChangeBounds $this_untupled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TuplingKt$untupled$12(Styleable.ChangeBounds changeBounds) {
        super(13);
        this.$this_untupled = changeBounds;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [R, java.lang.Object] */
    @Override // o.Styleable.Transition
    public final R invoke(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11, T12 t12, T13 t13) {
        return this.$this_untupled.invoke(new ITrustedWebActivityService.Default(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13));
    }
}
